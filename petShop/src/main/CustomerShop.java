package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import oracleDB.OracleDB;
import util.MyUtil;

public class CustomerShop {
	
	private int selectNum;
	
	public void Shop() {
		
		//상품 구매
		System.out.println("상품 구매 페이지 입니다.");
		System.out.println("원하시는 상품을 선택해 주세요.");
		System.out.println("----------------------");
		System.out.println("1. 개 사료");
		System.out.println("2. 고양이 사료");
		System.out.println("3. 개 간식");
		System.out.println("4. 고양이 간식");
		System.out.println("5. 장난감");
		System.out.println("6. 기타");
		System.out.println("----------------------");
		
		selectNum = MyUtil.sc.nextInt();
		
		switch(selectNum) {
		case 1 : 
			new CustomerShop().Dogfood(); break; //개 사료
		case 2 : 
			new CustomerShop().Catfood(); break; // 고양이 사료
		case 3 : 
			new CustomerShop().DogTreat(); break; //개 간식
		case 4 : 
			new CustomerShop().CatTreat(); break; //고양이 간식
		case 5 : 
			new CustomerShop().Toys(); break; //장난감
		case 6 : 
			new CustomerShop().Extra(); break; // 기타
			
		default : System.out.println("선택하신 메뉴는 유효하지 않습니다."); Shop();
		}
	}//Shop
	
	
	//상품 카테고리 메소드
	public void Dogfood() {
		
		System.out.println("=========개 사료 페이지입니다.=========");
		
		Connection conn = OracleDB.getOracleConnection();
		String sql = "SELECT PRD_NO, PRD_NAME, DESCRIPTION, PRICE, STOCK FROM PRODUCT WHERE CAT_NO = 1 ORDER BY PRD_NO ASC";
		
		ResultSet rs = null;

		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			System.out.print("상품 번호");
			System.out.print(" | ");
			System.out.print("상품 이름");
			System.out.print(" | ");
			System.out.print("상품 설명");
			System.out.print(" | ");
			System.out.print("가격");
			System.out.print(" | ");
			System.out.print("재고");
			System.out.print("\n-------------------------------");
			System.out.println();
			
			while(rs.next()) {
				int prdNo = rs.getInt("PRD_NO"); //상품 번호
				String prdName = rs.getString("PRD_NAME");//상품 이름
				String descrip = rs.getString("DESCRIPTION"); //상품 설명
				int price = rs.getInt("PRICE"); //가격
				int stock = rs.getInt("STOCK"); //남은 재고
				
				
				System.out.print(prdNo);
				System.out.print(" | ");
				System.out.print(prdName);
				System.out.print(" | ");
				System.out.print(descrip);
				System.out.print(" | ");
				System.out.print(price);
				System.out.print(" | ");
				System.out.print(stock);
				System.out.println();
				

				
	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}

	}//Dogfood
	
	public void Catfood() {
		System.out.println("=========고양이 사료 페이지입니다.=========");
		
		Connection conn = OracleDB.getOracleConnection();
		String sql = "SELECT PRD_NO, CAT_NO, PRD_NAME, DESCRIPTION, PRICE, STOCK FROM PRODUCT WHERE CAT_NO = 2 ORDER BY PRD_NO ASC";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.print("상품 번호");
			System.out.print(" | ");
			System.out.print("상품 이름");
			System.out.print(" | ");
			System.out.print("상품 설명");
			System.out.print(" | ");
			System.out.print("가격");
			System.out.print(" | ");
			System.out.print("재고");
			System.out.print("\n-------------------------------");
			System.out.println();
			
			while(rs.next()) {
				int prdNo = rs.getInt("PRD_NO"); //상품 번호
				String prdName = rs.getString("PRD_NAME");//상품 이름
				String descrip = rs.getString("DESCRIPTION"); //상품 설명
				int price = rs.getInt("PRICE"); //가격
				int stock = rs.getInt("STOCK"); //남은 재고
				
				
				System.out.print(prdNo);
				System.out.print(" | ");
				System.out.print(prdName);
				System.out.print(" | ");
				System.out.print(descrip);
				System.out.print(" | ");
				System.out.print(price);
				System.out.print(" | ");
				System.out.print(stock);
				System.out.println();
				
	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
		
			
		}
		
	}//Catfood
	
