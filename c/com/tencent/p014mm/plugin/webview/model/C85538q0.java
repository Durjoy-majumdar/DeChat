package com.tencent.p014mm.plugin.webview.model;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import pe3.C47465a;
import te3.C90433r43;
import te3.C90438s43;
import te3.C90442v43;
import te3.C90445w43;

/* renamed from: com.tencent.mm.plugin.webview.model.q0 */
public class C85538q0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f249277a;

    /* renamed from: b */
    public final /* synthetic */ C43791l f249278b;

    /* renamed from: c */
    public final /* synthetic */ C85523o0.C85537c f249279c;

    /* renamed from: d */
    public final /* synthetic */ C85523o0.C43723a f249280d;

    /* renamed from: e */
    public final /* synthetic */ String f249281e;

    /* renamed from: f */
    public final /* synthetic */ int f249282f;

    /* renamed from: g */
    public final /* synthetic */ Dialog f249283g;

    public C85538q0(WeakReference weakReference, C43791l lVar, C85523o0.C85537c cVar, C85523o0.C43723a aVar, String str, int i, Dialog dialog) {
        this.f249277a = weakReference;
        this.f249278b = lVar;
        this.f249279c = cVar;
        this.f249280d = aVar;
        this.f249281e = str;
        this.f249282f = i;
        this.f249283g = dialog;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        Context context = (Context) this.f249277a.get();
        Log.m105925i("MicroMsg.OauthAuthorizeLogic", "onSceneEnd doOauthAuthorize errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (context != null && this.f249278b != null && this.f249279c != null && this.f249280d != null) {
            Bundle bundle = new Bundle();
            if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof C90433r43)) {
                C85523o0.C85524b.m105554c(false, str, bundle, context, this.f249278b, this.f249279c, this.f249280d, this.f249282f, i2, this.f249283g);
                return;
            }
            C90433r43 r432 = (C90433r43) aVar;
            bundle.putString("oauth_url", this.f249281e);
            LinkedList<C90442v43> linkedList = r432.f259762d;
            ArrayList arrayList = new ArrayList();
            if (linkedList != null && !linkedList.isEmpty()) {
                int i3 = 0;
                while (i3 < linkedList.size()) {
                    try {
                        arrayList.add(linkedList.get(i3).toByteArray());
                        i3++;
                    } catch (IOException e) {
                        Log.m105929w("MicroMsg.OauthAuthorizeLogic", "oauthScopeInfoListToBytesList index:%d, exp:%s ", Integer.valueOf(i3), e.getLocalizedMessage());
                        arrayList.clear();
                    }
                }
            }
            bundle.putSerializable("scope_list", arrayList);
            bundle.putString("appname", r432.f259763e);
            bundle.putString("appicon_url", r432.f259764f);
            bundle.putString("redirect_url", r432.f259765g);
            bundle.putBoolean("is_recent_has_auth", r432.f259766h);
            bundle.putBoolean("is_silence_auth", r432.f259767i);
            bundle.putBoolean("is_call_server_when_confirm", r432.f259768j);
            LinkedList<C90438s43> linkedList2 = r432.f259769n;
            C85541t0 t0Var = C85541t0.f249286a;
            ArrayList arrayList2 = new ArrayList();
            if (!Util.isNullOrNil((List) linkedList2) && linkedList2 != null) {
                for (C90438s43 byteArray : linkedList2) {
                    try {
                        arrayList2.add(byteArray.toByteArray());
                    } catch (IOException unused) {
                        Log.m105928w(C85541t0.f249287b, "oauthAvatarListToBytesList exception");
                        arrayList2.clear();
                    }
                }
            }
            bundle.putSerializable("avatar_list", arrayList2);
            bundle.putBoolean("is_use_new_page", r432.f259770o);
            bundle.putBoolean("is_ban_modify_avatar", r432.f259771p);
            C90445w43 w432 = r432.f259777v;
            if (w432 != null) {
                bundle.putString("create_avatar_title", w432.f259920e);
            }
            bundle.putInt("avatar_limit", r432.f259772q);
            bundle.putInt("default_avatar_id", r432.f259773r);
            bundle.putString("default_headimg_url", r432.f259774s);
            bundle.putString("default_headimg_fileid", r432.f259775t);
            bundle.putBoolean("is_tourist_oauth", r432.f259776u);
            bundle.putString("tourist_banner_wording", r432.f259777v.f259921f);
            C85523o0.C85524b.m105554c(true, str, bundle, context, this.f249278b, this.f249279c, this.f249280d, this.f249282f, i2, this.f249283g);
        }
    }
}
