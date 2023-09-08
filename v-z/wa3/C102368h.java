package wa3;

import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.LinkedList;
import p823sg.C90193h;
import pb1.C100718j1;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101834rc0;
import xb1.C102614d;

/* renamed from: wa3.h */
public class C102368h {
    /* renamed from: a */
    public static C100755z m135070a(long j) {
        return ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
    }

    /* renamed from: b */
    public static String m135071b(String str, int i) {
        return C90193h.m112878f((str + i + System.currentTimeMillis()).getBytes());
    }

    /* renamed from: c */
    public static String m135072c(C101834rc0 rc02) {
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 27;
        aVar.f264840f = rc02;
        favoriteOperationEvent.publish();
        return favoriteOperationEvent.f264834e.f264857c;
    }

    /* renamed from: d */
    public static String m135073d(float f) {
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

    /* renamed from: e */
    public static String m135074e(C101834rc0 rc02) {
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 27;
        aVar.f264840f = rc02;
        favoriteOperationEvent.publish();
        return favoriteOperationEvent.f264834e.f264858d;
    }

    /* renamed from: f */
    public static float m135075f(long j) {
        float f = ((float) j) / 1000.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (float) Math.round(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        r1 = r10.group();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r4 = r2 + 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m135076g(te3.C101801kd0 r7, long r8, java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r1 != 0) goto L_0x00a7
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0013
            goto L_0x00a7
        L_0x0013:
            r1 = 2
            java.lang.String r2 = "<object[^>]*>"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r2, r1)
            java.util.regex.Matcher r10 = r1.matcher(r10)
        L_0x001e:
            boolean r1 = r10.find()
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = r10.group()
            java.lang.String r2 = "WeNote_"
            int r2 = r1.indexOf(r2)
            r3 = -1
            if (r2 != r3) goto L_0x0032
            goto L_0x0052
        L_0x0032:
            int r4 = r2 + 1
            java.lang.String r5 = "\""
            int r5 = r1.indexOf(r5, r4)
            if (r5 != r3) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            java.lang.String r6 = " "
            int r4 = r1.indexOf(r6, r4)
            if (r4 != r3) goto L_0x0046
            goto L_0x0052
        L_0x0046:
            if (r5 >= r4) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r5 = r4
        L_0x004a:
            java.lang.String r1 = r1.substring(r2, r5)
            r0.add(r1)
            goto L_0x001e
        L_0x0052:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.LinkedList<te3.rc0> r1 = r7.f298618f
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L_0x005f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r1.next()
            te3.rc0 r4 = (te3.C101834rc0) r4
            if (r2 != 0) goto L_0x0078
            java.lang.String r5 = "WeNoteHtmlFile"
            r4.mo141228A(r5)
            int r2 = r2 + 1
            r10.add(r4)
            goto L_0x005f
        L_0x0078:
            int r5 = r4.f299258I
            r6 = 1
            if (r5 != r6) goto L_0x0083
            java.lang.String r5 = "-1"
            r4.mo141228A(r5)
            goto L_0x008f
        L_0x0083:
            int r5 = r3 + 1
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4.mo141228A(r3)
            r3 = r5
        L_0x008f:
            r10.add(r4)
            goto L_0x005f
        L_0x0093:
            com.tencent.mm.autogen.events.FavoriteOperationEvent r0 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r1 = r0.f264833d
            r2 = 33
            r1.f264835a = r2
            r1.f264838d = r7
            r7.f298618f = r10
            r1.f264839e = r8
            r0.publish()
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.C102368h.m135076g(te3.kd0, long, java.lang.String):void");
    }

    /* renamed from: h */
    public static void m135077h(long j, String str) {
        LinkedList<C101834rc0> linkedList;
        if (j > 0) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 34;
            aVar.f264839e = j;
            favoriteOperationEvent.publish();
            C101801kd0 kd02 = favoriteOperationEvent.f264833d.f264838d;
            if (kd02 != null && (linkedList = kd02.f298618f) != null && linkedList.size() > 1 && favoriteOperationEvent.f264833d.f264838d.f298618f.get(0).f299308i1 == null) {
                Log.m105924i("MicroMsg.WNNoteFavLogic", "Note: Htmlid is null,  do updateFavItemHtmlIdStorage");
                if (!Util.isNullOrNil(str) && C86013q1.m106450k(str)) {
                    try {
                        m135076g(favoriteOperationEvent.f264833d.f264838d, j, C86013q1.m106432N(str));
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.WNNoteFavLogic", "Note: FileNotFoundException :%s", e.getMessage());
                    }
                }
            }
        }
    }
}
