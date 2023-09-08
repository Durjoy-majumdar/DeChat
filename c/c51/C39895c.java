package c51;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;

/* renamed from: c51.c */
public class C39895c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f106964d;

    /* renamed from: e */
    public final /* synthetic */ C44561j f106965e;

    /* renamed from: f */
    public final /* synthetic */ WXMediaMessage f106966f;

    /* renamed from: g */
    public final /* synthetic */ C44580q1 f106967g;

    public C39895c(Context context, C44561j jVar, WXMediaMessage wXMediaMessage, C44580q1 q1Var) {
        this.f106964d = context;
        this.f106965e = jVar;
        this.f106966f = wXMediaMessage;
        this.f106967g = q1Var;
    }

    public void run() {
        Context context = this.f106964d;
        C44561j jVar = this.f106965e;
        String str = jVar.field_packageName;
        WXMediaMessage wXMediaMessage = this.f106966f;
        String str2 = jVar.field_appId;
        String str3 = jVar.field_openId;
        C44565l.m49000t(context, str, wXMediaMessage, str2, str3, 0, this.f106967g, (Bundle) null);
    }
}
