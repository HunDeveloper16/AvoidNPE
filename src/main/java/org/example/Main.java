package org.example;

import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //"=="는 주소값을 비교하는데 null은 아무 값을 가지고 있는 상태를 의미한다. 어떻게 비교가 가능한가?
        //null은 기본적으로 참조형 타입의 기본 값이다.
        //정수형 int는 0을 갖는 것 처럼 null도 0번지를 참조하고 있기 때문에 "=="비교가 가능한 것이다.
        String check = null;
        boolean a = (check==null);   // true

        // NPE 피하기
        Boolean check2 = null;

        // 1. value!=null 사용
        // 1-1. 보통 문자열 비교를 할때 .equals()과 null 체크를 같이 쓸때가 있는데 .equals()에 null이 들어가면 NPE가 뜨게 된다.
        check2 = !check2.equals("which one") && check2!=null ? true : false;  // NPE

        // 1-2. null체크를 제일 먼저 해주게 되면 NPE를 피해갈 수 있다.
        check2 = check2!=null && !check2.equals("which one") ? true : false;
        // 기본적으로 .equals()는 최상위 클래스 Object의 메서드로 객체가 아닌 null은 해당 메서드를 가지고 있지 않는다.


        // 2. Objects.isNull() 메서드 사용
        System.out.println(Objects.isNull(check2));  // true
        // Objects 클래스는 Object 클래스의 유틸리티 클래스이다.
        // Object 클래스는 java.lang 패키지에 있으며 Ojects 클래스는 java.util 패키지안에 들어있다.


        // 3.  Apache Commons에서 제공하는 StringUtils 사용
        System.out.println(StringUtils.isEmpty(null); //true
        StringUtils.equals("1", null); //false
        StringUtils.equals(null, "1"); //false
        StringUtils.equals(null,null); // true



    }

}