package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI */
public class SelectServiceNotifySenderUI extends MMActivity {

    /* renamed from: d */
    public ListView f195010d;

    /* renamed from: e */
    public MMEditText f195011e;

    /* renamed from: f */
    public View f195012f;

    /* renamed from: g */
    public SelectMemberScrollBar f195013g;

    /* renamed from: h */
    public C67939d f195014h;

    /* renamed from: i */
    public String f195015i;

    /* renamed from: j */
    public boolean f195016j;

    /* renamed from: n */
    public TextView f195017n;

    /* renamed from: o */
    public List<C67941e> f195018o = new ArrayList();

    /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$a */
    public class C67935a implements VerticalScrollBar.C6756b {
        public C67935a() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            if ("↑".equals(str)) {
                SelectServiceNotifySenderUI.this.f195010d.setSelection(0);
                return;
            }
            C67939d dVar = SelectServiceNotifySenderUI.this.f195014h;
            int intValue = dVar.f195030j.containsKey(str) ? dVar.f195030j.get(str).intValue() : -1;
            if (intValue != -1) {
                SelectServiceNotifySenderUI.this.f195010d.setSelection(intValue);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$b */
    public class C67936b implements TextWatcher {

        /* renamed from: d */
        public MTimerHandler f195020d = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C67937a(), false);

        /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$b$a */
        public class C67937a implements MTimerHandler.CallBack {
            public C67937a() {
            }

            public boolean onTimerExpired() {
                C72996z1 z1Var;
                C44673z4 Lo;
                String str;
                Log.m105918d("MicroMsg.SelectServiceNotifySenderUI", "searchEvent onTimerExpired");
                SelectServiceNotifySenderUI selectServiceNotifySenderUI = SelectServiceNotifySenderUI.this;
                C67939d dVar = selectServiceNotifySenderUI.f195014h;
                String obj = selectServiceNotifySenderUI.f195011e.getText().toString();
                dVar.getClass();
                Log.m105925i("MicroMsg.ServiceNotifyAdapter", "search:%s isLoading:%s", Util.secPrint(obj), Boolean.valueOf(dVar.f195029i));
                if (!dVar.f195029i) {
                    dVar.f195025e = obj;
                    Log.m105924i("MicroMsg.ServiceNotifyAdapter", "[setMemberListBySearch]");
                    ArrayList arrayList = new ArrayList();
                    if (!Util.isNullOrNil(obj)) {
                        for (C67941e next : dVar.f195027g) {
                            if (!(next == null || (z1Var = next.f195033a) == null)) {
                                if (z1Var.mo73969n2() != null && z1Var.mo73969n2().contains(obj)) {
                                    arrayList.add(next);
                                } else if (z1Var.mo62909j3() != null && z1Var.mo62909j3().contains(obj)) {
                                    arrayList.add(next);
                                } else if (z1Var.mo62942y2() != null && z1Var.mo62942y2().contains(obj)) {
                                    arrayList.add(next);
                                } else if (!z1Var.mo62927s3() && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0()).mo69630Lo(z1Var.getUsername())) != null && (str = Lo.field_conRemark) != null && str.contains(obj)) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        dVar.f195028h = arrayList;
                    } else {
                        dVar.f195028h = dVar.f195027g;
                    }
                    MMHandlerThread.postToMainThread(new C67960g2(dVar, obj));
                }
                return false;
            }
        }

        public C67936b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f195020d.stopTimer();
            this.f195020d.startTimer(500);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$c */
    public class C67938c implements MenuItem.OnMenuItemClickListener {
        public C67938c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectServiceNotifySenderUI.this.setResult(0, new Intent());
            SelectServiceNotifySenderUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$d */
    public class C67939d extends BaseAdapter {

        /* renamed from: d */
        public final String f195024d = new String(Character.toChars(91));

        /* renamed from: e */
        public String f195025e;

        /* renamed from: f */
        public Context f195026f;

        /* renamed from: g */
        public List<C67941e> f195027g = new ArrayList(0);

        /* renamed from: h */
        public List<C67941e> f195028h = new ArrayList();

        /* renamed from: i */
        public volatile boolean f195029i = false;

        /* renamed from: j */
        public HashMap<String, Integer> f195030j = new HashMap<>();

        /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$d$a */
        public class C67940a implements View.OnClickListener {
            public C67940a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SelectServiceNotifySenderUI selectServiceNotifySenderUI = SelectServiceNotifySenderUI.this;
                int i = ((C67942f) view.getTag()).f195041e;
                view.getId();
                selectServiceNotifySenderUI.f195011e.clearFocus();
                Util.hideVKB(view);
                List<C67941e> list = selectServiceNotifySenderUI.f195014h.f195028h;
                if (list == null || list.size() < i) {
                    Object[] objArr = new Object[2];
                    int i2 = 0;
                    objArr[0] = Integer.valueOf(i);
                    if (list != null) {
                        i2 = list.size();
                    }
                    objArr[1] = Integer.valueOf(i2);
                    Log.m105921e("MicroMsg.SelectServiceNotifySenderUI", "user should not be null. position:%d, size:%d", objArr);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("Chat_User", Util.nullAsNil("notifymessage"));
                    intent.putExtra("key_notify_message_real_username", list.get(i).f195034b);
                    intent.putExtra("finish_direct", true);
                    intent.putExtra("chat_from_scene", 6);
                    C88144b.m109801s(selectServiceNotifySenderUI.getContext(), ".ui.chatting.ChattingUI", intent, (Bundle) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C67939d(Context context) {
            this.f195026f = context;
        }

        public int getCount() {
            if (this.f195028h == null || this.f195029i) {
                return 0;
            }
            return this.f195028h.size();
        }

        public Object getItem(int i) {
            if (this.f195028h.size() > i) {
                return this.f195028h.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r24, android.view.View r25, android.view.ViewGroup r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = 0
                r3 = 2
                if (r25 != 0) goto L_0x0066
                android.content.Context r4 = r0.f195026f
                r5 = 2131495723(0x7f0c0b2b, float:1.861499E38)
                android.view.View r4 = android.view.View.inflate(r4, r5, r2)
                com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$f r5 = new com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$f
                r5.<init>()
                android.content.Context r6 = r0.f195026f
                java.lang.String r7 = "window"
                java.lang.Object r6 = r6.getSystemService(r7)
                android.view.WindowManager r6 = (android.view.WindowManager) r6
                r7 = 2131297474(0x7f0904c2, float:1.8212894E38)
                android.view.View r7 = r4.findViewById(r7)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f195037a = r7
                r7 = 2131310284(0x7f0936cc, float:1.8238876E38)
                android.view.View r7 = r4.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r5.f195038b = r7
                android.view.Display r6 = r6.getDefaultDisplay()
                int r6 = r6.getWidth()
                int r6 = r6 * 2
                int r6 = r6 / 3
                r7.setMaxWidth(r6)
                r6 = 2131309578(0x7f09340a, float:1.8237444E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f195039c = r6
                r6 = 2131309580(0x7f09340c, float:1.8237448E38)
                android.view.View r6 = r4.findViewById(r6)
                r5.f195040d = r6
                r4.setTag(r5)
                com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$d$a r6 = new com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$d$a
                r6.<init>()
                r4.setOnClickListener(r6)
                goto L_0x006f
            L_0x0066:
                java.lang.Object r4 = r25.getTag()
                r5 = r4
                com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$f r5 = (com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI.C67942f) r5
                r4 = r25
            L_0x006f:
                java.util.List<com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$e> r6 = r0.f195028h
                int r6 = r6.size()
                if (r6 <= r1) goto L_0x007f
                java.util.List<com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$e> r2 = r0.f195028h
                java.lang.Object r2 = r2.get(r1)
                com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$e r2 = (com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI.C67941e) r2
            L_0x007f:
                r6 = 0
                r7 = 1
                if (r2 != 0) goto L_0x009d
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
                r2[r6] = r1
                int r1 = r23.getCount()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r7] = r1
                java.lang.String r1 = "MicroMsg.ServiceNotifyAdapter"
                java.lang.String r3 = "null == item! position:%s, count:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r2)
                return r4
            L_0x009d:
                int r3 = r23.getCount()
                int r3 = r3 - r7
                if (r1 >= r3) goto L_0x00e8
                android.view.View r3 = r5.f195040d
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r15.mo10233c(r8)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r8 = r3
                r7 = r15
                r15 = r16
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r7 = r7.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r3.setVisibility(r7)
                java.lang.String r9 = "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x012a
            L_0x00e8:
                android.view.View r3 = r5.f195040d
                r7 = 8
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r8.mo10233c(r7)
                java.lang.Object[] r16 = r8.mo10232b()
                java.lang.String r17 = "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r3
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r7 = r8.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r3.setVisibility(r7)
                java.lang.String r16 = "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter"
                java.lang.String r17 = "getView"
                java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            L_0x012a:
                com.tencent.mm.storage.z1 r3 = r2.f195033a
                android.widget.ImageView r7 = r5.f195037a
                java.lang.Class<ln.f> r8 = p196ln.C76705f.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                ln.f r8 = (p196ln.C76705f) r8
                java.lang.String r9 = r3.getUsername()
                r8.mo106822J5(r7, r9)
                java.lang.String r3 = r3.mo62909j3()
                java.util.List<com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$e> r7 = r0.f195027g
                java.util.List<com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$e> r8 = r0.f195028h
                if (r7 == r8) goto L_0x0149
                r7 = 1
                goto L_0x014a
            L_0x0149:
                r7 = 0
            L_0x014a:
                if (r7 != 0) goto L_0x0166
                android.widget.TextView r7 = r5.f195038b
                java.lang.Class<ny.h> r8 = p629ny.C76979h.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                ny.h r8 = (p629ny.C76979h) r8
                android.content.Context r9 = r0.f195026f
                android.widget.TextView r10 = r5.f195038b
                float r10 = r10.getTextSize()
                android.text.SpannableString r3 = r8.yp0(r9, r3, r10)
                r7.setText(r3)
                goto L_0x017f
            L_0x0166:
                java.lang.String r7 = r0.f195025e
                lv1.f r3 = lv1.C99667f.m130088a(r3, r7, r6, r6)
                android.widget.TextView r7 = r5.f195038b
                android.text.TextPaint r7 = r7.getPaint()
                r3.f292095h = r7
                lv1.g r3 = kv1.C99254i.m129308e(r3)
                java.lang.CharSequence r3 = r3.f292107a
                android.widget.TextView r7 = r5.f195038b
                r7.setText(r3)
            L_0x017f:
                android.widget.TextView r3 = r5.f195039c
                com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI r7 = com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI.this
                r8 = 2131835449(0x7f113a39, float:1.9304037E38)
                r9 = 1
                java.lang.Object[] r9 = new java.lang.Object[r9]
                int r2 = r2.f195036d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r9[r6] = r2
                java.lang.String r2 = r7.getString(r8, r9)
                r3.setText(r2)
                r5.f195041e = r1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI.C67939d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$e */
    public static final class C67941e {

        /* renamed from: a */
        public C72996z1 f195033a;

        /* renamed from: b */
        public String f195034b;

        /* renamed from: c */
        public String f195035c;

        /* renamed from: d */
        public int f195036d;
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI$f */
    public static class C67942f {

        /* renamed from: a */
        public ImageView f195037a;

        /* renamed from: b */
        public TextView f195038b;

        /* renamed from: c */
        public TextView f195039c;

        /* renamed from: d */
        public View f195040d;

        /* renamed from: e */
        public int f195041e;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bw8;
    }

    public void initView() {
        setMMTitle(Util.nullAsNil(this.f195015i));
        ListView listView = (ListView) findViewById(C0966R.C0970id.gri);
        this.f195010d = listView;
        listView.setBackgroundResource(C0966R.color.BW_93);
        this.f195012f = findViewById(C0966R.C0970id.j_f);
        this.f195017n = (TextView) findViewById(C0966R.C0970id.cjf);
        this.f195014h = new C67939d(this);
        new HashSet().add(C75592q0.m90789s());
        this.f195010d.setAdapter(this.f195014h);
        SelectMemberScrollBar selectMemberScrollBar = (SelectMemberScrollBar) findViewById(C0966R.C0970id.grk);
        this.f195013g = selectMemberScrollBar;
        selectMemberScrollBar.setOnScrollBarTouchListener(new C67935a());
        this.f195013g.setVisibility(0);
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.j_b);
        this.f195011e = mMEditText;
        mMEditText.addTextChangedListener(new C67936b());
        C67939d dVar = this.f195014h;
        View view = SelectServiceNotifySenderUI.this.f195012f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C86709a0.m107525e().postToWorker(new C67956f2(dVar));
        setBackBtn(new C67938c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SelectServiceNotifySenderUI", "[onCreate]");
        getIntent().getIntExtra("from_scene", 0);
        this.f195015i = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f195016j = getIntent().getBooleanExtra("is_show_owner", true);
        initView();
    }
}
