package r30;

import m30.C88694d;
import s30.C77614a;
import s30.C77615b;

/* renamed from: r30.a */
public class C77483a implements Runnable {
    public void run() {
        C77614a aVar = C77484b.f225929a;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - (((long) C88694d.m110638a()) * 86400000);
        aVar.f226277d.execSQL("ChattingEvent", "DELETE FROM ChattingEvent where timestamp<=" + currentTimeMillis);
        C77615b bVar = C77484b.f225930b;
        bVar.getClass();
        long currentTimeMillis2 = System.currentTimeMillis() - (((long) C88694d.m110638a()) * 86400000);
        bVar.f226279d.execSQL("SnsFeature", "DELETE FROM SnsFeature where timestamp<=" + currentTimeMillis2);
    }
}
