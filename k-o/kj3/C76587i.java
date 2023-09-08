package kj3;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C97625j3;
import java.util.LinkedList;
import kb0.C33868l;
import kr0.C76629w0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import te3.ce4;

/* renamed from: kj3.i */
public class C76587i {

    /* renamed from: kj3.i$a */
    public class C76588a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ Context f224167d;

        /* renamed from: e */
        public final /* synthetic */ String f224168e;

        /* renamed from: f */
        public final /* synthetic */ boolean f224169f;

        public C76588a(Context context, String str, boolean z) {
            this.f224167d = context;
            this.f224168e = str;
            this.f224169f = z;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C97625j3.m125815e().mo123470p(1176, this);
            int i3 = 1;
            Log.m105919d("MicroMsg.AppBrandServiceHelper", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.TRUE);
            if (i != 0 || i2 != 0) {
                C76912y0.makeText(this.f224167d, (int) C0966R.string.hd9, 0).show();
                UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
                UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
                aVar.f193996a = this.f224168e;
                if (!this.f224169f) {
                    i3 = 2;
                }
                aVar.f193997b = i3;
                aVar.f193998c = 2;
                updateWxaOptionsEvent.publish();
            }
        }
    }

    /* renamed from: a */
    public static String m92181a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(str);
        if (N2 != null && N2.mo113940m2() != null) {
            return N2.field_appId;
        }
        Log.m105920e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    /* renamed from: b */
    public static String m92182b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(str);
        if (N2 != null && N2.mo113940m2() != null) {
            return N2.mo113940m2().f239497m;
        }
        Log.m105920e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    /* renamed from: c */
    public static String m92183c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(str);
        if (N2 != null) {
            return N2.field_nickname;
        }
        Log.m105920e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    /* renamed from: d */
    public static void m92184d(Context context, String str, boolean z) {
        UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
        UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
        aVar.f193996a = str;
        aVar.f193997b = z ? 2 : 1;
        aVar.f193998c = 2;
        updateWxaOptionsEvent.publish();
        LinkedList linkedList = new LinkedList();
        ce4 ce4 = new ce4();
        ce4.f131684f = str;
        ce4.f131683e = z ? 1 : 0;
        ce4.f131682d = 3;
        linkedList.add(ce4);
        C97625j3.m125815e().mo123455a(1176, new C76588a(context, str, z));
        C97625j3.m125815e().mo123460f(new C33868l(linkedList));
    }
}
