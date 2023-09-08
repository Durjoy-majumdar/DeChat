package p484cx;

import android.content.Context;
import androidx.lifecycle.C39623j;
import ck2.C54873a;
import ck2.C54883d0;
import ck2.C54885e0;
import ck2.C54913i0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.plugin.ringtone.widget.RingtoneHalfBottomDialog;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import nj2.C61768p;
import p145dx.C58458y;
import p145dx.C7522l;
import p145dx.C7524q;
import qo3.C101218e0;
import rx3.C13598b0;
import wj2.C66132f;

@C86522b
/* renamed from: cx.k */
public final class C57995k extends C86301e implements C7522l, C7524q, C58458y {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: FD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8645FD(com.tencent.p014mm.plugin.ringtone.widget.RingtoneAuthorLayout r7, wj2.C66132f r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ringtoneAuthorLayout"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "ringtoneInfo"
            gy3.C87412m.m108594g(r8, r0)
            android.widget.TextView r0 = r7.getAuthor()
            android.widget.ImageView r1 = r7.getAuthIcon()
            android.widget.TextView r2 = r7.getAuthProfession()
            android.content.Context r3 = r7.getContext()
            boolean r7 = r7.getShowAuthProfession()
            java.lang.String r4 = r8.mo90176g()
            java.lang.String r5 = "voip_default_sound"
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x003a
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131821604(0x7f110424, float:1.9275956E38)
            java.lang.CharSequence r3 = r3.getText(r4)
            r0.setText(r3)
            goto L_0x0044
        L_0x003a:
            java.lang.String r3 = r8.f190087j
            if (r3 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            java.lang.String r3 = ""
        L_0x0041:
            r0.setText(r3)
        L_0x0044:
            r0.requestLayout()
            java.lang.String r0 = r8.f190098u
            int r0 = r0.length()
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            r5 = 8
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r8.f190099v
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0062
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0082
            int r0 = r8.f190101x
            if (r0 != r3) goto L_0x0082
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            java.lang.String r3 = r8.f190098u
            r0.mo76785N7(r3, r1)
            java.lang.String r8 = r8.f190099v
            r2.setText(r8)
            r1.setVisibility(r4)
            r2.setVisibility(r4)
            goto L_0x0088
        L_0x0082:
            r1.setVisibility(r5)
            r2.setVisibility(r5)
        L_0x0088:
            if (r7 != 0) goto L_0x008d
            r2.setVisibility(r5)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p484cx.C57995k.mo8645FD(com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout, wj2.f):void");
    }

    public Class<? extends UIComponent> Sp0() {
        return C54913i0.class;
    }

    public Class<? extends UIComponent> T30() {
        return C54883d0.class;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dg0(com.tencent.p014mm.plugin.ringtone.widget.RingtoneAuthorLayout r8, com.tencent.p014mm.protocal.protobuf.FinderObject r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ringtoneAuthorLayout"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "finderObject"
            gy3.C87412m.m108594g(r9, r0)
            android.widget.TextView r0 = r8.getAuthor()
            android.widget.ImageView r1 = r8.getAuthIcon()
            android.widget.TextView r2 = r8.getAuthProfession()
            boolean r8 = r8.getShowAuthProfession()
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.contact
            if (r9 != 0) goto L_0x001f
            return
        L_0x001f:
            java.lang.String r3 = r9.nickname
            r0.setText(r3)
            r0.requestLayout()
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r9.authInfo
            r0 = 0
            if (r9 == 0) goto L_0x002f
            java.lang.String r3 = r9.authIconUrl
            goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            if (r9 == 0) goto L_0x0034
            java.lang.String r0 = r9.authProfession
        L_0x0034:
            r9 = 1
            r4 = 0
            if (r3 == 0) goto L_0x0041
            int r5 = r3.length()
            if (r5 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r5 = 0
            goto L_0x0042
        L_0x0041:
            r5 = 1
        L_0x0042:
            r6 = 8
            if (r5 != 0) goto L_0x0067
            if (r0 == 0) goto L_0x0050
            int r5 = r0.length()
            if (r5 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            if (r9 != 0) goto L_0x0067
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ht1.t1 r9 = (ht1.C60200t1) r9
            r9.mo76785N7(r3, r1)
            r2.setText(r0)
            r1.setVisibility(r4)
            r2.setVisibility(r4)
            goto L_0x006d
        L_0x0067:
            r1.setVisibility(r6)
            r2.setVisibility(r6)
        L_0x006d:
            if (r8 != 0) goto L_0x0072
            r2.setVisibility(r6)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p484cx.C57995k.dg0(com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    public boolean fo0(C66132f fVar) {
        C87412m.m108594g(fVar, "tpMediaDesc");
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        C66132f j = C61768p.m72482j(s);
        if (fVar.f190081d == null) {
            int i = fVar.f190094q;
            return i != 0 && j.f190094q == i;
        } else if (j.f190092o == fVar.f190092o) {
            return true;
        }
    }

    public Class<? extends UIComponent> id0() {
        return C54885e0.class;
    }

    /* renamed from: su */
    public void mo8649su(Context context, C39623j jVar, String str, C66132f fVar, long j, int i, int i2, String str2, boolean z, boolean z2, C32226l<? super C101218e0, C13598b0> lVar, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jVar, "lifecycle");
        C87412m.m108594g(str, "toUser");
        C87412m.m108594g(fVar, "tpMediaInfoDesc");
        C87412m.m108594g(str2, "recRequestId");
        RingtoneHalfBottomDialog.m66040a(context, jVar, str, fVar, j, i, i2, str2, z, z2, lVar, pVar);
    }

    public Class<? extends UIComponent> tk0() {
        return RingtoneDataUIC.class;
    }

    /* renamed from: xJ */
    public Class<? extends UIComponent> mo82783xJ() {
        return C54873a.class;
    }
}
