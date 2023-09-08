package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import fy0.C20739g;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rb0.C48009v0;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q3 */
public class C18339q3 extends C18353s3 {

    /* renamed from: A */
    public TextView f50766A;

    /* renamed from: B */
    public Context f50767B;

    /* renamed from: C */
    public View.OnClickListener f50768C = new C18341b();

    /* renamed from: m */
    public View f50769m;

    /* renamed from: n */
    public View f50770n;

    /* renamed from: o */
    public ViewGroup f50771o;

    /* renamed from: p */
    public MMNeat7extView f50772p;

    /* renamed from: q */
    public TextView f50773q;

    /* renamed from: r */
    public View f50774r;

    /* renamed from: s */
    public ImageView f50775s;

    /* renamed from: t */
    public View f50776t;

    /* renamed from: u */
    public ImageView f50777u;

    /* renamed from: v */
    public ImageView f50778v;

    /* renamed from: w */
    public View f50779w;

    /* renamed from: x */
    public TextView f50780x;

    /* renamed from: y */
    public View f50781y;

    /* renamed from: z */
    public View f50782z;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q3$a */
    public class C18340a implements View.OnClickListener {
        public C18340a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C18339q3.this.f50769m.performClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q3$b */
    public class C18341b implements View.OnClickListener {
        public C18341b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19623o0 kD = C48009v0.Jx0().mo25806kD(((C20642c) C86312j.m106911c(C20642c.class)).Eh0(view));
            if (kD != null) {
                C18339q3.this.f50825d.f51443n.mo22984k(kD, 4);
            } else {
                Log.m105928w("MicroMsg.BizTimeLineItem", "mediaIconClickListener info is null");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C18339q3(C18508z2 z2Var, Context context) {
        this.f50824c = context;
        this.f50825d = z2Var;
        this.f50767B = context;
    }

    /* renamed from: d */
    public void mo22879d(C77630j jVar, C19623o0 o0Var, int i, boolean z) {
        if (jVar.f226333o == 8) {
            View view = this.f50781y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (jVar.f226311C > 1) {
                this.f50766A.setVisibility(0);
                this.f50766A.setText(String.valueOf(jVar.f226311C));
            } else {
                this.f50766A.setText("");
                this.f50766A.setVisibility(8);
            }
            if (z) {
                this.f50782z.setBackgroundResource(C0966R.C0969drawable.f4608ho);
            } else {
                this.f50782z.setBackgroundResource(C0966R.C0969drawable.ags);
            }
        } else {
            View view2 = this.f50781y;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo22908e(C77630j jVar, C19623o0 o0Var, int i, boolean z) {
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        int i2 = i;
        View view = this.f50776t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setPlayIcon", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setPlayIcon", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i3 = jVar2.f226333o;
        if (i3 == 5) {
            this.f50778v.setVisibility(0);
            this.f50778v.setImageResource(C0966R.C0969drawable.f4600hf);
            this.f50778v.setOnClickListener(new C18340a());
        } else if (i3 == 6) {
            this.f50778v.setVisibility(0);
            if (z) {
                if ((o0Var2.field_msgId + "_" + i2).equals(C20739g.m22692d())) {
                    this.f50778v.setImageResource(C0966R.C0969drawable.f4770mf);
                } else {
                    this.f50778v.setImageResource(C0966R.C0969drawable.f4771mg);
                }
            } else {
                if ((o0Var2.field_msgId + "_" + i2).equals(C20739g.m22692d())) {
                    this.f50778v.setImageResource(C0966R.raw.chatting_item_biz_music_pause_loading_icon);
                } else {
                    this.f50778v.setImageResource(C0966R.raw.chatting_item_biz_music_play_loading_icon);
                }
            }
            mo22909f(this.f50778v, o0Var2, i2, jVar2.f226330i);
        } else if (i3 == 7) {
            this.f50778v.setVisibility(8);
            View view2 = this.f50776t;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setPlayIcon", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot", "setPlayIcon", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Drawable drawable = this.f50777u.getDrawable();
            if (drawable instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
            }
            if ((o0Var2.field_msgId + "_" + i2).equals(C20739g.m22692d())) {
                this.f50777u.setImageResource(C0966R.C0969drawable.f4603hh);
                if (this.f50778v.getDrawable() instanceof AnimationDrawable) {
                    ((AnimationDrawable) this.f50778v.getDrawable()).start();
                }
            } else {
                this.f50777u.setImageResource(C0966R.C0969drawable.f4601hg);
            }
            mo22909f(this.f50777u, o0Var2, i2, jVar2.f226330i);
        } else {
            this.f50778v.setVisibility(8);
        }
        int b = C76577a.m92151b(this.f50767B, 28);
        if (jVar2.f226333o == 7) {
            b = C76577a.m92151b(this.f50767B, 48);
        }
        ImageView imageView = this.f50778v;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public void mo22909f(ImageView imageView, C19623o0 o0Var, int i, String str) {
        ((C20642c) C86312j.m106911c(C20642c.class)).mo32314DF(imageView, o0Var.field_msgId, str, o0Var.field_content, i);
        imageView.setOnClickListener(this.f50768C);
    }
}
