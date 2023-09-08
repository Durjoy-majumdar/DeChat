package com.tencent.p014mm.p136ui.chatting;

import android.os.Bundle;
import android.util.ArrayMap;
import ck3.C67391b;
import eb0.C97625j3;
import java.util.Map;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import q31.C118148a;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUI$$d */
public class ChattingUI$$d implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ Bundle f215285a;

    /* renamed from: b */
    public final /* synthetic */ ChattingUI f215286b;

    public ChattingUI$$d(ChattingUI chattingUI, Bundle bundle) {
        this.f215286b = chattingUI;
        this.f215285a = bundle;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        ArrayMap arrayMap = new ArrayMap();
        C67391b bVar = this.f215286b.f215277j.f215220f;
        int N7 = ChattingUI.m86391N7(C97625j3.m125812b().mo105907v().get(this.f215285a.getString("Chat_User")), bVar);
        arrayMap.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, Integer.valueOf(N7));
        arrayMap.put("is_mute", Integer.valueOf(ChattingUI.m86392O7(N7, bVar)));
        return arrayMap;
    }
}
