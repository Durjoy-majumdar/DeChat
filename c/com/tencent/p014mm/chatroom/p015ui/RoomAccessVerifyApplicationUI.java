package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleCondition;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C11184p0;
import nj3.C76879j;
import nr3.C89059e;
import o31.C11345b;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import ob0.C89137b0;
import p148ei.C7660a;
import p203mi.C47036d;
import p239sv.C13786m;
import p239sv.C36838i;
import p239sv.C77792p;
import p644pi.C77088c;
import p749xh.C38533b7;
import p749xh.C78832y7;
import p909ki.C76578a;
import p909ki.C76579b;
import p909ki.C76580c;
import qo3.C89779i0;
import re0.C36315l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C90364q0;
import te3.C50225l7;
import uo3.C78253a;
import zh3.C91753f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "a", "b", "c", "ui-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI */
public final class RoomAccessVerifyApplicationUI extends MMActivity implements C11385n {

    /* renamed from: h */
    public static final C67899c f194859h = new C67899c((C8480h) null);

    /* renamed from: d */
    public String f194860d;

    /* renamed from: e */
    public final C13601g f194861e = C36568h.m40985a(new C67900d(this));

    /* renamed from: f */
    public final C13601g f194862f = C36568h.m40985a(new C67902f(this));

    /* renamed from: g */
    public final C13601g f194863g = C36568h.m40985a(new C67901e(this));

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a */
    public static final class C67881a extends RecyclerView.C16613e<C67890b> {

        /* renamed from: d */
        public final RecyclerView f194864d;

        /* renamed from: e */
        public final List<C78832y7> f194865e;

        /* renamed from: f */
        public Float f194866f;

        /* renamed from: g */
        public Float f194867g;

        /* renamed from: h */
        public final C13601g f194868h = C36568h.m40985a(new C67885b(this));

        /* renamed from: i */
        public final View.OnTouchListener f194869i = new C67889d(this);

        /* renamed from: j */
        public final View.OnLongClickListener f194870j = new C67886c(this);

        /* renamed from: n */
        public final C67882a f194871n = new C67882a(this);

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$a */
        public static final class C67882a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C67881a f194872d;

            /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$a$a */
            public static final class C67883a<_Ret, _Var> implements C87581a {

                /* renamed from: a */
                public final /* synthetic */ C89779i0 f194873a;

                /* renamed from: b */
                public final /* synthetic */ View f194874b;

                /* renamed from: c */
                public final /* synthetic */ C67881a f194875c;

                /* renamed from: d */
                public final /* synthetic */ int f194876d;

                public C67883a(C89779i0 i0Var, View view, C67881a aVar, int i) {
                    this.f194873a = i0Var;
                    this.f194874b = view;
                    this.f194875c = aVar;
                    this.f194876d = i;
                }

                public Object call(Object obj) {
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    C89779i0 i0Var = this.f194873a;
                    if (i0Var != null) {
                        i0Var.dismiss();
                    }
                    C7660a a = C7660a.m7782a(cVar.f256795c);
                    if (a != null) {
                        a.mo8792b(this.f194874b.getContext(), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                        this.f194875c.f194865e.get(this.f194876d).field_state = 1;
                        this.f194875c.f194865e.get(this.f194876d).updateToDB(C86709a0.m107535s().f251811i, true);
                        C115669n.INSTANCE.idkeyStat(219, 23, 1, true);
                    } else {
                        C76879j.m92748s(this.f194874b.getContext(), this.f194874b.getContext().getString(C0966R.string.f7349dr), this.f194874b.getContext().getString(C0966R.string.a3h));
                    }
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$a$b */
            public static final class C67884b<_Ret, _Var> implements C87581a {

                /* renamed from: a */
                public final /* synthetic */ C89779i0 f194877a;

                /* renamed from: b */
                public final /* synthetic */ View f194878b;

                /* renamed from: c */
                public final /* synthetic */ C67881a f194879c;

                /* renamed from: d */
                public final /* synthetic */ int f194880d;

                public C67884b(C89779i0 i0Var, View view, C67881a aVar, int i) {
                    this.f194877a = i0Var;
                    this.f194878b = view;
                    this.f194879c = aVar;
                    this.f194880d = i;
                }

                public Object call(Object obj) {
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    C89779i0 i0Var = this.f194877a;
                    if (i0Var != null && i0Var.isShowing()) {
                        this.f194877a.dismiss();
                    }
                    C7660a a = C7660a.m7782a(cVar.f256795c);
                    if (a != null) {
                        a.mo8792b(this.f194878b.getContext(), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                        this.f194879c.f194865e.get(this.f194880d).field_state = 1;
                        this.f194879c.f194865e.get(this.f194880d).updateToDB(C86709a0.m107535s().f251811i, true);
                        C115669n.INSTANCE.idkeyStat(219, 23, 1, true);
                    } else {
                        C76879j.m92748s(this.f194878b.getContext(), this.f194878b.getContext().getString(C0966R.string.f7349dr), this.f194878b.getContext().getString(C0966R.string.a3h));
                    }
                    return C13598b0.f38549a;
                }
            }

            public C67882a(C67881a aVar) {
                this.f194872d = aVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$agreeBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C87412m.m108594g(view, "v");
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) tag).intValue();
                C76579b bVar = new C76579b();
                bVar.parseFrom(this.f194872d.f194865e.get(intValue).field_data);
                LinkedList<C76578a> linkedList = bVar.f224137f;
                C76578a aVar = linkedList.get(linkedList.size() - 1);
                C89779i0 Q = C76879j.m92723Q(view.getContext(), view.getContext().getString(C0966R.string.a3h), view.getContext().getString(C0966R.string.f7361dx), true, false, (DialogInterface.OnCancelListener) null);
                if (C72996z1.m85847r5(this.f194872d.f194865e.get(intValue).field_chatRoomName)) {
                    C13786m mVar = (C13786m) C86312j.m106911c(C13786m.class);
                    String str = bVar.f224135d.f224138d;
                    String str2 = this.f194872d.f194865e.get(intValue).field_chatRoomName;
                    String str3 = aVar.f224132e;
                    LinkedList<C76580c> linkedList2 = bVar.f224136e;
                    C87412m.m108593f(linkedList2, "item.memberlist");
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (C76580c cVar : linkedList2) {
                        arrayList2.add(cVar.f224138d);
                    }
                    C89132b<C50225l7> Bu = mVar.mo12976Bu(str, str2, str3, arrayList2);
                    Bu.f256791h = true;
                    C89059e<C89132b.C89134c<C50225l7>> i = Bu.mo9225i();
                    Context context = view.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i.mo11397F((MMActivity) context).mo123062e(new C67883a(Q, view, this.f194872d, intValue));
                } else {
                    long j = aVar.f224134g;
                    String str4 = bVar.f224135d.f224138d;
                    String str5 = this.f194872d.f194865e.get(intValue).field_chatRoomName;
                    String str6 = aVar.f224132e;
                    LinkedList<C76580c> linkedList3 = bVar.f224136e;
                    C87412m.m108593f(linkedList3, "item.memberlist");
                    ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList3, 10));
                    for (C76580c cVar2 : linkedList3) {
                        arrayList3.add(cVar2.f224138d);
                    }
                    C47036d dVar = new C47036d(j, str4, str5, str6, arrayList3);
                    dVar.f256791h = true;
                    C89059e i2 = dVar.mo9225i();
                    Context context2 = view.getContext();
                    C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i2.mo11397F((MMActivity) context2).mo123062e(new C67884b(Q, view, this.f194872d, intValue));
                }
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("base_chatroom_invite_manage_confirm", view, new HashMap(), 25772);
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$agreeBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$b */
        public static final class C67885b extends C87413o implements C32224a<C78253a> {

