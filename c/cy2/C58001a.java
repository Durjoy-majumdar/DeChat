package cy2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
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
import h81.C59774i;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import l60.C99344b;
import o40.C61926c;
import p185kq.C10383h;
import p60.C11871e;
import p629ny.C76979h;
import p744wt.C66191d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import q31.C118148a;
import r60.C101350i;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C64273c21;
import te3.C64766v41;
import up1.C27696y;

/* renamed from: cy2.a */
public final class C58001a extends C58854c {

    /* renamed from: b */
    public final String f165925b = "TaskBarSectionOtherViewLiveHelper";

    /* renamed from: cy2.a$a */
    public static final class C58002a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderObject f165926a;

        public C58002a(FinderObject finderObject) {
            this.f165926a = finderObject;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            C13604l lVar = new C13604l("behaviour_session_id", Wb);
            boolean z = false;
            lVarArr[0] = lVar;
            int i = 1;
            lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
            lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
            C64273c21 c212 = this.f165926a.liveInfo;
            if (c212 != null && c212.f182394f == 1) {
                z = true;
            }
            if (!z) {
                i = 2;
            }
            lVarArr[3] = new C13604l("live_enter_status", Integer.valueOf(i));
            lVarArr[4] = new C13604l("share_username", "");
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58001a(C58854c.C58855a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: a */
    public int mo75502a(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "data");
        return C0966R.C0969drawable.ccx;
    }

    /* renamed from: b */
    public String mo75503b(MultiTaskInfo multiTaskInfo) {
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7898vj);
        C87412m.m108593f(q, "getString(MMApplicationC…ar_section_subtitle_live)");
        return q;
    }

    /* renamed from: d */
    public void mo75505d(int i, C75665a.C58851b bVar, C67121f fVar) {
        String str;
        LinkedList<FinderMedia> linkedList;
        C75665a.C58851b bVar2 = bVar;
        C67121f fVar2 = fVar;
        Class cls = C11990s0.class;
        Class cls2 = C60200t1.class;
        Class cls3 = C61212e.class;
        C87412m.m108594g(bVar2, "viewHolder");
        C87412m.m108594g(fVar2, "viewModel");
        super.mo75505d(i, bVar, fVar);
        C64766v41 v412 = new C64766v41();
        try {
            v412.parseFrom(((MultiTaskInfo) ((ArrayList) fVar2.f192729d).get(i)).field_data);
        } catch (Throwable th) {
            Log.m105921e(this.f165925b, "FinderLiveMultiTaskData parse fail", th);
        }
        if (v412.f185835n != null) {
            Context context = bVar2.f44854d.getContext();
            FinderObject finderObject = v412.f185835n;
            C87412m.m108591d(finderObject);
            FinderContact finderContact = finderObject.contact;
            CharSequence charSequence = finderContact != null ? finderContact.nickname : null;
            String str2 = "";
            if (charSequence == null) {
                charSequence = str2;
            }
            if (charSequence.length() > 0) {
                charSequence = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, charSequence + C76577a.m92166q(context, C0966R.string.f7899vk));
                C87412m.m108593f(charSequence, "getService(ISpannableSer…_subtitle_live_suffix)}\")");
            }
            bVar2.f168473B.setText(charSequence);
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            FinderMedia finderMedia = (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null) ? null : (FinderMedia) C110818d0.m150916N(linkedList);
            StringBuilder sb = new StringBuilder();
            sb.append(Util.nullAsNil(finderMedia != null ? finderMedia.coverUrl : null));
            sb.append(Util.nullAsNil(finderMedia != null ? finderMedia.cover_url_token : null));
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(Util.nullAsNil(finderMedia != null ? finderMedia.thumbUrl : null));
            sb5.append(Util.nullAsNil(finderMedia != null ? finderMedia.thumb_url_token : null));
            String sb6 = sb5.toString();
            if (Util.isNullOrNil(sb4)) {
                sb4 = sb6;
            }
            bVar2.f168472A.setImageBitmap((Bitmap) null);
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(sb4, C27696y.RAW_IMAGE));
            a.f291321e = new C11871e((Animation) null, (C101350i) null, 3, (C8480h) null);
            a.mo138758f(((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            ImageView imageView = bVar2.f168472A;
            C87412m.m108593f(imageView, "viewHolder.image");
            a.mo85954d(imageView);
            C64273c21 c212 = finderObject.liveInfo;
            int i2 = c212 != null ? c212.f182394f : 2;
            String str3 = this.f165925b;
            Log.m105924i(str3, "onBind live " + i2 + ' ' + charSequence);
            if (i2 == 1) {
                View view = bVar2.f168476E;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = bVar2.f168477F;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = bVar2.f168476E;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = bVar2.f168477F;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((C60200t1) C86312j.m106911c(cls2)).mo76861l7().mo83755B5(bVar2.f168472A, sb4, 25);
            }
            C61212e eVar = (C61212e) C86312j.m106911c(cls3);
            View view9 = bVar2.f44854d;
            C13604l[] lVarArr = new C13604l[5];
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(finderObject.f164794id));
            lVarArr[1] = new C13604l("live_id", C61926c.m72691p(v412.f185829e));
            lVarArr[2] = new C13604l("comment_scene", ((C66191d) C86312j.m106911c(C66191d.class)).mo61355ua());
            FinderObject finderObject2 = v412.f185835n;
            if (finderObject2 == null || (str = finderObject2.username) == null) {
                str = str2;
            }
            lVarArr[3] = new C13604l("finder_username", str);
            String str4 = v412.f185834j;
            if (str4 != null) {
                str2 = str4;
            }
            lVarArr[4] = new C13604l("session_buffer", str2);
            eVar.mo86149PM(view9, C90364q0.m113147f(lVarArr));
            ((C61212e) C86312j.m106911c(cls3)).E60(bVar2.f44854d, new C58002a(finderObject));
            ((C61212e) C86312j.m106911c(cls3)).o30(bVar2.f44854d, "live_room_card_wamain");
            ((C61212e) C86312j.m106911c(cls3)).mo86175pO(bVar2.f44854d, 40, 26236);
        }
    }
}
