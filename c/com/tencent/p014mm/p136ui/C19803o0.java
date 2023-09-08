package com.tencent.p014mm.p136ui;

import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.LinkedList;
import p151er.C75651n;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.ui.o0 */
public class C19803o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f56350d;

    /* renamed from: e */
    public final /* synthetic */ FinderIconViewTipPreference f56351e;

    /* renamed from: f */
    public final /* synthetic */ boolean f56352f;

    /* renamed from: g */
    public final /* synthetic */ boolean f56353g;

    /* renamed from: h */
    public final /* synthetic */ FindMoreFriendsUI f56354h;

    public C19803o0(FindMoreFriendsUI findMoreFriendsUI, int i, FinderIconViewTipPreference finderIconViewTipPreference, boolean z, boolean z2) {
        this.f56354h = findMoreFriendsUI;
        this.f56350d = i;
        this.f56351e = finderIconViewTipPreference;
        this.f56352f = z;
        this.f56353g = z2;
    }

    public void run() {
        Class cls = C75651n.class;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = this.f56350d;
        FindMoreFriendsUI findMoreFriendsUI = this.f56354h;
        int i = FindMoreFriendsUI.f55665Z0;
        findMoreFriendsUI.getClass();
        int sk02 = ((C75651n) C86312j.m106911c(cls)).sk0() % 2;
        String str = "";
        String str2 = sk02 != 0 ? sk02 != 1 ? str : "天天向上黄河" : "天天向上黄河之水天上来奔来天天向上";
        nn12.f184504f = str2.substring(0, findMoreFriendsUI.f55694W0.nextInt(str2.length()));
        this.f56354h.getClass();
        if (((C75651n) C86312j.m106911c(cls)).sk0() != 4) {
            str = "http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0";
        }
        nn12.f184505g = str;
        this.f56354h.getClass();
        nn12.f184503e = WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED;
        LinkedList<String> linkedList = nn12.f184511p;
        this.f56354h.getClass();
        ArrayList arrayList = new ArrayList();
        int sk03 = ((C75651n) C86312j.m106911c(cls)).sk0();
        if (sk03 == 5) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else if (sk03 == 6) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else if (sk03 == 7) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else if (sk03 == 8) {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        } else {
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
            arrayList.add("http://wx.qlogo.cn/finderhead/Q3auHgzwzM7n3ckWMDzB3NicngLXjxuAygzY13aAT8Wle00nibjiaBFHA/0");
        }
        linkedList.addAll(arrayList);
        this.f56354h.mo25896Y(nn12, this.f56351e, this.f56352f, ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77253Y5(), this.f56353g, (C64586nn1) null);
    }
}
