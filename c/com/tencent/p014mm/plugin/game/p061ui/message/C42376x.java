package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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
import uy1.C14391b;
import uy1.C52645f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.x */
public class C42376x extends RecyclerView {

    /* renamed from: A1 */
    public C42380d f114630A1;

    /* renamed from: B1 */
    public C101611g<String, Bitmap> f114631B1;

    /* renamed from: C1 */
    public C42329a0 f114632C1;

    /* renamed from: D1 */
    public C42354k f114633D1;

    /* renamed from: E1 */
    public Set<Integer> f114634E1 = new HashSet();

    /* renamed from: y1 */
    public Context f114635y1;

    /* renamed from: z1 */
    public int f114636z1;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.x$a */
    public class C42377a implements C42329a0.C42335d {
        public C42377a() {
        }

        /* renamed from: a */
        public void mo66403a() {
            C42376x xVar = C42376x.this;
            if (xVar.f114630A1 != null) {
                ((C119157j) C119157j.f356862d).mo183875f(new C42381y(xVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.x$b */
    public class C42378b implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ String f114638a;

        public C42378b(String str) {
            this.f114638a = str;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                ((C100301b) C42376x.this.f114631B1).put(this.f114638a, bitmap);
            }
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.x$c */
    public class C42379c extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f114640A;

        /* renamed from: B */
        public TextView f114641B;

        /* renamed from: C */
        public ImageView f114642C;

        /* renamed from: D */
        public TextView f114643D;

        /* renamed from: E */
        public TextView f114644E;

        /* renamed from: F */
        public TextView f114645F;

        /* renamed from: G */
        public View f114646G;

        /* renamed from: H */
        public View f114647H;

        /* renamed from: I */
        public View f114648I;

        /* renamed from: z */
        public ViewGroup f114650z;

        public C42379c(View view) {
            super(view);
            this.f114650z = (ViewGroup) view.findViewById(C0966R.C0970id.h1_);
            this.f114640A = (ImageView) view.findViewById(C0966R.C0970id.f2a);
            this.f114641B = (TextView) view.findViewById(C0966R.C0970id.hg4);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.h1a);
            this.f114642C = (ImageView) view.findViewById(C0966R.C0970id.awl);
            this.f114643D = (TextView) view.findViewById(C0966R.C0970id.axl);
            this.f114644E = (TextView) view.findViewById(C0966R.C0970id.atr);
            this.f114645F = (TextView) view.findViewById(C0966R.C0970id.kky);
            this.f114646G = view.findViewById(C0966R.C0970id.emm);
            this.f114647H = view.findViewById(C0966R.C0970id.hdl);
            this.f114648I = view.findViewById(C0966R.C0970id.g2y);
            this.f114650z.setOnLongClickListener(C42376x.this.f114632C1);
            this.f114650z.setOnClickListener(C42376x.this.f114632C1);
            this.f114640A.setOnLongClickListener(C42376x.this.f114632C1);
            this.f114640A.setOnClickListener(C42376x.this.f114632C1);
            this.f114641B.setOnLongClickListener(C42376x.this.f114632C1);
            this.f114641B.setOnClickListener(C42376x.this.f114632C1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.x$d */
    public class C42380d extends C42337b0<C42379c> {

        /* renamed from: h */
        public int f114651h;

        public C42380d(Context context, Cursor cursor, int i) {
            super(context, cursor);
            this.f114651h = i;
        }

        /* renamed from: G4 */
        public void mo66414G4(RecyclerView.C16631z zVar, Cursor cursor) {
            C42379c cVar = (C42379c) zVar;
            C42119w wVar = new C42119w();
            wVar.convertFrom(cursor);
            int position = cursor.getPosition();
            int i = position + 1;
            char c = i == getItemCount() ? 3 : i == this.f114651h ? (char) 2 : 1;
            cVar.getClass();
            Class cls = C76979h.class;
            wVar.mo66075l2();
            cVar.f114650z.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113557a), 4));
            C42376x xVar = C42376x.this;
            ImageView imageView = cVar.f114640A;
            String str = wVar.f113463X1.f113560d;
            if (((C101062d) xVar.f114631B1).check(str)) {
                Bitmap bitmap = (Bitmap) ((C100301b) xVar.f114631B1).get(str);
                if (bitmap == null || bitmap.isRecycled()) {
                    xVar.mo66444x1(imageView, str, 0.083333336f);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } else {
                xVar.mo66444x1(imageView, str, 0.083333336f);
            }
            cVar.f114640A.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113562f), 2));
            cVar.f114641B.setText(((C76979h) C86312j.m106911c(cls)).yp0(C42376x.this.f114635y1, wVar.f113463X1.f113561e, cVar.f114641B.getTextSize()));
            cVar.f114641B.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113562f), 1));
            if (!Util.isNullOrNil(wVar.f113463X1.f113563g)) {
                cVar.f114642C.setVisibility(0);
                C42376x xVar2 = C42376x.this;
                ImageView imageView2 = cVar.f114642C;
                String str2 = wVar.f113463X1.f113563g;
                if (((C101062d) xVar2.f114631B1).check(str2)) {
                    Bitmap bitmap2 = (Bitmap) ((C100301b) xVar2.f114631B1).get(str2);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        xVar2.mo66444x1(imageView2, str2, 0.0f);
                    } else {
                        imageView2.setImageBitmap(bitmap2);
                    }
                } else {
                    xVar2.mo66444x1(imageView2, str2, 0.0f);
                }
            } else {
                cVar.f114642C.setVisibility(8);
            }
            if (!Util.isNullOrNil(wVar.f113463X1.f113564h)) {
                cVar.f114643D.setVisibility(0);
                cVar.f114643D.setText(((C76979h) C86312j.m106911c(cls)).yp0(C42376x.this.f114635y1, wVar.f113463X1.f113564h, cVar.f114643D.getTextSize()));
            } else {
                cVar.f114643D.setVisibility(8);
            }
            if (!Util.isNullOrNil(wVar.f113463X1.f113565i)) {
                cVar.f114644E.setVisibility(0);
                cVar.f114644E.setText(((C76979h) C86312j.m106911c(cls)).yp0(C42376x.this.f114635y1, wVar.f113463X1.f113565i, cVar.f114644E.getTextSize()));
            } else {
                cVar.f114644E.setVisibility(8);
            }
            cVar.f114645F.setText(C14391b.m13703a(C42376x.this.f114635y1, wVar.field_createTime * 1000));
            if (c == 1) {
                View view = cVar.f114646G;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = cVar.f114647H;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = cVar.f114648I;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c == 2) {
                View view7 = cVar.f114646G;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = cVar.f114647H;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view11 = cVar.f114648I;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c == 3) {
                View view13 = cVar.f114646G;
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar7.mo10233c(8);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view15 = cVar.f114647H;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view16 = view15;
                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view17 = cVar.f114648I;
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view18 = view17;
                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/game/ui/message/NotifyMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!((HashSet) C42376x.this.f114634E1).contains(Integer.valueOf(position))) {
                HashMap hashMap = new HashMap();
                String str3 = "2";
                hashMap.put("tab", str3);
                if (position < this.f114651h) {
                    str3 = "1";
                }
                hashMap.put("isnew", str3);
                hashMap.put("fold", String.valueOf(wVar.field_hasMergedCount));
                hashMap.put("ext_data", wVar.f113474g2);
                C40314g.m43485d(C42376x.this.getContext(), 13, 1300, i, 1, 0, wVar.field_appId, C42376x.this.f114636z1, wVar.f113470e2, wVar.field_gameMsgId, wVar.f113472f2, C40314g.m43483b(hashMap));
                ((HashSet) C42376x.this.f114634E1).add(Integer.valueOf(position));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C42379c(LayoutInflater.from(C42376x.this.f114635y1).inflate(C0966R.C0971layout.axj, viewGroup, false));
        }
    }

    public C42376x(Context context, int i) {
        super(context, (AttributeSet) null);
        this.f114635y1 = context;
        this.f114636z1 = i;
        this.f114631B1 = new C100301b(30, C42376x.class);
        this.f114632C1 = new C42329a0(this.f114636z1, new C42377a());
        ((C119157j) C119157j.f356862d).mo183875f(new C42383z(this, context));
    }

    public void setEmptyCallback(C42354k kVar) {
        this.f114633D1 = kVar;
    }

    /* renamed from: x1 */
    public final void mo66444x1(ImageView imageView, String str, float f) {
        C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
        aVar.f147020a = false;
        aVar.f147026g = f;
        C52645f.m59023a().mo73595e(imageView, str, aVar.mo73598a(), new C42378b(str));
    }
}
