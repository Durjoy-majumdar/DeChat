package pb1;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.ImgData;
import com.tencent.p014mm.sendtowework.VideoData;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.List;
import te3.C101834rc0;

/* renamed from: pb1.j0 */
public final class C100717j0 {
    /* renamed from: a */
    public static final void m131779a(Intent intent, C100755z zVar) {
        C87412m.m108594g(intent, "intent");
        if ((zVar != null ? zVar.field_favProto : null) != null && !Util.isNullOrNil((List) zVar.field_favProto.f298618f)) {
            C101834rc0 D = C100734q.m131813D(zVar);
            C87412m.m108593f(D, "getFirstDataItem(favItemInfo)");
            String w = C100734q.m131880w(D);
            if (C86013q1.m106450k(w)) {
                ImgData imgData = new ImgData(C86013q1.m106448i(w, false));
                intent.putExtra("content_type_forward_to_wework", 2);
                intent.putExtra("Select_Data_Send_To_WeWork", imgData);
            }
        }
    }

    /* renamed from: b */
    public static final void m131780b(Intent intent, C100755z zVar) {
        C87412m.m108594g(intent, "intent");
        if ((zVar != null ? zVar.field_favProto : null) != null && !Util.isNullOrNil((List) zVar.field_favProto.f298618f)) {
            C101834rc0 D = C100734q.m131813D(zVar);
            C87412m.m108593f(D, "getFirstDataItem(favItemInfo)");
            String w = C100734q.m131880w(D);
            if (C86013q1.m106450k(w)) {
                VideoData videoData = new VideoData(C86013q1.m106448i(w, false));
                intent.putExtra("content_type_forward_to_wework", 3);
                intent.putExtra("Select_Data_Send_To_WeWork", videoData);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: te3.zc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: te3.pc0} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m131781c(android.content.Intent r14, pb1.C100755z r15) {
        /*
            java.lang.String r0 = "intent"
            gy3.C87412m.m108594g(r14, r0)
            if (r15 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = r15.field_type
            r1 = 1
            java.lang.String r2 = "Select_Data_Send_To_WeWork"
            java.lang.String r3 = "content_type_forward_to_wework"
            if (r0 == r1) goto L_0x00f7
            r1 = 2
            if (r0 == r1) goto L_0x00f3
            r1 = 0
            r4 = 0
            switch(r0) {
                case 4: goto L_0x00aa;
                case 5: goto L_0x007e;
                case 6: goto L_0x004e;
                case 7: goto L_0x00ae;
                case 8: goto L_0x0022;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r0) {
                case 18: goto L_0x00ed;
                case 19: goto L_0x00b4;
                case 20: goto L_0x0109;
                case 21: goto L_0x00ae;
                default: goto L_0x001c;
            }
        L_0x001c:
            r15 = -1
            r14.putExtra(r3, r15)
            goto L_0x0109
        L_0x0022:
            te3.kd0 r15 = r15.field_favProto
            if (r15 != 0) goto L_0x0028
            goto L_0x0109
        L_0x0028:
            java.util.LinkedList<te3.rc0> r15 = r15.f298618f
            java.lang.Object r15 = r15.get(r1)
            te3.rc0 r15 = (te3.C101834rc0) r15
            java.lang.String r0 = pb1.C100734q.m131880w(r15)
            com.tencent.mm.sendtowework.FileData r4 = new com.tencent.mm.sendtowework.FileData
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r1)
            long r5 = r15.f299276R
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r15 = r15.f299297d
            r4.<init>(r0, r1, r15)
            r15 = 4
            r14.putExtra(r3, r15)
            r14.putExtra(r2, r4)
            goto L_0x0109
        L_0x004e:
            te3.kd0 r15 = r15.field_favProto
            if (r15 == 0) goto L_0x0054
            te3.zc0 r4 = r15.f298620h
        L_0x0054:
            if (r4 != 0) goto L_0x0058
            goto L_0x0109
        L_0x0058:
            com.tencent.mm.sendtowework.LocationData r15 = new com.tencent.mm.sendtowework.LocationData
            java.lang.String r6 = r4.f299958o
            java.lang.String r7 = r4.f299956j
            double r0 = r4.f299950d
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
            double r0 = r4.f299952f
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            int r0 = r4.f299954h
            double r0 = (double) r0
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 6
            r14.putExtra(r3, r0)
            r14.putExtra(r2, r15)
            goto L_0x0109
        L_0x007e:
            te3.kd0 r0 = r15.field_favProto
            te3.ae0 r0 = r0.f298622j
            if (r0 != 0) goto L_0x0086
            goto L_0x0109
        L_0x0086:
            java.lang.String r1 = r0.f297867h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0095
            te3.kd0 r15 = r15.field_favProto
            te3.rd0 r15 = r15.f298616d
            java.lang.String r15 = r15.f299364y
            goto L_0x0097
        L_0x0095:
            java.lang.String r15 = r0.f297867h
        L_0x0097:
            com.tencent.mm.sendtowework.LinkData r1 = new com.tencent.mm.sendtowework.LinkData
            java.lang.String r4 = r0.f297863d
            java.lang.String r5 = r0.f297865f
            java.lang.String r0 = r0.f297869j
            r1.<init>(r15, r4, r5, r0)
            r15 = 7
            r14.putExtra(r3, r15)
            r14.putExtra(r2, r1)
            goto L_0x0109
        L_0x00aa:
            m131780b(r14, r15)
            goto L_0x0109
        L_0x00ae:
            r15 = 11
            r14.putExtra(r3, r15)
            goto L_0x0109
        L_0x00b4:
            te3.kd0 r0 = r15.field_favProto
            if (r0 == 0) goto L_0x00ba
            te3.pc0 r4 = r0.f298610I
        L_0x00ba:
            if (r4 != 0) goto L_0x00bd
            goto L_0x0109
        L_0x00bd:
            com.tencent.mm.sendtowework.AppBrandData r13 = new com.tencent.mm.sendtowework.AppBrandData
            java.lang.String r6 = r4.f259741d
            java.lang.String r7 = r4.f259746i
            java.lang.String r8 = r4.f259744g
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            java.lang.Object r0 = r0.getFirst()
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.lang.String r0 = pb1.C100734q.m131826Q(r0)
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r1)
            java.lang.String r10 = r4.f259747j
            te3.kd0 r15 = r15.field_favProto
            java.lang.String r11 = r15.f298626q
            int r15 = r4.f259745h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r15 = 5
            r14.putExtra(r3, r15)
            r14.putExtra(r2, r13)
            goto L_0x0109
        L_0x00ed:
            r15 = 13
            r14.putExtra(r3, r15)
            goto L_0x0109
        L_0x00f3:
            m131779a(r14, r15)
            goto L_0x0109
        L_0x00f7:
            te3.kd0 r15 = r15.field_favProto
            java.lang.String r15 = r15.f298628s
            if (r15 != 0) goto L_0x00fe
            goto L_0x0109
        L_0x00fe:
            com.tencent.mm.sendtowework.TextData r0 = new com.tencent.mm.sendtowework.TextData
            r0.<init>(r15)
            r14.putExtra(r3, r1)
            r14.putExtra(r2, r0)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100717j0.m131781c(android.content.Intent, pb1.z):void");
    }
}