	public void DogTreat() {
		System.out.println("=========개 간식 페이지입니다.=========");
		
		Connection conn = OracleDB.getOracleConnection();
		String sql = "SELECT PRD_NO, CAT_NO, PRD_NAME, DESCRIPTION, PRICE, STOCK FROM PRODUCT WHERE CAT_NO = 3 ORDER BY PRD_NO ASC";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.print("상품 번호");
			System.out.print(" | ");
			System.out.print("상품 이름");
			System.out.print(" | ");
			System.out.print("상품 설명");
			System.out.print(" | ");
			System.out.print("가격");
			System.out.print(" | ");
			System.out.print("재고");
			System.out.print("\n-------------------------------");
			System.out.println();
			
			while(rs.next()) {
				int prdNo = rs.getInt("PRD_NO"); //상품 번호
				String prdName = rs.getString("PRD_NAME");//상품 이름
				String descrip = rs.getString("DESCRIPTION"); //상품 설명
				int price = rs.getInt("PRICE"); //가격
				int stock = rs.getInt("STOCK"); //남은 재고
				
				
				System.out.print(prdNo);
				System.out.print(" | ");
				System.out.print(prdName);
				System.out.print(" | ");
				System.out.print(descrip);
				System.out.print(" | ");
				System.out.print(price);
				System.out.print(" | ");
				System.out.print(stock);
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}//DogTreat
	
	public void CatTreat() {
		System.out.println("=========고양이 간식 페이지입니다.=========");
		
		Connection conn = OracleDB.getOracleConnection();
		String sql = "SELECT PRD_NO, CAT_NO, PRD_NAME, DESCRIPTION, PRICE, STOCK FROM PRODUCT WHERE CAT_NO = 4 ORDER BY PRD_NO ASC";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.print("상품 번호");
			System.out.print(" | ");
			System.out.print("상품 이름");
			System.out.print(" | ");
			System.out.print("상품 설명");
			System.out.print(" | ");
			System.out.print("가격");
			System.out.print(" | ");
			System.out.print("재고");
			System.out.print("\n-------------------------------");
			System.out.println();
			
			while(rs.next()) {
				int prdNo = rs.getInt("PRD_NO"); //상품 번호
				String prdName = rs.getString("PRD_NAME");//상품 이름
				String descrip = rs.getString("DESCRIPTION"); //상품 설명
				int price = rs.getInt("PRICE"); //가격
				int stock = rs.getInt("STOCK"); //남은 재고
				
				
				System.out.print(prdNo);
				System.out.print(" | ");
				System.out.print(prdName);
				System.out.print(" | ");
				System.out.print(descrip);
				System.out.print(" | ");
				System.out.print(price);
				System.out.print(" | ");
				System.out.print(stock);
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}//CatTreat
	
	public void Toys() {
		System.out.println("=========장난감 페이지입니다.=========");
		
		Connection conn = OracleDB.getOracleConnection();
		String sql = "SELECT PRD_NO, CAT_NO, PRD_NAME, DESCRIPTION, PRICE, STOCK FROM PRODUCT WHERE CAT_NO = 5 ORDER BY PRD_NO ASC";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.print("상품 번호");
			System.out.print(" | ");
			System.out.print("상품 이름");
			System.out.print(" | ");
			System.out.print("상품 설명");
			System.out.print(" | ");
			System.out.print("가격");
			System.out.print(" | ");
			System.out.print("재고");
			System.out.print("\n-------------------------------");
			System.out.println();
			
			while(rs.next()) {
				int prdNo = rs.getInt("PRD_NO"); //상품 번호
				String prdName = rs.getString("PRD_NAME");//상품 이름
				String descrip = rs.getString("DESCRIPTION"); //상품 설명
				int price = rs.getInt("PRICE"); //가격
				int stock = rs.getInt("STOCK"); //남은 재고
				
				
				System.out.print(prdNo);
				System.out.print(" | ");
				System.out.print(prdName);
				System.out.print(" | ");
				System.out.print(descrip);
				System.out.print(" | ");
				System.out.print(price);
				System.out.print(" | ");
				System.out.print(stock);
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}//Toys
	
	public void Extra() {
		System.out.println("=========기타 상품 페이지입니다.=========");
		
		Connection conn = OracleDB.getOracleConnection();
		String sql = "SELECT PRD_NO, CAT_NO, PRD_NAME, DESCRIPTION, PRICE, STOCK FROM PRODUCT WHERE CAT_NO = 6 ORDER BY PRD_NO ASC";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.print("상품 번호");
			System.out.print(" | ");
			System.out.print("상품 이름");
			System.out.print(" | ");
			System.out.print("상품 설명");
			System.out.print(" | ");
			System.out.print("가격");
			System.out.print(" | ");
			System.out.print("재고");
			System.out.print("\n-------------------------------");
			System.out.println();
			
			while(rs.next()) {
				int prdNo = rs.getInt("PRD_NO"); //상품 번호
				String prdName = rs.getString("PRD_NAME");//상품 이름
				String descrip = rs.getString("DESCRIPTION"); //상품 설명
				int price = rs.getInt("PRICE"); //가격
				int stock = rs.getInt("STOCK"); //남은 재고
				
				
				System.out.print(prdNo);
				System.out.print(" | ");
				System.out.print(prdName);
				System.out.print(" | ");
				System.out.print(descrip);
				System.out.print(" | ");
				System.out.print(price);
				System.out.print(" | ");
				System.out.print(stock);
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}//Extra
	
	public void GotoCart() {
		
		selectNum = MyUtil.sc.nextInt();
		
		
		
	}
	
	

}