package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.g */
public final class C6471g implements C15913g.C15916c {

    /* renamed from: a */
    public final /* synthetic */ LinkedList<String> f23533a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<GetGamelifeContactData> f23534b;

    /* renamed from: c */
    public final /* synthetic */ LinkedList<Map<String, String>> f23535c;

    public C6471g(LinkedList<String> linkedList, C1256g<GetGamelifeContactData> gVar, LinkedList<Map<String, String>> linkedList2) {
        this.f23533a = linkedList;
        this.f23534b = gVar;
        this.f23535c = linkedList2;
    }

    /* renamed from: a */
    public final void mo445a(Map<String, C15912f> map) {
        LinkedList<String> linkedList = this.f23533a;
        LinkedList<Map<String, String>> linkedList2 = this.f23535c;
        for (String str : linkedList) {
            C15912f fVar = map.get(str);
            if (fVar != null) {
                linkedList2.add(C90364q0.m113147f(new C13604l("username", fVar.getUsername()), new C13604l("nickname", fVar.getNickname()), new C13604l("avatarUrl", fVar.getAvatarUrl())));
            }
        }
        C1256g<GetGamelifeContactData> gVar = this.f23534b;
        if (gVar != null) {
            gVar.mo894a(new GetGamelifeContactData(this.f23535c, "get contact ok", true));
        }
    }
}
