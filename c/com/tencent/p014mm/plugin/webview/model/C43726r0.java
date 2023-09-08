package com.tencent.p014mm.plugin.webview.model;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.webview.model.r0 */
public class C43726r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f118180d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f118181e;

    /* renamed from: f */
    public final /* synthetic */ String f118182f;

    /* renamed from: g */
    public final /* synthetic */ String f118183g;

    /* renamed from: h */
    public final /* synthetic */ C85590k1.C85591a f118184h;

    public C43726r0(Context context, LinkedList linkedList, String str, String str2, C85590k1.C85591a aVar) {
        this.f118180d = context;
        this.f118181e = linkedList;
        this.f118182f = str;
        this.f118183g = str2;
        this.f118184h = aVar;
    }

    public void run() {
        Context context = this.f118180d;
        new C85590k1(context).mo119057a(this.f118181e, this.f118182f, this.f118183g, context.getString(C0966R.string.lir), this.f118184h);
    }
}
