package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.C42329a0;
import com.tencent.p014mm.pluginsdk.event.IListenerMStorage;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o90.C100301b;
import ob0.C47350c;
import p629ny.C76979h;
import p823sg.C101611g;
import q90.C101062d;
import qo3.C77426q;
import uy1.C14391b;
import uy1.C52645f;
import vl3.C102226d;
import vw1.C53006b0;
import vw1.C53034y;
import vw1.C53035z;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView */
public class InteractiveMsgMRecycleView extends MRecyclerView {

    /* renamed from: C1 */
    public Context f114489C1;

    /* renamed from: D1 */
    public int f114490D1;

    /* renamed from: E1 */
    public C42326c f114491E1;

    /* renamed from: F1 */
    public C101611g<String, Bitmap> f114492F1;

    /* renamed from: G1 */
    public C42329a0 f114493G1;

    /* renamed from: H1 */
    public boolean f114494H1;

    /* renamed from: I1 */
    public boolean f114495I1;

    /* renamed from: J1 */
    public LinkedList<String> f114496J1 = new LinkedList<>();

    /* renamed from: K1 */
    public final Set<Integer> f114497K1 = new HashSet();

    /* renamed from: L1 */
    public final IListenerMStorage f114498L1 = new IListenerMStorage() {
        /* renamed from: e */
        public void mo25931e(IEvent iEvent) {
            if (iEvent instanceof GameMessageStorageNotifyEvent) {
                InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
                interactiveMsgMRecycleView.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C42355l(interactiveMsgMRecycleView));
            }
        }
    };

    /* renamed from: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView$a */
    public class C42324a implements C42329a0.C42335d {
        public C42324a() {
        }

        /* renamed from: a */
        public void mo66403a() {
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
            if (interactiveMsgMRecycleView.f114491E1 != null) {
                ((C119157j) C119157j.f356862d).mo183876g(new C42357m(interactiveMsgMRecycleView), "InteractiveMsg");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView$b */
    public class C42325b implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ String f114501a;

        public C42325b(String str) {
            this.f114501a = str;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                ((C100301b) InteractiveMsgMRecycleView.this.f114492F1).put(this.f114501a, bitmap);
            }
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView$c */
    public class C42326c extends RecyclerView.C16613e<C42327d> {

        /* renamed from: d */
        public int f114503d;

        /* renamed from: e */
        public final List<C42119w> f114504e = new LinkedList();

        public C42326c(Context context, Cursor cursor, int i) {
            this.f114503d = i;
            if (cursor != null) {
                if (cursor.getCount() < 15) {
                    InteractiveMsgMRecycleView.this.f114495I1 = true;
                }
                if (cursor.moveToFirst()) {
                    do {
                        C42119w wVar = new C42119w();
                        wVar.convertFrom(cursor);
                        if (wVar.field_quickResponseContentId.length() > 0) {
                            InteractiveMsgMRecycleView.this.f114496J1.add(wVar.field_quickResponseContentId);
                        }
                        this.f114504e.add(wVar);
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        }

        public int getItemCount() {
            return ((LinkedList) this.f114504e).size();
        }

        public int getItemViewType(int i) {
            return super.getItemViewType(i);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C42327d dVar = (C42327d) zVar;
            char c = (!InteractiveMsgMRecycleView.this.f114495I1 || i2 + 1 != getItemCount()) ? i2 + 1 == this.f114503d ? (char) 2 : 1 : 3;
            C42119w wVar = (C42119w) ((LinkedList) this.f114504e).get(i2);
            dVar.getClass();
            if (wVar != null) {
                wVar.mo66075l2();
                dVar.f114527z.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113557a), 4));
                InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
                ImageView imageView = dVar.f114507B;
                String str = wVar.f113463X1.f113560d;
                if (((C101062d) interactiveMsgMRecycleView.f114492F1).check(str)) {
                    Bitmap bitmap = (Bitmap) ((C100301b) interactiveMsgMRecycleView.f114492F1).get(str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        interactiveMsgMRecycleView.mo66396E1(imageView, str, 0.083333336f);
                    } else {
                        imageView.setImageBitmap(bitmap);
                    }
                } else {
                    interactiveMsgMRecycleView.mo66396E1(imageView, str, 0.083333336f);
                }
                dVar.f114507B.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113562f), 2));
                dVar.f114508C.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(InteractiveMsgMRecycleView.this.f114489C1, wVar.f113463X1.f113561e, dVar.f114508C.getTextSize()));
                dVar.f114508C.setTag(new C42329a0.C42334c(wVar, wVar.f113494t1.get(wVar.f113463X1.f113562f), 1));
                int i3 = wVar.field_hasMergedCount;
                if (i3 <= 1 || i3 < wVar.f113463X1.f113567k) {
                    View view = dVar.f114513H;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114509D.setVisibility(8);
                    View view3 = dVar.f114522R;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114507B.setVisibility(0);
                    dVar.f114506A.setVisibility(8);
                    InteractiveMsgMRecycleView.this.f114494H1 = false;
                } else {
                    int[] iArr = {C0966R.C0970id.nwd, C0966R.C0970id.nwe, C0966R.C0970id.nwf, C0966R.C0970id.nwg};
                    dVar.f114507B.setVisibility(8);
                    dVar.f114506A.setVisibility(0);
                    dVar.f114506A.setRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), 8));
                    String[] split = wVar.field_mergeSenderIcon.split(";");
                    for (int i4 = 0; i4 < split.length; i4++) {
                        InteractiveMsgMRecycleView.m46014C1(InteractiveMsgMRecycleView.this, (ImageView) dVar.f114506A.findViewById(iArr[i4]), split[i4]);
                    }
                    dVar.f114509D.setVisibility(0);
                    dVar.f114509D.setText(MMApplicationContext.getString(C0966R.string.fam, Integer.valueOf(wVar.field_hasMergedCount)));
                    View view5 = dVar.f114513H;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view7 = dVar.f114522R;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    InteractiveMsgMRecycleView.this.f114494H1 = true;
                }
                if (!Util.isNullOrNil(wVar.f113463X1.f113570n)) {
                    InteractiveMsgMRecycleView.m46014C1(InteractiveMsgMRecycleView.this, dVar.f114510E, wVar.f113463X1.f113570n);
                    dVar.f114510E.setVisibility(0);
                } else {
                    dVar.f114510E.setVisibility(8);
                }
                dVar.f114515J.setText(C14391b.m13703a(InteractiveMsgMRecycleView.this.f114489C1, wVar.field_createTime * 1000));
                TextView textView = (TextView) dVar.f114521Q.findViewById(C0966R.C0970id.nwv);
                ImageView imageView2 = (ImageView) dVar.f114513H.findViewById(C0966R.C0970id.nwu);
                if (!wVar.f113463X1.f113574r.equals("")) {
                    dVar.f114514I.setText(wVar.f113463X1.f113574r);
                    if (!wVar.f113463X1.f113575s.equals("")) {
                        dVar.f114512G.setText(C102226d.m134696a(InteractiveMsgMRecycleView.this.f114489C1, wVar.f113463X1.f113575s));
                        dVar.f114512G.setVisibility(0);
                    } else {
                        dVar.f114512G.setVisibility(8);
                    }
                    if (wVar.field_isGreet) {
                        textView.setText(MMApplicationContext.getString(C0966R.string.n3v));
                        textView.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.f356935ao0));
                        imageView2.setImageResource(C0966R.raw.game_comment_liked);
                    } else {
                        textView.setText(MMApplicationContext.getString(C0966R.string.n3u));
                        textView.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.FG_0));
                        if (C85875k4.m106211z()) {
                            imageView2.setImageResource(C0966R.raw.game_comment_like_dark);
                        } else {
                            imageView2.setImageResource(C0966R.raw.game_comment_like);
                        }
                    }
                    if (!wVar.f113463X1.f113576t.equals("")) {
                        dVar.f114517L.setText(C102226d.m134696a(InteractiveMsgMRecycleView.this.f114489C1, wVar.f113463X1.f113576t));
                        View view9 = dVar.f114518M;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(0);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view11 = dVar.f114518M;
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(8);
                        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view11, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    String str2 = wVar.f113463X1.f113568l;
                    int indexOf = str2.indexOf("<em class=\"prefix\">");
                    int indexOf2 = str2.indexOf("</em>") - 19;
                    String replaceAll = str2.replaceAll("<em class=\"prefix\">", "").replaceAll("</em>", "");
                    if (indexOf < indexOf2) {
                        dVar.f114514I.setText(replaceAll.substring(indexOf, indexOf2 - 1));
                        dVar.f114512G.setText(C102226d.m134696a(InteractiveMsgMRecycleView.this.f114489C1, replaceAll.substring(indexOf2)));
                        dVar.f114512G.setVisibility(0);
                    }
                    if (!wVar.f113463X1.f113569m.equals("")) {
                        dVar.f114517L.setText(C102226d.m134696a(InteractiveMsgMRecycleView.this.f114489C1, wVar.f113463X1.f113569m));
                        View view12 = dVar.f114518M;
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(0);
                        View view13 = view12;
                        C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view13, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view14 = dVar.f114518M;
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(8);
                        View view15 = view14;
                        C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view15, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                dVar.f114521Q.setOnClickListener(new C42365s(dVar, textView, wVar, imageView2));
                int i5 = wVar.f113463X1.f113578v;
                if (i5 == 1) {
                    View view16 = dVar.f114513H;
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(0);
                    View view17 = view16;
                    C117292a.m165358d(view17, aVar9.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view16.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view17, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view18 = dVar.f114520P;
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(0);
                    View view19 = view18;
                    C117292a.m165358d(view19, aVar10.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view18.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view19, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view20 = dVar.f114521Q;
                    C9556a aVar11 = new C9556a();
                    aVar11.mo10233c(8);
                    View view21 = view20;
                    C117292a.m165358d(view21, aVar11.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view20.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view21, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114511F.setVisibility(8);
                } else if (i5 == 2) {
                    View view22 = dVar.f114513H;
                    C9556a aVar12 = new C9556a();
                    aVar12.mo10233c(0);
                    View view23 = view22;
                    C117292a.m165358d(view23, aVar12.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view22.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view23, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view24 = dVar.f114520P;
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(8);
                    View view25 = view24;
                    C117292a.m165358d(view25, aVar13.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view24.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view25, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114511F.setVisibility(8);
                    View view26 = dVar.f114521Q;
                    C9556a aVar14 = new C9556a();
                    aVar14.mo10233c(0);
                    View view27 = view26;
                    C117292a.m165358d(view27, aVar14.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view26.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view27, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i5 == 3) {
                    View view28 = dVar.f114513H;
                    C9556a aVar15 = new C9556a();
                    aVar15.mo10233c(0);
                    View view29 = view28;
                    C117292a.m165358d(view29, aVar15.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view28.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                    C117292a.m165359e(view29, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view30 = dVar.f114520P;
                    C9556a aVar16 = new C9556a();
                    aVar16.mo10233c(0);
                    View view31 = view30;
                    C117292a.m165358d(view31, aVar16.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view30.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                    C117292a.m165359e(view31, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114511F.setVisibility(8);
                    View view32 = dVar.f114521Q;
                    C9556a aVar17 = new C9556a();
                    aVar17.mo10233c(0);
                    View view33 = view32;
                    C117292a.m165358d(view33, aVar17.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view32.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                    C117292a.m165359e(view33, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i5 != 4) {
                    View view34 = dVar.f114520P;
                    C9556a aVar18 = new C9556a();
                    aVar18.mo10233c(8);
                    View view35 = view34;
                    C117292a.m165358d(view35, aVar18.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view34.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                    C117292a.m165359e(view35, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view36 = dVar.f114521Q;
                    C9556a aVar19 = new C9556a();
                    aVar19.mo10233c(8);
                    View view37 = view36;
                    C117292a.m165358d(view37, aVar19.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view36.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
                    C117292a.m165359e(view37, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114511F.setVisibility(8);
                } else {
                    ViewGroup.LayoutParams layoutParams = dVar.f114511F.getLayoutParams();
                    layoutParams.width = C76577a.m92151b(InteractiveMsgMRecycleView.this.f114489C1, 66);
                    dVar.f114511F.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.BW_100));
                    int i6 = wVar.field_relationType;
                    if (i6 == 0) {
                        dVar.f114511F.setBackgroundResource(C0966R.C0969drawable.cnk);
                        dVar.f114525U = (GradientDrawable) dVar.f114511F.getBackground();
                        if (C85875k4.m106211z()) {
                            dVar.f114525U.setColor(InteractiveMsgMRecycleView.this.getResources().getColor(C0966R.color.f356936ao2));
                        }
                        dVar.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3r));
                    } else if (i6 == 1) {
                        dVar.f114511F.setBackgroundResource(C0966R.C0969drawable.cnj);
                        dVar.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3t));
                        dVar.f114511F.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                    } else if (i6 != 3) {
                        dVar.f114511F.setBackgroundResource(C0966R.C0969drawable.cnk);
                        dVar.f114525U = (GradientDrawable) dVar.f114511F.getBackground();
                        if (C85875k4.m106211z()) {
                            dVar.f114525U.setColor(InteractiveMsgMRecycleView.this.getResources().getColor(C0966R.color.f356936ao2));
                        }
                        dVar.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3s));
                    } else {
                        dVar.f114511F.setBackgroundResource(C0966R.C0969drawable.cnj);
                        dVar.f114525U = (GradientDrawable) dVar.f114511F.getBackground();
                        layoutParams.width = C76577a.m92151b(InteractiveMsgMRecycleView.this.f114489C1, 80);
                        dVar.f114511F.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                        dVar.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3n));
                    }
                    dVar.f114511F.setLayoutParams(layoutParams);
                    View view38 = dVar.f114513H;
                    C9556a aVar20 = new C9556a();
                    aVar20.mo10233c(8);
                    View view39 = view38;
                    C117292a.m165358d(view39, aVar20.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view38.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
                    C117292a.m165359e(view39, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114511F.setVisibility(0);
                }
                C77426q qVar = new C77426q(InteractiveMsgMRecycleView.this.f114489C1);
                qVar.mo107595g(MMApplicationContext.getString(C0966R.string.n3p));
                qVar.mo107602n(MMApplicationContext.getString(C0966R.string.n3q));
                qVar.mo107598j(MMApplicationContext.getString(C0966R.string.n3o));
                dVar.f114511F.setOnClickListener(new C42366t(dVar, wVar, qVar));
                dVar.f114522R.setOnClickListener(new C42369u(dVar, wVar));
                dVar.f114520P.setOnClickListener(new C42370v(dVar, wVar));
                wVar.f113463X1.f113572p = "";
                if (!Util.isNullOrNil("")) {
                    dVar.f114516K.setVisibility(0);
                    dVar.f114516K.setText(wVar.f113463X1.f113572p);
                } else {
                    dVar.f114516K.setVisibility(8);
                }
                if (c == 1) {
                    View view40 = dVar.f114519N;
                    C9556a aVar21 = new C9556a();
                    aVar21.mo10233c(0);
                    View view41 = view40;
                    C117292a.m165358d(view41, aVar21.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view40.setVisibility(((Integer) aVar21.mo10231a(0)).intValue());
                    C117292a.m165359e(view41, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view42 = dVar.f114523S;
                    C9556a aVar22 = new C9556a();
                    aVar22.mo10233c(8);
                    View view43 = view42;
                    C117292a.m165358d(view43, aVar22.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view42.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
                    C117292a.m165359e(view43, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view44 = dVar.f114524T;
                    C9556a aVar23 = new C9556a();
                    aVar23.mo10233c(8);
                    View view45 = view44;
                    C117292a.m165358d(view45, aVar23.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view44.setVisibility(((Integer) aVar23.mo10231a(0)).intValue());
                    C117292a.m165359e(view45, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (c == 2) {
                    View view46 = dVar.f114519N;
                    C9556a aVar24 = new C9556a();
                    aVar24.mo10233c(8);
                    View view47 = view46;
                    C117292a.m165358d(view47, aVar24.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view46.setVisibility(((Integer) aVar24.mo10231a(0)).intValue());
                    C117292a.m165359e(view47, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view48 = dVar.f114523S;
                    C9556a aVar25 = new C9556a();
                    aVar25.mo10233c(0);
                    View view49 = view48;
                    C117292a.m165358d(view49, aVar25.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view48.setVisibility(((Integer) aVar25.mo10231a(0)).intValue());
                    C117292a.m165359e(view49, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view50 = dVar.f114524T;
                    C9556a aVar26 = new C9556a();
                    aVar26.mo10233c(8);
                    View view51 = view50;
                    C117292a.m165358d(view51, aVar26.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view50.setVisibility(((Integer) aVar26.mo10231a(0)).intValue());
                    C117292a.m165359e(view51, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (c == 3) {
                    View view52 = dVar.f114519N;
                    C9556a aVar27 = new C9556a();
                    aVar27.mo10233c(8);
                    View view53 = view52;
                    C117292a.m165358d(view53, aVar27.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view52.setVisibility(((Integer) aVar27.mo10231a(0)).intValue());
                    C117292a.m165359e(view53, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view54 = dVar.f114523S;
                    C9556a aVar28 = new C9556a();
                    aVar28.mo10233c(8);
                    View view55 = view54;
                    C117292a.m165358d(view55, aVar28.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view54.setVisibility(((Integer) aVar28.mo10231a(0)).intValue());
                    C117292a.m165359e(view55, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view56 = dVar.f114524T;
                    C9556a aVar29 = new C9556a();
                    aVar29.mo10233c(0);
                    View view57 = view56;
                    C117292a.m165358d(view57, aVar29.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view56.setVisibility(((Integer) aVar29.mo10231a(0)).intValue());
                    C117292a.m165359e(view57, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ImageView imageView3 = (ImageView) dVar.f114513H.findViewById(C0966R.C0970id.nw4);
                ImageView imageView4 = (ImageView) dVar.f114518M.findViewById(C0966R.C0970id.f358357nw1);
                ImageView imageView5 = (ImageView) dVar.f114513H.findViewById(C0966R.C0970id.nvw);
                if (C85875k4.m106211z()) {
                    imageView3.setImageResource(C0966R.raw.game_comment_reply_dark);
                    imageView4.setImageResource(C0966R.raw.game_comment_rectangle_dark);
                    imageView5.setImageResource(C0966R.raw.game_comment_more_user_dark);
                } else {
                    imageView3.setImageResource(C0966R.raw.game_comment_reply);
                    imageView4.setImageResource(C0966R.raw.game_comment_rectangle);
                    imageView5.setImageResource(C0966R.raw.game_comment_more_user);
                }
                if (InteractiveMsgMRecycleView.this.f114494H1) {
                    View view58 = dVar.f114513H;
                    C9556a aVar30 = new C9556a();
                    aVar30.mo10233c(0);
                    View view59 = view58;
                    C117292a.m165358d(view59, aVar30.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view58.setVisibility(((Integer) aVar30.mo10231a(0)).intValue());
                    C117292a.m165359e(view59, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    dVar.f114511F.setVisibility(8);
                    View view60 = dVar.f114520P;
                    C9556a aVar31 = new C9556a();
                    aVar31.mo10233c(8);
                    View view61 = view60;
                    C117292a.m165358d(view61, aVar31.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view60.setVisibility(((Integer) aVar31.mo10231a(0)).intValue());
                    C117292a.m165359e(view61, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view62 = dVar.f114521Q;
                    C9556a aVar32 = new C9556a();
                    aVar32.mo10233c(8);
                    View view63 = view62;
                    C117292a.m165358d(view63, aVar32.mo10232b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view62.setVisibility(((Integer) aVar32.mo10231a(0)).intValue());
                    C117292a.m165359e(view63, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (!((HashSet) InteractiveMsgMRecycleView.this.f114497K1).contains(Integer.valueOf(i))) {
                HashMap hashMap = new HashMap();
                String str3 = "1";
                hashMap.put("tab", str3);
                if (i2 >= this.f114503d) {
                    str3 = "2";
                }
                hashMap.put("isnew", str3);
                hashMap.put("fold", String.valueOf(wVar.field_hasMergedCount));
                hashMap.put("ext_data", wVar.f113474g2);
                C40314g.m43485d(InteractiveMsgMRecycleView.this.getContext(), 13, 1300, i2 + 1, 1, 0, wVar.field_appId, InteractiveMsgMRecycleView.this.f114490D1, wVar.f113470e2, wVar.field_gameMsgId, wVar.f113472f2, C40314g.m43483b(hashMap));
                ((HashSet) InteractiveMsgMRecycleView.this.f114497K1).add(Integer.valueOf(i));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C42327d(LayoutInflater.from(InteractiveMsgMRecycleView.this.f114489C1).inflate(C0966R.C0971layout.f359811d51, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView$d */
    public class C42327d extends RecyclerView.C16631z {

        /* renamed from: A */
        public final RoundCornerRelativeLayout f114506A;

        /* renamed from: B */
        public final ImageView f114507B;

        /* renamed from: C */
        public final TextView f114508C;

        /* renamed from: D */
        public final TextView f114509D;

        /* renamed from: E */
        public final ImageView f114510E;

        /* renamed from: F */
        public final Button f114511F;

        /* renamed from: G */
        public final TextView f114512G;

        /* renamed from: H */
        public final View f114513H;

        /* renamed from: I */
        public final TextView f114514I;

        /* renamed from: J */
        public final TextView f114515J;

        /* renamed from: K */
        public final TextView f114516K;

        /* renamed from: L */
        public final TextView f114517L;

        /* renamed from: M */
        public final View f114518M;

        /* renamed from: N */
        public final View f114519N;

        /* renamed from: P */
        public final View f114520P;

        /* renamed from: Q */
        public final View f114521Q;

        /* renamed from: R */
        public final View f114522R;

        /* renamed from: S */
        public final View f114523S;

        /* renamed from: T */
        public final View f114524T;

        /* renamed from: U */
        public GradientDrawable f114525U;

        /* renamed from: z */
        public final ViewGroup f114527z;

        public C42327d(View view) {
            super(view);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.h1_);
            this.f114527z = viewGroup;
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f2a);
            this.f114507B = imageView;
            this.f114506A = (RoundCornerRelativeLayout) view.findViewById(C0966R.C0970id.nwh);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.hg4);
            this.f114508C = textView;
            this.f114509D = (TextView) view.findViewById(C0966R.C0970id.h08);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.iu7);
            this.f114510E = (ImageView) view.findViewById(C0966R.C0970id.itu);
            this.f114511F = (Button) view.findViewById(C0966R.C0970id.itg);
            this.f114513H = view.findViewById(C0966R.C0970id.nvt);
            this.f114520P = view.findViewById(C0966R.C0970id.f358352nw0);
            this.f114522R = view.findViewById(C0966R.C0970id.nvv);
            this.f114521Q = view.findViewById(C0966R.C0970id.nvu);
            this.f114512G = (TextView) view.findViewById(C0966R.C0970id.bsk);
            this.f114515J = (TextView) view.findViewById(C0966R.C0970id.kky);
            this.f114514I = (TextView) view.findViewById(C0966R.C0970id.dbg);
            this.f114516K = (TextView) view.findViewById(C0966R.C0970id.jyt);
            this.f114517L = (TextView) view.findViewById(C0966R.C0970id.nxs);
            this.f114519N = view.findViewById(C0966R.C0970id.emm);
            this.f114523S = view.findViewById(C0966R.C0970id.hdl);
            this.f114524T = view.findViewById(C0966R.C0970id.g2y);
            this.f114518M = view.findViewById(C0966R.C0970id.nvz);
            viewGroup.setOnLongClickListener(InteractiveMsgMRecycleView.this.f114493G1);
            viewGroup.setOnClickListener(InteractiveMsgMRecycleView.this.f114493G1);
            imageView.setOnLongClickListener(InteractiveMsgMRecycleView.this.f114493G1);
            imageView.setOnClickListener(InteractiveMsgMRecycleView.this.f114493G1);
            textView.setOnLongClickListener(InteractiveMsgMRecycleView.this.f114493G1);
            textView.setOnClickListener(InteractiveMsgMRecycleView.this.f114493G1);
        }
    }

    public InteractiveMsgMRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B1 */
    public static void m46013B1(InteractiveMsgMRecycleView interactiveMsgMRecycleView, String str, boolean z, int i) {
        interactiveMsgMRecycleView.getClass();
        ((C119157j) C119157j.f356862d).mo183876g(new C42360o(interactiveMsgMRecycleView, str, z, i), "InteractiveMsg");
    }

    /* renamed from: C1 */
    public static void m46014C1(InteractiveMsgMRecycleView interactiveMsgMRecycleView, ImageView imageView, String str) {
        if (((C101062d) interactiveMsgMRecycleView.f114492F1).check(str)) {
            Bitmap bitmap = (Bitmap) ((C100301b) interactiveMsgMRecycleView.f114492F1).get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                interactiveMsgMRecycleView.mo66396E1(imageView, str, 0.0f);
            } else {
                imageView.setImageBitmap(bitmap);
            }
        } else {
            interactiveMsgMRecycleView.mo66396E1(imageView, str, 0.0f);
        }
    }

    /* renamed from: D1 */
    public static void m46015D1(InteractiveMsgMRecycleView interactiveMsgMRecycleView, String str, int i, String str2, int i2, int i3) {
        interactiveMsgMRecycleView.getClass();
        C47350c.C47352b bVar = new C47350c.C47352b();
        C53035z zVar = new C53035z();
        C53034y yVar = new C53034y();
        yVar.f148049d = str;
        yVar.f148051f = str2;
        yVar.f148053h = i3;
        yVar.f148052g = i2;
        yVar.f148050e = i;
        zVar.f148054d = yVar;
        bVar.f127066a = zVar;
        bVar.f127067b = new C53006b0();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/quickcontentinteract";
        bVar.f127069d = 1670;
        ((C119157j) C119157j.f356862d).mo183875f(new C42361p(interactiveMsgMRecycleView, bVar));
    }

    /* renamed from: E1 */
    public final void mo66396E1(ImageView imageView, String str, float f) {
        C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
        aVar.f147020a = false;
        aVar.f147026g = f;
        C52645f.m59023a().mo73595e(imageView, str, aVar.mo73598a(), new C42325b(str));
    }

    public LinkedList<String> getQuickReplyList() {
        return this.f114496J1;
    }

    public C42326c getmAdapter() {
        return this.f114491E1;
    }

    public Context getmContext() {
        return this.f114489C1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IListenerMStorage.m48928f(GameMessageStorageNotifyEvent.class.getName(), this.f114498L1);
        Log.m105924i("MicroMsg.InteractiveMsgMRecycleView", "onAttachedToWindow");
    }

    public void onDetachedFromWindow() {
        IListenerMStorage.m48929g(GameMessageStorageNotifyEvent.class.getName(), this.f114498L1);
        super.onDetachedFromWindow();
    }

    public void setQuickReplyList(LinkedList<String> linkedList) {
        this.f114496J1 = linkedList;
    }

    public void setmContext(Context context) {
        this.f114489C1 = context;
    }

    public void setmFromScene(int i) {
        this.f114490D1 = i;
        this.f114492F1 = new C100301b(30, getClass());
        this.f114493G1 = new C42329a0(i, new C42324a());
        Context context = getmContext();
        ((C119157j) C119157j.f356862d).mo183876g(new C42358n(this, context), "InteractiveMsg");
    }

    public InteractiveMsgMRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
