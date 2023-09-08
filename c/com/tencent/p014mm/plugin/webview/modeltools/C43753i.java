package com.tencent.p014mm.plugin.webview.modeltools;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import java.util.ArrayList;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.i */
public class C43753i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Activity f118220d;

    /* renamed from: e */
    public final /* synthetic */ Intent f118221e;

    /* renamed from: f */
    public final /* synthetic */ Intent f118222f;

    /* renamed from: g */
    public final /* synthetic */ Intent[] f118223g;

    /* renamed from: h */
    public final /* synthetic */ C43754j f118224h;

    public C43753i(C43754j jVar, Activity activity, Intent intent, Intent intent2, Intent[] intentArr) {
        this.f118224h = jVar;
        this.f118220d = activity;
        this.f118221e = intent;
        this.f118222f = intent2;
        this.f118223g = intentArr;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 101) {
            this.f118224h.mo68065h(this.f118220d, this.f118221e);
        } else if (itemId == 102) {
            C43754j jVar = this.f118224h;
            Activity activity = this.f118220d;
            Intent intent = this.f118222f;
            Intent[] intentArr = this.f118223g;
            jVar.getClass();
            if (intentArr != null && intentArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (Intent intent2 : intentArr) {
                    if (!jVar.mo68062e(intent2)) {
                        arrayList.add(intent2);
                    }
                }
                if (arrayList.isEmpty()) {
                    intent.removeExtra("android.intent.extra.INITIAL_INTENTS");
                } else {
                    Intent[] intentArr2 = new Intent[arrayList.size()];
                    arrayList.toArray(intentArr2);
                    intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr2);
                }
                jVar.mo68061d(activity, intent);
            }
        }
    }
}
