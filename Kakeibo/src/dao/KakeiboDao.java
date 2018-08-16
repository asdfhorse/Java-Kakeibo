package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.User;

public class KakeiboDao {

	public static String LoginCheck(String name)	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String lpass = null;
		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/asdf?useSSL=false",
					"root",
					"tomonori319");
			// ④SQL文を作成する
			String sql = "SELECT password FROM user WHERE name = ?";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);

			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();

			// ⑦実行結果を含んだインスタンスからデータを取り出す
			rs.next();
			lpass = rs.getString("password");

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}

		}
		return lpass;
	}

	public static User addUser(String u,String p)	{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		User result = null;

		try	{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/asdf?useSSL=false",
					"root",
					"tomonori319");

			String sql = "INSERT INTO User(name,password)Values(?,?)";

			pst = con.prepareStatement(sql);

			pst.setString(1, u);
			pst.setString(2, p);

			pst.executeUpdate();


		}	catch (SQLException e)	{
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		}	catch (Exception e)		{
			System.out.println("数字を指定してください。");
		}	finally	{
			try	{
				if(rs != null)	{
					rs.close();
				}
			}	catch(SQLException e)	{
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}
}
