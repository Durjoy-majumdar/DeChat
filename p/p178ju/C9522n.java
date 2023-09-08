package p178ju;

import android.os.Bundle;
import android.view.View;
import c62.C0419f;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.Map;
import wd3.C53155r0;

/* renamed from: ju.n */
public class C9522n extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f29699e;

    /* renamed from: f */
    public final /* synthetic */ Map f29700f;

    /* renamed from: g */
    public final /* synthetic */ String f29701g;

    /* renamed from: h */
    public final /* synthetic */ WeakReference f29702h;

    /* renamed from: i */
    public final /* synthetic */ WeakReference f29703i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9522n(C9523o oVar, int i, C53155r0 r0Var, Bundle bundle, Map map, String str, WeakReference weakReference, WeakReference weakReference2) {
        super(i, r0Var);
        this.f29699e = bundle;
        this.f29700f = map;
        this.f29701g = str;
        this.f29702h = weakReference;
        this.f29703i = weakReference2;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        try {
            String string = this.f29699e.getString("send_msg_username", "");
            Map map = this.f29700f;
            String nullAs = Util.nullAs((String) map.get(this.f29701g + ".chatname"), "");
            OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new OpenIMSucceedContactLogStruct();
            openIMSucceedContactLogStruct.mo1064t(string);
            openIMSucceedContactLogStruct.f10024f = 2;
            openIMSucceedContactLogStruct.f10025g = 2;
            openIMSucceedContactLogStruct.f10028j = 1;
            openIMSucceedContactLogStruct.mo86054n();
            ((C0419f) C86312j.m106911c(C0419f.class)).Hx0(nullAs);
            ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_jump_chat", this.f29700f, this.f29699e, this.f29702h, this.f29703i);
        } catch (Throwable unused) {
        }
    }
}
