package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.C42329a0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import o90.C100301b;
import p629ny.C76979h;
import p823sg.C101611g;
import q90.C101062d;
import sw1.C48484q;
import uy1.C14391b;
import uy1.C52645f;

/* renamed from: com.tencent.mm.plugin.game.ui.message.w */
public class C42371w extends RecyclerView {

    /* renamed from: A1 */
    public C42374c f114605A1;

    /* renamed from: B1 */
    public C101611g<String, Bitmap> f114606B1;

    /* renamed from: C1 */
    public C42329a0 f114607C1;

    /* renamed from: D1 */
    public C42354k f114608D1;

    /* renamed from: E1 */
    public Set<Integer> f114609E1 = new HashSet();

    /* renamed from: y1 */
    public Context f114610y1;

    /* renamed from: z1 */
    public int f114611z1;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.w$a */
    public class C42372a implements C42329a0.C42335d {
        public C42372a() {
        }

        /* renamed from: a */
        public void mo66403a() {
            C42354k kVar;
            C42371w wVar = C42371w.this;
            Class cls = C48484q.class;
            C42374c cVar = wVar.f114605A1;
            if (cVar != null) {
                cVar.f114615h = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(1);
                Cursor TE = ((C48484q) C86312j.m106911c(cls)).xi0().mo66002TE(1);
                wVar.f114605A1.mo66413F4(TE);
                if ((TE == null || TE.getCount() == 0) && (kVar = wVar.f114608D1) != null) {
                    kVar.mo66408a();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.w$b */
    public class C42373b implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ String f114613a;

        public C42373b(String str) {
            this.f114613a = str;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                ((C100301b) C42371w.this.f114606B1).put(this.f114613a, bitmap);
            }
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.w$c */
    public class C42374c extends C42337b0<C42375d> {

        /* renamed from: h */
        public int f114615h;

        public C42374c(Context context, Cursor cursor, int i) {
            super(context, cursor);
            this.f114615h = i;
        }

        /* renamed from: G4 */
        public void mo66414G4(RecyclerView.C16631z zVar, Cursor cursor) {
            SpannableString spannableString;
            C42375d dVar = (C42375d) zVar;
            C42119w wVar = new C42119w();
            wVar.convertFrom(cursor);
            int position = cursor.getPosition();
            int i = position + 1;
            char c = i == getItemCount() ? 3 : i == this.f114615h ? (char) 2 : 1;
            dVar.getClass();
            Class cls = C76979h.class;
            wVar.mo66075l2();
            dVar.f114629z.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113557a), 4));
            C42371w wVar2 = C42371w.this;
            ImageView imageView = dVar.f114617A;
            String str = wVar.f113463X1.f113560d;
            if (((C101062d) wVar2.f114606B1).check(str)) {
                Bitmap bitmap = (Bitmap) ((C100301b) wVar2.f114606B1).get(str);
                if (bitmap == null || bitmap.isRecycled()) {
                    wVar2.mo66442x1(imageView, str, 0.083333336f);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } else {
                wVar2.mo66442x1(imageView, str, 0.083333336f);
            }
            dVar.f114617A.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113562f), 2));
            dVar.f114618B.setText(((C76979h) C86312j.m106911c(cls)).yp0(C42371w.this.f114610y1, wVar.f113463X1.f113561e, dVar.f114618B.getTextSize()));
            dVar.f114618B.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113562f), 1));
            if (wVar.field_hasMergedCount > 1) {
                dVar.f114619C.setVisibility(0);
                dVar.f114619C.setText(C42371w.this.f114610y1.getString(C0966R.string.fam, new Object[]{Integer.valueOf(wVar.field_hasMergedCount)}));
            } else {
                dVar.f114619C.setVisibility(8);
            }
            if (!Util.isNullOrNil(wVar.f113463X1.f113570n)) {
                C42371w wVar3 = C42371w.this;
                ImageView imageView2 = dVar.f114621E;
                String str2 = wVar.f113463X1.f113570n;
                if (((C101062d) wVar3.f114606B1).check(str2)) {
                    Bitmap bitmap2 = (Bitmap) ((C100301b) wVar3.f114606B1).get(str2);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        wVar3.mo66442x1(imageView2, str2, 0.0f);
                    } else {
                        imageView2.setImageBitmap(bitmap2);
                    }
                } else {
                    wVar3.mo66442x1(imageView2, str2, 0.0f);
                }
                dVar.f114621E.setVisibility(0);
            } else {
                dVar.f114621E.setVisibility(8);
            }
            if (dVar.f114621E.getVisibility() == 8) {
                if (!Util.isNullOrNil(wVar.f113463X1.f113571o)) {
                    dVar.f114620D.setVisibility(0);
                    dVar.f114620D.setText(((C76979h) C86312j.m106911c(cls)).yp0(C42371w.this.f114610y1, wVar.f113463X1.f113571o, dVar.f114620D.getTextSize()));
                } else {
                    dVar.f114620D.setVisibility(8);
                }
            }
            String str3 = wVar.f113463X1.f113568l;
            int indexOf = str3.indexOf("<em class=\"prefix\">");
            int indexOf2 = str3.indexOf("</em>") - 19;
            if (indexOf < indexOf2) {
                spannableString = new SpannableString(str3.replaceAll("<em class=\"prefix\">", "").replaceAll("</em>", ""));
                spannableString.setSpan(new ForegroundColorSpan(C42371w.this.f114610y1.getResources().getColor(C0966R.color.BW_0_Alpha_0_3)), indexOf, indexOf2, 33);
            } else {
                spannableString = new SpannableString(str3);
            }
            dVar.f114622F.setText(((C76979h) C86312j.m106911c(cls)).yp0(C42371w.this.f114610y1, spannableString, dVar.f114622F.getTextSize()));
            dVar.f114623G.setText(C14391b.m13703a(C42371w.this.f114610y1, wVar.field_createTime * 1000));
            wVar.f113463X1.f113572p = "";
            if (!Util.isNullOrNil("")) {
                dVar.f114624H.setVisibility(0);
                dVar.f114624H.setText(wVar.f113463X1.f113572p);
            } else {
                dVar.f114624H.setVisibility(8);
            }
            if (c == 1) {
                View view = dVar.f114625I;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = dVar.f114626J;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = dVar.f114627K;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c == 2) {
                View view7 = dVar.f114625I;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = dVar.f114626J;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view11 = dVar.f114627K;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c == 3) {
                View view13 = dVar.f114625I;
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar7.mo10233c(8);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view15 = dVar.f114626J;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view16 = view15;
                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view17 = dVar.f114627K;
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view18 = view17;
                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!((HashSet) C42371w.this.f114609E1).contains(Integer.valueOf(position))) {
                HashMap hashMap = new HashMap();
                String str4 = "1";
                hashMap.put("tab", str4);
                if (position >= this.f114615h) {
                    str4 = "2";
                }
                hashMap.put("isnew", str4);
                hashMap.put("fold", String.valueOf(wVar.field_hasMergedCount));
                hashMap.put("ext_data", wVar.f113474g2);
                C40314g.m43485d(C42371w.this.getContext(), 13, 1300, i, 1, 0, wVar.field_appId, C42371w.this.f114611z1, wVar.f113470e2, wVar.field_gameMsgId, wVar.f113472f2, C40314g.m43483b(hashMap));
                ((HashSet) C42371w.this.f114609E1).add(Integer.valueOf(position));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C42375d(LayoutInflater.from(C42371w.this.f114610y1).inflate(C0966R.C0971layout.awo, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.w$d */
    public class C42375d extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f114617A;

        /* renamed from: B */
        public TextView f114618B;

        /* renamed from: C */
        public TextView f114619C;

        /* renamed from: D */
        public TextView f114620D;

        /* renamed from: E */
        public ImageView f114621E;

        /* renamed from: F */
        public TextView f114622F;

        /* renamed from: G */
        public TextView f114623G;

        /* renamed from: H */
        public TextView f114624H;

        /* renamed from: I */
        public View f114625I;

        /* renamed from: J */
        public View f114626J;

        /* renamed from: K */
        public View f114627K;

        /* renamed from: z */
        public ViewGroup f114629z;

        public C42375d(View view) {
            super(view);
            this.f114629z = (ViewGroup) view.findViewById(C0966R.C0970id.h1_);
            this.f114617A = (ImageView) view.findViewById(C0966R.C0970id.f2a);
            this.f114618B = (TextView) view.findViewById(C0966R.C0970id.hg4);
            this.f114619C = (TextView) view.findViewById(C0966R.C0970id.h08);
            this.f114620D = (TextView) view.findViewById(C0966R.C0970id.iu7);
            this.f114621E = (ImageView) view.findViewById(C0966R.C0970id.itu);
            this.f114622F = (TextView) view.findViewById(C0966R.C0970id.bsk);
            this.f114623G = (TextView) view.findViewById(C0966R.C0970id.kky);
            this.f114624H = (TextView) view.findViewById(C0966R.C0970id.jyt);
            this.f114625I = view.findViewById(C0966R.C0970id.emm);
            this.f114626J = view.findViewById(C0966R.C0970id.hdl);
            this.f114627K = view.findViewById(C0966R.C0970id.g2y);
            this.f114629z.setOnLongClickListener(C42371w.this.f114607C1);
            this.f114629z.setOnClickListener(C42371w.this.f114607C1);
            this.f114617A.setOnLongClickListener(C42371w.this.f114607C1);
            this.f114617A.setOnClickListener(C42371w.this.f114607C1);
            this.f114618B.setOnLongClickListener(C42371w.this.f114607C1);
            this.f114618B.setOnClickListener(C42371w.this.f114607C1);
        }
    }

    public C42371w(Context context, int i) {
        super(context, (AttributeSet) null);
        this.f114610y1 = context;
        this.f114611z1 = i;
        this.f114606B1 = new C100301b(30, C42371w.class);
        this.f114607C1 = new C42329a0(this.f114611z1, new C42372a());
        Class cls = C48484q.class;
        this.f114605A1 = new C42374c(context, ((C48484q) C86312j.m106911c(cls)).xi0().mo66002TE(1), ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(1));
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(this.f114605A1);
    }

    public void setEmptyCallback(C42354k kVar) {
        this.f114608D1 = kVar;
    }

    /* renamed from: x1 */
    public final void mo66442x1(ImageView imageView, String str, float f) {
        C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
        aVar.f147020a = false;
        aVar.f147026g = f;
        C52645f.m59023a().mo73595e(imageView, str, aVar.mo73598a(), new C42373b(str));
    }
}
