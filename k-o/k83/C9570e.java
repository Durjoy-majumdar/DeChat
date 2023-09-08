package k83;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: k83.e */
public class C9570e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9571f f29808d;

    public C9570e(C9571f fVar) {
        this.f29808d = fVar;
    }

    public void run() {
        C9571f fVar = this.f29808d;
        fVar.getClass();
        fVar.execSQL("WebViewHistory", "delete from WebViewHistory where  timeStamp < " + ((System.currentTimeMillis() / 1000) - 604800));
        C9571f fVar2 = this.f29808d;
        int count = fVar2.getCount() + -500;
        if (count > 0) {
            boolean execSQL = fVar2.execSQL("WebViewHistory", "delete from WebViewHistory order by timeStamp limit " + count);
            Log.m105924i("MicroMsg.WebViewHistoryStorage", "deleteItem: " + execSQL);
        }
    }
}
