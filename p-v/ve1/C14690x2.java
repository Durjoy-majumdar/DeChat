package ve1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0712b0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l60.C99342a;
import l60.C99344b;
import p60.C11871e;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import r60.C101350i;
import sx3.C110818d0;
import te3.C64273c21;
import te3.C64284cg;
import tf0.C13887q1;
import up1.C27696y;

/* renamed from: ve1.x2 */
public final class C14690x2 extends C60896i<C0712b0> {

    /* renamed from: e */
    public final int f40630e;

    /* renamed from: f */
    public final String f40631f = "FinderFeedLiveListItemConvert";

    /* renamed from: g */
    public final int f40632g = 5;

    public C14690x2(int i) {
        this.f40630e = i;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aay;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        int i3;
        int i4;
        C64273c21 c212;
        LinkedList<FinderMedia> linkedList;
        C60905o oVar2 = oVar;
        C0712b0 b0Var = (C0712b0) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(b0Var, "item");
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        FinderContact finderContact = b0Var.f1709d.contact;
        String str3 = "";
        if (finderContact == null || (str = finderContact.headUrl) == null) {
            str = str3;
        }
        C62345f fVar = new C62345f(str, (C27696y) null, 2, (C8480h) null);
        View D = oVar2.mo85812D(C0966R.C0970id.f358573fv0);
        C87412m.m108593f(D, "holder.getView(R.id.live_list_item_avatar)");
        i25.mo85957c(fVar, (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.f358576fv3);
        C65604i iVar = C65604i.f188772a;
        View D2 = oVar2.mo85812D(C0966R.C0970id.f358576fv3);
        C87412m.m108593f(D2, "holder.getView(R.id.live_list_item_nickname)");
        TextView textView2 = (TextView) D2;
        FinderContact finderContact2 = b0Var.f1709d.contact;
        if (finderContact2 == null || (str2 = finderContact2.nickname) == null) {
            str2 = str3;
        }
        textView.setText(iVar.mo89679e(textView2, str2, this.f40632g));
        C58784w3 w3Var = C58784w3.f168295a;
        View D3 = oVar2.mo85812D(C0966R.C0970id.a0g);
        C87412m.m108593f(D3, "holder.getView(R.id.auth_icon)");
        ImageView imageView = (ImageView) D3;
        FinderContact finderContact3 = b0Var.f1709d.contact;
        C58784w3.m68429F1(w3Var, imageView, finderContact3 != null ? finderContact3.authInfo : null, 0, (C64284cg) null, 12, (Object) null);
        FinderObject finderObject = b0Var.f1709d;
        C64273c21 c213 = finderObject.liveInfo;
        int i5 = c213 != null ? c213.f182394f : 2;
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        FinderMedia finderMedia = (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null) ? null : (FinderMedia) C110818d0.m150916N(linkedList);
        if (finderMedia == null) {
            String str4 = this.f40631f;
            StringBuilder sb = new StringBuilder();
            FinderObject finderObject2 = b0Var.f1709d;
            sb.append((finderObject2 == null || (c212 = finderObject2.liveInfo) == null) ? null : Long.valueOf(c212.f182392d));
            sb.append(" firstMedia is empty");
            Log.m105924i(str4, sb.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Util.nullAsNil(finderMedia != null ? finderMedia.coverUrl : null));
        sb4.append(Util.nullAsNil(finderMedia != null ? finderMedia.cover_url_token : null));
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Util.nullAsNil(finderMedia != null ? finderMedia.thumbUrl : null));
        sb6.append(Util.nullAsNil(finderMedia != null ? finderMedia.thumb_url_token : null));
        String sb7 = !Util.isNullOrNil(sb5) ? sb5 : sb6.toString();
        ((ImageView) oVar2.mo85812D(C0966R.C0970id.kk5)).setImageBitmap((Bitmap) null);
        if (i5 == 1) {
            C99344b<C100810g0, Bitmap> a = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(new C11984n0(sb7, C27696y.RAW_IMAGE));
            a.f291321e = new C11871e((Animation) null, (C101350i) null, 3, (C8480h) null);
            a.mo138758f(((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            View D4 = oVar2.mo85812D(C0966R.C0970id.kk5);
            C87412m.m108593f(D4, "holder.getView<ImageView>(R.id.thumb_img)");
            ((C99342a) a).mo85954d((ImageView) D4);
            View D5 = oVar2.mo85812D(C0966R.C0970id.dv9);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D5;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D6 = oVar2.mo85812D(C0966R.C0970id.dkn);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = D6;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i4 = 0;
            i3 = 8;
        } else {
            C7335d c = C86312j.m106911c(C13887q1.class);
            C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
            View D7 = oVar2.mo85812D(C0966R.C0970id.kk5);
            C87412m.m108593f(D7, "holder.getView<ImageView>(R.id.thumb_img)");
            i3 = 8;
            i4 = 0;
            C13887q1.C13888a.m13309e((C13887q1) c, (ImageView) D7, sb7, 0, 4, (Object) null);
            View D8 = oVar2.mo85812D(C0966R.C0970id.dv9);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = D8;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D9 = oVar2.mo85812D(C0966R.C0970id.dkn);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view4 = D9;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i6 = this.f40630e;
        if (i6 == 2) {
            String str5 = this.f40631f;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("bindLbsConfig recommendReason is empty:");
            String str6 = b0Var.f1709d.recommendReason;
            sb8.append(str6 == null || str6.length() == 0);
            sb8.append(",recommendReasonType:");
            sb8.append(b0Var.f1709d.recommendReasonType);
            Log.m105924i(str5, sb8.toString());
            String str7 = b0Var.f1709d.recommendReason;
            if (!(str7 == null || str7.length() == 0)) {
                LinearLayout linearLayout = (LinearLayout) oVar2.mo85812D(C0966R.C0970id.brm);
                ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.brw);
                TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.bsm);
                String str8 = b0Var.f1709d.recommendReason;
                if (str8 != null) {
                    str3 = str8;
                }
                textView3.setText(str3);
                textView3.setVisibility(i4);
                int i7 = b0Var.f1709d.recommendReasonType;
                if (i7 != 1) {
                    switch (i7) {
                        case 9:
                            linearLayout.setVisibility(i4);
                            Context context = oVar2.f173499A;
                            imageView2.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_me, context.getResources().getColor(C0966R.color.f2975b6)));
                            imageView2.setVisibility(i4);
                            break;
                        case 10:
                            linearLayout.setVisibility(i4);
                            Context context2 = oVar2.f173499A;
                            imageView2.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.finder_icons_filled_topic, context2.getResources().getColor(C0966R.color.f2975b6)));
                            imageView2.setVisibility(i4);
                            break;
                        case 11:
                            linearLayout.setVisibility(i4);
                            Context context3 = oVar2.f173499A;
                            imageView2.setImageDrawable(C74933u4.m89768e(context3, C0966R.raw.finder_icons_filled_sight, context3.getResources().getColor(C0966R.color.f2975b6)));
                            imageView2.setVisibility(i4);
                            break;
                        case 12:
                            linearLayout.setVisibility(i4);
                            Context context4 = oVar2.f173499A;
                            imageView2.setImageDrawable(C74933u4.m89768e(context4, C0966R.raw.finder_filled_fire, context4.getResources().getColor(C0966R.color.f2975b6)));
                            imageView2.setVisibility(i4);
                            break;
                        case 13:
                            linearLayout.setVisibility(i4);
                            Context context5 = oVar2.f173499A;
                            imageView2.setImageDrawable(C74933u4.m89768e(context5, C0966R.raw.finder_icons_filled_food, context5.getResources().getColor(C0966R.color.f2975b6)));
                            imageView2.setVisibility(i4);
                            break;
                        default:
                            linearLayout.setVisibility(i3);
                            imageView2.setVisibility(i3);
                            textView3.setVisibility(i3);
                            break;
                    }
                } else {
                    linearLayout.setVisibility(i4);
                    Context context6 = oVar2.f173499A;
                    imageView2.setImageDrawable(C74933u4.m89768e(context6, C0966R.raw.icons_filled_location, context6.getResources().getColor(C0966R.color.f2975b6)));
                    imageView2.setVisibility(i4);
                }
            }
        } else if (i6 == 1) {
            ((LinearLayout) oVar2.mo85812D(C0966R.C0970id.brm)).setVisibility(i3);
            TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.efk);
            textView4.setTextSize(1, 10.0f);
            String str9 = b0Var.f1709d.recommendReason;
            if (str9 == null || str9.length() == 0) {
                textView4.setVisibility(i3);
            } else {
                textView4.setVisibility(i4);
                textView4.setText(b0Var.f1709d.recommendReason);
            }
            String str10 = this.f40631f;
            Log.m105924i(str10, "bindFriendConfig item:" + b0Var);
        }
        String str11 = this.f40631f;
        Log.m105924i(str11, "[updateLiveList]onBindViewHolder holder:" + oVar2 + " tabType:" + this.f40630e + ",position:" + i + ",type:" + i2 + ',' + b0Var);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
