public class Task16 {

    /**
     * @param expectedResult - ожидаемый результат
     * @param actualResult   - фактический результат
     * @param <T>            - Object
     * @return - пустая строка | сообщение об ошибке
     */
    @SuppressWarnings("ConstantConditions")
    <T> String testInputText(T expectedResult, T actualResult) {

        if (expectedResult instanceof Number | actualResult instanceof Number) {
            assert expectedResult instanceof Number;
            Double expect = ((Number) expectedResult).doubleValue();
            assert actualResult instanceof Number;
            Double actual = ((Number) actualResult).doubleValue();

            return expect.equals(actual) ?
                    "" :
                    "expected " + (expectedResult.getClass().getSimpleName().equals("Integer") ? ((Integer) expectedResult).toString() : expectedResult.toString())
                            + ", got " + (actualResult.getClass().getSimpleName().equals("Integer") ? ((Integer) actualResult).toString() : actualResult.toString());
        }
        return expectedResult.equals(actualResult) ? "F" : "expected " + expectedResult + ", " + "got " + actualResult;
    }

}
