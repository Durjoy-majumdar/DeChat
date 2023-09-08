package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.C40266t1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C33630h;
import jq3.C76437p;
import kotlin.Metadata;
import lc3.C10485b;
import nj3.C76879j;
import nr3.C89059e;
import ob0.C89132b;
import p203mi.C47035c;
import p385u2.C111105a;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49889is;
import te3.C50165kq2;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "Lcom/tencent/mm/chatroom/ui/t1$a;", "<init>", "()V", "a", "ui-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI */
public class RoomSpecialFollowMemberManagerUI extends MMActivity implements MStorage.IOnStorageChange, C40266t1.C40267a {

    /* renamed from: s */
    public static final /* synthetic */ int f108151s = 0;

    /* renamed from: d */
    public C44661m1 f108152d;

    /* renamed from: e */
    public String f108153e;

    /* renamed from: f */
    public long f108154f;

    /* renamed from: g */
    public final ArrayList<String> f108155g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<String> f108156h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<C72996z1> f108157i = new ArrayList<>();

    /* renamed from: j */
    public C89779i0 f108158j;

    /* renamed from: n */
    public final C13601g f108159n = C36568h.m40985a(new C40218e(this));

    /* renamed from: o */
    public final C13601g f108160o = C36568h.m40985a(new C40219f(this));

    /* renamed from: p */
    public final C13601g f108161p = C36568h.m40985a(new C40217d(this));

    /* renamed from: q */
    public final C13601g f108162q = C36568h.m40985a(new C40220g(this));

    /* renamed from: r */
    public final C13601g f108163r = C36568h.m40985a(new C40221h(this));

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$a */
    public static final class C40214a {
        public C40214a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$b */
    public static final class C40215b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108164d;

