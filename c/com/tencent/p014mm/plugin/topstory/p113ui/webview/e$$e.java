package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.lang.ref.WeakReference;
import nj3.C11184p0;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$e */
public class e$$e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Context f117085d;

    /* renamed from: e */
    public final /* synthetic */ String f117086e;

    /* renamed from: f */
    public final /* synthetic */ C19391e f117087f;

    public e$$e(C19391e eVar, Context context, String str) {
        this.f117087f = eVar;
        this.f117085d = context;
        this.f117086e = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C76057w.class;
        if (menuItem != null) {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl shareImage ItemId click:%s", Integer.valueOf(menuItem.getItemId()));
            if (menuItem.getItemId() == 1) {
                C19391e eVar = this.f117087f;
                Context context = this.f117085d;
                String str = this.f117086e;
                eVar.getClass();
                ((C76057w) C86312j.m106911c(cls)).h60(str, new C43272i(eVar, new WeakReference(context)));
            } else if (menuItem.getItemId() == 0) {
                C19391e eVar2 = this.f117087f;
                Context context2 = this.f117085d;
                String str2 = this.f117086e;
                eVar2.getClass();
                if (context2 != null && !TextUtils.isEmpty(str2)) {
                    ((C76057w) C86312j.m106911c(cls)).h60(str2, new C85490j(eVar2, new WeakReference(context2)));
                }
            }
        }
    }
}