            /* renamed from: d */
            public final /* synthetic */ C67881a f194881d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67885b(C67881a aVar) {
                super(0);
                this.f194881d = aVar;
            }

            public Object invoke() {
                return new C78253a(this.f194881d.f194864d.getContext());
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$c */
        public static final class C67886c implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C67881a f194882d;

            /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$c$a */
            public static final class C67887a implements View.OnCreateContextMenuListener {
                public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    C87412m.m108594g(contextMenu, "menu");
                    contextMenu.add(0, 0, 0, C0966R.string.f7944x1);
                }
            }

            /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$c$b */
            public static final class C67888b implements C11184p0 {

                /* renamed from: d */
                public final /* synthetic */ C67881a f194883d;

                /* renamed from: e */
                public final /* synthetic */ View f194884e;

                public C67888b(C67881a aVar, View view) {
                    this.f194883d = aVar;
                    this.f194884e = view;
                }

                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    List<C78832y7> list = this.f194883d.f194865e;
                    Object tag = this.f194884e.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
                    C78832y7 y7Var = list.get(((Integer) tag).intValue());
                    C91753f fVar = C86709a0.m107535s().f251811i;
                    y7Var.getClass();
                    StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getDELETE(), String.valueOf(y7Var.field_primaryKey), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
                    storageObserverEvent.setObj(y7Var);
                    new DeleteExecutor(y7Var, storageObserverEvent, C78832y7.f231619G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg").execute(fVar);
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("base_chatroom_invite_manage_delete", this.f194884e, new HashMap(), 25772);
                }
            }

