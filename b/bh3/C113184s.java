package bh3;

import bh3.C113177k;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import di3.C86312j;
import java.util.HashMap;

/* renamed from: bh3.s */
public final class C113184s implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public static final C113184s f338677a = new C113184s();

    /* renamed from: b */
    public static boolean f338678b;

    /* renamed from: c */
    public static final HashMap<Integer, C113177k.C113178a> f338679c;

    static {
        new HashMap();
        HashMap<Integer, C113177k.C113178a> hashMap = new HashMap<>();
        hashMap.put(2, C113177k.C113178a.WEBVIEW);
        hashMap.put(8, C113177k.C113178a.STORY);
        hashMap.put(16, C113177k.C113178a.GAME);
        C113177k.C113178a aVar = C113177k.C113178a.LIVE;
        hashMap.put(21, aVar);
        C113177k.C113178a aVar2 = C113177k.C113178a.FINDER;
        hashMap.put(22, aVar2);
        hashMap.put(23, C113177k.C113178a.MUSICPLAYER);
        hashMap.put(32, aVar2);
        hashMap.put(9, C113177k.C113178a.CHATTING);
        hashMap.put(3, C113177k.C113178a.FAV);
        hashMap.put(35, aVar);
        f338679c = hashMap;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        ((C113177k) C86312j.m106911c(C113177k.class)).Aa0(C113177k.C113179b.OVERLAY);
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
    }
}
