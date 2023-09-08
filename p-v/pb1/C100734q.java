package pb1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.DeleteFavItemEvent;
import com.tencent.p014mm.autogen.events.FavDeleteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import ke3.C88144b;
import o40.C61926c;
import oa1.C117731d;
import p272xq.C102713f;
import p500dy.C97560f;
import p640ox.C77049b;
import p682rz.C101491u;
import p749xh.C102666r2;
import p749xh.C66261f3;
import p763ym.C79138l;
import p823sg.C90193h;
import qb1.C101089b;
import qb1.C101092c;
import qc0.C101093a;
import qc0.C101106m;
import rb1.C101367a;
import rb1.C101369c;
import rf3.C89961a;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101825od0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101836ry2;
import te3.C101841sc0;
import te3.C101850ud0;
import te3.C101854uy2;
import te3.C101855vc0;
import te3.C101861wc0;
import te3.C101871zc0;
import te3.C64682rk1;
import te3.C64853yd0;
import te3.C77911cd0;
import wb1.C102413r;
import wb1.C102415t;
import wb1.C102417u;
import wb1.C102421x;
import wc3.C102429k;
import xb1.C102612a;
import xb1.C102613c;
import xb1.C102614d;
import xb1.C102615e;

/* renamed from: pb1.q */
public class C100734q {

    /* renamed from: a */
    public static HashMap<Long, ArrayList<String>> f295126a = new HashMap<>();

    /* renamed from: b */
    public static long f295127b = 0;

    /* renamed from: c */
    public static Boolean f295128c = null;

    /* renamed from: pb1.q$a */
    public class C100735a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102666r2 f295129d;

        /* renamed from: e */
        public final /* synthetic */ boolean f295130e;

        /* renamed from: f */
        public final /* synthetic */ String f295131f;

        /* renamed from: g */
        public final /* synthetic */ int f295132g;

        /* renamed from: h */
        public final /* synthetic */ Runnable f295133h;

        public C100735a(C102666r2 r2Var, boolean z, String str, int i, Runnable runnable) {
            this.f295129d = r2Var;
            this.f295130e = z;
            this.f295131f = str;
            this.f295132g = i;
            this.f295133h = runnable;
        }

