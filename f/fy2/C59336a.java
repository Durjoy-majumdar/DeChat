package fy2;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.animation.Animation;
import android.widget.ImageView;
import ay2.C67121f;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ey2.C58854c;
import ey2.C75665a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import l60.C99344b;
import p60.C11871e;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import r60.C101350i;
import te3.C64897zv2;
import up1.C27696y;

/* renamed from: fy2.a */
public final class C59336a extends C58854c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59336a(C58854c.C58855a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: a */
    public int mo75502a(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "data");
        return C0966R.C0969drawable.f357376cd0;
    }

    /* renamed from: b */
    public String mo75503b(MultiTaskInfo multiTaskInfo) {
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7902vn);
        C87412m.m108593f(q, "getString(MMApplicationC…r_section_subtitle_video)");
        return q;
    }

    /* renamed from: d */
    public void mo75505d(int i, C75665a.C58851b bVar, C67121f fVar) {
        LinkedList<FinderMedia> linkedList;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(bVar, "viewHolder");
        C87412m.m108594g(fVar, "viewModel");
        super.mo75505d(i, bVar, fVar);
        C64897zv2 zv22 = new C64897zv2();
        boolean z = true;
        try {
            zv22.parseFrom(((MultiTaskInfo) ((ArrayList) fVar.f192729d).get(i)).field_data);
        } catch (Throwable th) {
            Log.m105921e("TaskBarSectionOtherViewVideoHelper", "MegaVideoFloatBallInfo parse fail", th);
        }
        if (!zv22.f186888j.isEmpty()) {
            Context context = bVar.f44854d.getContext();
            FinderObject finderObject = zv22.f186888j.get(0);
            FinderContact finderContact = finderObject.contact;
            CharSequence charSequence = finderContact != null ? finderContact.nickname : null;
            if (charSequence == null) {
                charSequence = (SpannableString) "";
            }
            if (charSequence.length() <= 0) {
                z = false;
            }
            if (z) {
                charSequence = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, charSequence + C76577a.m92166q(context, C0966R.string.f7903vo));
                C87412m.m108593f(charSequence, "getService(ISpannableSer…subtitle_video_suffix)}\")");
            }
            bVar.f168473B.setText(charSequence);
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            FinderMedia first = (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null) ? null : linkedList.getFirst();
            StringBuilder sb = new StringBuilder();
            sb.append(Util.nullAsNil(first != null ? first.coverUrl : null));
            sb.append(Util.nullAsNil(first != null ? first.cover_url_token : null));
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(Util.nullAsNil(first != null ? first.thumbUrl : null));
            sb5.append(Util.nullAsNil(first != null ? first.thumb_url_token : null));
            String sb6 = sb5.toString();
            if (Util.isNullOrNil(sb4)) {
                sb4 = sb6;
            }
            ImageView imageView = bVar.f168472A;
            imageView.setImageBitmap((Bitmap) null);
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(sb4, C27696y.RAW_IMAGE));
            a.f291321e = new C11871e((Animation) null, (C101350i) null, 3, (C8480h) null);
            a.mo138758f(((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            a.mo85954d(imageView);
            bVar.f168478G.setVisibility(0);
        }
    }
}
