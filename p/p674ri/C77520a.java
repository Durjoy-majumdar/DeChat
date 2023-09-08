package p674ri;

import a11.C39479c;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import cp3.C7121a;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75589l0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import l31.C61212e;
import nj3.C76879j;
import p148ei.C7660a;
import p148ei.C7662f;
import p530fx.C45819c;
import p740wo.C53193b;
import pg3.C47504d;
import pg3.C77084b;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import z04.C66723k;

/* renamed from: ri.a */
public final class C77520a {

    /* renamed from: a */
    public final MMActivity f226029a;

    /* renamed from: b */
    public final String f226030b;

    /* renamed from: c */
    public final String f226031c;

    /* renamed from: d */
    public final ChatroomInfoUI.LocalHistoryInfo f226032d;

    /* renamed from: e */
    public final long f226033e;

    /* renamed from: f */
    public final C77522b f226034f;

    /* renamed from: g */
    public C44661m1 f226035g;

    /* renamed from: h */
    public final C13601g f226036h = C36568h.m40985a(new C77526f(this));

    /* renamed from: i */
    public final C13601g f226037i = C36568h.m40985a(new C77525e(this));

    /* renamed from: ri.a$a */
    public static final class C77521a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C77520a f226038a;

        public C77521a(C77520a aVar) {
            this.f226038a = aVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                this.f226038a.mo107676b(str, C0966R.string.fsc);
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                C13604l[] lVarArr = new C13604l[4];
                lVarArr[0] = new C13604l("base_chatroom_user_role", Integer.valueOf(((Boolean) ((C36570n) this.f226038a.f226036h).getValue()).booleanValue() ? 1 : ((Boolean) ((C36570n) this.f226038a.f226037i).getValue()).booleanValue() ? 2 : 3));
                lVarArr[1] = new C13604l("room_username", this.f226038a.f226030b);
                lVarArr[2] = new C13604l("Inviter_username", C75592q0.m90789s());
                lVarArr[3] = new C13604l("Invitee_username", this.f226038a.f226031c);
                eVar.mo86168ix("base_chatroom_invite", C90364q0.m113147f(lVarArr), 25772);
            }
        }
    }

    /* renamed from: ri.a$b */
    public interface C77522b {
        /* renamed from: N4 */
        void mo93251N4();

        /* renamed from: c1 */
        void mo93267c1();
    }

    /* renamed from: ri.a$c */
    public static final class C77523c extends C47504d {

        /* renamed from: l */
        public final /* synthetic */ C77520a f226039l;

        public C77523c(C77520a aVar) {
            this.f226039l = aVar;
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C7121a aVar;
            C47504d dVar = (C47504d) bVar;
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                if (a.f26002c == 4) {
                    C7662f fVar = a.f26004e;
                    boolean z = false;
                    if (fVar != null && fVar.f26012d == 1) {
                        MMActivity mMActivity = this.f226039l.f226029a;
                        String str2 = a.f26000a;
                        if (str2 == null || str2.length() == 0) {
                            z = true;
                        }
                        if (!z && mMActivity != null) {
                            aVar = new C7121a(mMActivity, str2);
                            a.mo8792b(this.f226039l.f226029a, aVar, (DialogInterface.OnClickListener) null);
                        }
                    }
                }
                aVar = null;
                a.mo8792b(this.f226039l.f226029a, aVar, (DialogInterface.OnClickListener) null);
            } else if (i == 0 && i2 == 0) {
                C77520a.m93470a(this.f226039l, i, i2, dVar, str);
                this.f226039l.f226034f.mo93267c1();
                this.f226039l.f226034f.mo93251N4();
            } else {
                C77520a.m93470a(this.f226039l, i, i2, dVar, str);
                this.f226039l.f226034f.mo93267c1();
            }
        }
    }

    /* renamed from: ri.a$d */
    public static final class C77524d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C72940a f226040d;

        public C77524d(C72940a aVar) {
            this.f226040d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f226040d.cancel();
        }
    }

    /* renamed from: ri.a$e */
    public static final class C77525e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C77520a f226041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77525e(C77520a aVar) {
            super(0);
            this.f226041d = aVar;
        }

        public Object invoke() {
            C44661m1 m1Var = this.f226041d.f226035g;
            return Boolean.valueOf(m1Var != null ? m1Var.mo69793u2(C75592q0.m90789s()) : false);
        }
    }

    /* renamed from: ri.a$f */
    public static final class C77526f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C77520a f226042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77526f(C77520a aVar) {
            super(0);
            this.f226042d = aVar;
        }

        public Object invoke() {
            C44661m1 m1Var = this.f226042d.f226035g;
            String str = m1Var != null ? m1Var.field_roomowner : null;
            Object s = C75592q0.m90789s();
            if (s == null) {
                s = Boolean.FALSE;
            }
            return Boolean.valueOf(C87412m.m108589b(str, s));
        }
    }

    public C77520a(MMActivity mMActivity, String str, String str2, ChatroomInfoUI.LocalHistoryInfo localHistoryInfo, long j, C77522b bVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(bVar, "iChatRoomAddContactCallback");
        this.f226029a = mMActivity;
        this.f226030b = str;
        this.f226031c = str2;
        this.f226032d = localHistoryInfo;
        this.f226033e = j;
        this.f226034f = bVar;
        this.f226035g = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        C44661m1 m1Var = this.f226035g;
        if (m1Var != null) {
            int p2 = m1Var.mo69788p2();
            boolean z = false;
            C44661m1 m1Var2 = this.f226035g;
            C87412m.m108591d(m1Var2);
            if (!m1Var2.mo69797y2() && (!C72996z1.m85847r5(str) ? p2 == 2 : (p2 & 1) == 1)) {
                z = true;
            }
            if (z) {
                C77426q qVar = new C77426q(mMActivity);
                qVar.mo107595g(mo107677c(C0966R.string.f361206i41));
                qVar.mo107602n(mo107677c(C0966R.string.a2s));
                qVar.mo107589a(true);
                qVar.mo107594f(Boolean.TRUE);
                qVar.mo107598j(mo107677c(C0966R.string.f7926wf));
                qVar.f225837a.f225714b.f225647d = mo107677c(C0966R.string.hsl);
                qVar.mo107590b(new C77521a(this));
                qVar.mo107603o();
                return;
            }
            mo107676b((String) null, C0966R.string.f7411fj);
            return;
        }
        Log.m105920e("MicroMsg.ChatRoomAddContactProcess", "member is null!!!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0339 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m93470a(p674ri.C77520a r17, int r18, int r19, pg3.C47504d r20, java.lang.String r21) {
        /*
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r17.getClass()
            java.lang.Class<f62.v0> r5 = f62.C31950v0.class
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131823394(0x7f110b22, float:1.9279586E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r8 = "getContext().getString(c…oom_sys_msg_invite_split)"
            gy3.C87412m.m108593f(r6, r8)
            gy3.C87412m.m108591d(r20)
            java.util.List<java.lang.String> r9 = r3.f127459a
            java.util.List<java.lang.String> r10 = r3.f127464f
            java.util.List<java.lang.String> r11 = r3.f127463e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "dealAddChatRoomMember errType:"
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = " errCode:"
            r12.append(r13)
            r12.append(r2)
            java.lang.String r13 = " sysErrMsg:"
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = ", tips:"
            r12.append(r13)
            java.lang.String r13 = r3.f127468j
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "MicroMsg.ChatRoomAddContactProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            r12 = -2012(0xfffffffffffff824, float:NaN)
            if (r2 != r12) goto L_0x00ab
            if (r9 == 0) goto L_0x0064
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x006c
        L_0x0064:
            if (r10 == 0) goto L_0x00ab
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x00ab
        L_0x006c:
            java.lang.String r0 = r3.f127468j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = r3.f127468j
            goto L_0x007e
        L_0x0077:
            r0 = 2131820743(0x7f1100c7, float:1.927421E38)
            java.lang.String r0 = r1.mo107677c(r0)
        L_0x007e:
            r6 = r0
            com.tencent.mm.ui.MMActivity r7 = r1.f226029a
            r8 = 0
            r0 = 2131831461(0x7f112aa5, float:1.9295948E38)
            java.lang.String r12 = r1.mo107677c(r0)
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r13 = r1.mo107677c(r0)
            ri.b r14 = new ri.b
            r0 = r14
            r1 = r17
            r2 = r20
            r3 = r11
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            ri.c r0 = p674ri.C36328c.f96694d
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0452
        L_0x00ab:
            r9 = 2
            r10 = 1
            if (r0 != 0) goto L_0x00cb
            if (r2 == 0) goto L_0x00b2
            goto L_0x00cb
        L_0x00b2:
            di3.d r0 = di3.C86312j.m106911c(r5)
            f62.v0 r0 = (f62.C31950v0) r0
            r0.mo58434ql(r10)
            java.lang.Class<pw.c> r0 = p654pw.C100971c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pw.c r0 = (p654pw.C100971c) r0
            long r12 = r1.f226033e
            java.lang.String r5 = r1.f226030b
            r0.Jf0(r12, r5)
            goto L_0x00d4
        L_0x00cb:
            di3.d r0 = di3.C86312j.m106911c(r5)
            f62.v0 r0 = (f62.C31950v0) r0
            r0.mo58434ql(r9)
        L_0x00d4:
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            java.lang.String r5 = r1.f226030b
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r0 = r0.mo69801SE(r5)
            r5 = -116(0xffffffffffffff8c, float:NaN)
            java.lang.String r12 = ""
            if (r2 != r5) goto L_0x0123
            java.lang.Class<lc3.b> r5 = lc3.C10485b.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            java.lang.String r14 = "ChatroomGlobalSwitch"
            java.lang.String r5 = r5.mo107405c(r14)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r10)
            if (r5 != r10) goto L_0x0108
            r5 = 1
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            if (r5 == 0) goto L_0x0123
            java.lang.String r5 = r0.field_roomowner
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0123
            r5 = 2131834983(0x7f113867, float:1.9303092E38)
            java.lang.String r5 = r1.mo107677c(r5)
            r14 = 2131834982(0x7f113866, float:1.930309E38)
            java.lang.String r14 = r1.mo107677c(r14)
            r15 = 1
            goto L_0x0126
        L_0x0123:
            r5 = r12
            r14 = r5
            r15 = 0
        L_0x0126:
            r7 = -23
            r10 = 2131834990(0x7f11386e, float:1.9303106E38)
            if (r2 != r7) goto L_0x0138
            java.lang.String r5 = r1.mo107677c(r10)
            r7 = 2131834989(0x7f11386d, float:1.9303104E38)
            java.lang.String r14 = r1.mo107677c(r7)
        L_0x0138:
            r7 = -109(0xffffffffffffff93, float:NaN)
            if (r2 != r7) goto L_0x014a
            r5 = 2131834985(0x7f113869, float:1.9303096E38)
            java.lang.String r5 = r1.mo107677c(r5)
            r7 = 2131834984(0x7f113868, float:1.9303094E38)
            java.lang.String r14 = r1.mo107677c(r7)
        L_0x014a:
            r7 = -122(0xffffffffffffff86, float:NaN)
            if (r2 != r7) goto L_0x01cd
            java.lang.String r5 = r1.mo107677c(r10)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
            com.tencent.mm.storage.m1 r10 = r1.f226035g
            gy3.C87412m.m108591d(r10)
            java.lang.String r10 = r10.field_roomowner
            com.tencent.mm.storage.z1 r9 = r9.get(r10)
            if (r9 == 0) goto L_0x0177
            long r13 = r9.f108320R1
            int r14 = (int) r13
            if (r14 <= 0) goto L_0x0177
            java.lang.String r13 = r9.mo73969n2()
            goto L_0x0178
        L_0x0177:
            r13 = 0
        L_0x0178:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 == 0) goto L_0x0194
            com.tencent.mm.storage.m1 r13 = r1.f226035g
            gy3.C87412m.m108591d(r13)
            java.lang.String r13 = r13.field_roomowner
            java.lang.String r14 = "member!!.field_roomowner"
            gy3.C87412m.m108593f(r13, r14)
            com.tencent.mm.storage.m1 r14 = r1.f226035g
            if (r14 != 0) goto L_0x0190
            r13 = 0
            goto L_0x0194
        L_0x0190:
            java.lang.String r13 = r14.mo69789q2(r13)
        L_0x0194:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 == 0) goto L_0x01a8
            if (r9 == 0) goto L_0x01a8
            r16 = r11
            long r10 = r9.f108320R1
            int r11 = (int) r10
            if (r11 <= 0) goto L_0x01aa
            java.lang.String r13 = r9.mo62909j3()
            goto L_0x01aa
        L_0x01a8:
            r16 = r11
        L_0x01aa:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r9 == 0) goto L_0x01b7
            com.tencent.mm.storage.m1 r9 = r1.f226035g
            gy3.C87412m.m108591d(r9)
            java.lang.String r13 = r9.field_roomowner
        L_0x01b7:
            r9 = 0
            r7[r9] = r13
            int r0 = r0.mo69787o2()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = 1
            r7[r9] = r0
            r0 = 2131834988(0x7f11386c, float:1.9303102E38)
            java.lang.String r14 = r1.mo107678d(r0, r7)
            goto L_0x01cf
        L_0x01cd:
            r16 = r11
        L_0x01cf:
            java.util.List<java.lang.String> r0 = r3.f127461c
            java.lang.String r7 = "scene.getChatroomName()"
            r9 = 2131830308(0x7f112624, float:1.929361E38)
            if (r16 == 0) goto L_0x02a4
            int r10 = r16.size()
            if (r10 <= 0) goto L_0x02a4
            int r10 = r16.size()
            int r11 = r3.f127465g
            if (r10 == r11) goto L_0x01fb
            if (r0 == 0) goto L_0x02a4
            int r10 = r0.size()
            if (r10 <= 0) goto L_0x02a4
            int r10 = r3.f127465g
            int r11 = r16.size()
            int r13 = r0.size()
            int r11 = r11 + r13
            if (r10 != r11) goto L_0x02a4
        L_0x01fb:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r4 = r16.size()
            r5 = 0
        L_0x0205:
            if (r5 >= r4) goto L_0x0213
            r10 = r16
            java.lang.Object r6 = r10.get(r5)
            r2.add(r6)
            int r5 = r5 + 1
            goto L_0x0205
        L_0x0213:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131823394(0x7f110b22, float:1.9279586E38)
            java.lang.String r4 = r4.getString(r5)
            gy3.C87412m.m108593f(r4, r8)
            if (r0 == 0) goto L_0x0259
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x0259
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "\n                "
            r5.append(r6)
            r6 = 2131830307(0x7f112623, float:1.9293608E38)
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.util.List r0 = r1.mo107680f(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r4)
            r8 = 0
            r10[r8] = r0
            java.lang.String r0 = r1.mo107678d(r6, r10)
            r5.append(r0)
            java.lang.String r0 = "\n\n                "
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = z04.C66725r.m78728b(r0)
            goto L_0x025a
        L_0x0259:
            r0 = r12
        L_0x025a:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0281
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List r6 = r1.mo107680f(r2)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r6, r4)
            r6 = 0
            r0[r6] = r4
            java.lang.String r0 = r1.mo107678d(r9, r0)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
        L_0x0281:
            com.tencent.mm.ui.MMActivity r4 = r1.f226029a
            r5 = 2131830300(0x7f11261c, float:1.9293593E38)
            java.lang.String r5 = r1.mo107677c(r5)
            ri.e r6 = new ri.e
            r6.<init>(r1)
            nj3.C76879j.m92754y(r4, r0, r12, r5, r6)
            java.lang.String r0 = r1.f226030b
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x0452
            java.lang.String r0 = r3.f127466h
            gy3.C87412m.m108593f(r0, r7)
            r1.mo107679e(r0, r2)
            goto L_0x0452
        L_0x02a4:
            r10 = r16
            java.util.List<java.lang.String> r0 = r3.f127461c
            if (r0 == 0) goto L_0x02d4
            int r8 = r0.size()
            if (r8 <= 0) goto L_0x02d4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r11 = 2131830326(0x7f112636, float:1.9293646E38)
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.util.List r0 = r1.mo107680f(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r6)
            r13 = 0
            r14[r13] = r0
            java.lang.String r0 = r1.mo107678d(r11, r14)
            r8.append(r0)
            java.lang.String r14 = r8.toString()
        L_0x02d4:
            java.util.List<java.lang.String> r0 = r3.f127462d
            r8 = 2131820742(0x7f1100c6, float:1.9274208E38)
            if (r0 == 0) goto L_0x0309
            int r11 = r0.size()
            if (r11 <= 0) goto L_0x0309
            java.lang.String r5 = r1.mo107677c(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            r13 = 2131830340(0x7f112644, float:1.9293675E38)
            r14 = 1
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.util.List r0 = r1.mo107680f(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r6)
            r14 = 0
            r9[r14] = r0
            java.lang.String r0 = r1.mo107678d(r13, r9)
            r11.append(r0)
            java.lang.String r14 = r11.toString()
        L_0x0309:
            java.util.List<java.lang.String> r0 = r3.f127460b
            if (r0 == 0) goto L_0x0364
            int r9 = r0.size()
            if (r9 <= 0) goto L_0x0364
            java.util.Iterator r9 = r0.iterator()
        L_0x0317:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0339
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85843n5(r11)
            if (r11 == 0) goto L_0x0317
            r5 = 2131831933(0x7f112c7d, float:1.9296906E38)
            java.lang.String r5 = r1.mo107677c(r5)
            r9 = 2131831934(0x7f112c7e, float:1.9296908E38)
            java.lang.String r14 = r1.mo107677c(r9)
            r9 = 1
            goto L_0x033a
        L_0x0339:
            r9 = 0
        L_0x033a:
            if (r9 != 0) goto L_0x0364
            java.lang.String r5 = r1.mo107677c(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r9 = 2131830329(0x7f112639, float:1.9293652E38)
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.util.List r0 = r1.mo107680f(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r6)
            r11 = 0
            r13[r11] = r0
            java.lang.String r0 = r1.mo107678d(r9, r13)
            r8.append(r0)
            java.lang.String r14 = r8.toString()
        L_0x0364:
            java.util.List<java.lang.String> r0 = r3.f127464f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r10 == 0) goto L_0x0376
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x0376
            r8.addAll(r10)
        L_0x0376:
            if (r0 == 0) goto L_0x0381
            int r9 = r0.size()
            if (r9 <= 0) goto L_0x0381
            r8.addAll(r0)
        L_0x0381:
            r0 = -2028(0xfffffffffffff814, float:NaN)
            if (r2 == r0) goto L_0x0395
            java.lang.String r0 = r1.f226030b
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x0395
            java.lang.String r0 = r3.f127466h
            gy3.C87412m.m108593f(r0, r7)
            r1.mo107679e(r0, r10)
        L_0x0395:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.List r7 = r1.mo107680f(r8)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r7, r6)
            r7 = 0
            r2[r7] = r6
            r6 = 2131830308(0x7f112624, float:1.929361E38)
            java.lang.String r2 = r1.mo107678d(r6, r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            if (r10 == 0) goto L_0x03c2
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x03c2
            r0 = 0
        L_0x03c2:
            java.lang.String r2 = r1.f226030b
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85847r5(r2)
            if (r2 == 0) goto L_0x03ef
            java.lang.String r2 = r3.f127467i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x03db
            com.tencent.mm.ui.MMActivity r0 = r1.f226029a
            java.lang.String r1 = r3.f127467i
            nj3.C76879j.m92748s(r0, r1, r12)
            goto L_0x0452
        L_0x03db:
            java.lang.String r2 = r1.f226030b
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85847r5(r2)
            if (r2 == 0) goto L_0x03ef
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r2 != 0) goto L_0x03ef
            com.tencent.mm.ui.MMActivity r0 = r1.f226029a
            nj3.C76879j.m92748s(r0, r4, r12)
            goto L_0x0452
        L_0x03ef:
            if (r0 == 0) goto L_0x042f
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x042f
            java.lang.String r2 = r3.f127467i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0407
            com.tencent.mm.ui.MMActivity r0 = r1.f226029a
            java.lang.String r1 = r3.f127467i
            nj3.C76879j.m92748s(r0, r1, r12)
            goto L_0x0452
        L_0x0407:
            java.lang.String r2 = r1.f226030b
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85847r5(r2)
            if (r2 == 0) goto L_0x041b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r2 != 0) goto L_0x041b
            com.tencent.mm.ui.MMActivity r0 = r1.f226029a
            nj3.C76879j.m92748s(r0, r4, r12)
            goto L_0x0452
        L_0x041b:
            if (r15 == 0) goto L_0x0429
            com.tencent.mm.ui.MMActivity r2 = r1.f226029a
            ri.d r3 = new ri.d
            r3.<init>(r1)
            r1 = 0
            nj3.C76879j.m92750u(r2, r0, r5, r3, r1)
            goto L_0x0452
        L_0x0429:
            com.tencent.mm.ui.MMActivity r1 = r1.f226029a
            nj3.C76879j.m92748s(r1, r0, r5)
            goto L_0x0452
        L_0x042f:
            java.lang.String r0 = r3.f127467i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x043f
            com.tencent.mm.ui.MMActivity r0 = r1.f226029a
            java.lang.String r1 = r3.f127467i
            nj3.C76879j.m92748s(r0, r1, r12)
            goto L_0x0452
        L_0x043f:
            java.lang.String r0 = r1.f226030b
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x0452
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r0 != 0) goto L_0x0452
            com.tencent.mm.ui.MMActivity r0 = r1.f226029a
            nj3.C76879j.m92748s(r0, r4, r12)
        L_0x0452:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p674ri.C77520a.m93470a(ri.a, int, int, pg3.d, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo107676b(String str, int i) {
        if (!C72996z1.m85807K5(this.f226030b) || C45628s0.m50735A(this.f226030b) || C75589l0.m90735a(this.f226031c)) {
            String str2 = this.f226031c;
            boolean z = true;
            if (!C87412m.m108589b(Util.nullAsNil(C75592q0.m90789s()), str2)) {
                List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f226030b);
                if (k5 == null) {
                    z = false;
                } else {
                    boolean z2 = false;
                    for (String b : k5) {
                        if (C87412m.m108589b(b, str2)) {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
            }
            if (z) {
                C76879j.m92748s(this.f226029a, mo107677c(C0966R.string.f7396f3), mo107677c(C0966R.string.a3h));
                return;
            }
            String str3 = this.f226031c;
            if (str3 != null) {
                Object[] array = new C66723k(",").mo90760e(str3, 0).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                ArrayList<String> stringsToList = Util.stringsToList((String[]) array);
                if (stringsToList != null) {
                    C72940a n = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f226030b).mo71503n(this.f226030b, stringsToList, str, this.f226032d);
                    n.f212615d = new C77523c(this);
                    n.mo100867d(this.f226029a, mo107677c(C0966R.string.a3h), mo107677c(i), true, true, new C77524d(n));
                    return;
                }
                return;
            }
            return;
        }
        C76879j.m92748s(this.f226029a, mo107677c(C0966R.string.i7k), mo107677c(C0966R.string.a3h));
    }

    /* renamed from: c */
    public final String mo107677c(int i) {
        String string = this.f226029a.getString(i);
        C87412m.m108593f(string, "context.getString(resId)");
        return string;
    }

    /* renamed from: d */
    public final String mo107678d(int i, Object... objArr) {
        C87412m.m108594g(objArr, "formatArgs");
        String string = this.f226029a.getString(i, Arrays.copyOf(objArr, objArr.length));
        C87412m.m108593f(string, "context.getString(resId, *formatArgs)");
        return string;
    }

    /* renamed from: e */
    public final void mo107679e(String str, List<String> list) {
        if (list != null && list.size() > 0) {
            LinkedList linkedList = new LinkedList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
            C75589l0.m90737c(str, linkedList, mo107677c(C0966R.string.b67), true, "weixin://findfriend/verifycontact/" + str + XVFSFile.SEPARATOR_CHAR);
        }
    }

    /* renamed from: f */
    public final List<String> mo107680f(List<String> list) {
        LinkedList linkedList = new LinkedList();
        if (!C86709a0.m107522a() || list == null) {
            return linkedList;
        }
        for (String next : list) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next);
            if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                next = z1Var.mo62898f();
                C87412m.m108593f(next, "ct.displayRemark");
            }
            linkedList.add(next);
        }
        return linkedList;
    }
}