        public void run() {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, do on worker thread", Integer.valueOf(this.f295129d.field_id), Long.valueOf(this.f295129d.field_localId), Boolean.valueOf(this.f295130e));
            C100734q.m131862n(this.f295129d, this.f295130e, this.f295131f, this.f295132g);
            MMHandlerThread.postToMainThread(this.f295133h);
            C100734q.m131866p(this.f295129d);
        }
    }

    /* renamed from: A */
    public static String m131809A() {
        return C86709a0.m107535s().f251806d + "favorite" + "/music/";
    }

    /* renamed from: A0 */
    public static void m131810A0(C100746u uVar) {
        C100746u Yt;
        Class cls = C100718j1.class;
        int bD = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142253bD(uVar.field_favLocalId, 0);
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, upload data status:%d, favlocalId:%d", Integer.valueOf(bD), Long.valueOf(uVar.field_favLocalId));
        C100755z Yt2 = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(uVar.field_favLocalId);
        if (Yt2 == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
        } else if (Yt2.mo140176C2()) {
            Log.m105924i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus waiting server upload skip.");
        } else {
            int i = uVar.field_status;
            if (i == 3 && bD != i && Yt2.field_type == 18 && (Yt = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(uVar.field_dataId)) != null && Yt.field_status == 3) {
                m131848g(uVar, Yt2);
            } else if (bD == 1) {
                if (Yt2.mo140192z2()) {
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(15, uVar.field_favLocalId);
                } else {
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(4, uVar.field_favLocalId);
                }
                Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, continue upload data, favlocalId:%d, favId:%d, itemStatus:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt2.field_id), Integer.valueOf(Yt2.field_itemStatus));
            } else if (bD == 2) {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(6, uVar.field_favLocalId);
                Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d, itemStatus:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt2.field_id), Integer.valueOf(Yt2.field_itemStatus));
            } else if (bD != 3) {
                if (bD == 4) {
                    if (Yt2.mo140192z2()) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(16, uVar.field_favLocalId);
                    } else {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(6, uVar.field_favLocalId);
                    }
                    C115669n.INSTANCE.mo160131h(10659, 0, Integer.valueOf(Yt2.field_type), -5, Long.valueOf(m131817H(Yt2)), Long.valueOf(C100695a0.m131726a(Yt2.field_localId)));
                    Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt2.field_id), Integer.valueOf(Yt2.field_itemStatus));
                }
            } else if (Yt2.field_type == 18) {
                m131848g(uVar, Yt2);
            } else if (Yt2.mo140192z2()) {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(17, uVar.field_favLocalId);
                Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start mod faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt2.field_id), Integer.valueOf(Yt2.field_itemStatus));
                ((C102417u) ((C100718j1) C86312j.m106911c(cls)).mo128203Ly()).mo141993c();
            } else {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(9, uVar.field_favLocalId);
                Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start send faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt2.field_id), Integer.valueOf(Yt2.field_itemStatus));
                ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
            }
        }
    }

    /* renamed from: B */
    public static String m131811B() {
        return C86709a0.m107535s().f251806d + "favorite" + "/voice/";
    }

    /* renamed from: C */
    public static String m131812C() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("favorite");
        sb.append("/web/");
        return sb.toString();
    }

    /* renamed from: D */
    public static C101834rc0 m131813D(C102713f fVar) {
        return fVar == null ? new C101834rc0() : fVar.mo140188w0().f298618f.size() == 0 ? new C101834rc0() : fVar.mo140188w0().f298618f.get(0);
    }

    /* renamed from: E */
    public static long m131814E() {
        long S = m131828S() - ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERFINO_FAV_USED_CAPACITY_LONG, 0L)).longValue();
        if (S < 0) {
            return 1024;
        }
        return S;
    }

    /* renamed from: F */
    public static C101861wc0 m131815F(int i, C101801kd0 kd02, C64853yd0 yd02) {
        LinkedList<C101834rc0> linkedList;
        LinkedList<C101834rc0> linkedList2;
        if (kd02 == null) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "proto item is null");
            return null;
        }
        C101861wc0 wc02 = new C101861wc0();
        C101835rd0 rd02 = kd02.f298616d;
        if (rd02 != null) {
            wc02.f299733f = rd02.f299348f;
            wc02.f299734g = rd02.f299354o;
            wc02.f299735h = rd02.f299362w;
            wc02.f299736i = rd02.f299344B;
        }
        if (yd02 != null) {
            LinkedList<String> linkedList3 = yd02.f186494d;
            if (linkedList3 != null) {
                wc02.f299737j.addAll(linkedList3);
            }
            LinkedList<String> linkedList4 = yd02.f186495e;
            if (linkedList4 != null) {
                wc02.f299737j.addAll(linkedList4);
            }
        }
        wc02.f299739o = kd02;
        wc02.f299738n = i;
        switch (i) {
            case 1:
                wc02.f299731d = "";
                wc02.f299732e = kd02.f298628s;
                return wc02;
            case 2:
                LinkedList<C101834rc0> linkedList5 = kd02.f298618f;
                if (linkedList5 != null && linkedList5.size() > 0) {
                    wc02.f299731d = kd02.f298618f.get(0).f299297d;
                }
                return wc02;
            case 3:
            case 16:
                break;
            case 4:
                LinkedList<C101834rc0> linkedList6 = kd02.f298618f;
                if (linkedList6 != null && !linkedList6.isEmpty()) {
                    wc02.f299731d = kd02.f298618f.get(0).f299297d;
                    break;
                }
            case 5:
                C101756ae0 ae02 = kd02.f298622j;
                if (ae02 != null) {
                    wc02.f299731d = ae02.f297863d;
                    wc02.f299732e = ae02.f297867h;
                }
                if (Util.isNullOrNil(wc02.f299731d) && (linkedList = kd02.f298618f) != null && !linkedList.isEmpty()) {
                    wc02.f299731d = kd02.f298618f.get(0).f299297d;
                }
                if (Util.isNullOrNil(wc02.f299732e) && rd02 != null) {
                    wc02.f299732e = rd02.f299364y;
                }
                return wc02;
            case 6:
                String str = kd02.f298624o;
                wc02.f299731d = str;
                if (Util.isNullOrNil(str)) {
                    C101871zc0 zc02 = kd02.f298620h;
                    if (zc02 != null) {
                        wc02.f299731d = zc02.f299958o;
                        wc02.f299732e = zc02.f299956j;
                    }
                } else {
                    C101871zc0 zc03 = kd02.f298620h;
                    if (zc03 != null) {
                        wc02.f299732e = zc03.f299958o;
                    }
                }
                return wc02;
            case 7:
            case 21:
                LinkedList<C101834rc0> linkedList7 = kd02.f298618f;
                if (linkedList7 != null && !linkedList7.isEmpty()) {
                    wc02.f299731d = kd02.f298618f.get(0).f299297d;
                    wc02.f299732e = kd02.f298618f.get(0).f299301f;
                }
                return wc02;
            case 8:
                String str2 = kd02.f298626q;
                wc02.f299731d = str2;
                if (Util.isNullOrNil(str2) && (linkedList2 = kd02.f298618f) != null && !linkedList2.isEmpty()) {
                    wc02.f299731d = kd02.f298618f.get(0).f299297d;
                }
                return wc02;
            case 10:
            case 11:
                C101793jd0 jd02 = kd02.f298634y;
                if (jd02 != null) {
                    wc02.f299731d = jd02.f298511d;
                    wc02.f299732e = jd02.f298513f;
                }
                return wc02;
            case 12:
            case 15:
                C101850ud0 ud02 = kd02.f298604C;
                if (ud02 != null) {
                    wc02.f299731d = ud02.f299618d;
                    wc02.f299732e = ud02.f299620f;
                }
                return wc02;
            case 14:
            case 18:
                LinkedList<C101834rc0> linkedList8 = kd02.f298618f;
                if (linkedList8 == null) {
                    return null;
                }
                Iterator<C101834rc0> it = linkedList8.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C101834rc0 next = it.next();
                        if (1 == next.f299258I) {
                            wc02.f299731d = next.f299301f;
                        }
                    }
                }
                return wc02;
            default:
                Log.m105929w("MicroMsg.Fav.FavApiLogic", "unknown type %d", Integer.valueOf(i));
                return wc02;
        }
        return wc02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r1 != 18) goto L_0x00d1;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m131816G(pb1.C100755z r11) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r11.field_type
            r2 = 1
            if (r1 == r2) goto L_0x00bb
            r3 = 2
            if (r1 == r3) goto L_0x009b
            r4 = 3
            if (r1 == r4) goto L_0x0091
            r5 = 4
            if (r1 == r5) goto L_0x0091
            r6 = 5
            if (r1 == r6) goto L_0x0084
            r6 = 8
            if (r1 == r6) goto L_0x009b
            r6 = 14
            if (r1 == r6) goto L_0x0028
            r6 = 16
            if (r1 == r6) goto L_0x0091
            r6 = 18
            if (r1 == r6) goto L_0x0028
            goto L_0x00d1
        L_0x0028:
            te3.kd0 r11 = r11.field_favProto
            java.util.LinkedList<te3.rc0> r11 = r11.f298618f
            java.util.Iterator r11 = r11.iterator()
            r0 = 0
            r1 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0035:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L_0x0063
            java.lang.Object r9 = r11.next()
            te3.rc0 r9 = (te3.C101834rc0) r9
            int r10 = r9.f299258I
            if (r10 == r2) goto L_0x0052
            if (r10 == r3) goto L_0x004f
            if (r10 == r5) goto L_0x004c
            int r8 = r8 + 1
            goto L_0x0035
        L_0x004c:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x004f:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x0052:
            java.lang.String r10 = r9.f299301f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0035
            java.lang.String r9 = r9.f299301f
            byte[] r9 = r9.getBytes()
            int r9 = r9.length
            int r1 = r1 + r9
            goto L_0x0035
        L_0x0063:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r11[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r11[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r11[r4] = r0
            java.lang.String r0 = "%d:%d:%d:%d"
            java.lang.String r11 = java.lang.String.format(r0, r11)
            return r11
        L_0x0084:
            te3.kd0 r11 = r11.field_favProto     // Catch:{ Exception -> 0x008b }
            te3.ae0 r11 = r11.f298622j     // Catch:{ Exception -> 0x008b }
            java.lang.String r11 = r11.f297867h     // Catch:{ Exception -> 0x008b }
            goto L_0x008d
        L_0x008b:
            java.lang.String r11 = ""
        L_0x008d:
            r0.append(r11)
            goto L_0x00d1
        L_0x0091:
            te3.rc0 r11 = m131813D(r11)
            int r11 = r11.f299338y
            r0.append(r11)
            goto L_0x00d1
        L_0x009b:
            r1 = 0
            te3.kd0 r11 = r11.field_favProto
            java.util.LinkedList<te3.rc0> r11 = r11.f298618f
            java.util.Iterator r11 = r11.iterator()
        L_0x00a5:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r3 = r11.next()
            te3.rc0 r3 = (te3.C101834rc0) r3
            if (r3 == 0) goto L_0x00a5
            long r3 = r3.f299276R
            long r1 = r1 + r3
            goto L_0x00a5
        L_0x00b7:
            r0.append(r1)
            goto L_0x00d1
        L_0x00bb:
            te3.kd0 r1 = r11.field_favProto
            java.lang.String r1 = r1.f298628s
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00d1
            te3.kd0 r11 = r11.field_favProto
            java.lang.String r11 = r11.f298628s
            byte[] r11 = r11.getBytes()
            int r11 = r11.length
            r0.append(r11)
        L_0x00d1:
            java.lang.String r11 = r0.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100734q.m131816G(pb1.z):java.lang.String");
    }

    /* renamed from: H */
    public static long m131817H(C100755z zVar) {
        if (zVar == null) {
            return 0;
        }
        int i = 0;
        Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
        while (it.hasNext()) {
            i = (int) (((long) i) + it.next().f299276R);
        }
        return (long) i;
    }

    /* renamed from: I */
    public static String m131818I(float f) {
        if (f < 1024.0f) {
            return String.format("%.1fB", new Object[]{Float.valueOf(f)});
        } else if (f < 1048576.0f) {
            return String.format("%.1fKB", new Object[]{Float.valueOf(f / 1024.0f)});
        } else if (f < 1.07374182E9f) {
            return String.format("%.1fMB", new Object[]{Float.valueOf((f / 1024.0f) / 1024.0f)});
        } else {
            return String.format("%.1fGB", new Object[]{Float.valueOf(((f / 1024.0f) / 1024.0f) / 1024.0f)});
        }
    }

    /* renamed from: J */
    public static int m131819J(String str) {
        if (Util.isNullOrNil(str) || !str.equals("speex")) {
            return (Util.isNullOrNil(str) || !str.equals("silk")) ? -2 : -4;
        }
        return -3;
    }

    /* renamed from: K */
    public static Set<String> m131820K() {
        String[] split;
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(225282, "");
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "get need del IDs: %s", str);
        HashSet hashSet = new HashSet();
        if (!(Util.isNullOrNil(str) || (split = str.split(",")) == null || split.length == 0)) {
            for (String add : split) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    /* renamed from: L */
    public static ArrayList<C102666r2> m131821L(List<String> list, List<String> list2, int i, List<? extends C102666r2> list3, Set<Integer> set, C11883v0 v0Var) {
        List<String> list4 = list;
        int i2 = i;
        Class cls = C100718j1.class;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i));
        ArrayList<Long> Lo = ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).mo142274Lo(list4, list2, arrayList);
        ArrayList<C102666r2> arrayList2 = new ArrayList<>();
        if (Lo.size() == 0) {
            return arrayList2;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 20;
            if (i4 >= Lo.size()) {
                i4 = Lo.size();
            }
            Log.m105927v("MicroMsg.Fav.FavApiLogic", "start:%d  end:%d listSize:%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(Lo.size()));
            boolean a = C102429k.m135145a(arrayList);
            ArrayList<C100755z> SE = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142264SE(Lo.subList(i3, i4), list3, set, v0Var, a);
            if (SE != null && SE.size() > 0) {
                if (i2 == 8) {
                    arrayList2.addAll(m131874t(list4, SE, 8, 8));
                } else if (i2 == 5) {
                    arrayList2.addAll(m131874t(list4, SE, 5, 5));
                } else if (i2 == 7) {
                    arrayList2.addAll(m131874t(list4, SE, 7, 7));
                } else if (i2 == 6) {
                    arrayList2.addAll(m131874t(list4, SE, 6, 6));
                } else if (i2 == 3) {
                    arrayList2.addAll(m131874t(list4, SE, 3, 3));
                } else {
                    arrayList2.addAll(SE);
                }
            }
            if (i4 >= Lo.size()) {
                return arrayList2;
            }
            i3 = i4;
        }
    }

    /* renamed from: M */
    public static ArrayList<C100755z> m131822M(List<String> list, List<String> list2, List<Integer> list3, List<C100755z> list4, Set<Integer> set, C11883v0 v0Var) {
        boolean z;
        List<Integer> list5 = list3;
        Class cls = C100718j1.class;
        ArrayList<Long> Lo = ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).mo142274Lo(list, list2, list5);
        ArrayList<C100755z> arrayList = new ArrayList<>();
        if (Lo.size() == 0) {
            return arrayList;
        }
        int i = 0;
        while (true) {
            int i2 = i + 20;
            if (i2 >= Lo.size()) {
                i2 = Lo.size();
            }
            Log.m105927v("MicroMsg.Fav.FavApiLogic", "start:%d  end:%d listSize:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Lo.size()));
            boolean a = C102429k.m135145a(list3);
            ArrayList<C100755z> SE = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142264SE(Lo.subList(i, i2), list4, set, v0Var, a);
            if (SE != null && SE.size() > 0) {
                if (list5.contains(8)) {
                    Iterator<C100755z> it = SE.iterator();
                    while (it.hasNext()) {
                        C100755z next = it.next();
                        if (next.field_type == 18) {
                            try {
                                LinkedList<C101834rc0> linkedList = next.field_favProto.f298618f;
                                int i3 = 1;
                                while (true) {
                                    if (i3 >= linkedList.size()) {
                                        break;
                                    } else if (linkedList.get(i3).f299258I == 8) {
                                        z = true;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            z = false;
                            if (z) {
                                arrayList.add(next);
                            }
                        } else {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList.addAll(SE);
                }
            }
            if (i2 >= Lo.size()) {
                return arrayList;
            }
            i = i2;
        }
    }

    /* renamed from: N */
    public static String m131823N(long j) {
        C101801kd0 kd02;
        String str;
        StringBuilder sb = new StringBuilder();
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
        String str2 = "";
        if (Yt == null || (kd02 = Yt.field_favProto) == null || kd02.f298618f.size() <= 1) {
            return str2;
        }
        C77911cd0 cd02 = Yt.field_favProto.f298608G;
        if (cd02 != null) {
            String str3 = cd02.f227116e;
            String str4 = cd02.f227115d;
            str = str3;
            str2 = str4;
        } else {
            str = str2;
        }
        sb.append("<noteinfo>");
        sb.append("<noteauthor>");
        sb.append(str2);
        sb.append("</noteauthor>");
        sb.append("<noteeditor>");
        sb.append(str);
        sb.append("</noteeditor>");
        sb.append("<edittime>");
        sb.append(Yt.field_favProto.f298602A);
        sb.append("</edittime>");
        sb.append("<editusr>");
        sb.append(str2);
        sb.append("</editusr>");
        sb.append("<favlocalid>");
        sb.append(Yt.field_localId);
        sb.append("</favlocalid>");
        sb.append(C101367a.m133008b(Yt.field_favProto.f298618f).replace("cdn_dataurl", "cdndataurl").replace("cdn_datakey", "cdndatakey").replace("cdn_thumburl", "cdnthumburl").replace("cdn_thumbkey", "cdnthumbkey").replace("thumbfullsize", "thumbsize").replace("fullsize", "datasize").replace("datasrcname", "sourcename").replace("datasrctime", "sourcetime").replace("stream_lowbandurl", "streamlowbandurl").replace("stream_dataurl", "streamdataurl").replace("stream_weburl", "streamweburl"));
        sb.append("</noteinfo>");
        return sb.toString();
    }

    /* renamed from: O */
    public static String m131824O(long j) {
        if (j == 0) {
            return "0KB";
        }
        double d = ((double) j) * 1.0d;
        double d2 = d / 1048576.0d;
        if (d2 >= 1.0d) {
            return String.format("%dMB", new Object[]{Integer.valueOf((int) d2)});
        }
        double d3 = d / 1024.0d;
        if (d3 < 1.0d) {
            return "1KB";
        }
        return String.format("%dKB", new Object[]{Integer.valueOf((int) d3)});
    }

    /* renamed from: P */
    public static String m131825P(String str) {
        return str + "_t";
    }

    /* renamed from: Q */
    public static String m131826Q(C101834rc0 rc02) {
        if (rc02 == null || Util.isNullOrNil(rc02.f299280T)) {
            return "";
        }
        String P = m131825P(rc02.f299280T);
        return new C86009m1(m131870r(P), P).mo119971i();
    }

    /* renamed from: R */
    public static float m131827R(long j) {
        float f = ((float) j) / 1000.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (float) Math.round(f);
    }

    /* renamed from: S */
    public static long m131828S() {
        return ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERFINO_FAV_TOTAL_CAPACITY_LONG, 0L)).longValue();
    }

    /* renamed from: T */
    public static int m131829T(String str) {
        if (Util.isNullOrNil(str) || !str.equals("speex")) {
            return (Util.isNullOrNil(str) || !str.equals("silk")) ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a7  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m131830U(te3.C101834rc0 r17, pb1.C100755z r18, int r19, boolean r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Class<pb1.j1> r3 = pb1.C100718j1.class
            r4 = 1
            java.lang.String r5 = "MicroMsg.Fav.FavApiLogic"
            if (r2 != r4) goto L_0x0023
            java.lang.String r6 = r0.f299329u
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x001d
            java.lang.String r6 = r0.f299325s
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0023
        L_0x001d:
            java.lang.String r0 = "insertCdnDataInfo, type recv, cdndataurl must not be null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x0023:
            if (r2 != 0) goto L_0x0035
            java.lang.String r6 = m131880w(r17)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0035
            java.lang.String r0 = "insertCdnDataInfo, type send, path must not be null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x0035:
            di3.d r6 = di3.C86312j.m106911c(r3)
            pb1.j1 r6 = (pb1.C100718j1) r6
            pb1.n0 r6 = r6.mo128198DE()
            java.lang.String r7 = r0.f299280T
            xb1.a r6 = (xb1.C102612a) r6
            pb1.u r6 = r6.mo142252Yt(r7)
            r7 = 0
            if (r6 == 0) goto L_0x0056
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f299280T
            r1[r7] = r0
            java.lang.String r0 = "cdn info exist, id[%s], return"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r0, r1)
            return
        L_0x0056:
            r6 = 3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            long r9 = r1.field_localId
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r7] = r9
            int r9 = r1.field_id
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r4] = r9
            java.lang.String r9 = r0.f299280T
            r10 = 2
            r8[r10] = r9
            java.lang.String r9 = "insert cdn data info, fav local id[%d] fav id[%d] dataId:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r8)
            pb1.u r8 = new pb1.u
            r8.<init>()
            java.lang.String r9 = r0.f299280T
            r8.field_dataId = r9
            long r11 = r0.f299276R
            int r9 = (int) r11
            r8.field_totalLen = r9
            r8.field_type = r2
            long r11 = r1.field_localId
            r8.field_favLocalId = r11
            java.lang.String r1 = r0.f299329u
            r8.field_cdnKey = r1
            java.lang.String r1 = r0.f299325s
            r8.field_cdnUrl = r1
            java.lang.String r1 = m131880w(r17)
            r8.field_path = r1
            int r1 = r0.f299258I
            if (r1 != r6) goto L_0x00a2
            java.lang.String r0 = r0.f299262K
            int r0 = m131819J(r0)
            r8.field_dataType = r0
            goto L_0x00a4
        L_0x00a2:
            r8.field_dataType = r1
        L_0x00a4:
            long r0 = eb0.C31543z5.m39453c()
            r8.field_modifyTime = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            r1 = 15
            r9 = 8
            r11 = 4
            if (r2 != 0) goto L_0x0136
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r20)
            r12[r7] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r12[r4] = r13
            int r13 = r8.field_dataType
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            int r13 = r8.field_totalLen
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r6] = r13
            java.lang.String r13 = "can auto upload, force %B, isWifi %B, dataType %d, totalLen %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r12)
            if (r20 == 0) goto L_0x00e0
        L_0x00de:
            r12 = 1
            goto L_0x0125
        L_0x00e0:
            if (r0 == 0) goto L_0x00e3
            goto L_0x00de
        L_0x00e3:
            int r12 = r8.field_dataType
            if (r12 == r9) goto L_0x00ec
            if (r12 == r11) goto L_0x00ec
            if (r12 == r1) goto L_0x00ec
            goto L_0x00de
        L_0x00ec:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r13, r7)
            r13 = 0
            java.lang.String r15 = "fav_mx_auto_upload_size"
            long r15 = r12.getLong(r15, r13)
            int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x010e
            di3.d r12 = di3.C86312j.m106911c(r3)
            pb1.j1 r12 = (pb1.C100718j1) r12
            long r15 = r12.mo128210aN(r4)
        L_0x010e:
            int r12 = r8.field_totalLen
            long r12 = (long) r12
            int r14 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r14 > 0) goto L_0x0124
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Long r13 = java.lang.Long.valueOf(r15)
            r12[r7] = r13
            java.lang.String r13 = "match max auto upload, max size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r12)
            goto L_0x00de
        L_0x0124:
            r12 = 0
        L_0x0125:
            if (r12 == 0) goto L_0x012f
            r8.field_status = r4
            java.lang.String r12 = "insertCdnDataInfo upload status traning"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            goto L_0x0136
        L_0x012f:
            r8.field_status = r11
            java.lang.String r12 = "insertCdnDataInfo upload status pause"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
        L_0x0136:
            if (r2 != r4) goto L_0x01ae
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r20)
            r12[r7] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r12[r4] = r13
            int r13 = r8.field_dataType
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            int r10 = r8.field_totalLen
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r6] = r10
            java.lang.String r6 = "can auto download, force %B, isWifi %B, dataType %d, totalLen %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r12)
            if (r20 == 0) goto L_0x015f
        L_0x015d:
            r7 = 1
            goto L_0x019d
        L_0x015f:
            if (r0 == 0) goto L_0x0162
            goto L_0x015d
        L_0x0162:
            int r0 = r8.field_dataType
            if (r0 == r9) goto L_0x016b
            if (r0 == r11) goto L_0x016b
            if (r0 == r1) goto L_0x016b
            goto L_0x015d
        L_0x016b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r7)
            di3.d r1 = di3.C86312j.m106911c(r3)
            pb1.j1 r1 = (pb1.C100718j1) r1
            long r9 = r1.mo128210aN(r4)
            java.lang.String r1 = "fav_mx_auto_download_size"
            long r0 = r0.getLong(r1, r9)
            int r6 = r8.field_totalLen
            long r9 = (long) r6
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x019d
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6[r7] = r0
            java.lang.String r0 = "match max auto download, max size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r6)
            goto L_0x015d
        L_0x019d:
            if (r7 == 0) goto L_0x01a7
            r8.field_status = r4
            java.lang.String r0 = "insertCdnDataInfo download status traning"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x01ae
        L_0x01a7:
            r8.field_status = r11
            java.lang.String r0 = "insertCdnDataInfo download status pause"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x01ae:
            di3.d r0 = di3.C86312j.m106911c(r3)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.n0 r0 = r0.mo128198DE()
            xb1.a r0 = (xb1.C102612a) r0
            r0.insert(r8)
            if (r2 != r4) goto L_0x01c3
            m131883x0(r8)
            goto L_0x01c6
        L_0x01c3:
            m131810A0(r8)
        L_0x01c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100734q.m131830U(te3.rc0, pb1.z, int, boolean):void");
    }

    /* renamed from: V */
    public static void m131831V(C101834rc0 rc02, C100755z zVar, int i) {
        Class cls = C100718j1.class;
        if (i == 1 && (rc02.f299336x0 <= 0 || Util.isNullOrNil(rc02.f299309j) || Util.isNullOrNil(rc02.f299305h))) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type recv, cdndataurl must not be null!");
        } else if (i != 0 || !Util.isNullOrNil(m131826Q(rc02))) {
            String P = m131825P(rc02.f299280T);
            if (((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(P) != null) {
                Log.m105929w("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], return", P);
                return;
            }
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "insert cdn thumb info, fav local id[%d] fav id[%d] dataId:[%s]", Long.valueOf(zVar.field_localId), Integer.valueOf(zVar.field_id), rc02.f299280T);
            C100746u uVar = new C100746u();
            uVar.field_cdnKey = rc02.f299309j;
            uVar.field_cdnUrl = rc02.f299305h;
            uVar.field_dataId = P;
            uVar.field_favLocalId = zVar.field_localId;
            uVar.field_totalLen = (int) rc02.f299336x0;
            uVar.field_type = i;
            uVar.field_status = 1;
            uVar.field_path = m131826Q(rc02);
            uVar.field_modifyTime = C31543z5.m39453c();
            uVar.field_attrFlag |= 1;
            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).insert(uVar);
            if (i == 1) {
                m131883x0(uVar);
            } else {
                m131810A0(uVar);
            }
        } else {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type send, path must not be null!");
        }
    }

    /* renamed from: W */
    public static boolean m131832W(C100755z zVar) {
        if (zVar == null) {
            return false;
        }
        Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            int i = next.f299258I;
            if ((i == 8 || i == 4 || i == 2 || i == 3) && (Util.isNullOrNil(next.f299325s) || Util.isNullOrNil(next.f299329u))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public static boolean m131833X(int i) {
        return i == 17 || i == 35;
    }

    /* renamed from: Y */
    public static boolean m131834Y(C101834rc0 rc02) {
        Uri n = C116299g2.m163858n(m131880w(rc02));
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return false;
        }
        return l.f348991a.mo119948x(l.f348992b);
    }

    /* renamed from: Z */
    public static boolean m131835Z(C101834rc0 rc02) {
        return ImgUtil.isGif(m131880w(rc02));
    }

    /* renamed from: a */
    public static void m131836a(Context context) {
        if (0 >= f295127b) {
            Log.m105924i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
            return;
        }
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(f295127b);
        f295127b = 0;
        if (Yt == null) {
            Log.m105924i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
            return;
        }
        Log.m105924i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav ,go on");
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Intent intent = new Intent();
        intent.putExtra("key_fav_scene", 5);
        intent.putExtra("key_fav_item_id", Yt.field_localId);
        m131875t0(context, ".ui.FavTagEditUI", intent, (Bundle) null);
    }

    /* renamed from: a0 */
    public static boolean m131837a0() {
        Class cls = C32735h.class;
        return ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_entry, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_no_support_share_switch, 0) == 1;
    }

    /* renamed from: b */
    public static String m131838b(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return str2;
        }
        if (Util.isNullOrNil(str2)) {
            return str;
        }
        return str + "​" + str2;
    }

    /* renamed from: b0 */
    public static boolean m131839b0(C101834rc0 rc02) {
        C101106m b = C101093a.m132480b();
        return b != null && b.f295959d == 6 && Util.nullAs(rc02.f299280T, "").equals(b.f295960e) && C101093a.m132481c();
    }

    /* renamed from: c */
    public static long m131840c(C100755z zVar) {
        int[] iArr = C100694a.f295012a;
        int i = 0;
        while (true) {
            long j = 0;
            if (i >= 8) {
                return 0;
            }
            if (iArr[i] == zVar.field_type) {
                C101801kd0 kd02 = zVar.field_favProto;
                if (kd02 != null) {
                    Iterator<C101834rc0> it = kd02.f298618f.iterator();
                    while (it.hasNext()) {
                        j += it.next().f299276R;
                    }
                }
                zVar.field_datatotalsize = j;
                Log.m105919d("MicroMsg.Fav.FavApiLogic", "calFavItemInfoTotalLength id:%d,length:%d", Integer.valueOf(zVar.field_id), Long.valueOf(j));
                return j;
            }
            i++;
        }
    }

    /* renamed from: c0 */
    public static boolean m131841c0(C100755z zVar) {
        if (zVar == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "[isReceiveStatus] item == null, isReceiveStatus = false");
            return false;
        }
        Log.m105924i("MicroMsg.Fav.FavApiLogic", "[isReceiveStatus] item.field_itemStatus = " + zVar.field_itemStatus);
        int i = zVar.field_itemStatus;
        return i == 8 || i == 10 || i == 7;
    }

    /* renamed from: d */
    public static boolean m131842d(C100755z zVar) {
        return ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(zVar.field_localId) != null;
    }

    /* renamed from: d0 */
    public static boolean m131843d0() {
        if (f295128c == null) {
            boolean z = true;
            if (C117731d.m166007c().mo182440a(new C89961a()) != 1) {
                z = false;
            }
            f295128c = Boolean.valueOf(z);
        }
        return f295128c.booleanValue();
    }

    /* renamed from: e */
    public static void m131844e(C100755z zVar) {
        if (zVar != null) {
            C77911cd0 cd02 = zVar.field_favProto.f298608G;
            if ((cd02 == null || Util.isNullOrNil(cd02.f227116e)) && zVar.field_type == 18) {
                if (zVar.field_favProto.f298616d.f299346d == 6) {
                    m131867p0(zVar, false);
                } else {
                    m131867p0(zVar, true);
                }
                ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).update(zVar, C66261f3.COL_LOCALID);
            }
        }
    }

    /* renamed from: e0 */
    public static void m131845e0(C100755z zVar, int i) {
        Class cls = C100718j1.class;
        if (zVar == null) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "modeTag, item info is null");
            return;
        }
        LinkedList<C101836ry2> linkedList = new LinkedList<>();
        C101836ry2 ry22 = new C101836ry2();
        ry22.f299366d = 4;
        ry22.f299367e = 0;
        linkedList.add(ry22);
        LinkedList<C101854uy2> linkedList2 = new LinkedList<>();
        C101854uy2 uy22 = new C101854uy2();
        uy22.f299650d = "favitem.taglist";
        boolean z = true;
        uy22.f299653g = 1;
        StringBuffer stringBuffer = new StringBuffer();
        int size = zVar.field_tagProto.f186495e.size();
        for (int i2 = 0; i2 < size; i2++) {
            stringBuffer.append("<tag>");
            stringBuffer.append(Util.escapeStringForXml(zVar.field_tagProto.f186495e.get(i2)));
            stringBuffer.append("</tag>");
        }
        uy22.f299652f = stringBuffer.toString();
        Log.m105927v("MicroMsg.Fav.FavApiLogic", "do net scene mod tag, id=%d, tag=%s", Integer.valueOf(zVar.field_id), uy22.f299652f);
        linkedList2.add(uy22);
        int i3 = zVar.field_id;
        if (i3 > 0) {
            C86709a0.m107524d().mo123460f(new C100739r1(i3, linkedList, linkedList2, 0));
            C100695a0.m131730e((long) zVar.field_id, size, i);
            return;
        }
        C100742s0 ik = ((C100718j1) C86312j.m106911c(cls)).mo128213ik();
        long j = zVar.field_localId;
        C102415t tVar = (C102415t) ik;
        tVar.getClass();
        Log.m105925i("MicroMsg.Fav.FavEditService", "addTag %d", Long.valueOf(j));
        Cursor rawQuery = ((C102613c) ((C100718j1) C86312j.m106911c(cls)).a10()).f302174d.rawQuery("select * from FavEditInfo where localId =  ? and type =  ?", new String[]{String.valueOf(j), String.valueOf(0)}, 2);
        C35443x xVar = null;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                xVar = new C35443x();
                xVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        if (xVar == null) {
            xVar = new C35443x();
        } else {
            z = false;
        }
        xVar.field_localId = j;
        C101855vc0 vc02 = new C101855vc0();
        vc02.f299663d = linkedList;
        vc02.f299664e = linkedList2;
        xVar.field_modItem = vc02;
        xVar.field_time = Util.nowMilliSecond();
        xVar.field_type = 0;
        xVar.field_scene = i;
        if (z) {
            ((C102613c) ((C100718j1) C86312j.m106911c(cls)).a10()).mo142259jo(xVar);
        } else {
            ((C102613c) ((C100718j1) C86312j.m106911c(cls)).a10()).mo142258Lo(xVar, new String[]{C66261f3.COL_LOCALID});
        }
        C86709a0.m107525e().postToWorker(new C102413r(tVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m131846f(pb1.C100755z r8) {
        /*
            java.lang.Class<pb1.q> r0 = pb1.C100734q.class
            monitor-enter(r0)
            if (r8 == 0) goto L_0x008c
            int r1 = r8.field_type     // Catch:{ all -> 0x0089 }
            r2 = 18
            if (r1 == r2) goto L_0x000d
            goto L_0x008c
        L_0x000d:
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r1 = f295126a     // Catch:{ all -> 0x0089 }
            long r2 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r0)
            return
        L_0x001d:
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r1 = f295126a     // Catch:{ all -> 0x0089 }
            long r2 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0087
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r1 = f295126a     // Catch:{ all -> 0x0089 }
            long r2 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0089 }
            int r1 = r1.size()     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0040
            goto L_0x0087
        L_0x0040:
            long r1 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = m131823N(r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "MicroMsg.Fav.FavApiLogic"
            java.lang.String r3 = "checkUpdateSnsNotePostXml, resend favlocal id:%d,xml:%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0089 }
            r5 = 0
            long r6 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0089 }
            r4[r5] = r6     // Catch:{ all -> 0x0089 }
            r5 = 1
            r4[r5] = r1     // Catch:{ all -> 0x0089 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x0089 }
            com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent r2 = new com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent     // Catch:{ all -> 0x0089 }
            r2.<init>()     // Catch:{ all -> 0x0089 }
            com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent$a r3 = r2.f78934d     // Catch:{ all -> 0x0089 }
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r4 = f295126a     // Catch:{ all -> 0x0089 }
            long r5 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0089 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0089 }
            r3.f78935a = r4     // Catch:{ all -> 0x0089 }
            com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent$a r3 = r2.f78934d     // Catch:{ all -> 0x0089 }
            r3.f78936b = r1     // Catch:{ all -> 0x0089 }
            r2.publish()     // Catch:{ all -> 0x0089 }
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r1 = f295126a     // Catch:{ all -> 0x0089 }
            long r2 = r8.field_localId     // Catch:{ all -> 0x0089 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0089 }
            r1.remove(r8)     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            return
        L_0x0087:
            monitor-exit(r0)
            return
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x008c:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100734q.m131846f(pb1.z):void");
    }

    /* renamed from: f0 */
    public static void m131847f0(Context context, String str, String str2, String str3) {
        C100755z g0 = m131849g0(str);
        if (g0 != null) {
            NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
            NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
            aVar.f264944a = 2;
            aVar.field_localId = -1;
            aVar.f264947d = context;
            aVar.f264954k = 4;
            aVar.f264955l = true;
            Bundle bundle = new Bundle();
            bundle.putString("noteauthor", g0.field_favProto.f298608G.f227115d);
            bundle.putString("noteeditor", g0.field_favProto.f298608G.f227116e);
            bundle.putLong("edittime", g0.field_favProto.f298602A);
            bundle.putString("notexml", C100755z.m131907w2(g0));
            bundle.putString("snslocalid", str2);
            bundle.putString("snsthumbpath", str3);
            bundle.putString("snsnotelinkxml", str);
            NotifyWNNoteOperationEvent.C92535a aVar2 = notifyWNNoteOperationEvent.f264942d;
            aVar2.f264951h = bundle;
            aVar2.field_favProto = g0.field_favProto;
            notifyWNNoteOperationEvent.publish();
        }
    }

    /* renamed from: g */
    public static void m131848g(C100746u uVar, C100755z zVar) {
        Class cls = C100718j1.class;
        Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
        int i = 0;
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            int i2 = next.f299258I;
            if (!(i2 == 1 || i2 == 6 || !Util.isNullOrNil(next.f299325s))) {
                i++;
            }
        }
        if (i != 0) {
            return;
        }
        if (zVar.field_id > 0) {
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(17, uVar.field_favLocalId);
            ((C102417u) ((C100718j1) C86312j.m106911c(cls)).mo128203Ly()).mo141993c();
            return;
        }
        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(9, uVar.field_favLocalId);
        ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
    }

    /* renamed from: g0 */
    public static C100755z m131849g0(String str) {
        if (str == null || str.equals("")) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml but xml is null");
            return null;
        }
        String replace = str.replace("cdndataurl", "cdn_dataurl").replace("cdndatakey", "cdn_datakey").replace("cdnthumburl", "cdn_thumburl").replace("cdnthumbkey", "cdn_thumbkey").replace("datasize", "fullsize").replace("thumbsize", "thumbfullsize").replace("sourcename", "datasrcname").replace("sourcetime", "datasrctime").replace("streamlowbandurl", "stream_lowbandurl").replace("streamdataurl", "stream_dataurl").replace("streamweburl", "stream_weburl");
        if (!replace.startsWith("<noteinfo>")) {
            replace = "<noteinfo>" + replace + "</noteinfo>";
        }
        Map<String, String> parseXml = XmlParser.parseXml(replace, "noteinfo", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml, FavItemInfo maps null");
            return null;
        }
        C100755z zVar = new C100755z();
        try {
            zVar.field_favProto = new C101801kd0();
            zVar.field_type = 18;
            zVar.field_favProto.mo141213k(Util.getLong(parseXml.get(".noteinfo.edittime"), 0));
            C77911cd0 cd02 = new C77911cd0();
            cd02.f227116e = parseXml.get(".noteinfo.noteeditor");
            cd02.f227115d = parseXml.get(".noteinfo.noteauthor");
            zVar.field_favProto.mo141217o(cd02);
            zVar.field_localId = Util.getLong(parseXml.get(".noteinfo.favlocalid"), System.currentTimeMillis());
            C101369c.m133014b(replace, zVar.field_favProto);
            return zVar;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Fav.FavApiLogic", e, "", new Object[0]);
            Log.m105921e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml , FavItemInfo exception:+%s", e.toString());
            return null;
        }
    }

    /* renamed from: h */
    public static String m131850h(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C86009m1 m1Var = new C86009m1(m131812C() + C90193h.m112878f(str.getBytes()));
        if (m1Var.mo119967g()) {
            return m1Var.mo119971i();
        }
        return null;
    }

    /* renamed from: h0 */
    public static boolean m131851h0(C100755z zVar) {
        C101834rc0 D;
        boolean z;
        int i;
        int i2;
        if (zVar == null || (D = m131813D(zVar)) == null) {
            return false;
        }
        long currentTicks = Util.currentTicks();
        C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(m131880w(D));
        if (Z40 != null) {
            i2 = Z40.mo130041a();
            i = D.f299338y;
            if (i <= 0 || Math.abs(i - i2) >= 2) {
                D.mo141266v(i2);
                z = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).update(zVar, C66261f3.COL_LOCALID);
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
            i = 0;
        }
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "repair video duration[%d TO %d] %b cost time %d", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Long.valueOf(Util.ticksToNow(currentTicks)));
        return z;
    }

    /* renamed from: i */
    public static void m131852i(FavoriteOperationEvent favoriteOperationEvent) {
        LinkedList<C101834rc0> linkedList;
        C101801kd0 kd02;
        Class cls = C100718j1.class;
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        int i = aVar.f264847m;
        String str = "";
        int i2 = 1;
        if (i == 1) {
            favoriteOperationEvent.f264834e.f264857c = m131823N(aVar.f264839e);
            FavoriteOperationEvent.C92516b bVar = favoriteOperationEvent.f264834e;
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
            if (Yt != null && (kd02 = Yt.field_favProto) != null && (Yt.field_type != 18 || kd02.f298618f.size() > 1)) {
                Iterator<C101834rc0> it = Yt.field_favProto.f298618f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C101834rc0 next = it.next();
                    if (next.f299258I == 2) {
                        String Q = m131826Q(next);
                        if (!C86013q1.m106450k(Q)) {
                            String w = m131880w(next);
                            if (C86013q1.m106450k(w)) {
                                BitmapUtil.createThumbNail(w, 150, 150, Bitmap.CompressFormat.JPEG, 90, Q, true);
                                str = m131826Q(next);
                            } else if (next.f299307i) {
                                m131857k0(Yt, next, true);
                            } else if (next.f299327t) {
                                m131853i0(Yt, next, true);
                                str = w;
                            }
                        }
                        str = Q;
                    }
                }
            }
            bVar.f264858d = str;
        } else if (i == 2) {
            C100755z zVar = new C100755z();
            zVar.field_type = 2;
            C101834rc0 rc02 = new C101834rc0();
            rc02.mo141257m(C100745t.m131892d(rc02.toString(), 2));
            String w2 = m131880w(rc02);
            rc02.f299284V = w2;
            rc02.mo141260p(2);
            zVar.field_favProto.f298618f.add(rc02);
            favoriteOperationEvent.f264834e.f264857c = C100755z.m131907w2(zVar);
            favoriteOperationEvent.f264834e.f264858d = w2;
        } else if (i == 3) {
            C100755z Yt2 = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
            if (Yt2 != null) {
                FavoriteOperationEvent.C92516b bVar2 = favoriteOperationEvent.f264834e;
                bVar2.f264857c = C75592q0.m90789s() + ";" + Yt2.field_fromUser + ";" + Yt2.field_updateTime;
            }
        } else if (i == 4) {
            C100755z g0 = m131849g0(aVar.f264837c);
            if (g0 != null) {
                C101801kd0 kd03 = g0.field_favProto;
                if (!(kd03 == null || (linkedList = kd03.f298618f) == null)) {
                    Iterator<C101834rc0> it4 = linkedList.iterator();
                    while (it4.hasNext()) {
                        C101834rc0 next2 = it4.next();
                        if (next2.f299258I == 20) {
                            next2.mo141232F(true);
                            next2.mo141231E(true);
                            next2.f299284V = str;
                            next2.mo141254j(str);
                            next2.mo141253f(str);
                            next2.mo141256l(str);
                            next2.mo141255k(str);
                        }
                    }
                }
                favoriteOperationEvent.f264833d.f264838d = g0.field_favProto;
            }
        } else if (i == 5) {
            if (Util.isNullOrNil(aVar.f264837c)) {
                favoriteOperationEvent.f264834e.f264855a = -1;
                return;
            }
            C100755z g05 = m131849g0(favoriteOperationEvent.f264833d.f264837c);
            if (g05 == null || g05.field_localId <= 0) {
                favoriteOperationEvent.f264834e.f264855a = -1;
                return;
            }
            boolean W = m131832W(g05);
            String str2 = favoriteOperationEvent.f264833d.f264846l;
            if (W) {
                favoriteOperationEvent.f264834e.f264855a = 1;
                ArrayList arrayList = f295126a.get(Long.valueOf(g05.field_localId));
                if (arrayList != null) {
                    if (arrayList.contains(str2)) {
                        arrayList.remove(str2);
                    }
                    if (arrayList.size() == 0) {
                        f295126a.remove(Long.valueOf(g05.field_localId));
                    }
                }
            } else if (Util.isNullOrNil(str2)) {
                favoriteOperationEvent.f264834e.f264855a = -1;
            } else {
                long j = g05.field_localId;
                ArrayList arrayList2 = f295126a.get(Long.valueOf(j));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(str2);
                f295126a.put(Long.valueOf(j), arrayList2);
                C100755z Yt3 = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(j);
                if (Yt3 == null || Yt3.field_localId <= 0) {
                    favoriteOperationEvent.f264834e.f264855a = -1;
                } else if (m131832W(Yt3) || Yt3.field_itemStatus == 10) {
                    favoriteOperationEvent.f264834e.f264855a = -1;
                    C86709a0.m107525e().postToWorkerDelayed(new C100729p(Yt3), 500);
                } else {
                    favoriteOperationEvent.f264834e.f264855a = -1;
                }
            }
        } else if (i == 6) {
            C100755z Yt4 = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
            if (Yt4 == null) {
                favoriteOperationEvent.f264834e.f264855a = 0;
                return;
            }
            FavoriteOperationEvent.C92516b bVar3 = favoriteOperationEvent.f264834e;
            if (Yt4.field_id <= 0) {
                i2 = 0;
            }
            bVar3.f264855a = i2;
        } else {
            C100755z zVar2 = new C100755z();
            zVar2.field_type = 18;
            zVar2.field_favProto = favoriteOperationEvent.f264833d.f264838d;
            favoriteOperationEvent.f264834e.f264857c = C100755z.m131907w2(zVar2);
        }
    }

    /* renamed from: i0 */
    public static void m131853i0(C100755z zVar, C101834rc0 rc02, boolean z) {
        Class cls = C100718j1.class;
        if (zVar != null && !Util.isNullOrNil(rc02.f299280T)) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, favId %d, favLocalId %d, dataId %s", Integer.valueOf(zVar.field_id), Long.valueOf(zVar.field_localId), rc02.f299280T);
            C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(rc02.f299280T);
            if (Yt != null && Yt.field_status == 3) {
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).delete(Yt, "dataId");
                Yt = null;
            }
            if (Yt != null && (Util.isNullOrNil(Yt.field_cdnUrl) || Util.isNullOrNil(Yt.field_cdnKey) || Util.isNullOrNil(Yt.field_dataId) || !Yt.field_cdnUrl.equals(rc02.f299325s) || !Yt.field_cdnKey.equals(rc02.f299329u) || !Yt.field_dataId.equals(rc02.f299280T))) {
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).delete(Yt, "dataId");
                Yt = null;
            }
            if (Yt == null || Yt.field_type != 1) {
                Uri n = C116299g2.m163858n(m131880w(rc02));
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                if (!Util.isNullOrNil(rc02.f299329u) && !Util.isNullOrNil(rc02.f299325s)) {
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        Log.m105924i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
                        long currentTimeMillis = System.currentTimeMillis();
                        m131830U(rc02, zVar, 1, true);
                        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
            Yt.field_status = 1;
            Yt.field_path = m131880w(rc02);
            Yt.field_modifyTime = C31543z5.m39453c();
            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt, "dataId");
            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
        }
    }

    /* renamed from: j */
    public static void m131854j(C102666r2 r2Var) {
        Set<String> set = C11881t1.f34720b;
        LinkedList<C101834rc0> linkedList = r2Var.field_favProto.f298618f;
        for (int i = 0; i < linkedList.size(); i++) {
            String Q = m131826Q(linkedList.get(i));
            if (set == null || !set.contains(Q)) {
                C86013q1.m106447h(Q);
            }
            String w = m131880w(linkedList.get(i));
            if (set == null || !set.contains(w)) {
                C86013q1.m106447h(w);
            }
            C101834rc0 rc02 = linkedList.get(i);
            C101841sc0 sc02 = rc02.f299296c1;
            if (!(sc02 == null || sc02.f299422x == null)) {
                ((C101491u) C86312j.m106911c(C101491u.class)).Jm0(rc02.f299280T);
            }
        }
    }

    /* renamed from: j0 */
    public static void m131855j0(C101834rc0 rc02, boolean z, int i, long j) {
        int i2;
        Class cls = C100718j1.class;
        if (!Util.isNullOrNil(rc02.f299280T)) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, dataId %s", rc02.f299280T);
            C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(rc02.f299280T);
            if (Yt != null && ((i2 = Yt.field_status) == 3 || i2 == 4)) {
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).delete(Yt, "dataId");
                Yt = null;
            }
            if (Yt == null || Yt.field_type != 1) {
                Uri n = C116299g2.m163858n(m131880w(rc02));
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                if (!Util.isNullOrNil(rc02.f299329u) && !Util.isNullOrNil(rc02.f299325s)) {
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        Log.m105924i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
                        long currentTimeMillis = System.currentTimeMillis();
                        C100755z zVar = new C100755z();
                        zVar.field_localId = j;
                        zVar.field_id = -1;
                        zVar.field_type = i;
                        m131830U(rc02, zVar, 1, true);
                        if (z) {
                            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(rc02.f299280T);
                        }
                        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
            Yt.field_status = 1;
            Yt.field_modifyTime = C31543z5.m39453c();
            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt, "dataId");
            if (z) {
                ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(rc02.f299280T);
            }
            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
        }
    }

    /* renamed from: k */
    public static boolean m131856k(long j, Runnable runnable, int i) {
        return m131860m(((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j), true, runnable, i);
    }

    /* renamed from: k0 */
    public static void m131857k0(C100755z zVar, C101834rc0 rc02, boolean z) {
        Class cls = C100718j1.class;
        if (!Util.isNullOrNil(rc02.f299280T)) {
            String P = m131825P(rc02.f299280T);
            C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(P);
            if (Yt != null && Yt.field_status == 3) {
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).delete(Yt, "dataId");
                Yt = null;
            }
            if (Yt == null || Yt.field_type != 1) {
                Uri n = C116299g2.m163858n(m131826Q(rc02));
                String path = n.getPath();
                boolean z2 = false;
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                if (!Util.isNullOrNil(rc02.f299309j) && !Util.isNullOrNil(rc02.f299305h)) {
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (l.mo177810a()) {
                        z2 = l.f348991a.mo119948x(l.f348992b);
                    }
                    if (!z2) {
                        m131831V(rc02, zVar, 1);
                        if (z) {
                            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(P);
                        }
                        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
                        return;
                    }
                    return;
                }
                return;
            }
            Yt.field_status = 1;
            Yt.field_modifyTime = C31543z5.m39453c();
            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt, "dataId");
            if (z) {
                ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(P);
            }
            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
        }
    }

    /* renamed from: l */
    public static boolean m131858l(C102666r2 r2Var, Runnable runnable, int i) {
        return m131860m(r2Var, true, runnable, i);
    }

    /* renamed from: l0 */
    public static void m131859l0(C101834rc0 rc02, boolean z, int i, long j) {
        int i2;
        Class cls = C100718j1.class;
        if (!Util.isNullOrNil(rc02.f299280T) && !Util.isNullOrNil(rc02.f299309j) && !Util.isNullOrNil(rc02.f299305h)) {
            String P = m131825P(rc02.f299280T);
            C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(P);
            if (Yt != null && ((i2 = Yt.field_status) == 3 || i2 == 4)) {
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).delete(Yt, "dataId");
                Yt = null;
            }
            if (Yt == null || Yt.field_type != 1) {
                Uri n = C116299g2.m163858n(m131826Q(rc02));
                String path = n.getPath();
                boolean z2 = false;
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                if (!Util.isNullOrNil(rc02.f299309j) && !Util.isNullOrNil(rc02.f299305h)) {
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (l.mo177810a()) {
                        z2 = l.f348991a.mo119948x(l.f348992b);
                    }
                    if (!z2) {
                        C100755z zVar = new C100755z();
                        zVar.field_localId = j;
                        zVar.field_id = -1;
                        zVar.field_type = i;
                        m131831V(rc02, zVar, 1);
                        if (z) {
                            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(P);
                        }
                        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
                        return;
                    }
                    return;
                }
                return;
            }
            Yt.field_status = 1;
            Yt.field_modifyTime = C31543z5.m39453c();
            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt, "dataId");
            if (z) {
                ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(P);
            }
            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
        }
    }

    /* renamed from: m */
    public static boolean m131860m(C102666r2 r2Var, boolean z, Runnable runnable, int i) {
        if (r2Var == null) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
            MMHandlerThread.postToMainThread(runnable);
            return false;
        }
        boolean z2 = Looper.myLooper() == C86709a0.m107525e().getLooper();
        String mMStack = Util.getStack().toString();
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "deleteFavItem execute favid:%d, localId:%d, needBatchDel:%B, isInWorkerThread:%s" + mMStack, Integer.valueOf(r2Var.field_id), Long.valueOf(r2Var.field_localId), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z2) {
            m131862n(r2Var, z, mMStack, i);
            MMHandlerThread.postToMainThread(runnable);
            m131866p(r2Var);
        } else {
            C86709a0.m107525e().postToWorker(new C100735a(r2Var, z, mMStack, i, runnable));
        }
        return true;
    }

    /* renamed from: m0 */
    public static void m131861m0(C100755z zVar, boolean z) {
        if (zVar != null) {
            int i = zVar.field_itemStatus;
            if (i == 8 || i == 10) {
                zVar.field_itemStatus = 7;
                LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
                if (linkedList.size() != 0) {
                    for (C101834rc0 next : linkedList) {
                        m131853i0(zVar, next, z);
                        m131857k0(zVar, next, z);
                    }
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "status not download failed or done!");
        }
    }

    /* renamed from: n */
    public static void m131862n(C102666r2 r2Var, boolean z, String str, int i) {
        Class cls = C100718j1.class;
        m131854j(r2Var);
        C100701c1 Y3 = ((C100718j1) C86312j.m106911c(cls)).mo128208Y3();
        long j = r2Var.field_localId;
        C102615e eVar = (C102615e) Y3;
        eVar.getClass();
        eVar.f302176d.execSQL("FavSearchInfo", "delete from FavSearchInfo where localId = " + j);
        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142269jo(r2Var);
        C100724n0 DE = ((C100718j1) C86312j.m106911c(cls)).mo128198DE();
        long j2 = r2Var.field_localId;
        C102612a aVar = (C102612a) DE;
        aVar.getClass();
        C100746u uVar = new C100746u();
        uVar.field_favLocalId = j2;
        aVar.delete(uVar, "favLocalId");
        C100706g0 NU = ((C100718j1) C86312j.m106911c(cls)).mo128204NU();
        C100755z zVar = (C100755z) r2Var;
        NU.getClass();
        for (String g : zVar.field_tagProto.f186495e) {
            NU.mo140141g(g);
        }
        if (z) {
            Set<String> K = m131820K();
            ((HashSet) K).add(r2Var.field_id + "");
            m131865o0(K);
            m131868q();
        }
        ((C101089b) ((C100718j1) C86312j.m106911c(cls)).mo128206Ve()).mo140541a(zVar, str, i, z ? 3 : 2);
        if (r2Var.field_type == 18) {
            long j3 = r2Var.field_localId;
            if (j3 > 0) {
                DeleteFavItemEvent deleteFavItemEvent = new DeleteFavItemEvent();
                deleteFavItemEvent.f78763d.f78764a = j3;
                deleteFavItemEvent.publish();
            }
        }
    }

    /* renamed from: n0 */
    public static void m131863n0(C100755z zVar, boolean z) {
        LinkedList<C101834rc0> linkedList;
        LinkedList<C101834rc0> linkedList2;
        C100755z zVar2 = zVar;
        Class cls = C100718j1.class;
        if (!zVar.mo140174A2()) {
            Log.m105922f("MicroMsg.Fav.FavApiLogic", "restartItemUpload status not upload failed!");
            return;
        }
        char c = 3;
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "restartItemUpload, force:%b, itemStatus:%d, item_xml:%s", Boolean.valueOf(z), Integer.valueOf(zVar2.field_itemStatus), !Util.isNullOrNil(C100755z.m131907w2(zVar)) ? C100755z.m131907w2(zVar) : "");
        int i = zVar2.field_itemStatus;
        if (i != 3) {
            int i2 = 5;
            if (i == 6) {
                if (((ArrayList) ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142249Ow(zVar2.field_localId)).size() == 0) {
                    zVar2.field_itemStatus = 9;
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar2, C66261f3.COL_LOCALID);
                    C86709a0.m107524d().mo123460f(new C100722l1(zVar2));
                    return;
                }
                zVar2.field_itemStatus = 4;
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142251TE(zVar2);
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar2, C66261f3.COL_LOCALID);
                if (z) {
                    Iterator it = ((ArrayList) ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142249Ow(zVar2.field_localId)).iterator();
                    while (it.hasNext()) {
                        C100746u uVar = (C100746u) it.next();
                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", Integer.valueOf(zVar2.field_id), Long.valueOf(zVar2.field_localId), uVar.field_dataId, Integer.valueOf(uVar.field_dataType), Integer.valueOf(uVar.field_totalLen));
                        if (!C86013q1.m106450k(uVar.field_path)) {
                            String str = uVar.field_path;
                            Log.m105925i("MicroMsg.Fav.FavApiLogic", "cdnInfo.field_path (%s) not exists, exportPath:%s", str, C86013q1.m106448i(str, false));
                            C101801kd0 kd02 = zVar2.field_favProto;
                            if (!(kd02 == null || (linkedList = kd02.f298618f) == null)) {
                                Iterator<C101834rc0> it4 = linkedList.iterator();
                                while (it4.hasNext()) {
                                    C101834rc0 next = it4.next();
                                    String w = m131880w(next);
                                    String i3 = C86013q1.m106448i(w, false);
                                    Log.m105925i("MicroMsg.Fav.FavApiLogic", "toPath:%s, trueDataPath:%s", w, i3);
                                    if (w.equals(uVar.field_path) || i3.equals(uVar.field_path)) {
                                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "copy ret:%s", Long.valueOf(C86013q1.m106443d(next.f299284V, uVar.field_path, false)));
                                    }
                                }
                            }
                        }
                        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(uVar.field_dataId);
                    }
                }
                ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
            } else if (i == 11) {
                zVar2.field_itemStatus = 9;
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar2, C66261f3.COL_LOCALID);
                ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
            } else if (i == 14) {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(12, zVar2.field_localId);
                ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
            } else if (i == 16) {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(15, zVar2.field_localId);
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142251TE(zVar2);
                if (z) {
                    Iterator it5 = ((ArrayList) ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142249Ow(zVar2.field_localId)).iterator();
                    while (it5.hasNext()) {
                        C100746u uVar2 = (C100746u) it5.next();
                        Object[] objArr = new Object[i2];
                        objArr[0] = Integer.valueOf(zVar2.field_id);
                        objArr[1] = Long.valueOf(zVar2.field_localId);
                        objArr[2] = uVar2.field_dataId;
                        objArr[c] = Integer.valueOf(uVar2.field_dataType);
                        objArr[4] = Integer.valueOf(uVar2.field_totalLen);
                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last mod failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", objArr);
                        if (!C86013q1.m106450k(uVar2.field_path)) {
                            String str2 = uVar2.field_path;
                            Log.m105925i("MicroMsg.Fav.FavApiLogic", "cdnInfo.field_path (%s) not exists, exportPath:%s", str2, C86013q1.m106448i(str2, false));
                            C101801kd0 kd03 = zVar2.field_favProto;
                            if (!(kd03 == null || (linkedList2 = kd03.f298618f) == null)) {
                                Iterator<C101834rc0> it6 = linkedList2.iterator();
                                while (it6.hasNext()) {
                                    C101834rc0 next2 = it6.next();
                                    String w2 = m131880w(next2);
                                    String i4 = C86013q1.m106448i(w2, false);
                                    Log.m105925i("MicroMsg.Fav.FavApiLogic", "toPath:%s, trueDataPath:%s", w2, i4);
                                    if (w2.equals(uVar2.field_path) || i4.equals(uVar2.field_path)) {
                                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "copy ret:%s", Long.valueOf(C86013q1.m106443d(next2.f299284V, uVar2.field_path, false)));
                                    }
                                }
                            }
                        }
                        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140157r0(uVar2.field_dataId);
                        c = 3;
                        i2 = 5;
                    }
                }
                ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
            } else if (i == 18) {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(17, zVar2.field_localId);
                ((C102417u) ((C100718j1) C86312j.m106911c(cls)).mo128203Ly()).mo141993c();
            }
        } else {
            zVar2.field_itemStatus = 1;
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar2, C66261f3.COL_LOCALID);
            ((C100718j1) C86312j.m106911c(cls)).C30().run();
        }
    }

    /* renamed from: o */
    public static boolean m131864o(List<C100755z> list, int i) {
        Class cls = C100718j1.class;
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
            return false;
        }
        String mMStack = Util.getStack().toString();
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "deleteFavItems execute items:%s" + mMStack, Integer.valueOf(list.size()));
        Set<String> K = m131820K();
        for (C100755z next : list) {
            m131854j(next);
            C100701c1 Y3 = ((C100718j1) C86312j.m106911c(cls)).mo128208Y3();
            long j = next.field_localId;
            C102615e eVar = (C102615e) Y3;
            eVar.getClass();
            eVar.f302176d.execSQL("FavSearchInfo", "delete from FavSearchInfo where localId = " + j);
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142269jo(next);
            C100724n0 DE = ((C100718j1) C86312j.m106911c(cls)).mo128198DE();
            long j2 = next.field_localId;
            C102612a aVar = (C102612a) DE;
            aVar.getClass();
            C100746u uVar = new C100746u();
            uVar.field_favLocalId = j2;
            aVar.delete(uVar, "favLocalId");
            C100706g0 NU = ((C100718j1) C86312j.m106911c(cls)).mo128204NU();
            NU.getClass();
            for (String g : next.field_tagProto.f186495e) {
                NU.mo140141g(g);
            }
            ((HashSet) K).add(next.field_id + "");
            Log.m105919d("MicroMsg.Fav.FavApiLogic", "delete id %d", Integer.valueOf(next.field_id));
        }
        m131865o0(K);
        m131868q();
        ((C101089b) ((C100718j1) C86312j.m106911c(cls)).mo128206Ve()).getClass();
        C87412m.m108594g(mMStack, "callMsg");
        C61926c.m72661F("THREAD.FavDelManager", new C101092c(list, i, 3, mMStack));
        return true;
    }

    /* renamed from: o0 */
    public static void m131865o0(Set<String> set) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String append : set) {
            stringBuffer.append(append);
            stringBuffer.append(",");
        }
        String substring = stringBuffer.length() > 0 ? stringBuffer.substring(0, stringBuffer.length() - 1) : "";
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "set need del IDs: %s", substring);
        C86709a0.m107535s().mo121142i().mo119676J(225282, substring);
    }

    /* renamed from: p */
    public static void m131866p(C102666r2 r2Var) {
        if (r2Var != null && 5 == r2Var.field_type) {
            C101801kd0 kd02 = r2Var.field_favProto;
            C101756ae0 ae02 = kd02.f298622j;
            String str = ae02 != null ? ae02.f297867h : "";
            if (kd02.f298616d != null && Util.isNullOrNil(str)) {
                str = r2Var.field_favProto.f298616d.f299364y;
            }
            FavDeleteEvent favDeleteEvent = new FavDeleteEvent();
            favDeleteEvent.f264807d.f264808a = str;
            favDeleteEvent.publish();
        }
    }

    /* renamed from: p0 */
    public static void m131867p0(C100755z zVar, boolean z) {
        C77911cd0 cd02 = new C77911cd0();
        if (!z) {
            cd02.f227115d = C75592q0.m90789s();
        }
        cd02.f227116e = C75592q0.m90789s();
        zVar.field_favProto.mo141213k(Util.nowSecond());
        zVar.field_favProto.mo141217o(cd02);
    }

    /* renamed from: q */
    public static void m131868q() {
        Set<String> K = m131820K();
        HashSet hashSet = (HashSet) K;
        if (hashSet.size() == 0) {
            Log.m105926v("MicroMsg.Fav.FavApiLogic", "doBatchDel no item to delete");
            return;
        }
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "doBatchDel idList:%s", K.toString());
        LinkedList linkedList = new LinkedList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                linkedList.add(Integer.valueOf(Util.getInt((String) it.next(), 0)));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Fav.FavApiLogic", e, "", new Object[0]);
                Log.m105921e("MicroMsg.Fav.FavApiLogic", "doBatchDel parseInt error:%s", e.getMessage());
            }
        }
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "doBatchDel after parse, total size %d", Integer.valueOf(linkedList.size()));
        if (linkedList.size() > 0) {
            C86709a0.m107524d().mo123460f(new C47451m1(linkedList));
        }
    }

    /* renamed from: q0 */
    public static void m131869q0(long j) {
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "setUsedCapacity:%d", Long.valueOf(j));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERFINO_FAV_USED_CAPACITY_LONG, Long.valueOf(j));
    }

    /* renamed from: r */
    public static C86009m1 m131870r(String str) {
        C86009m1 m1Var = new C86009m1(String.format("%s%s/%d/", new Object[]{C86709a0.m107535s().f251806d, "favorite", Integer.valueOf(str.hashCode() & 255)}));
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119987x();
        }
        return m1Var;
    }

    /* renamed from: r0 */
    public static void m131871r0(String str, Context context, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "share image to friend fail, imgPath is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("msg_uuid", str2);
        C88144b.m109801s(context, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
    }

    /* renamed from: s */
    public static String m131872s(C101834rc0 rc02) {
        C101841sc0 sc02 = rc02.f299296c1;
        int i = rc02.f299258I;
        if (i == 1) {
            return m131838b("", rc02.f299301f);
        }
        if (i == 8) {
            return m131838b("", sc02.f299411j);
        }
        if (i == 4) {
            C101850ud0 ud02 = sc02.f299409h;
            return ud02 != null ? m131838b("", ud02.f299618d) : "";
        } else if (i == 5) {
            C101756ae0 ae02 = sc02.f299407f;
            return ae02 != null ? m131838b("", ae02.f297863d) : "";
        } else if (i == 6) {
            String b = m131838b("", sc02.f299410i);
            C101871zc0 zc02 = sc02.f299406e;
            return zc02 != null ? m131838b(m131838b(b, zc02.f299958o), sc02.f299406e.f299956j) : b;
        } else if (i != 10 && i != 11) {
            return m131838b(m131838b("", sc02.f299411j), sc02.f299412n);
        } else {
            C101793jd0 jd02 = sc02.f299408g;
            return jd02 != null ? m131838b(m131838b("", jd02.f298511d), sc02.f299408g.f298513f) : "";
        }
    }

    /* renamed from: s0 */
    public static void m131873s0(String str, Context context) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "share image to timeline fail, filePath is null");
            return;
        }
        Intent intent = new Intent();
        String str2 = "fav_" + C75592q0.m90789s() + "_" + 0;
        String a = C86493v0.m107223a(str2);
        C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", str2);
        intent.putExtra("reportSessionId", a);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        C88144b.m109791i(context, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
    }

    /* renamed from: t */
    public static ArrayList<C100755z> m131874t(List<String> list, ArrayList<C100755z> arrayList, int i, int i2) {
        boolean z;
        ArrayList<C100755z> arrayList2 = new ArrayList<>();
        Iterator<C100755z> it = arrayList.iterator();
        while (it.hasNext()) {
            C100755z next = it.next();
            int i3 = next.field_type;
            if (i3 == 18 || i3 == 14) {
                try {
                    LinkedList<C101834rc0> linkedList = next.field_favProto.f298618f;
                    for (int i4 = i3 == 18 ? 1 : 0; i4 < linkedList.size(); i4++) {
                        C101834rc0 rc02 = linkedList.get(i4);
                        if (rc02.f299258I == i) {
                            String str = !Util.isNullOrNil(rc02.f299297d) ? rc02.f299297d : rc02.f299301f;
                            if (list != null && !list.isEmpty() && !Util.isNullOrNil(str)) {
                                Iterator<String> it4 = list.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (str.contains(it4.next())) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (!z) {
                                }
                            }
                            C100755z o2 = next.clone();
                            o2.field_type = i2;
                            o2.f295172Q0 = true;
                            o2.f295173R0 = next;
                            o2.f295174S0 = next.field_localId + "_" + rc02.f299280T;
                            o2.f295175T0 = rc02.f299280T;
                            C101801kd0 a = C101369c.m133013a(next.field_favProto);
                            o2.field_favProto = a;
                            a.f298618f = new LinkedList<>();
                            o2.field_favProto.f298618f.add(rc02);
                            o2.field_favProto.mo141220r(rc02.f299297d);
                            C101841sc0 sc02 = rc02.f299296c1;
                            if (sc02 != null) {
                                if (i == 6) {
                                    o2.field_favProto.mo141215m(sc02.f299406e);
                                } else if (i == 5) {
                                    o2.field_favProto.mo141221s(sc02.f299407f);
                                }
                            }
                            arrayList2.add(o2);
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.Fav.FavApiLogic", "getSearchList() [%s] Exception:%s %s", Integer.valueOf(i), e.getClass().getSimpleName(), e.getMessage());
                }
            } else {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: t0 */
    public static void m131875t0(Context context, String str, Intent intent, Bundle bundle) {
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", e);
                return;
            }
        }
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin.fav";
        if (str.startsWith(".")) {
            str = str2 + str;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str);
        if (context != null) {
            Class.forName(str, false, context.getClassLoader());
            if (context instanceof Activity) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(bundle);
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
                C117292a.m165359e(context, "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                return;
            }
            intent.addFlags(268435456);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(bundle);
            aVar2.mo10233c(intent);
            C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((Intent) aVar2.mo10231a(0), (Bundle) aVar2.mo10231a(1));
            C117292a.m165359e(context, "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        }
    }

    /* renamed from: u */
    public static String m131876u(Context context, String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(context, str);
    }

    /* renamed from: u0 */
    public static void m131877u0(Context context, String str, Intent intent, int i, Bundle bundle) {
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", e);
                return;
            }
        }
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin.fav";
        if (str.startsWith(".")) {
            str = str2 + str;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str);
        Class.forName(str, false, context.getClassLoader());
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, i, bundle);
        }
    }

    /* renamed from: v */
    public static String m131878v(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        return z1Var != null ? !Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.mo73969n2() : !Util.isNullOrNil(z1Var.getNickname()) ? z1Var.getNickname() : z1Var.getUsername() : str;
    }

    /* renamed from: v0 */
    public static void m131879v0(long j, C101871zc0 zc02, String str, String str2, ArrayList<String> arrayList, Context context, boolean z, boolean z2) {
        if (zc02 != null && context != null) {
            Intent intent = new Intent();
            intent.putExtra("KFavLocSigleView", true);
            intent.putExtra("map_view_type", 2);
            intent.putExtra("map_indoor_support", 1);
            intent.putExtra("kFavInfoLocalId", j);
            intent.putExtra("kwebmap_slat", zc02.f299952f);
            intent.putExtra("kwebmap_lng", zc02.f299950d);
            intent.putExtra("kPoiName", zc02.f299958o);
            intent.putExtra("Kwebmap_locaion", zc02.f299956j);
            int i = zc02.f299954h;
            if (i >= 0) {
                intent.putExtra("kwebmap_scale", i);
            }
            intent.putExtra("kPoiid", zc02.f299960q);
            intent.putExtra("KIsFromPoiList", zc02.f299944A);
            intent.putExtra("KPoiCategoryTips", zc02.f299962s);
            intent.putExtra("kPoiBusinessHour", zc02.f299964u);
            intent.putExtra("KPoiPhone", zc02.f299966w);
            intent.putExtra("KPoiPriceTips", zc02.f299968y);
            intent.putExtra("kBuildingID", zc02.f299946C);
            intent.putExtra("kFloorName", zc02.f299948E);
            intent.putExtra("kisUsername", str);
            intent.putExtra("kwebmap_from_to", true);
            intent.putExtra("kRemark", str2);
            intent.putExtra("kTags", arrayList);
            intent.putExtra("kFavCanDel", z);
            intent.putExtra("kFavCanRemark", z2);
            C101825od0 od02 = (C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 17, C101825od0.class);
            if (od02 != null) {
                try {
                    intent.putExtra("key_fav_search_report_obj", od02.toByteArray());
                } catch (Exception unused) {
                    Log.m105924i("MicroMsg.Fav.FavApiLogic", "fav report search obj to byte array error");
                }
            }
            C88144b.m109791i(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
        }
    }

    /* renamed from: w */
    public static String m131880w(C101834rc0 rc02) {
        if (rc02 == null) {
            return "";
        }
        String str = rc02.f299280T;
        if (Util.isNullOrNil(str) || !C86709a0.m107522a()) {
            return "";
        }
        C86009m1 r = m131870r(str);
        boolean z = false;
        if (rc02.f299258I == 8 && !Util.isNullOrNil(rc02.f299297d)) {
            str = rc02.f299297d;
            r = m131870r(rc02.f299280T);
            z = true;
        }
        String str2 = rc02.f299262K;
        if (str2 != null && str2.trim().length() > 0 && !z) {
            str = str + "." + rc02.f299262K;
        }
        C86009m1 m1Var = new C86009m1(r, str);
        if (m1Var.mo119967g() || Util.isNullOrNil(rc02.f299266M)) {
            return m1Var.mo119971i();
        }
        String f = C90193h.m112878f((rc02.f299266M + rc02.f299280T).getBytes());
        if (Util.isNullOrNil(f)) {
            return m1Var.mo119971i();
        }
        String str3 = rc02.f299262K;
        if (str3 != null && str3.trim().length() > 0) {
            f = f + "." + rc02.f299262K;
        }
        C86009m1 m1Var2 = new C86009m1(r, f);
        if (m1Var2.mo119967g()) {
            return m1Var2.mo119971i();
        }
        String str4 = rc02.f299280T;
        String str5 = rc02.f299262K;
        if (str5 != null && str5.trim().length() > 0) {
            str4 = str4 + "." + rc02.f299262K;
        }
        Log.m105918d("MicroMsg.Fav.FavApiLogic", "use dataId.fmt, " + str4);
        return new C86009m1(r, str4).mo119971i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ee  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m131881w0(long r18, int r20, int r21) {
        /*
            r0 = r18
            r2 = r20
            r3 = r21
            java.lang.Class<pb1.j1> r4 = pb1.C100718j1.class
            java.lang.String r5 = "MicroMsg.Fav.FavApiLogic"
            java.lang.String r6 = "tryStartBatchGet..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            di3.d r6 = di3.C86312j.m106911c(r4)
            pb1.j1 r6 = (pb1.C100718j1) r6
            pb1.w0 r6 = r6.mo128199Jq()
            xb1.d r6 = (xb1.C102614d) r6
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r6.f302175d
            r8 = 0
            r9 = 0
            java.lang.String r11 = " order by updateTime desc limit "
            java.lang.String r12 = " and type = "
            java.lang.String r13 = "MicroMsg.Fav.FavItemInfoStorage"
            r14 = -1
            r15 = 0
            if (r7 != 0) goto L_0x0032
            java.lang.String r6 = "getMinBatchGetUpdateTime, but db is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r6)
            goto L_0x00f5
        L_0x0032:
            java.lang.String r7 = ") where updateSeq > localSeq"
            int r16 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x0090
            java.lang.String r9 = "select updateTime from (select * from FavItemInfo"
            if (r2 == r14) goto L_0x0051
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = " where type = "
            r10.append(r9)
            r10.append(r2)
            java.lang.String r9 = r10.toString()
        L_0x0051:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r11)
            r10.append(r3)
            java.lang.String r9 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f302175d
            android.database.Cursor r6 = r6.rawQuery(r7, r15)
            if (r6 != 0) goto L_0x007b
            goto L_0x00e8
        L_0x007b:
            int r7 = r6.getCount()
            if (r7 != 0) goto L_0x0085
            r6.close()
            goto L_0x00e8
        L_0x0085:
            r6.moveToLast()
            long r9 = r6.getLong(r8)
            r6.close()
            goto L_0x00f5
        L_0x0090:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "select updateTime from (select * from FavItemInfo where updateTime < "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            if (r2 == r14) goto L_0x00b6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r12)
            r10.append(r2)
            java.lang.String r9 = r10.toString()
        L_0x00b6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = " order by updateTime desc "
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f302175d
            android.database.Cursor r6 = r6.rawQuery(r7, r15)
            if (r6 != 0) goto L_0x00df
            goto L_0x00e8
        L_0x00df:
            int r7 = r6.getCount()
            if (r7 != 0) goto L_0x00eb
            r6.close()
        L_0x00e8:
            r9 = 0
            goto L_0x00f5
        L_0x00eb:
            r6.moveToLast()
            long r9 = r6.getLong(r8)
            r6.close()
        L_0x00f5:
            di3.d r6 = di3.C86312j.m106911c(r4)
            pb1.j1 r6 = (pb1.C100718j1) r6
            pb1.w0 r6 = r6.mo128199Jq()
            xb1.d r6 = (xb1.C102614d) r6
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r6.f302175d
            if (r7 != 0) goto L_0x010b
            java.lang.String r3 = "getNextUpdateTime, but db is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r3)
            goto L_0x014c
        L_0x010b:
            r16 = 0
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x015a
            java.lang.String r7 = "select updateTime from FavItemInfo where itemStatus > 0"
            if (r2 == r14) goto L_0x0128
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r12)
            r13.append(r2)
            java.lang.String r7 = r13.toString()
        L_0x0128:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f302175d
            android.database.Cursor r3 = r6.rawQuery(r3, r15)
            if (r3 != 0) goto L_0x0143
            goto L_0x014c
        L_0x0143:
            int r6 = r3.getCount()
            if (r6 != 0) goto L_0x014f
            r3.close()
        L_0x014c:
            r6 = 0
            goto L_0x01bf
        L_0x014f:
            r3.moveToLast()
            long r6 = r3.getLong(r8)
            r3.close()
            goto L_0x01bf
        L_0x015a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "select updateTime from FavItemInfo where updateTime < "
            r7.append(r13)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            if (r2 == r14) goto L_0x0180
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r12)
            r13.append(r2)
            java.lang.String r7 = r13.toString()
        L_0x0180:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            java.lang.String r7 = " and itemStatus > 0"
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f302175d
            android.database.Cursor r3 = r6.rawQuery(r3, r15)
            if (r3 == 0) goto L_0x01b9
            int r6 = r3.getCount()
            if (r6 <= 0) goto L_0x01b9
            r3.moveToLast()
            long r6 = r3.getLong(r8)
            goto L_0x01ba
        L_0x01b9:
            r6 = r0
        L_0x01ba:
            if (r3 == 0) goto L_0x01bf
            r3.close()
        L_0x01bf:
            long r11 = java.lang.Math.min(r9, r6)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r13 = java.lang.Long.valueOf(r9)
            r3[r8] = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r14 = 1
            r3[r14] = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r18)
            r15 = 2
            r3[r15] = r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 3
            r3[r12] = r11
            java.lang.String r11 = "klem, tryStartBatchGet, minBatGetTime:%d, itemMinTime:%d, updateTime:%d, mayReturnTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r3)
            r16 = 0
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x01ee
            return r6
        L_0x01ee:
            di3.d r3 = di3.C86312j.m106911c(r4)
            pb1.j1 r3 = (pb1.C100718j1) r3
            pb1.w0 r3 = r3.mo128199Jq()
            xb1.d r3 = (xb1.C102614d) r3
            java.util.LinkedList r2 = r3.mo142262Lo(r9, r2)
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0273
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r3[r8] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r14] = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r3[r15] = r0
            java.lang.String r0 = "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r3)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            int r1 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "klem, tryStartBatchGet, need batch get idList size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = pb1.C100725n1.f295091o
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x023a
            r0 = 1
            goto L_0x023b
        L_0x023a:
            r0 = 0
        L_0x023b:
            if (r0 == 0) goto L_0x025c
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.util.concurrent.atomic.AtomicInteger r1 = pb1.C100725n1.f295091o
            int r1 = r1.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "now %d batch-get scene is doing"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 402(0x192, float:5.63E-43)
            r0.mo123457c(r1)
        L_0x025c:
            pb1.n1 r0 = new pb1.n1
            r0.<init>(r2)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            boolean r0 = r1.mo123461g(r0, r8)
            if (r0 != 0) goto L_0x0273
            java.lang.String r0 = "do scene BatchGetFav fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            pb1.C100725n1.m131805j1()
        L_0x0273:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x027a
            return r9
        L_0x027a:
            long r0 = java.lang.Math.min(r9, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100734q.m131881w0(long, int, int):long");
    }

    /* renamed from: x */
    public static String m131882x(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null) {
            Log.m105929w("MicroMsg.Fav.FavApiLogic", "wtf get contact null, username %s", str);
            return "";
        }
        String f = z1Var.mo62898f();
        if (!C72996z1.m85820U5(f)) {
            return f;
        }
        List<String> l = C45612m0.m50695l(str);
        String s = C75592q0.m90789s();
        if (l == null || l.isEmpty()) {
            Log.m105928w("MicroMsg.Fav.FavApiLogic", "get members from username error, content empty");
            return f;
        }
        LinkedList linkedList = (LinkedList) l;
        linkedList.remove(s);
        linkedList.add(0, s);
        return C45612m0.m50692i(l, 3, "");
    }

    /* renamed from: x0 */
    public static void m131883x0(C100746u uVar) {
        Class cls = C100718j1.class;
        if (((C100718j1) C86312j.m106911c(cls)).mo128198DE() == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, getFavCdnStorage null");
            return;
        }
        int bD = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142253bD(uVar.field_favLocalId, 1);
        Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, download data status:%d, favlocalId:%d", Integer.valueOf(bD), Long.valueOf(uVar.field_favLocalId));
        if (((C100718j1) C86312j.m106911c(cls)).mo128199Jq() == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus getFavItemInfoStorage null");
            return;
        }
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(uVar.field_favLocalId);
        if (Yt == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
        } else if (Yt.mo140176C2() || Yt.mo140175B2() || Yt.mo140174A2()) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, status upload, skip. isWaitServerUpload:%b  isUploadding:%b  isUploadFailed:%b", Boolean.valueOf(Yt.mo140176C2()), Boolean.valueOf(Yt.mo140175B2()), Boolean.valueOf(Yt.mo140174A2()));
        } else if (bD == 0) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus init, favLocalId:%d, favId:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt.field_id));
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(10, uVar.field_favLocalId);
        } else if (bD == 1) {
            long j = Yt.field_localId;
            if (!((HashMap) C100695a0.f295015b).containsKey(Long.valueOf(j))) {
                ((HashMap) C100695a0.f295015b).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            }
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(7, uVar.field_favLocalId);
        } else if (bD == 2) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt.field_id));
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(8, uVar.field_favLocalId);
        } else if (bD == 3) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus finish, favLocalId:%d, favId:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt.field_id));
            C115669n.INSTANCE.mo160131h(10659, 1, Integer.valueOf(Yt.field_type), 0, Long.valueOf(m131817H(Yt)), Long.valueOf(C100695a0.m131726a(Yt.field_localId)));
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(10, uVar.field_favLocalId);
        } else if (bD == 4) {
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", Long.valueOf(uVar.field_favLocalId), Integer.valueOf(Yt.field_id), Integer.valueOf(Yt.field_itemStatus));
            C115669n.INSTANCE.mo160131h(10659, 1, Integer.valueOf(Yt.field_type), -5, Long.valueOf(m131817H(Yt)), Long.valueOf(C100695a0.m131726a(Yt.field_localId)));
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(8, uVar.field_favLocalId);
        }
    }

    /* renamed from: y */
    public static String m131884y(C101801kd0 kd02) {
        LinkedList<C101834rc0> linkedList;
        StringBuilder sb = new StringBuilder();
        if (!(kd02 == null || (linkedList = kd02.f298618f) == null)) {
            Iterator<C101834rc0> it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().f299280T);
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* renamed from: y0 */
    public static void m131885y0(C100755z zVar) {
        boolean z;
        Class cls = C75700k0.class;
        Class cls2 = C100718j1.class;
        C35428d0 d0Var = (C35428d0) ((C102615e) ((C100718j1) C86312j.m106911c(cls2)).mo128208Y3()).mo142276jo(zVar.field_localId);
        if (d0Var == null) {
            d0Var = new C35428d0();
            d0Var.field_localId = zVar.field_localId;
            z = true;
        } else {
            z = false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str = zVar.field_favProto.f298626q;
        if (str != null) {
            stringBuffer.append(str);
        }
        String str2 = zVar.field_favProto.f298628s;
        if (str2 != null) {
            stringBuffer.append(str2);
        }
        C101835rd0 rd02 = zVar.field_favProto.f298616d;
        if (rd02 != null && !Util.isNullOrNil(rd02.f299348f)) {
            stringBuffer.append(rd02.f299348f);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(rd02.f299348f);
            if (z1Var != null) {
                stringBuffer.append(z1Var.getNickname());
                stringBuffer.append(z1Var.mo73969n2());
            }
            C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(rd02.f299350h);
            if (z1Var2 != null) {
                stringBuffer.append(z1Var2.getNickname());
                stringBuffer.append(z1Var2.mo73969n2());
            }
            stringBuffer.append(rd02.f299354o);
        }
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        d0Var.field_subtype = 0;
        Iterator<C101834rc0> it = linkedList.iterator();
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            String str3 = next.f299301f;
            if (str3 != null) {
                stringBuffer.append(str3);
            }
            String str4 = next.f299297d;
            if (str4 != null) {
                stringBuffer.append(str4);
            }
            d0Var.field_subtype = (1 << next.f299258I) | d0Var.field_subtype;
        }
        C101756ae0 ae02 = zVar.field_favProto.f298622j;
        if (ae02 != null) {
            String str5 = ae02.f297865f;
            if (str5 != null) {
                stringBuffer.append(str5);
            }
            String str6 = zVar.field_favProto.f298622j.f297863d;
            if (str6 != null) {
                stringBuffer.append(str6);
            }
        }
        C101793jd0 jd02 = zVar.field_favProto.f298634y;
        if (jd02 != null) {
            String str7 = jd02.f298513f;
            if (str7 != null) {
                stringBuffer.append(str7);
            }
            String str8 = zVar.field_favProto.f298634y.f298511d;
            if (str8 != null) {
                stringBuffer.append(str8);
            }
        }
        C64682rk1 rk12 = zVar.field_favProto.f298614M;
        if (rk12 != null) {
            String str9 = rk12.f185185f;
            if (str9 != null) {
                String str10 = rk12.f185198v;
                if (str10 != null && !str10.isEmpty()) {
                    str9 = zVar.field_favProto.f298614M.f185198v;
                }
                stringBuffer.append(str9);
            }
            String str11 = zVar.field_favProto.f298614M.f185187h;
            if (str11 != null) {
                stringBuffer.append(str11);
            }
        }
        d0Var.field_tagContent = "";
        for (String next2 : zVar.field_tagProto.f186494d) {
            d0Var.field_tagContent += " " + next2;
            stringBuffer.append(next2);
        }
        for (String next3 : zVar.field_tagProto.f186495e) {
            d0Var.field_tagContent += " " + next3;
            stringBuffer.append(next3);
            ((C100718j1) C86312j.m106911c(cls2)).mo128204NU().mo140136b(next3);
        }
        d0Var.field_content = stringBuffer.toString();
        d0Var.field_time = zVar.field_updateTime;
        d0Var.field_type = zVar.field_type;
        if (z) {
            ((C102615e) ((C100718j1) C86312j.m106911c(cls2)).mo128208Y3()).mo142277qq(d0Var);
            return;
        }
        ((C102615e) ((C100718j1) C86312j.m106911c(cls2)).mo128208Y3()).mo142275Yt(d0Var, new String[]{C66261f3.COL_LOCALID});
    }

    /* renamed from: z */
    public static C100755z m131886z(String str, int i) {
        C100755z zVar = new C100755z();
        zVar.field_localId = -1;
        zVar.field_id = -1;
        zVar.field_xml = str;
        zVar.field_type = i;
        zVar.mo140177D2(str);
        return zVar;
    }

    /* renamed from: z0 */
    public static void m131887z0(C100755z zVar) {
        boolean z;
        Class cls = C100718j1.class;
        C35428d0 d0Var = (C35428d0) ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).mo142276jo(zVar.field_localId);
        if (d0Var == null) {
            C35428d0 d0Var2 = new C35428d0();
            d0Var2.field_localId = zVar.field_localId;
            d0Var = d0Var2;
            z = true;
        } else {
            z = false;
        }
        d0Var.field_tagContent = "";
        for (String str : zVar.field_tagProto.f186494d) {
            d0Var.field_tagContent += " " + str;
        }
        for (String next : zVar.field_tagProto.f186495e) {
            d0Var.field_tagContent += " " + next;
            ((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140136b(next);
        }
        d0Var.field_time = zVar.field_updateTime;
        d0Var.field_type = zVar.field_type;
        if (z) {
            ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).mo142277qq(d0Var);
            return;
        }
        ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).mo142275Yt(d0Var, new String[]{C66261f3.COL_LOCALID});
    }
}
