package p661qj;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import yc3.C38992a;

/* renamed from: qj.d */
public class C101201d implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f296340a = 0;

    static {
        C30650a.m39147b(new C101201d(), "//fav");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        String str2 = strArr[1];
        str2.getClass();
        if (str2.equals("resendfavitem")) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 39;
            aVar.f264851q = strArr[2];
            aVar.f264852r = strArr[3];
            favoriteOperationEvent.asyncPublish(Looper.getMainLooper());
        } else if (str2.equals("uploadfavitem")) {
            FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent2.f264833d;
            aVar2.f264835a = 38;
            aVar2.f264851q = strArr[2];
            favoriteOperationEvent2.asyncPublish(Looper.getMainLooper());
        }
        return true;
    }
}
