package p172io.flutter.plugin.report;

/* renamed from: io.flutter.plugin.report.FlutterAnrReport */
public class FlutterAnrReport {
    private static ReportCallback callback;

    /* renamed from: io.flutter.plugin.report.FlutterAnrReport$ReportCallback */
    public interface ReportCallback {
        void onReport(String str, long j);
    }

    private static void report(String str, long j) {
        ReportCallback reportCallback = callback;
        if (reportCallback != null) {
            reportCallback.onReport(str, j);
        }
    }

    public static void setCallback(ReportCallback reportCallback) {
        callback = reportCallback;
    }
}
