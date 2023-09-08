package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import te3.C48922bx2;
import te3.C52172yv;
import te3.C64300cx2;
import te3.C64594nx2;
import te3.C64622p31;
import te3.C64668qx2;
import te3.C64773vh3;

/* renamed from: cl1.y0 */
public final class C55009y0 {
    /* renamed from: a */
    public static final void m62070a(C64622p31 p312, String str, String str2) {
        LinkedList<C52172yv> linkedList;
        LinkedList<C52172yv> linkedList2;
        C64773vh3 vh32;
        C89349b bVar;
        C64773vh3 vh33;
        C64773vh3 vh34;
        C87412m.m108594g(p312, "<this>");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "prefix");
        Log.m105924i(str, "FinderLiveMilestoneLotteryInfo logInfo " + str2 + " id:" + p312.f184746d + ", ext_flag:" + p312.f184749g);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" id:");
        sb.append(p312.f184746d);
        sb.append(", base_info, begin_time:");
        C64300cx2 cx22 = p312.f184747e;
        Integer num = null;
        sb.append(cx22 != null ? Integer.valueOf(cx22.f182596d) : null);
        sb.append(", end_time:");
        C64300cx2 cx23 = p312.f184747e;
        sb.append(cx23 != null ? Integer.valueOf(cx23.f182597e) : null);
        sb.append(", remain_time:");
        C64300cx2 cx24 = p312.f184747e;
        sb.append(cx24 != null ? Integer.valueOf(cx24.f182598f) : null);
        sb.append(", status:");
        C64300cx2 cx25 = p312.f184747e;
        sb.append(cx25 != null ? Integer.valueOf(cx25.f182599g) : null);
        sb.append(", attend_type:");
        C64300cx2 cx26 = p312.f184747e;
        sb.append(cx26 != null ? Integer.valueOf(cx26.f182600h) : null);
        sb.append(",participate_count:");
        C64300cx2 cx27 = p312.f184747e;
        sb.append(cx27 != null ? Integer.valueOf(cx27.f182601i) : null);
        sb.append(",show_count:");
        C64300cx2 cx28 = p312.f184747e;
        sb.append(cx28 != null ? Integer.valueOf(cx28.f182602j) : null);
        Log.m105924i(str, sb.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(" id:");
        sb4.append(p312.f184746d);
        sb4.append(", prize_info, count:");
        C64594nx2 nx22 = p312.f184748f;
        sb4.append(nx22 != null ? Integer.valueOf(nx22.f184577f) : null);
        sb4.append(", prize_type:");
        C64594nx2 nx23 = p312.f184748f;
        sb4.append(nx23 != null ? Integer.valueOf(nx23.f184578g) : null);
        sb4.append(", wording:");
        C64594nx2 nx24 = p312.f184748f;
        sb4.append(nx24 != null ? nx24.f184576e : null);
        sb4.append(", img_url:");
        C64594nx2 nx25 = p312.f184748f;
        sb4.append(nx25 != null ? nx25.f184575d : null);
        Log.m105924i(str, sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append(" id:");
        sb5.append(p312.f184746d);
        sb5.append(", prize_info, product_jump_info:coupon_id: ");
        C64594nx2 nx26 = p312.f184748f;
        sb5.append((nx26 == null || (vh34 = nx26.f184579h) == null) ? null : vh34.f185893d);
        sb5.append(",related_product_id: ");
        C64594nx2 nx27 = p312.f184748f;
        sb5.append((nx27 == null || (vh33 = nx27.f184579h) == null) ? null : vh33.f185894e);
        sb5.append(",jump_info: ");
        C64594nx2 nx28 = p312.f184748f;
        sb5.append((nx28 == null || (vh32 = nx28.f184579h) == null || (bVar = vh32.f185895f) == null) ? null : Integer.valueOf(bVar.f257327a.length));
        Log.m105924i(str, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str2);
        sb6.append(" id:");
        sb6.append(p312.f184746d);
        sb6.append(", attend_info:choiceSize:");
        C48922bx2 bx22 = p312.f184750h;
        sb6.append((bx22 == null || (linkedList2 = bx22.f131371f) == null) ? null : Integer.valueOf(linkedList2.size()));
        sb6.append(",voting_id: ");
        C48922bx2 bx23 = p312.f184750h;
        sb6.append(bx23 != null ? bx23.f131370e : null);
        sb6.append(",voting_wording: ");
        C48922bx2 bx24 = p312.f184750h;
        sb6.append(bx24 != null ? bx24.f131372g : null);
        sb6.append(",voting_tips:");
        C48922bx2 bx25 = p312.f184750h;
        sb6.append(bx25 != null ? bx25.f131373h : null);
        sb6.append(",comment_wording: ");
        C48922bx2 bx26 = p312.f184750h;
        sb6.append(bx26 != null ? bx26.f131369d : null);
        Log.m105924i(str, sb6.toString());
        C48922bx2 bx27 = p312.f184750h;
        if (!(bx27 == null || (linkedList = bx27.f131371f) == null)) {
            for (C52172yv yvVar : linkedList) {
                Log.m105924i(str, str2 + " choiceList, choice_id:" + yvVar.f145527d + ", self_voted:" + yvVar.f145529f + ", select_count:" + yvVar.f145530g + ", choice_str_id:" + yvVar.f145531h + ", wording:" + yvVar.f145528e);
            }
        }
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str2);
        sb7.append(" id:");
        sb7.append(p312.f184746d);
        sb7.append(", result_info:support_voting_result: ");
        C64668qx2 qx22 = p312.f184751i;
        sb7.append(qx22 != null ? Integer.valueOf(qx22.f185086f) : null);
        sb7.append("voting_correct: ");
        C64668qx2 qx23 = p312.f184751i;
        if (qx23 != null) {
            num = Integer.valueOf(qx23.f185087g);
        }
        sb7.append(num);
        Log.m105924i(str, sb7.toString());
    }
}
