package com.ljs.and.controlflow1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // controlflow1
        var ball = 4
        if (ball > 3) {
            Log.d("ControlFlow", "4볼로 출루합니다.")
        } else {
            Log.d("ControlFlow", "타석에서 다음타구를 기다립니다.")
        }


        // controlflow2
        var a = 1
        var b = 2
        var c = 3

        if (a < b) {
            Log.d("ControlFlow", "1 : a 는 b 보다 작습니다.")
        }

        if (a < c) {
            Log.d("ControlFlow", "1 : a 는 c 보다 작습니다.")
        }

        if (a < b) {
            Log.d("ControlFlow", "2 : a 는 b 보다 작습니다.")
        } else if (a < c) {
            Log.d("ControlFlow", "2 : a 는 c 보다 작습니다.")
        }


        // controlflow3
        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43

        val era = if (eraOfRyu < eraOfDegrom) {
            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        } else {
            Log.d("MLB_Result", "2019 디그롬이 류현진을 이겼습니다.")
            eraOfDegrom
        }

        Log.d("MLB_Result", "2019 MLB에서 가장 높은 ERA는 ${era}입니다.")


        // controlflow4
        var now = 10
        when (now) {
            8 -> {
                Log.d("when", "현재 시간은 8시입니다.")
            }
            9 -> {
                Log.d("when", "현재 시간은 9시입니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 9시가아닙니다.")
            }
        }

        now = 9
        when (now) {
            8, 9 -> {
                Log.d("when", "현재 시간은 8시 또는 9시 입니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 9시가아닙니다.")
            }
        }

        var ageOfMichael = 19
        when (ageOfMichael) {
            in 10..19 -> {
                Log.d("when", "마이클은 10대 입니다.")
            }
            !in 10..19 -> {
                Log.d("when", "마이클은 10대가 아닙니다.")
            }
            else -> {
                Log.d("when", "마이클의 나이를 알 수 없습니다.")
            }
        }

        var currentTime = 6;
        when {
            currentTime == 5 -> {
                Log.d("when", "현재 시간은 5시입니다.")
            }
            currentTime > 5 -> {
                Log.d("when", "현재 시간은 5시가 넘었습니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 5시 이전입니다.")
            }
        }


        // array

        var students = IntArray(10)
        var longArray = LongArray(10)
        var charArray = CharArray(10)
        var floatArray = FloatArray(10)
        var doubleArray = DoubleArray(10)
        // arrayOf 함수를 사용하면 선언과 동시에 값을 입력할 수 있다.
        var intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        // intArray 변수에는 1부터 10까지의 값이 각각의 배열 공간에 저장됨

        // 2.문자열 타입 배열 선언하기
        var stringArray = Array(10, { item -> "" })
        // arrayOf 합수로 값을 직접 입력해서 배열을 생성할 수 있음
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        // 3. 앞에서 선언한 students 변수에 값넣기
        // 가. 대괄호를 사용하는 방법
        students[0] = 90
        students[1] = 90
        students[2] = 90
        students[3] = 90
        students[4] = 90
        // 나. set함수를 사용하는 방법
        students.set(5, 95)
        students.set(6, 95)
        students.set(7, 95)
        students.set(8, 95)
        students.set(9, 95)


        // 4. 값 변경 해보기
        intArray[6] = 137
        intArray.set(9, 200)

        // 5. 배열 값 사용하기
        var seventhValue = intArray[6]
        Log.d("Array", "여덟 번째 intArray의 값은 ${seventhValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array", "열 번째 intArray의 값은 ${seventhValue}입니다.")

        // 6. 변수에 담지 않고 직접 사용
        Log.d("Array", "첫 번째 dayArray의 값은 ${dayArray[0]}입니다.")
        Log.d("Array", "여섯 번째 dayArray의 값은 ${dayArray.get(5)}입니다.")


        // collection list
        // 1. 값으로 컬렉션 생성
        var mutableList = mutableListOf("MON", "TUE", "WED")
        // 값 추가
        mutableList.add("TUH")
        // 값을 꺼낸다
        Log.d("Collection", "mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다")
        Log.d("Collection", "mutableList의 첫 번째 값은 ${mutableList.get(1)}입니다.")

        // 2. 빈 컬렉션 생성하기
        var stringList = mutableListOf<String>()    // 비어있는 문자열로 컬렉션 생성성
        // 값 추가
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        // 값 변경
        stringList.set(1, "요일변경")
        // 사용
        Log.d("Collection", "stringList의 두 번째 값은 ${stringList.get(1)}입니다.")
        // 삭제
        stringList.removeAt(1)
        Log.d("Collection", "stringList의 두 번째 값은 ${stringList.get(1)}입니다.")
        // 개수 출력
        Log.d("Collection", "stringList에는 ${stringList.size}개의 값이 있습니다.")


        // collection Set

        // 1. 셋 생성하고 값 추가하기
        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN")  // 동일한 값은 입력 되지 않는다.

        // 2. 전체 데이터 출력해보기
        Log.d("Collection", "Set 전체 출력 = ${set}")

        // 3. 특정 값 삭제 하기
        set.remove("FEB")
        Log.d("Collection", "Set 전체 출력 = ${set}")



        // collection map

        // 1. 맵 생성하기
        var map = mutableMapOf<String, String>()

        // 2. 값 넣기
        map.put("키1", "값2")
        map.put("키2", "값2")
        map.put("키3", "값3")
        // 3. 값 사용하기
        var variable = map.get("키2")
        Log.d("Collection", "키2의 값은 ${variable}입니다.")
        // 4. 값 수정하기
        map.put("키2", "두 번재 값 수정")
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다.")
        // 5. 값 삭제하기
        map.remove("키2")
        // 5.1 없는 값을 불러오면 null 값 출력
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다.")



        // for

        // 1. 일반적인 반목문 사용으로 열 번 반복하기
        for(index in 1..10){
            Log.d("For", "현재 숫자는 ${index}")
        }
        // 2. 마지막 숫자 제거하기
        var array = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
        for(index in 0 until array.size){
            Log.d("For", "현재 월은 ${array}")
        }
        // 3. 건너뛰기
        for(index in 0..10 step 3){
            Log.d("For", "건너뛰기 : ${index}")
        }
        // 4. 감소시키기
        for(index in 10 downTo 0){
            Log.d("For", "감소 : ${index}")
        }
        // 4.1건너뛰면서 감소
        for(index in 10 downTo 0 step 3){
            Log.d("For", "건너뛰면서 감소 : ${index}")
        }
        // 5.1 배열 컬렉션 사용
        for (month in array){
            Log.d("For", "현재 월은 ${month}")
        }


        // while

        // 1. 일반적인 while 사용하기
        var current = 1
        val until = 12
        while (current < until)  {
            Log.d("while", "현재 월은 ${current}")
            // current를 1씩 증가 시켜 열한번 반복 후 while 빠져나감
            current = current + 1
        }

        // 2. do ~ while 사용하기
        var game = 1
        var match = 6
        do {
            Log.d("while", "${game}게임 이겼습니다. 우승까지 ${match}게임 남앗다")
            game += 1
        }while(game < match)




        // functin

        // 4. 반환값이 있는 함수 square 사용하기
        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 ${squareResult}입니다.")

        // 5. 반환값이 없는 함수는 그냥 실행
        printSum(3, 5)

        // 6. 입력값이 없는 함수 사용하기
        val PI = getPi()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}")








    }


    // 1. 반환값이 있는 함수
    fun square(x :Int):Int{
        return x * x
    }

    // 2. 반환값이 없는 함수
    fun printSum(x: Int, y:Int){
        Log.d("fun", "x + y = ${x + y}")
    }

    // 3. 입력값 없이 반환값만 이쓴ㄴ 함수
    fun getPi(): Double{
        return 3.14
    }

    // 7. 기본값을 갖는 함수
    fun newFunction(name:String, age:Int = 29, weight:Double = 65.5){
        Log.d("fun", "name의 값은 ${name}")
        Log.d("fun", "age의 값은 ${age}")
        Log.d("fun", "weight의 값은 ${weight}")

    }
}
