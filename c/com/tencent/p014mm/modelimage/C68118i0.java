package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p158gt.C76049h;
import p158gt.C76056u;
import p823sg.C101610c;

/* renamed from: com.tencent.mm.modelimage.i0 */
public class C68118i0 implements C76056u {

    /* renamed from: f */
    public static C68118i0 f195773f;

    /* renamed from: a */
    public ConcurrentHashMap<Long, C68122d> f195774a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public C68121c f195775b = new C68121c();

    /* renamed from: c */
    public ConcurrentHashMap<Long, C68123e> f195776c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public ArrayList<Long> f195777d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C68123e> f195778e = new ArrayList<>();

    /* renamed from: com.tencent.mm.modelimage.i0$a */
    public static class C68119a implements C76049h {
    }

    /* renamed from: com.tencent.mm.modelimage.i0$b */
    public static class C68120b {

        /* renamed from: a */
        public String f195779a;
    }

    /* renamed from: com.tencent.mm.modelimage.i0$c */
    public static class C68121c {

        /* renamed from: a */
        public LinkedList<C68120b> f195780a = new LinkedList<>();

        /* renamed from: b */
        public LinkedList<C68120b> f195781b = new LinkedList<>();

        /* renamed from: a */
        public final void mo93630a() {
            int size = this.f195780a.size();
            if (size < 0) {
                int i = 5 - size;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= i) {
                        break;
                    }
                    C68120b bVar = new C68120b();
                    if (Util.isNullOrNil((String) null)) {
                        bVar.f195779a = C92839m.m117079SE();
                    } else {
                        bVar.f195779a = null;
                    }
                    String TY = C92837k0.Bx0().mo127174TY(bVar.f195779a, "", ".jpg", false);
                    if (C86013q1.m106451l(TY) > 0) {
                        Log.m105921e("MicroMsg.SendImgSpeeder", "file has exist %s", TY);
                        z = false;
                    }
                    if (!z) {
                        bVar = null;
                    } else {
                        new C101610c(TY);
                    }
                    this.f195780a.add(bVar);
                    i2++;
                }
                Log.m105925i("MicroMsg.SendImgSpeeder", "add big File pool added size %d , all size %d", Integer.valueOf(i), Integer.valueOf(this.f195780a.size()));
                synchronized (this) {
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < this.f195780a.size(); i3++) {
                        sb.append(this.f195780a.get(i3).f195779a);
                        if (i3 != this.f195780a.size() - 1) {
                            sb.append("-");
                        }
                    }
                    Log.m105919d("MicroMsg.SendImgSpeeder", "sync big des to file %s ", sb.toString());
                    C86709a0.m107535s().mo121142i().mo119676J(348176, sb.toString());
                }
            }
        }

        /* renamed from: b */
        public final void mo93631b() {
            int size = this.f195781b.size();
            if (size < 0) {
                int i = 5 - size;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= i) {
                        break;
                    }
                    C68120b bVar = new C68120b();
                    if (Util.isNullOrNil((String) null)) {
                        bVar.f195779a = C92839m.m117079SE();
                    } else {
                        bVar.f195779a = null;
                    }
                    C92839m Bx0 = C92837k0.Bx0();
                    String str = bVar.f195779a;
                    Bx0.getClass();
                    String TY = Bx0.mo127174TY("THUMBNAIL_DIRPATH://th_" + str, "th_", "", false);
                    if (C86013q1.m106451l(TY) > 0) {
                        Log.m105921e("MicroMsg.SendImgSpeeder", "file has exist %s", TY);
                        z = false;
                    }
                    if (!z) {
                        bVar = null;
                    } else {
                        new C101610c(TY);
                    }
                    this.f195781b.add(bVar);
                    i2++;
                }
                synchronized (this) {
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < this.f195781b.size(); i3++) {
                        sb.append(this.f195781b.get(i3).f195779a);
                        if (i3 != this.f195781b.size() - 1) {
                            sb.append("-");
                        }
                    }
                    Log.m105919d("MicroMsg.SendImgSpeeder", "sync thumb des to file %s ", sb.toString());
                    C86709a0.m107535s().mo121142i().mo119676J(348177, sb.toString());
                }
                Log.m105925i("MicroMsg.SendImgSpeeder", "add big thumb pool added size %d , all size %d", Integer.valueOf(i), Integer.valueOf(this.f195781b.size()));
            }
        }
    }

    /* renamed from: com.tencent.mm.modelimage.i0$d */
    public static class C68122d {

        /* renamed from: a */
        public long f195782a;

        /* renamed from: b */
        public long f195783b;
    }

    /* renamed from: com.tencent.mm.modelimage.i0$e */
    public static class C68123e {

        /* renamed from: a */
        public int f195784a;

        /* renamed from: b */
        public long f195785b;

        /* renamed from: c */
        public boolean f195786c = true;
    }

    /* renamed from: a */
    public static C68118i0 m80524a() {
        if (f195773f == null) {
            synchronized (C68118i0.class) {
                if (f195773f == null) {
                    f195773f = new C68118i0();
                }
            }
        }
        return f195773f;
    }
}
