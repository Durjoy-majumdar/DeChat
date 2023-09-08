package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import j20.C117292a;
import java.util.LinkedList;
import jc0.C21210b;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os2.C100406i0;
import p823sg.C90193h;
import rc0.C63389c;
import te3.C101779g1;
import te3.C101789j00;
import te3.C101799k1;
import te3.C101804kv2;
import te3.C64719t23;
import uo3.C78253a;
import vr2.C102236a0;
import za2.C102984b;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.j */
public class C57416j extends BaseTimeLineItem {

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.j$a */
    public class C57417a implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ TimeLineObject f164459a;

        /* renamed from: b */
        public final /* synthetic */ String f164460b;

        /* renamed from: c */
        public final /* synthetic */ C57418b f164461c;

        public C57417a(C57416j jVar, TimeLineObject timeLineObject, String str, C57418b bVar) {
            this.f164459a = timeLineObject;
            this.f164460b = str;
            this.f164461c = bVar;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            SnsMethodCalculate.markStartTimeMs("onImageLoadStart", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$1");
            SnsMethodCalculate.markEndTimeMs("onImageLoadStart", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$1");
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            SnsMethodCalculate.markStartTimeMs("onImageLoadFinish", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$1");
            Bitmap bitmap = bVar.f59988d;
            if (bitmap != null && !bitmap.isRecycled()) {
                ((C63389c) C86312j.m106911c(C63389c.class)).mo88295UZ(this.f164459a.f283893Id, this.f164460b);
                C55593g.f158270a.mo77114b(MMApplicationContext.getContext(), this.f164461c.f164465I0, bVar.f59988d, C90193h.m112878f(str.getBytes()));
            }
            SnsMethodCalculate.markEndTimeMs("onImageLoadFinish", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$1");
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            SnsMethodCalculate.markStartTimeMs("onProcessBitmap", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$1");
            SnsMethodCalculate.markEndTimeMs("onProcessBitmap", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$1");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.j$b */
    public static class C57418b extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public boolean f164462F0 = false;

        /* renamed from: G0 */
        public RoundCornerRelativeLayout f164463G0;

        /* renamed from: H0 */
        public View f164464H0;

        /* renamed from: I0 */
        public View f164465I0;

        /* renamed from: J0 */
        public TextView f164466J0;

        /* renamed from: K0 */
        public TextView f164467K0;

        /* renamed from: L0 */
        public TextView f164468L0;

        /* renamed from: M0 */
        public MMRoundCornerImageView f164469M0;

        /* renamed from: N0 */
        public WeImageView f164470N0;

        /* renamed from: b */
        public String mo81017b() {
            SnsMethodCalculate.markStartTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$MusicMvMediaViewHolder");
            StringBuffer stringBuffer = new StringBuffer(this.f164469M0.getContext().getString(C0966R.string.jea) + ",");
            if (this.f164466J0 != null) {
                stringBuffer.append(this.f164466J0.getText() + ",");
            }
            if (this.f164468L0 != null) {
                stringBuffer.append(this.f164468L0.getText() + ",");
            }
            if (this.f164467K0 != null) {
                stringBuffer.append(this.f164467K0.getText() + ",");
            }
            String stringBuffer2 = stringBuffer.toString();
            SnsMethodCalculate.markEndTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem$MusicMvMediaViewHolder");
            return stringBuffer2;
        }
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
        C57418b bVar = (C57418b) baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null || BaseTimeLineItem.m122773q(baseViewHolder).getParent() == null) {
            bVar.f164463G0 = (RoundCornerRelativeLayout) baseViewHolder.f279960i.findViewById(C0966R.C0970id.iwu);
            bVar.f164462F0 = true;
        } else {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c3j);
            if (!bVar.f164462F0) {
                bVar.f164463G0 = (RoundCornerRelativeLayout) BaseTimeLineItem.m122773q(baseViewHolder).inflate().findViewById(C0966R.C0970id.iwu);
                bVar.f164462F0 = true;
            }
        }
        bVar.f164463G0.setRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), 4));
        bVar.f164465I0 = bVar.f164463G0.findViewById(C0966R.C0970id.aft);
        bVar.f164464H0 = bVar.f164463G0.findViewById(C0966R.C0970id.h5u);
        if (C85875k4.m106211z()) {
            bVar.f164464H0.setBackgroundResource(C0966R.C0969drawable.atm);
        } else {
            bVar.f164464H0.setBackgroundResource(C0966R.C0969drawable.atn);
        }
        bVar.f164469M0 = (MMRoundCornerImageView) bVar.f164464H0.findViewById(C0966R.C0970id.b7t);
        bVar.f164467K0 = (TextView) bVar.f164464H0.findViewById(C0966R.C0970id.b7x);
        bVar.f164466J0 = (TextView) bVar.f164464H0.findViewById(C0966R.C0970id.b7y);
        bVar.f164468L0 = (TextView) bVar.f164464H0.findViewById(C0966R.C0970id.b7v);
        bVar.f164470N0 = (WeImageView) bVar.f164464H0.findViewById(C0966R.C0970id.b7u);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        String str;
        String str2;
        C101789j00 j002;
        String str3;
        C101789j00 j003;
        String str4;
        String str5;
        C101789j00 j004;
        LinkedList<C101804kv2> linkedList;
        C101799k1 k1Var;
        C101779g1 g1Var;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
        String str6 = w6Var2.f281381h;
        C57418b bVar = (C57418b) baseViewHolder;
        if (bVar.f164469M0 == null) {
            bVar.f164469M0 = (MMRoundCornerImageView) bVar.f164464H0.findViewById(C0966R.C0970id.b7t);
            Log.m105920e("MicroMsg.BaseTimeLineItem", "fillItem: musicCover null ");
        }
        MMRoundCornerImageView mMRoundCornerImageView = bVar.f164469M0;
        if (mMRoundCornerImageView != null) {
            mMRoundCornerImageView.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.aiu));
            if (C85875k4.m106211z()) {
                mMRoundCornerImageView.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.ait));
            }
        }
        if (timeLineObject2 == null || (j003 = timeLineObject2.ContentObj) == null) {
            str = "";
        } else {
            C64719t23 t232 = j003.f298439w;
            if (t232 != null) {
                str4 = t232.f185462g;
                if (!Util.isNullOrNil(str4)) {
                    Log.m105925i("MicroMsg.BaseTimeLineItem", "has mvInfo:%s", str4);
                    View findViewById = bVar.f164464H0.findViewById(C0966R.C0970id.hqn);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/MusicMvTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/MusicMvTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((ViewGroup.MarginLayoutParams) bVar.f164466J0.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 6);
                    ((ViewGroup.MarginLayoutParams) bVar.f164467K0.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 2);
                    bVar.f164468L0.setVisibility(0);
                    bVar.f164468L0.setText(str4 + MMApplicationContext.getContext().getString(C0966R.string.h2w));
                } else {
                    View findViewById2 = bVar.f164464H0.findViewById(C0966R.C0970id.hqn);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/MusicMvTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/MusicMvTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((ViewGroup.MarginLayoutParams) bVar.f164466J0.getLayoutParams()).topMargin = 0;
                    ((ViewGroup.MarginLayoutParams) bVar.f164467K0.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 4);
                    bVar.f164468L0.setText("");
                    bVar.f164468L0.setVisibility(8);
                }
                str5 = timeLineObject2.ContentObj.f298439w.f185461f;
            } else {
                j003.f298439w = new C64719t23();
                str5 = "";
                str4 = str5;
            }
            str = Util.nullAs(str5, "");
            Log.m105925i("MicroMsg.BaseTimeLineItem", "coverInfo: coverUrl:%s, postInfo:%s", str, str4);
            C64719t23 t233 = timeLineObject2.ContentObj.f298439w;
            SnsMethodCalculate.markStartTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
            if (!(t233 == null || (j004 = timeLineObject2.ContentObj) == null || (linkedList = j004.f298427h) == null || linkedList.isEmpty())) {
                C101804kv2 kv22 = timeLineObject2.ContentObj.f298427h.get(0);
                if (Util.isNullOrNil(t233.f185473u)) {
                    t233.f185473u = kv22.f298697o;
                }
                if (Util.isNullOrNil(t233.f185463h)) {
                    t233.f185463h = kv22.f298691f;
                }
                if (Util.isNullOrNil(t233.f185474v)) {
                    t233.f185474v = kv22.f298683Q;
                }
                if (Util.isNullOrNil(t233.f185475w)) {
                    t233.f185475w = kv22.f298682P;
                }
                if (!(!Util.isNullOrNil(t233.f185465j) || (k1Var = timeLineObject2.actionInfo) == null || (g1Var = k1Var.f298580j) == null)) {
                    t233.f185465j = g1Var.f298273f;
                }
            }
            SnsMethodCalculate.markEndTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
        }
        if (timeLineObject2 == null || (j002 = timeLineObject2.ContentObj) == null || j002.f298427h.isEmpty()) {
            str2 = "fillItem";
        } else {
            C101804kv2 kv23 = timeLineObject2.ContentObj.f298427h.get(0);
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.BaseTimeLineItem", "loadMusicCover use mv, title: %s", kv23.f298697o);
                str3 = C102984b.m136166c(str);
            } else if (!Util.isNullOrNil(kv23.f298694i)) {
                Log.m105925i("MicroMsg.BaseTimeLineItem", "loadMusicCover use media.Thumb, title: %s", kv23.f298697o);
                str3 = C102984b.m136166c(kv23.f298694i);
                str = kv23.f298694i;
            } else {
                C100406i0 LL = C94866e1.ay0().mo139867LL((long) kv23.f298701s);
                str = C94938q1.m120518e(C94866e1.m120262YO(), LL.mo139851e()) + C102236a0.m134733a0(LL.mo139851e());
                Log.m105927v("MicroMsg.BaseTimeLineItem", "loadMusicCover use thumb path: %s, exist: %s, title: %s", str, Boolean.valueOf(C86013q1.m106450k(str)), kv23.f298697o);
                str3 = str;
            }
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59350f = str3;
            bVar2.f59346b = true;
            bVar2.f59364t = true;
            bVar2.f59345a = true;
            bVar2.f59363s = true;
            bVar2.f59365u = (float) C76577a.m92151b(MMApplicationContext.getContext(), 2);
            str2 = "fillItem";
            C20828a.m22825b().mo32520i(str, bVar.f164469M0, bVar2.mo32666a(), new C57417a(this, timeLineObject2, str3, bVar));
            timeLineObject2.ContentObj.f298439w.f185472t = str3;
            bVar.f164470N0.setPressed(false);
            if (!Util.isNullOrNil(timeLineObject2.ContentObj.f298439w.f185463h)) {
                bVar.f164467K0.setVisibility(0);
                bVar.f164467K0.setText(timeLineObject2.ContentObj.f298439w.f185463h);
            } else if (!Util.isNullOrNil(kv23.f298691f)) {
                bVar.f164467K0.setVisibility(0);
                bVar.f164467K0.setText(kv23.f298691f);
            } else {
                bVar.f164467K0.setVisibility(8);
                bVar.f164467K0.setText("");
            }
            String str7 = kv23.f298697o;
            if (!Util.isNullOrNil(str7)) {
                bVar.f164466J0.setVisibility(0);
                bVar.f164466J0.setText(new SpannableString(str7), TextView.BufferType.SPANNABLE);
            } else {
                Log.m105920e("MicroMsg.BaseTimeLineItem", "songName must make sure not empty");
            }
            if (snsTimeLineBaseAdapter2.mo132924s(timeLineObject2.f283893Id)) {
                bVar.f164470N0.setImageResource(C0966R.raw.icons_outlined_pause2);
                bVar.f164470N0.setContentDescription(MMApplicationContext.getString(C0966R.string.jhg));
            } else {
                bVar.f164470N0.setImageResource(C0966R.raw.icons_outlined_play2);
                bVar.f164470N0.setContentDescription(MMApplicationContext.getString(C0966R.string.f361384jg1));
            }
            bVar.f164470N0.setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3133gi));
            C95787g0 g0Var = new C95787g0(timeLineObject2, str6);
            g0Var.f279454e = 1;
            bVar.f164470N0.setTag(g0Var);
            bVar.f164470N0.setOnClickListener(snsTimeLineBaseAdapter2.f278576j.f280600r);
            bVar.f164464H0.setTag(g0Var);
            bVar.f164464H0.setOnClickListener(snsTimeLineBaseAdapter2.f278576j.f280589g);
            C78253a k = snsTimeLineBaseAdapter.mo132921k();
            View view3 = bVar.f164464H0;
            TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter2.f278572f;
            k.mo108275j(view3, timelineClickListener.f280396z, timelineClickListener.f280381k);
        }
        mo133391g(w6Var2, 2);
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MusicMvTimeLineItem");
        return "MusicMvTimeLineItem";
    }
}
