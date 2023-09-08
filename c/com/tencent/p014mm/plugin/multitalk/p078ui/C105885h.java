package com.tencent.p014mm.plugin.multitalk.p078ui;

import as3.C103900s0;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import gy3.C87412m;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.h */
public final class C105885h<T> implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ C105883g f314955d;

    /* renamed from: e */
    public final /* synthetic */ List<C103900s0> f314956e;

    /* renamed from: f */
    public final /* synthetic */ String f314957f;

    public C105885h(C105883g gVar, List<C103900s0> list, String str) {
        this.f314955d = gVar;
        this.f314956e = list;
        this.f314957f = str;
    }

    public int compare(Object obj, Object obj2) {
        MultiTalkGroupMember multiTalkGroupMember = (MultiTalkGroupMember) obj;
        MultiTalkGroupMember multiTalkGroupMember2 = (MultiTalkGroupMember) obj2;
        String str = multiTalkGroupMember.f320048d;
        String str2 = multiTalkGroupMember2.f320048d;
        C87412m.m108593f(str2, "o2.usrName");
        int compareTo = str.compareTo(str2);
        C105883g gVar = this.f314955d;
        List<C103900s0> list = this.f314956e;
        String str3 = this.f314957f;
        C87412m.m108593f(str3, "userName");
        int c3 = C105883g.m142290c3(gVar, multiTalkGroupMember, list, str3) + (compareTo > 0 ? 1 : compareTo == 0 ? -1 : 0);
        C105883g gVar2 = this.f314955d;
        List<C103900s0> list2 = this.f314956e;
        String str4 = this.f314957f;
        C87412m.m108593f(str4, "userName");
        return c3 - C105883g.m142290c3(gVar2, multiTalkGroupMember2, list2, str4);
    }
}