            public C67886c(C67881a aVar) {
                this.f194882d = aVar;
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C87412m.m108594g(view, "v");
                C78253a aVar = (C78253a) ((C36570n) this.f194882d.f194868h).getValue();
                C67887a aVar2 = new C67887a();
                C67881a aVar3 = this.f194882d;
                C67888b bVar = new C67888b(aVar3, view);
                Float f = aVar3.f194866f;
                int floatValue = f != null ? (int) f.floatValue() : 0;
                Float f2 = this.f194882d.f194867g;
                aVar.mo108273h(view, aVar2, bVar, floatValue, f2 != null ? (int) f2.floatValue() : 0);
                C117292a.m165362h(true, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$a$d */
        public static final class C67889d implements View.OnTouchListener {

            /* renamed from: d */
            public final /* synthetic */ C67881a f194885d;

            public C67889d(C67881a aVar) {
                this.f194885d = aVar;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C87412m.m108594g(motionEvent, "event");
                if (motionEvent.getAction() == 0) {
                    this.f194885d.f194866f = Float.valueOf(motionEvent.getRawX());
                    this.f194885d.f194867g = Float.valueOf(motionEvent.getRawY());
                }
                C117292a.m165362h(false, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C67881a(RecyclerView recyclerView, List<C78832y7> list) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(list, "items");
            this.f194864d = recyclerView;
            this.f194865e = list;
            Float valueOf = Float.valueOf(0.0f);
            this.f194866f = valueOf;
            this.f194867g = valueOf;
        }

        public int getItemCount() {
            return this.f194865e.size();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0514  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0516  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0519  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x051c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x01e8 A[LOOP:1: B:23:0x01e2->B:25:0x01e8, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0284  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x030d  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0310  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0387  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x03c8  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x03ca  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x03cf  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x03d2  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x03da  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x03f0  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0443  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0473  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r35, int r36) {
            /*
                r34 = this;
                r0 = r34
                r1 = r36
                r8 = r35
                com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b r8 = (com.tencent.p014mm.chatroom.p015ui.RoomAccessVerifyApplicationUI.C67890b) r8
                java.lang.String r2 = "holder"
                gy3.C87412m.m108594g(r8, r2)
                ki.b r9 = new ki.b
                r9.<init>()
                java.util.List<xh.y7> r2 = r0.f194865e
                java.lang.Object r2 = r2.get(r1)
                xh.y7 r2 = (p749xh.C78832y7) r2
                byte[] r2 = r2.field_data
                r9.parseFrom(r2)
                java.util.List<xh.y7> r2 = r0.f194865e
                java.lang.Object r2 = r2.get(r1)
                xh.y7 r2 = (p749xh.C78832y7) r2
                int r10 = r2.field_state
                java.util.List<xh.y7> r2 = r0.f194865e
                java.lang.Object r2 = r2.get(r1)
                xh.y7 r2 = (p749xh.C78832y7) r2
                java.lang.String r11 = r2.field_chatRoomName
                java.lang.String r2 = "items[position].field_chatRoomName"
                gy3.C87412m.m108593f(r11, r2)
                java.lang.Class<ny.h> r12 = p629ny.C76979h.class
                java.lang.Class<l31.e> r2 = l31.C61212e.class
                di3.d r3 = di3.C86312j.m106911c(r2)
                l31.e r3 = (l31.C61212e) r3
                android.view.View r4 = r8.f44854d
                r3.se0(r4)
                di3.d r3 = di3.C86312j.m106911c(r2)
                l31.e r3 = (l31.C61212e) r3
                android.view.View r4 = r8.f44854d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "view_id_item_"
                r5.append(r6)
                int r6 = r8.mo17363j()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.o30(r4, r5)
                di3.d r2 = di3.C86312j.m106911c(r2)
                l31.e r2 = (l31.C61212e) r2
                android.view.View r3 = r8.f44854d
                r13 = 2
                rx3.l[] r4 = new rx3.C13604l[r13]
                ki.c r5 = r9.f224135d
                java.lang.String r5 = r5.f224138d
                rx3.l r6 = new rx3.l
                java.lang.String r7 = "Inviter_username"
                r6.<init>(r7, r5)
                r14 = 0
                r4[r14] = r6
                java.util.LinkedList<ki.c> r5 = r9.f224136e
                java.lang.String r15 = "item.memberlist"
                gy3.C87412m.m108593f(r5, r15)
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r14 = sx3.C36907w.m41090l(r5, r7)
                r6.<init>(r14)
                java.util.Iterator r5 = r5.iterator()
            L_0x0097:
                boolean r14 = r5.hasNext()
                if (r14 == 0) goto L_0x00a9
                java.lang.Object r14 = r5.next()
                ki.c r14 = (p909ki.C76580c) r14
                java.lang.String r14 = r14.f224138d
                r6.add(r14)
                goto L_0x0097
            L_0x00a9:
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 62
                r24 = 0
                java.lang.String r17 = ","
                r16 = r6
                java.lang.String r5 = sx3.C110818d0.m150921S(r16, r17, r18, r19, r20, r21, r22, r23, r24)
                rx3.l r6 = new rx3.l
                java.lang.String r14 = "Invitee_username"
                r6.<init>(r14, r5)
                r14 = 1
                r4[r14] = r6
                java.util.Map r4 = sx3.C90364q0.m113147f(r4)
                r2.mo86149PM(r3, r4)
                android.view.View r2 = r8.f44854d
                android.content.Context r6 = r2.getContext()
                rx3.g r2 = r8.f194888C
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                java.lang.Class<ln.f> r3 = p196ln.C76705f.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                ln.f r3 = (p196ln.C76705f) r3
                ki.c r4 = r9.f224135d
                java.lang.String r4 = r4.f224138d
                r3.mo106849z(r2, r4)
                com.tencent.mm.chatroom.ui.l1 r3 = new com.tencent.mm.chatroom.ui.l1
                r3.<init>(r9, r8, r6, r11)
                r2.setOnClickListener(r3)
                android.view.View$OnTouchListener r3 = r8.f194887B
                r2.setOnTouchListener(r3)
                int r3 = r8.mo17365l()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.setTag(r3)
                android.view.View$OnLongClickListener r3 = r8.f194886A
                r2.setOnLongClickListener(r3)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                rx3.g r2 = r8.f194889D
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                r5 = r2
                android.widget.TextView r5 = (android.widget.TextView) r5
                r2 = 2131834902(0x7f113816, float:1.9302927E38)
                java.lang.String r4 = r6.getString(r2)
                java.lang.String r2 = "context.getString(R.stri…y_application_item_title)"
                gy3.C87412m.m108593f(r4, r2)
                java.lang.Object[] r3 = new java.lang.Object[r13]
                ki.c r2 = r9.f224135d
                java.lang.String r13 = "item.inviter"
                gy3.C87412m.m108593f(r2, r13)
                rx3.g r13 = r8.f194889D
                rx3.n r13 = (rx3.C36570n) r13
                java.lang.Object r13 = r13.getValue()
                android.widget.TextView r13 = (android.widget.TextView) r13
                if (r13 != 0) goto L_0x013b
                goto L_0x015a
            L_0x013b:
                java.lang.Class<f62.k0> r17 = f62.C75700k0.class
                k40.a r17 = f40.C86709a0.m107533q(r17)
                f62.k0 r17 = (f62.C75700k0) r17
                com.tencent.mm.storage.u3 r14 = r17.mo96097Ni()
                java.lang.String r7 = r2.f224138d
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                com.tencent.mm.storage.z1 r7 = r14.get(r7)
                if (r7 != 0) goto L_0x015f
                java.lang.String r2 = "MicroMsg.RoomAccessVerifyApplicationUI"
                java.lang.String r7 = "ct == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r7)
            L_0x015a:
                r2 = 0
                r19 = r4
            L_0x015d:
                r4 = 0
                goto L_0x01cc
            L_0x015f:
                java.lang.String r14 = r7.mo73969n2()
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 != 0) goto L_0x0170
                java.lang.String r14 = r7.mo73969n2()
                r19 = r4
                goto L_0x018a
            L_0x0170:
                java.lang.Class<a11.c> r14 = a11.C39479c.class
                k40.a r14 = f40.C86709a0.m107533q(r14)
                a11.c r14 = (a11.C39479c) r14
                eb0.m2 r14 = r14.mo62084mr()
                com.tencent.mm.storage.n1 r14 = (com.tencent.p014mm.storage.C44662n1) r14
                com.tencent.mm.storage.m1 r14 = r14.mo69801SE(r11)
                r19 = r4
                java.lang.String r4 = r2.f224138d
                java.lang.String r14 = r14.mo69789q2(r4)
            L_0x018a:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r4 == 0) goto L_0x0194
                java.lang.String r14 = r7.mo73969n2()
            L_0x0194:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r4 == 0) goto L_0x019e
                java.lang.String r14 = r7.mo62909j3()
            L_0x019e:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r14)
                java.lang.String r7 = r2.f224142h
                java.lang.String r2 = r2.f224143i
                java.lang.String r2 = r8.mo93301C(r7, r2)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                di3.d r4 = di3.C86312j.m106911c(r12)
                ny.h r4 = (p629ny.C76979h) r4
                android.content.Context r7 = r13.getContext()
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                float r13 = r13.getTextSize()
                android.text.SpannableString r2 = r4.yp0(r7, r2, r13)
                goto L_0x015d
            L_0x01cc:
                r3[r4] = r2
                java.util.LinkedList<ki.c> r2 = r9.f224136e
                gy3.C87412m.m108593f(r2, r15)
                java.util.ArrayList r13 = new java.util.ArrayList
                r7 = 10
                int r4 = sx3.C36907w.m41090l(r2, r7)
                r13.<init>(r4)
                java.util.Iterator r14 = r2.iterator()
            L_0x01e2:
                boolean r2 = r14.hasNext()
                if (r2 == 0) goto L_0x0249
                java.lang.Object r2 = r14.next()
                ki.c r2 = (p909ki.C76580c) r2
                r17 = r14
                de3.u r14 = new de3.u
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = r2.f224139e
                r4.append(r7)
                java.lang.String r7 = r2.f224142h
                r22 = r3
                java.lang.String r3 = r2.f224143i
                java.lang.String r3 = r8.mo93301C(r7, r3)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r14.<init>((java.lang.String) r3)
                com.tencent.mm.chatroom.ui.m1 r7 = new com.tencent.mm.chatroom.ui.m1
                r23 = r2
                r2 = r7
                r30 = r22
                r3 = r8
                r1 = r19
                r0 = 33
                r4 = r6
                r31 = r5
                r5 = r11
                r32 = r6
                r6 = r23
                r19 = r11
                r11 = r7
                r7 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                int r2 = r14.length()
                r3 = 0
                r14.mo105705b(r11, r3, r2, r0)
                r13.add(r14)
                r0 = r34
                r14 = r17
                r11 = r19
                r3 = r30
                r5 = r31
                r6 = r32
                r7 = 10
                r19 = r1
                r1 = r36
                goto L_0x01e2
            L_0x0249:
                r30 = r3
                r31 = r5
                r32 = r6
                r1 = r19
                r0 = 33
                r19 = r11
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 124(0x7c, float:1.74E-43)
                r29 = 0
                java.lang.String r22 = ", "
                r20 = r13
                r21 = r2
                sx3.C110818d0.m150920R(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                r3 = 1
                r30[r3] = r2
                java.util.regex.Pattern r2 = o40.C61926c.f176038a
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>(r1)
                r1 = -1
                r3 = 0
                r4 = -1
            L_0x027e:
                int r5 = r2.length()
                if (r3 >= r5) goto L_0x033f
                java.util.regex.Pattern r5 = o40.C61926c.f176038a
                java.util.regex.Matcher r5 = r5.matcher(r2)
                java.lang.String r6 = "FORMAT_SEQUENCE.matcher(out)"
                gy3.C87412m.m108593f(r5, r6)
                boolean r3 = r5.find(r3)
                if (r3 == 0) goto L_0x033f
                int r3 = r5.start()
                int r6 = r5.end()
                r7 = 1
                java.lang.String r11 = r5.group(r7)
                java.lang.String r7 = "m.group(1)"
                gy3.C87412m.m108593f(r11, r7)
                r7 = 2
                java.lang.String r13 = r5.group(r7)
                java.lang.String r14 = "m.group(2)"
                gy3.C87412m.m108593f(r13, r14)
                r14 = 3
                java.lang.String r5 = r5.group(r14)
                java.lang.String r14 = "m.group(3)"
                gy3.C87412m.m108593f(r5, r14)
                java.lang.String r14 = "%"
                boolean r16 = gy3.C87412m.m108589b(r5, r14)
                if (r16 == 0) goto L_0x02c5
                goto L_0x0335
            L_0x02c5:
                java.lang.String r14 = "n"
                boolean r14 = gy3.C87412m.m108589b(r5, r14)
                if (r14 == 0) goto L_0x02d0
                java.lang.String r14 = "\n"
                goto L_0x0335
            L_0x02d0:
                java.lang.String r14 = ""
                boolean r14 = gy3.C87412m.m108589b(r11, r14)
                if (r14 == 0) goto L_0x02db
                int r4 = r4 + 1
                goto L_0x02e3
            L_0x02db:
                java.lang.String r14 = "<"
                boolean r14 = gy3.C87412m.m108589b(r11, r14)
                if (r14 == 0) goto L_0x02e5
            L_0x02e3:
                r7 = r4
                goto L_0x02ff
            L_0x02e5:
                int r14 = r11.length()
                int r14 = r14 + r1
                r7 = 0
                java.lang.String r11 = r11.substring(r7, r14)
                java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r11, r7)
                int r7 = java.lang.Integer.parseInt(r11)
                int r7 = r7 + r1
                r33 = r7
                r7 = r4
                r4 = r33
            L_0x02ff:
                r4 = r30[r4]
                java.lang.String r11 = "s"
                boolean r11 = gy3.C87412m.m108589b(r5, r11)
                if (r11 == 0) goto L_0x0310
                boolean r11 = r4 instanceof android.text.Spanned
                if (r11 == 0) goto L_0x0310
                android.text.Spanned r4 = (android.text.Spanned) r4
                goto L_0x0333
            L_0x0310:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r14 = 37
                r11.append(r14)
                r11.append(r13)
                r11.append(r5)
                java.lang.String r5 = r11.toString()
                r11 = 1
                java.lang.Object[] r13 = new java.lang.Object[r11]
                r11 = 0
                r13[r11] = r4
                java.lang.String r4 = java.lang.String.format(r5, r13)
                java.lang.String r5 = "format(\"%$modTerm$typeTerm\", argItem )"
                gy3.C87412m.m108593f(r4, r5)
            L_0x0333:
                r14 = r4
                r4 = r7
            L_0x0335:
                r2.replace(r3, r6, r14)
                int r5 = r14.length()
                int r3 = r3 + r5
                goto L_0x027e
            L_0x033f:
                android.text.SpannedString r3 = new android.text.SpannedString
                r3.<init>(r2)
                r2 = r31
                r2.setText(r3)
                android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
                r2.setMovementMethod(r3)
                android.view.View$OnTouchListener r3 = r8.f194887B
                r2.setOnTouchListener(r3)
                int r3 = r8.mo17365l()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.setTag(r3)
                android.view.View$OnLongClickListener r3 = r8.f194886A
                r2.setOnLongClickListener(r3)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                rx3.g r2 = r8.f194890E
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.util.LinkedList<ki.a> r3 = r9.f224137f
                java.lang.String r4 = "item.application3"
                gy3.C87412m.m108593f(r3, r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x0381:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x03a2
                java.lang.Object r5 = r3.next()
                r6 = r5
                ki.a r6 = (p909ki.C76578a) r6
                java.lang.String r6 = r6.f224133f
                if (r6 == 0) goto L_0x039b
                int r6 = r6.length()
                if (r6 != 0) goto L_0x0399
                goto L_0x039b
            L_0x0399:
                r6 = 0
                goto L_0x039c
            L_0x039b:
                r6 = 1
            L_0x039c:
                if (r6 != 0) goto L_0x0381
                r4.add(r5)
                goto L_0x0381
            L_0x03a2:
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                com.tencent.mm.chatroom.ui.n1 r26 = com.tencent.p014mm.chatroom.p015ui.C67981n1.f195117d
                r27 = 30
                r28 = 0
                java.lang.String r21 = "\n"
                r20 = r4
                java.lang.String r3 = sx3.C110818d0.m150921S(r20, r21, r22, r23, r24, r25, r26, r27, r28)
                r2.setText(r3)
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L_0x03ca
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03c8
                goto L_0x03ca
            L_0x03c8:
                r3 = 0
                goto L_0x03cb
            L_0x03ca:
                r3 = 1
            L_0x03cb:
                r4 = 8
                if (r3 == 0) goto L_0x03d2
                r3 = 8
                goto L_0x03d3
            L_0x03d2:
                r3 = 0
            L_0x03d3:
                r2.setVisibility(r3)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                if (r10 != 0) goto L_0x03f0
                android.widget.Button r2 = r8.mo93302z()
                r3 = 0
                r2.setVisibility(r3)
                rx3.g r2 = r8.f194892G
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                r2.setVisibility(r4)
                goto L_0x0405
            L_0x03f0:
                android.widget.Button r2 = r8.mo93302z()
                r2.setVisibility(r4)
                rx3.g r2 = r8.f194892G
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                r3 = 0
                r2.setVisibility(r3)
            L_0x0405:
                android.widget.Button r2 = r8.mo93302z()
                int r3 = r8.mo17365l()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.setTag(r3)
                android.widget.Button r2 = r8.mo93302z()
                android.view.View$OnTouchListener r3 = r8.f194887B
                r2.setOnTouchListener(r3)
                android.widget.Button r2 = r8.mo93302z()
                android.view.View$OnClickListener r3 = r8.f194895z
                r2.setOnClickListener(r3)
                android.widget.Button r2 = r8.mo93302z()
                android.view.View$OnLongClickListener r3 = r8.f194886A
                r2.setOnLongClickListener(r3)
                java.util.LinkedList<ki.c> r2 = r9.f224136e
                gy3.C87412m.m108593f(r2, r15)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x043d:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x045e
                java.lang.Object r5 = r2.next()
                r6 = r5
                ki.c r6 = (p909ki.C76580c) r6
                java.lang.String r6 = r6.f224141g
                if (r6 == 0) goto L_0x0457
                int r6 = r6.length()
                if (r6 != 0) goto L_0x0455
                goto L_0x0457
            L_0x0455:
                r6 = 0
                goto L_0x0458
            L_0x0457:
                r6 = 1
            L_0x0458:
                if (r6 != 0) goto L_0x043d
                r3.add(r5)
                goto L_0x043d
            L_0x045e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r5 = 10
                int r5 = sx3.C36907w.m41090l(r3, r5)
                r2.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x046d:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x04df
                java.lang.Object r5 = r3.next()
                ki.c r5 = (p909ki.C76580c) r5
                de3.u r6 = new de3.u
                r7 = 2131834899(0x7f113813, float:1.9302921E38)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]
                di3.d r9 = di3.C86312j.m106911c(r12)
                ny.h r9 = (p629ny.C76979h) r9
                java.lang.String r11 = r5.f224139e
                r13 = r32
                android.text.SpannableString r9 = r9.mo107057T1(r13, r11)
                r11 = 0
                r10[r11] = r9
                java.lang.String r7 = r13.getString(r7, r10)
                r6.<init>((java.lang.String) r7)
                com.tencent.mm.chatroom.ui.o1 r7 = new com.tencent.mm.chatroom.ui.o1
                r9 = r19
                r7.<init>(r13, r9, r5)
                int r5 = r6.length()
                r10 = 0
            L_0x04a5:
                r11 = 8203(0x200b, float:1.1495E-41)
                if (r10 >= r5) goto L_0x04b8
                char r14 = r6.charAt(r10)
                if (r14 != r11) goto L_0x04b1
                r14 = 1
                goto L_0x04b2
            L_0x04b1:
                r14 = 0
            L_0x04b2:
                if (r14 == 0) goto L_0x04b5
                goto L_0x04b9
            L_0x04b5:
                int r10 = r10 + 1
                goto L_0x04a5
            L_0x04b8:
                r10 = -1
            L_0x04b9:
                int r5 = r6.length()
                int r5 = r5 + r1
                if (r5 < 0) goto L_0x04d3
            L_0x04c0:
                int r14 = r5 + -1
                char r15 = r6.charAt(r5)
                if (r15 != r11) goto L_0x04ca
                r15 = 1
                goto L_0x04cb
            L_0x04ca:
                r15 = 0
            L_0x04cb:
                if (r15 == 0) goto L_0x04ce
                goto L_0x04d4
            L_0x04ce:
                if (r14 >= 0) goto L_0x04d1
                goto L_0x04d3
            L_0x04d1:
                r5 = r14
                goto L_0x04c0
            L_0x04d3:
                r5 = -1
            L_0x04d4:
                r6.mo105705b(r7, r10, r5, r0)
                r2.add(r6)
                r19 = r9
                r32 = r13
                goto L_0x046d
            L_0x04df:
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 124(0x7c, float:1.74E-43)
                r29 = 0
                java.lang.String r22 = "\n"
                r20 = r2
                r21 = r0
                sx3.C110818d0.m150920R(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                android.widget.TextView r1 = r8.mo93300B()
                android.view.ViewParent r1 = r1.getParent()
                android.view.ViewParent r1 = r1.getParent()
                java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r1, r2)
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                int r2 = r0.length()
                if (r2 != 0) goto L_0x0516
                r2 = 1
                goto L_0x0517
            L_0x0516:
                r2 = 0
            L_0x0517:
                if (r2 == 0) goto L_0x051c
                r2 = 8
                goto L_0x051d
            L_0x051c:
                r2 = 0
            L_0x051d:
                r1.setVisibility(r2)
                android.widget.TextView r1 = r8.mo93300B()
                r1.setText(r0)
                android.widget.TextView r0 = r8.mo93300B()
                android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
                r0.setMovementMethod(r1)
                android.widget.TextView r0 = r8.mo93300B()
                android.view.View$OnTouchListener r1 = r8.f194887B
                r0.setOnTouchListener(r1)
                android.widget.TextView r0 = r8.mo93300B()
                int r1 = r8.mo17365l()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.setTag(r1)
                android.widget.TextView r0 = r8.mo93300B()
                android.view.View$OnLongClickListener r1 = r8.f194886A
                r0.setOnLongClickListener(r1)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                android.view.View r0 = r8.f44854d
                r1 = r34
                android.view.View$OnTouchListener r2 = r1.f194869i
                r0.setOnTouchListener(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r36)
                r0.setTag(r2)
                android.view.View$OnLongClickListener r2 = r1.f194870j
                r0.setOnLongClickListener(r2)
                java.util.List<xh.y7> r0 = r1.f194865e
                r2 = r36
                java.lang.Object r0 = r0.get(r2)
                xh.y7 r0 = (p749xh.C78832y7) r0
                int r0 = r0.field_read
                r3 = 1
                if (r0 != r3) goto L_0x0597
                if (r2 <= 0) goto L_0x0597
                java.util.List<xh.y7> r0 = r1.f194865e
                int r2 = r2 - r3
                java.lang.Object r0 = r0.get(r2)
                xh.y7 r0 = (p749xh.C78832y7) r0
                int r0 = r0.field_read
                if (r0 != 0) goto L_0x0597
                rx3.g r0 = r8.f194893H
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2 = 0
                r0.setVisibility(r2)
                goto L_0x05a4
            L_0x0597:
                rx3.g r0 = r8.f194893H
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                android.widget.TextView r0 = (android.widget.TextView) r0
                r0.setVisibility(r4)
            L_0x05a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.RoomAccessVerifyApplicationUI.C67881a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f359632cs1, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(parent.conte…tion_item, parent, false)");
            return new C67890b(inflate, this.f194871n, this.f194870j, this.f194869i);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b */
    public static final class C67890b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View.OnLongClickListener f194886A;

        /* renamed from: B */
        public final View.OnTouchListener f194887B;

        /* renamed from: C */
        public final C13601g f194888C;

        /* renamed from: D */
        public final C13601g f194889D;

        /* renamed from: E */
        public final C13601g f194890E;

        /* renamed from: F */
        public final C13601g f194891F;

        /* renamed from: G */
        public final C13601g f194892G;

        /* renamed from: H */
        public final C13601g f194893H;

        /* renamed from: I */
        public final C13601g f194894I;

        /* renamed from: z */
        public final View.OnClickListener f194895z;

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$a */
        public static final class C67891a extends C87413o implements C32224a<Button> {

            /* renamed from: d */
            public final /* synthetic */ View f194896d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67891a(View view) {
                super(0);
                this.f194896d = view;
            }

            public Object invoke() {
                Button button = (Button) this.f194896d.findViewById(C0966R.C0970id.f5655l0);
                C85875k4.m106191k0(button.getPaint());
                return button;
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$b */
        public static final class C67892b extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f194897d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67892b(View view) {
                super(0);
                this.f194897d = view;
            }

            public Object invoke() {
                TextView textView = (TextView) this.f194897d.findViewById(C0966R.C0970id.enb);
                C85875k4.m106191k0(textView.getPaint());
                return textView;
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$c */
        public static final class C67893c extends C87413o implements C32224a<ImageView> {

            /* renamed from: d */
            public final /* synthetic */ View f194898d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67893c(View view) {
                super(0);
                this.f194898d = view;
            }

            public Object invoke() {
                return (ImageView) this.f194898d.findViewById(C0966R.C0970id.a1p);
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$d */
        public static final class C67894d extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f194899d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67894d(View view) {
                super(0);
                this.f194899d = view;
            }

            public Object invoke() {
                return (TextView) this.f194899d.findViewById(C0966R.C0970id.f357845c22);
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$e */
        public static final class C67895e extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f194900d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67895e(View view) {
                super(0);
                this.f194900d = view;
            }

            public Object invoke() {
                return (TextView) this.f194900d.findViewById(C0966R.C0970id.mp9);
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$f */
        public static final class C67896f extends C87413o implements C32224a<ProgressBar> {

            /* renamed from: d */
            public final /* synthetic */ View f194901d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67896f(View view) {
                super(0);
                this.f194901d = view;
            }

            public Object invoke() {
                return (ProgressBar) this.f194901d.findViewById(C0966R.C0970id.f357452en3);
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$g */
        public static final class C67897g extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f194902d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67897g(View view) {
                super(0);
                this.f194902d = view;
            }

            public Object invoke() {
                return (TextView) this.f194902d.findViewById(C0966R.C0970id.f359166mv1);
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$b$h */
        public static final class C67898h extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f194903d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67898h(View view) {
                super(0);
                this.f194903d = view;
            }

            public Object invoke() {
                return (TextView) this.f194903d.findViewById(C0966R.C0970id.knx);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67890b(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener) {
            super(view);
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(onClickListener, "clickListener");
            C87412m.m108594g(onLongClickListener, "longClickListener");
            C87412m.m108594g(onTouchListener, "touchListener");
            this.f194895z = onClickListener;
            this.f194886A = onLongClickListener;
            this.f194887B = onTouchListener;
            this.f194888C = C36568h.m40985a(new C67893c(view));
            this.f194889D = C36568h.m40985a(new C67898h(view));
            this.f194890E = C36568h.m40985a(new C67894d(view));
            this.f194891F = C36568h.m40985a(new C67891a(view));
            this.f194892G = C36568h.m40985a(new C67892b(view));
            C36568h.m40985a(new C67896f(view));
            this.f194893H = C36568h.m40985a(new C67897g(view));
            this.f194894I = C36568h.m40985a(new C67895e(view));
        }

        /* renamed from: y */
        public static final void m80268y(C67890b bVar, Context context, String str, String str2, String str3, String str4, boolean z, String str5) {
            bVar.getClass();
            Class cls = C75700k0.class;
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(str);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str2);
            boolean z2 = false;
            if (str4 == null || str4.length() == 0) {
                intent.putExtra("Contact_RoomNickname", SE.mo69789q2(str2));
                str4 = SE.mo69789q2(str2);
            }
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (z2) {
                C44673z4 Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(str2);
                str4 = Lo != null ? Lo.field_encryptUsername : null;
            }
            if (str4 != null) {
                intent.putExtra("Contact_RemarkName", str4);
            }
            intent.putExtra("key_add_contact_verify_ticket", str5);
            intent.putExtra("Contact_Nick", str3);
            intent.putExtra("Contact_RoomMember", true);
            intent.putExtra("room_name", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str2);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                aVar.f9503a = intent;
                aVar.f9504b = str2;
                setLocalQQMobileEvent.publish();
            }
            if (z1Var != null && z1Var.mo62916m3()) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(10298, z1Var.getUsername() + ",14");
            }
            if (z) {
                intent.putExtra("Contact_Scene", 96);
            } else {
                intent.putExtra("Contact_Scene", 14);
            }
            intent.putExtra("Is_RoomOwner", true);
            intent.putExtra("Contact_ChatRoomId", str);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }

        /* renamed from: B */
        public final TextView mo93300B() {
            return (TextView) ((C36570n) this.f194894I).getValue();
        }

        /* renamed from: C */
        public final String mo93301C(String str, String str2) {
            Class cls = C77792p.class;
            boolean z = false;
            if (str == null || str.length() == 0) {
                return "";
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (z) {
                return "";
            }
            C38533b7 b7Var = new C38533b7();
            b7Var.field_appid = str;
            b7Var.field_wordingId = str2;
            b7Var.field_language = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
            ((C36315l) ((C77792p) C86312j.m106911c(cls)).mo107738m7()).mo60615jo(b7Var, new String[]{"appid", "wordingId", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
            if (b7Var.field_wording != null) {
                String str3 = 65312 + b7Var.field_wording;
                if (str3 != null) {
                    return str3;
                }
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(str2);
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            C36838i Hf0 = ((C77792p) C86312j.m106911c(cls)).Hf0(str, b7Var.field_language, linkedList);
            C87412m.m108592e(Hf0, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            b0Var.mo123460f((C117747y) Hf0);
            return "";
        }

        /* renamed from: z */
        public final Button mo93302z() {
            return (Button) ((C36570n) this.f194891F).getValue();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$c */
    public static final class C67899c {
        public C67899c(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo93303a(String str) {
            if (str != null) {
                SingleTable singleTable = C78832y7.f231620o;
                ContentValues contentValues = new ContentValues();
                contentValues.put("read", 1);
                C78832y7.f231620o.update(contentValues).where(C78832y7.f231622q.equal(str)).build().run(C86709a0.m107535s().f251811i);
                ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().doNotify(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$d */
    public static final class C67900d extends C87413o implements C32224a<C44661m1> {

        /* renamed from: d */
        public final /* synthetic */ RoomAccessVerifyApplicationUI f194904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67900d(RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
            super(0);
            this.f194904d = roomAccessVerifyApplicationUI;
        }

        public Object invoke() {
            return ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f194904d.f194860d);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$e */
    public static final class C67901e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ RoomAccessVerifyApplicationUI f194905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67901e(RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
            super(0);
            this.f194905d = roomAccessVerifyApplicationUI;
        }

        public Object invoke() {
            return Boolean.valueOf(((C44661m1) ((C36570n) this.f194905d.f194861e).getValue()).mo69793u2(C75592q0.m90789s()));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$f */
    public static final class C67902f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ RoomAccessVerifyApplicationUI f194906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67902f(RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
            super(0);
            this.f194906d = roomAccessVerifyApplicationUI;
        }

        public Object invoke() {
            return Boolean.valueOf(C87412m.m108589b(((C44661m1) ((C36570n) this.f194906d.f194861e).getValue()).field_roomowner, C75592q0.m90789s()));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$g */
    public static final class C67903g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RoomAccessVerifyApplicationUI f194907d;

        public C67903g(RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
            this.f194907d = roomAccessVerifyApplicationUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f194907d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$h */
    public static final class C67904h<T extends IAutoDBItem> implements IStorageObserver {

        /* renamed from: d */
        public final /* synthetic */ RoomAccessVerifyApplicationUI f194908d;

        public C67904h(RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
            this.f194908d = roomAccessVerifyApplicationUI;
        }

        public void onChanged(Object obj) {
            StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
            C87412m.m108594g(storageObserverEvent, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.RoomAccessVerifyApplicationUI", "notify, " + storageObserverEvent.getPendingKey());
            C61926c.m72668M(new C67984p1(this.f194908d));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI$i */
    public static final class C67905i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RoomAccessVerifyApplicationUI f194909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67905i(RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
            super(0);
            this.f194909d = roomAccessVerifyApplicationUI;
        }

        public Object invoke() {
            this.f194909d.mo93295H7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: H7 */
    public final void mo93295H7() {
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.mon);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        String stringExtra = getIntent().getStringExtra("intent_chatroom_username");
        C67881a aVar = null;
        if (stringExtra != null) {
            this.f194860d = stringExtra;
            SingleTable singleTable = C78832y7.f231620o;
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            SingleCondition equal = C78832y7.f231622q.equal(stringExtra);
            linkedList2.add(C78832y7.f231626u.orderDesc());
            List<C78832y7> multiQuery = C78832y7.f231620o.select((List<? extends ISqlColumn>) linkedList).where(equal).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(C86709a0.m107535s().f251811i, C78832y7.class);
            Log.m105924i("MicroMsg.RoomAccessVerifyApplicationUI", "application count:" + multiQuery.size());
            if (multiQuery.size() > 0) {
                aVar = new C67881a(recyclerView, multiQuery);
            }
        }
        recyclerView.setAdapter(aVar);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setVisibility(8);
            ((LinearLayout) findViewById(C0966R.C0970id.cig)).setVisibility(0);
            return;
        }
        recyclerView.setVisibility(0);
        ((LinearLayout) findViewById(C0966R.C0970id.cig)).setVisibility(8);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359633cs2;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.mdd);
        setBackBtn(new C67903g(this));
        C78832y7.f231619G.observe(this, new C67904h(this));
        mo93295H7();
        C86709a0.m107529k().f251779b.mo123470p(453, this);
        ((C61212e) C86312j.m106911c(cls)).mo86163dt(this);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.SeeAccessVerifyInfoUI);
        C61212e eVar = (C61212e) C86312j.m106911c(cls);
        C13604l[] lVarArr = new C13604l[4];
        lVarArr[0] = new C13604l("base_chatroom_invite_manage_source", Integer.valueOf(getIntent().getBooleanExtra("intent_from_chattingui", false) ? 2 : 1));
        lVarArr[1] = new C13604l("base_chatroom_user_role", Integer.valueOf(((Boolean) ((C36570n) this.f194862f).getValue()).booleanValue() ? 1 : ((Boolean) ((C36570n) this.f194863g).getValue()).booleanValue() ? 2 : 3));
        lVarArr[2] = new C13604l("room_username", this.f194860d);
        lVarArr[3] = new C13604l("room_unread_count", Integer.valueOf(((C77088c) C86312j.m106911c(C77088c.class)).Yc0(this.f194860d, 0)));
        eVar.u70(this, C90364q0.m113147f(lVarArr));
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 4, 25772);
    }

    public void onDestroy() {
        f194859h.mo93303a(this.f194860d);
        C86709a0.m107529k().f251779b.mo123470p(453, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            C61926c.m72668M(new C67905i(this));
        }
    }
}