        public C40215b(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            this.f108164d = roomSpecialFollowMemberManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f108164d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$c */
    public static final class C40216c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108165d;

        public C40216c(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            this.f108165d = roomSpecialFollowMemberManagerUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI = this.f108165d;
            int i = RoomSpecialFollowMemberManagerUI.f108151s;
            roomSpecialFollowMemberManagerUI.getClass();
            Log.m105924i("MicroMsg.RoomSpecialFollowMemberManagerUI", "goFollowMemberUI()");
            Intent intent = new Intent(roomSpecialFollowMemberManagerUI, SelectRoomFollowMemberManagerUI.class);
            intent.putExtra("RoomInfo_Id", roomSpecialFollowMemberManagerUI.f108153e);
            intent.putExtra("selectRoomMemberNoOpenIm", true);
            roomSpecialFollowMemberManagerUI.startActivityForResult(intent, 1);
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$d */
    public static final class C40217d extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40217d(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            super(0);
            this.f108166d = roomSpecialFollowMemberManagerUI;
        }

        public Object invoke() {
            return (Button) this.f108166d.findViewById(C0966R.C0970id.cas);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$e */
    public static final class C40218e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40218e(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            super(0);
            this.f108167d = roomSpecialFollowMemberManagerUI;
        }

        public Object invoke() {
            return (TextView) this.f108167d.findViewById(C0966R.C0970id.go7);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$f */
    public static final class C40219f extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40219f(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            super(0);
            this.f108168d = roomSpecialFollowMemberManagerUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f108168d.findViewById(C0966R.C0970id.ece);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$g */
    public static final class C40220g extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40220g(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            super(0);
            this.f108169d = roomSpecialFollowMemberManagerUI;
        }

        public Object invoke() {
            return (ImageView) this.f108169d.findViewById(C0966R.C0970id.fo6);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$h */
    public static final class C40221h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40221h(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
            super(0);
            this.f108170d = roomSpecialFollowMemberManagerUI;
        }

        public Object invoke() {
            return (ImageView) this.f108170d.findViewById(C0966R.C0970id.fo7);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI$i */
    public static final class C40222i<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ RoomSpecialFollowMemberManagerUI f108171a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList<String> f108172b;

        public C40222i(RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI, LinkedList<String> linkedList) {
            this.f108171a = roomSpecialFollowMemberManagerUI;
            this.f108172b = linkedList;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = RoomSpecialFollowMemberManagerUI.f108151s;
            Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 447, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
            C89779i0 i0Var = this.f108171a.f108158j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI = this.f108171a;
                LinkedList<String> linkedList = this.f108172b;
                Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[updateRoomFollowMember] roomName:%s size:%s", roomSpecialFollowMemberManagerUI.f108153e, Integer.valueOf(linkedList.size()));
                roomSpecialFollowMemberManagerUI.f108157i.clear();
                RecyclerView.C16613e adapter = roomSpecialFollowMemberManagerUI.mo62758H7().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                Iterator<String> it = linkedList.iterator();
                while (it.hasNext()) {
                    roomSpecialFollowMemberManagerUI.f108157i.add(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(it.next()));
                }
                LinkedList<C49889is> linkedList2 = new LinkedList<>();
                Iterator<String> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C49889is isVar = new C49889is();
                    isVar.f135632d = it4.next();
                    linkedList2.add(isVar);
                }
                C50165kq2 kq22 = new C50165kq2();
                kq22.f136987d = linkedList2.size();
                kq22.f136988e = linkedList2;
                C44661m1 m1Var = roomSpecialFollowMemberManagerUI.f108152d;
                C87412m.m108591d(m1Var);
                m1Var.field_localChatRoomWatchMembers = kq22;
                boolean replace = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).replace(roomSpecialFollowMemberManagerUI.f108152d);
                RecyclerView.C16613e adapter2 = roomSpecialFollowMemberManagerUI.mo62758H7().getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
                Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[updateRoomFollowMember] ret:%s", Boolean.valueOf(replace));
                this.f108171a.mo62759I7();
                return null;
            }
            C76879j.m92748s(this.f108171a.getContext(), Util.nullAs(cVar.f256795c, this.f108171a.getString(C0966R.string.f361475k61)), this.f108171a.getString(C0966R.string.a3h));
            return null;
        }
    }

    static {
        new C40214a((C8480h) null);
    }

    /* renamed from: H7 */
    public final RecyclerView mo62758H7() {
        Object value = ((C36570n) this.f108160o).getValue();
        C87412m.m108593f(value, "<get-mFollowMemeberRv>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: I7 */
    public final void mo62759I7() {
        if (this.f108157i.size() == 0) {
            Object value = ((C36570n) this.f108161p).getValue();
            C87412m.m108593f(value, "<get-mEditButton>(...)");
            ((Button) value).setText(C0966R.string.f7566ju);
            Object value2 = ((C36570n) this.f108162q).getValue();
            C87412m.m108593f(value2, "<get-mLine1>(...)");
            ((ImageView) value2).setVisibility(8);
            Object value3 = ((C36570n) this.f108163r).getValue();
            C87412m.m108593f(value3, "<get-mLine2>(...)");
            ((ImageView) value3).setVisibility(8);
            return;
        }
        Object value4 = ((C36570n) this.f108161p).getValue();
        C87412m.m108593f(value4, "<get-mEditButton>(...)");
        ((Button) value4).setText(C0966R.string.f7956xe);
        Object value5 = ((C36570n) this.f108162q).getValue();
        C87412m.m108593f(value5, "<get-mLine1>(...)");
        ((ImageView) value5).setVisibility(0);
        Object value6 = ((C36570n) this.f108163r).getValue();
        C87412m.m108593f(value6, "<get-mLine2>(...)");
        ((ImageView) value6).setVisibility(0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.btw;
    }

    public void initView() {
        C50165kq2 kq22;
        LinkedList<C49889is> linkedList;
        C50165kq2 kq23;
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.f2929c);
        setBackBtn(new C40215b(this));
        C44661m1 m1Var = this.f108152d;
        LinkedList<C49889is> linkedList2 = null;
        if ((m1Var != null ? m1Var.field_localChatRoomWatchMembers : null) != null) {
            if (!(m1Var == null || (kq23 = m1Var.field_localChatRoomWatchMembers) == null)) {
                linkedList2 = kq23.f136988e;
            }
            if (!(linkedList2 == null || m1Var == null || (kq22 = m1Var.field_localChatRoomWatchMembers) == null || (linkedList = kq22.f136988e) == null)) {
                Iterator<C49889is> it = linkedList.iterator();
                while (it.hasNext()) {
                    C49889is next = it.next();
                    if (!Util.isNullOrNil(next.f135632d) && !this.f108155g.contains(next.f135632d) && m1Var.mo69790r2().contains(next.f135632d)) {
                        Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[resetData] Room Manager:%s", next.f135632d);
                        this.f108157i.add(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next.f135632d));
                        this.f108155g.add(next.f135632d);
                    }
                }
            }
        }
        Object value = ((C36570n) this.f108159n).getValue();
        C87412m.m108593f(value, "<get-mFollowDescTv>(...)");
        ((TextView) value).setText(getString(C0966R.string.i9i, new Object[]{Integer.valueOf(Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("RoomLimitWatchMemberMax"), 4))}));
        mo62758H7().setAdapter(new C40265s1(this.f108157i, this.f108152d, this));
        WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.mo16974W(1);
        mo62758H7().setLayoutManager(wxLinearLayoutManager);
        RecyclerView H7 = mo62758H7();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C76437p.C46569a aVar = new C76437p.C46569a(context);
        aVar.f125465c = C33630h.NORMAL;
        aVar.f125469g[0] = C111105a.m151500b(aVar.f125463a, C0966R.color.FG_3);
        aVar.f125470h = C111105a.m151500b(aVar.f125463a, C0966R.color.ahf);
        aVar.f125466d = aVar.f125464b.getDimensionPixelSize(C0966R.dimen.f4175v5);
        aVar.f125468f = aVar.f125464b.getDimensionPixelSize(C0966R.dimen.f3758d_);
        Paint paint = new Paint();
        paint.setColor(aVar.f125470h);
        H7.mo17085h0(new C76437p(aVar.f125465c, aVar.f125469g, paint, aVar.f125466d, aVar.f125467e, aVar.f125468f));
        mo62759I7();
        Object value2 = ((C36570n) this.f108161p).getValue();
        C87412m.m108593f(value2, "<get-mEditButton>(...)");
        ((Button) value2).setOnClickListener(new C40216c(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null || i2 != -1) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(intent == null);
            objArr[1] = Integer.valueOf(i2);
            Log.m105929w("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        String stringExtra = intent.getStringExtra("Select_Contact");
        Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f108153e, Integer.valueOf(i), stringExtra);
        C87412m.m108591d(stringExtra);
        Object[] array = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        LinkedList linkedList = new LinkedList();
        for (String str : (String[]) array) {
            if (!Util.isNullOrNil(str)) {
                linkedList.add(str);
            }
        }
        this.f108158j = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.gap), true, false, (DialogInterface.OnCancelListener) null);
        C89059e i3 = new C47035c(this.f108153e, linkedList).mo9225i();
        i3.mo11397F(this);
        i3.mo123062e(new C40222i(this, linkedList));
    }

    public void onCreate(Bundle bundle) {
        Class cls = C39479c.class;
        super.onCreate(bundle);
        this.f108154f = C31543z5.m39451a();
        getWindow().setSoftInputMode(32);
        ((C39479c) C86709a0.m107533q(cls)).mo62084mr().add(this);
        String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f108153e = stringExtra;
        Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "roomName:%s", Util.nullAs(stringExtra, ""));
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f108153e);
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(Util.nullAsNil(this.f108153e));
        this.f108152d = Lo;
        if (Lo == null) {
            finish();
            Log.m105920e("MicroMsg.RoomSpecialFollowMemberManagerUI", "member is null");
            return;
        }
        initView();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r8 = this;
            super.onDestroy()
            com.tencent.mm.autogen.mmdata.rpt.FollowChatroomMemberMangerStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FollowChatroomMemberMangerStruct
            r0.<init>()
            java.lang.String r1 = r8.f108153e
            java.lang.String r2 = "roomid"
            r3 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f107895d = r1
            long r1 = r8.f108154f
            r0.f107896e = r1
            long r1 = eb0.C31543z5.m39451a()
            r0.f107897f = r1
            r1 = 0
            r0.f107898g = r1
            r0.f107899h = r1
            com.tencent.mm.storage.m1 r2 = r8.f108152d
            gy3.C87412m.m108591d(r2)
            te3.kq2 r2 = r2.field_localChatRoomWatchMembers
            if (r2 == 0) goto L_0x0076
            com.tencent.mm.storage.m1 r2 = r8.f108152d
            gy3.C87412m.m108591d(r2)
            te3.kq2 r2 = r2.field_localChatRoomWatchMembers
            java.util.LinkedList<te3.is> r2 = r2.f136988e
            if (r2 == 0) goto L_0x0076
            com.tencent.mm.storage.m1 r2 = r8.f108152d
            gy3.C87412m.m108591d(r2)
            te3.kq2 r2 = r2.field_localChatRoomWatchMembers
            java.util.LinkedList<te3.is> r2 = r2.f136988e
            int r2 = r2.size()
            java.util.ArrayList<java.lang.String> r4 = r8.f108155g
            int r4 = r4.size()
            if (r2 == r4) goto L_0x004e
            r0.f107900i = r3
            goto L_0x0074
        L_0x004e:
            com.tencent.mm.storage.m1 r4 = r8.f108152d
            gy3.C87412m.m108591d(r4)
            te3.kq2 r4 = r4.field_localChatRoomWatchMembers
            java.util.LinkedList<te3.is> r4 = r4.f136988e
            java.util.Iterator r4 = r4.iterator()
        L_0x005b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0072
            java.lang.Object r5 = r4.next()
            te3.is r5 = (te3.C49889is) r5
            java.util.ArrayList<java.lang.String> r6 = r8.f108155g
            java.lang.String r5 = r5.f135632d
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L_0x005b
            r1 = 1
        L_0x0072:
            r0.f107900i = r1
        L_0x0074:
            r1 = r2
            goto L_0x0083
        L_0x0076:
            java.util.ArrayList<java.lang.String> r2 = r8.f108155g
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0080
            r2 = 0
            goto L_0x0081
        L_0x0080:
            r2 = 1
        L_0x0081:
            r0.f107900i = r2
        L_0x0083:
            java.util.ArrayList<java.lang.String> r2 = r8.f108155g
            int r2 = r2.size()
            r0.f107901j = r2
            r0.f107902k = r1
            r0.mo86054n()
            com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct
            r0.<init>()
            r1 = 3
            r0.f107866d = r1
            java.lang.String r1 = r8.f108153e
            java.lang.String r2 = "roomUsername"
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f107867e = r1
            java.util.ArrayList<java.lang.String> r1 = r8.f108155g
            int r1 = r1.size()
            r0.f107868f = r1
            com.tencent.mm.storage.m1 r1 = r8.f108152d
            gy3.C87412m.m108591d(r1)
            te3.kq2 r1 = r1.field_localChatRoomWatchMembers
            if (r1 == 0) goto L_0x0188
            com.tencent.mm.storage.m1 r1 = r8.f108152d
            gy3.C87412m.m108591d(r1)
            te3.kq2 r1 = r1.field_localChatRoomWatchMembers
            java.util.LinkedList<te3.is> r1 = r1.f136988e
            if (r1 == 0) goto L_0x0188
            com.tencent.mm.storage.m1 r1 = r8.f108152d
            gy3.C87412m.m108591d(r1)
            te3.kq2 r1 = r1.field_localChatRoomWatchMembers
            java.util.LinkedList<te3.is> r1 = r1.f136988e
            java.util.Iterator r1 = r1.iterator()
        L_0x00cb:
            boolean r2 = r1.hasNext()
            r4 = 124(0x7c, float:1.74E-43)
            if (r2 == 0) goto L_0x012d
            java.lang.Object r2 = r1.next()
            te3.is r2 = (te3.C49889is) r2
            java.util.ArrayList<java.lang.String> r5 = r8.f108156h
            java.lang.String r6 = r2.f135632d
            r5.add(r6)
            java.util.ArrayList<java.lang.String> r5 = r8.f108155g
            java.lang.String r6 = r2.f135632d
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x00cb
            java.lang.String r5 = r0.f107869g
            gy3.C87412m.m108591d(r5)
            int r5 = r5.length()
            java.lang.String r6 = "addList"
            if (r5 <= 0) goto L_0x010e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r0.f107869g
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r0.mo86045b(r6, r4, r3)
            r0.f107869g = r4
        L_0x010e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.f107869g
            r4.append(r5)
            java.lang.String r2 = r2.f135632d
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r2 = r0.mo86045b(r6, r2, r3)
            r0.f107869g = r2
            int r2 = r0.f107871i
            int r2 = r2 + r3
            r0.f107871i = r2
            goto L_0x00cb
        L_0x012d:
            java.util.ArrayList<java.lang.String> r1 = r8.f108155g
            java.util.Iterator r1 = r1.iterator()
        L_0x0133:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0188
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList<java.lang.String> r5 = r8.f108156h
            boolean r5 = r5.contains(r2)
            if (r5 != 0) goto L_0x0133
            java.lang.String r5 = r0.f107870h
            gy3.C87412m.m108591d(r5)
            int r5 = r5.length()
            java.lang.String r6 = "delList"
            if (r5 <= 0) goto L_0x016b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r0.f107870h
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r0.mo86045b(r6, r5, r3)
            r0.f107870h = r5
        L_0x016b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r0.f107870h
            r5.append(r7)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r2 = r0.mo86045b(r6, r2, r3)
            r0.f107870h = r2
            int r2 = r0.f107872j
            int r2 = r2 + r3
            r0.f107872j = r2
            goto L_0x0133
        L_0x0188:
            r0.mo86054n()
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            r0.remove(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.RoomSpecialFollowMemberManagerUI.onDestroy():void");
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (mStorageEventData != null) {
            Log.m105925i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, mStorageEventData.event, Integer.valueOf(mStorageEventData.eventId));
        }
    }
}
