public static int dayOfYear(int month, int dayOfMonth, int year) {
    import java.util.GregorianCalendar;
    GregorianCalendar gc = new GregorianCalendar();
    gc.set(GregorianCalendar.DAY_OF_MONTH, 8);
    gc.set(GregorianCalendar.MONTH, GregorianCalendar.JUNE);
    gc.set(GregorianCalendar.YEAR, 2010);
    dayOfMonth = gc.get(GregorianCalendar.DAY_OF_YEAR);
    return dayOfMonth;
}