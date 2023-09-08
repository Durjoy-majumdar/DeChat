package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelsimple.C40358f0;
import com.tencent.p014mm.modelsimple.C40372x;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76879j;
import o90.C100308d;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p492dn.C75415t;
import p548hg.C98450d;
import p629ny.C76979h;
import p910lj.C76701a;
import te3.C48678a82;
import te3.C50246ld0;
import te3.C50907q24;
import te3.C52007xq3;
import te3.C64763v03;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.AllRemindMsgUI */
public class AllRemindMsgUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public RecyclerView f164932d;

    /* renamed from: e */
    public ProgressBar f164933e;

    /* renamed from: f */
    public View f164934f;

    /* renamed from: g */
    public C57615d f164935g;

    /* renamed from: h */
    public LinkedList<C57622f> f164936h;

    /* renamed from: i */
    public C57612c f164937i = new C57612c();

    /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$a */
    public class C57610a extends RecyclerView.C16615g {
        public C57610a() {
        }

        /* renamed from: b */
        public void mo2556b() {
            Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[onChanged] size:%s", Integer.valueOf(AllRemindMsgUI.this.f164935g.getItemCount()));
            if (AllRemindMsgUI.this.f164935g.getItemCount() == 0) {
                View view = AllRemindMsgUI.this.f164934f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                AllRemindMsgUI.this.f164932d.setVisibility(8);
                return;
            }
            View view3 = AllRemindMsgUI.this.f164934f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AllRemindMsgUI.this.f164932d.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$b */
    public class C57611b implements MenuItem.OnMenuItemClickListener {
        public C57611b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AllRemindMsgUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$c */
    public class C57612c implements Runnable, C11385n {

        /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$c$a */
        public class C57613a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C117747y f164941d;

            /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$c$a$a */
            public class C57614a implements Runnable {
                public C57614a() {
                }

                public void run() {
                    AllRemindMsgUI.this.f164932d.setVisibility(0);
                    AllRemindMsgUI.this.f164933e.setVisibility(8);
                    AllRemindMsgUI.this.f164935g.notifyDataSetChanged();
                }
            }

            public C57613a(C117747y yVar) {
                this.f164941d = yVar;
            }

            public void run() {
                Class cls = C75700k0.class;
                LinkedList<C52007xq3> linkedList = ((C48678a82) ((C40372x) this.f164941d).f108497e.f127056b.f127083a).f130366d;
                LinkedList<C57622f> linkedList2 = new LinkedList<>();
                if (linkedList != null) {
                    for (C52007xq3 next : linkedList) {
                        C57622f fVar = new C57622f(AllRemindMsgUI.this);
                        fVar.f164963i = next;
                        fVar.f164958d = ((long) next.f144879f) * 1000;
                        int i = next.f144880g;
                        fVar.f164959e = i;
                        fVar.f164964j = next.f144877d;
                        if (i == 1) {
                            C64763v03 v032 = new C64763v03();
                            try {
                                v032.parseFrom(next.f144881h.f257327a);
                            } catch (IOException e) {
                                Log.m105921e("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] %s", e.toString());
                            }
                            fVar.f164957c = v032.f185815d;
                            String str = v032.f185817f;
                            fVar.f164955a = str;
                            fVar.f164960f = v032.f185818g;
                            if (str != null) {
                                if (C72996z1.m85820U5(str)) {
                                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(fVar.f164955a);
                                    if (z1Var != null) {
                                        fVar.f164956b = Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.getNickname() : z1Var.mo73969n2();
                                    }
                                    fVar.f164956b = Util.isNullOrNil(fVar.f164956b) ? AllRemindMsgUI.this.getString(C0966R.string.bba) : fVar.f164956b;
                                } else {
                                    C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(fVar.f164955a);
                                    fVar.f164956b = z1Var2.mo62898f() == null ? z1Var2.mo62909j3() : z1Var2.mo62898f();
                                }
                            }
                        } else if (i == 2) {
                            C50246ld0 ld02 = new C50246ld0();
                            try {
                                ld02.parseFrom(next.f144881h.f257327a);
                            } catch (IOException e2) {
                                Log.m105921e("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] %s", e2.toString());
                            }
                            fVar.f164957c = ld02.f137310d;
                            fVar.f164961g = ld02.f137312f;
                            fVar.f164962h = ld02.f137313g;
                        }
                        Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] getRemind:%s", fVar);
                        linkedList2.add(fVar);
                    }
                    AllRemindMsgUI.this.f164936h = linkedList2;
                }
                MMHandlerThread.postToMainThread(new C57614a());
            }
        }

        public C57612c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0) {
                Log.m105921e("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
                AllRemindMsgUI.this.f164932d.setVisibility(0);
                AllRemindMsgUI.this.f164933e.setVisibility(8);
            } else if (yVar.getType() == 866) {
                ThreadPool.post(new C57613a(yVar), "MicroMsg.emoji.AllRemindMsgUI[onSceneEnd]");
            }
        }

        public void run() {
            C97625j3.m125815e().mo123460f(new C40372x());
        }
    }

    /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$d */
    public class C57615d extends RecyclerView.C16613e {
        public C57615d() {
        }

        public int getItemCount() {
            LinkedList<C57622f> linkedList = AllRemindMsgUI.this.f164936h;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            Class cls = C76979h.class;
            C57622f fVar = AllRemindMsgUI.this.f164936h.get(i);
            C57616e eVar = (C57616e) zVar;
            eVar.f164950z.setTag(fVar);
            eVar.f164947C.setText(((C76979h) C86312j.m106911c(cls)).yp0(AllRemindMsgUI.this.getContext(), fVar.f164956b, eVar.f164947C.getTextSize()));
            eVar.f164945A.setText(((C76979h) C86312j.m106911c(cls)).yp0(AllRemindMsgUI.this.getContext(), fVar.f164957c, eVar.f164945A.getTextSize()));
            long currentTimeMillis = System.currentTimeMillis();
            long j = fVar.f164958d;
            if (j - currentTimeMillis < 60000) {
                eVar.f164946B.setText(AllRemindMsgUI.this.getContext().getString(C0966R.string.eyy, new Object[]{1}));
            } else if (j - currentTimeMillis < 3600000) {
                eVar.f164946B.setText(AllRemindMsgUI.this.getContext().getString(C0966R.string.eyy, new Object[]{Long.valueOf((fVar.f164958d - currentTimeMillis) / 60000)}));
            } else if (j - currentTimeMillis < 10800000) {
                TextView textView = eVar.f164946B;
                AppCompatActivity context = AllRemindMsgUI.this.getContext();
                long j2 = fVar.f164958d;
                textView.setText(context.getString(C0966R.string.eyx, new Object[]{Long.valueOf((fVar.f164958d - currentTimeMillis) / 3600000), Long.valueOf(((j2 - currentTimeMillis) - (((j2 - currentTimeMillis) / 3600000) * 3600000)) / 60000)}));
            } else {
                eVar.f164946B.setText(C72715f.m85112e(AllRemindMsgUI.this.getContext(), fVar.f164958d, true));
            }
            if (fVar.f164959e == 2) {
                eVar.f164948D.setImageDrawable(AllRemindMsgUI.this.getContext().getResources().getDrawable(C0966R.C0969drawable.btt));
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(eVar.f164948D, fVar.f164955a);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C57616e(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.brd, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$e */
    public class C57616e extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f164945A;

        /* renamed from: B */
        public TextView f164946B;

        /* renamed from: C */
        public TextView f164947C;

        /* renamed from: D */
        public ImageView f164948D;

        /* renamed from: z */
        public View f164950z;

        /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$e$a */
        public class C57617a implements View.OnClickListener {
            public C57617a(AllRemindMsgUI allRemindMsgUI) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C57622f fVar = (C57622f) view.getTag();
                Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[onClick] :%s", fVar);
                C57616e eVar = C57616e.this;
                AllRemindMsgUI allRemindMsgUI = AllRemindMsgUI.this;
                String str = fVar.f164955a;
                long j = fVar.f164960f;
                eVar.getClass();
                if (str == null) {
                    Log.m105920e("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] username is null");
                } else {
                    long msgId = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(str, j).getMsgId();
                    Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] msgLocalId:%s", Long.valueOf(msgId));
                    if (!str.contains("@")) {
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                        if (z1Var == null || !z1Var.mo62927s3()) {
                            if (z1Var == null) {
                                Log.m105929w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                            } else {
                                Log.m105929w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                            }
                            C76879j.m92749t(allRemindMsgUI, allRemindMsgUI.getString(C0966R.string.hze), allRemindMsgUI.getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
                        }
                    } else if (((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(str) == null) {
                        Log.m105929w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] member is null! username:%s", str);
                        C76879j.m92749t(allRemindMsgUI, allRemindMsgUI.getString(C0966R.string.hze), allRemindMsgUI.getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
                    }
                    Intent putExtra = new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
                    putExtra.setClass(allRemindMsgUI, ChattingUI.class);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(putExtra);
                    AllRemindMsgUI allRemindMsgUI2 = allRemindMsgUI;
                    C117292a.m165358d(allRemindMsgUI2, aVar.mo10232b(), "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    allRemindMsgUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(allRemindMsgUI2, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$e$b */
        public class C57618b implements View.OnTouchListener {
            public C57618b(C57616e eVar, AllRemindMsgUI allRemindMsgUI) {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                view.setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
                C117292a.m165362h(false, this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$e$c */
        public class C57619c implements View.OnLongClickListener {

            /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$e$c$a */
            public class C57620a implements View.OnCreateContextMenuListener {
                public C57620a() {
                }

                public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    contextMenu.add(0, 0, 0, AllRemindMsgUI.this.getContext().getString(C0966R.string.b_1));
                }
            }

            /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$e$c$b */
            public class C57621b implements C11184p0 {

                /* renamed from: d */
                public final /* synthetic */ View f164954d;

                public C57621b(C57619c cVar, View view) {
                    this.f164954d = view;
                }

                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    C57622f fVar = (C57622f) this.f164954d.getTag();
                    Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[onMMMenuItemSelected] delete item:%s", fVar);
                    C97625j3.m125815e().mo123460f(new C40358f0(2, fVar.f164963i));
                }
            }

            public C57619c(AllRemindMsgUI allRemindMsgUI) {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C78253a aVar = new C78253a(AllRemindMsgUI.this.getContext());
                int[] iArr = new int[2];
                if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                    iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
                }
                aVar.mo108273h(view, new C57620a(), new C57621b(this, view), iArr[0], iArr[1]);
                C117292a.m165362h(true, this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C57616e(View view) {
            super(view);
            this.f164950z = view;
            this.f164945A = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f164946B = (TextView) view.findViewById(C0966R.C0970id.klt);
            this.f164947C = (TextView) view.findViewById(C0966R.C0970id.hft);
            this.f164948D = (ImageView) view.findViewById(C0966R.C0970id.a1p);
            this.f164950z.setOnClickListener(new C57617a(AllRemindMsgUI.this));
            this.f164950z.setOnTouchListener(new C57618b(this, AllRemindMsgUI.this));
            this.f164950z.setOnLongClickListener(new C57619c(AllRemindMsgUI.this));
        }
    }

    /* renamed from: com.tencent.mm.ui.AllRemindMsgUI$f */
    public class C57622f {

        /* renamed from: a */
        public String f164955a;

        /* renamed from: b */
        public String f164956b;

        /* renamed from: c */
        public String f164957c;

        /* renamed from: d */
        public long f164958d;

        /* renamed from: e */
        public int f164959e;

        /* renamed from: f */
        public long f164960f;

        /* renamed from: g */
        public int f164961g;

        /* renamed from: h */
        public String f164962h;

        /* renamed from: i */
        public C52007xq3 f164963i;

        /* renamed from: j */
        public String f164964j;

        public C57622f(AllRemindMsgUI allRemindMsgUI) {
        }

        public String toString() {
            return "RemindItem{username='" + this.f164955a + '\'' + ", nickname='" + this.f164956b + '\'' + ", title='" + Util.secPrint(this.f164957c) + '\'' + ", timestamp=" + this.f164958d + ", subType=" + this.f164959e + ", msgId=" + this.f164960f + ", sourceType=" + this.f164961g + ", sourceId='" + this.f164962h + '\'' + '}';
        }
    }

    static {
        new C100308d(32);
    }

    /* renamed from: H7 */
    public static String m66358H7(Context context, int i, String str, String str2, int i2) {
        C72963f4.C72971h v;
        String str3;
        String str4;
        Context context2 = context;
        int i3 = i;
        String str5 = str;
        C68070l.C68072b u = C68070l.C68072b.m80422u(str5, (String) null);
        switch (i3) {
            case -1879048186:
                return context2.getString(C0966R.string.hun, new Object[]{""});
            case -1879048185:
            case -1879048183:
            case -1879048176:
                return context2.getString(C0966R.string.htd, new Object[]{""});
            case 1:
                return context2.getString(C0966R.string.a3f);
            case 3:
            case 23:
            case 33:
                return context2.getString(C0966R.string.a1p);
            case 34:
                long j = 0;
                try {
                    String[] split = (str5.endsWith("\n") ? str5.substring(0, str.length() - 1) : str5).split(XVFSFile.PATH_SEPARATOR);
                    int i4 = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                    if (split.length > i4) {
                        String str6 = split[i4];
                    }
                    int i5 = i4 + 1;
                    long j2 = split.length > i5 ? Util.getLong(split[i5], 0) : 0;
                    int i6 = i4 + 2;
                    if (split.length > i6) {
                        split[i6].equals("1");
                    }
                    j = j2;
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                }
                return context2.getString(C0966R.string.hv5, new Object[]{Integer.valueOf((int) ((C75415t) C86312j.m106911c(C75415t.class)).F30(j))});
            case 37:
                if (str5 == null || str.length() <= 0 || (str3 = v.f212737a) == null || str3.length() <= 0) {
                    return "";
                }
                int i7 = (v = C72963f4.C72971h.m85668v(str)).f212744h;
                if (i7 != 18) {
                    switch (i7) {
                        case 22:
                        case 23:
                        case 24:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            str4 = context2.getString(C0966R.string.f0h, new Object[]{v.mo101038e()});
                            break;
                        case 25:
                            str4 = context2.getString(C0966R.string.eya, new Object[]{v.mo101038e()});
                            break;
                        default:
                            str4 = context2.getString(C0966R.string.f0q, new Object[]{v.mo101038e()});
                            break;
                    }
                } else {
                    str4 = context2.getString(C0966R.string.f08, new Object[]{v.mo101038e()});
                }
                return str4;
            case 42:
            case 66:
                return context2.getString(C0966R.string.f8018ze);
            case 43:
            case 62:
                return context2.getString(62 == i3 ? C0966R.string.a36 : C0966R.string.f360103a43);
            case 47:
                return context2.getString(C0966R.string.f7957xf);
            case 48:
                ((C72972g4) C97625j3.m125812b().mo105911z()).Tx0(str5);
                return context2.getString(C0966R.string.hu9, new Object[]{""});
            case 49:
            case 553648177:
            case 587202609:
            case 1090519089:
            case 1124073521:
                if (u == null) {
                    Log.m105920e("MicroMsg.emoji.AllRemindMsgUI", "decode msg content failed");
                    return "";
                }
                int i8 = u.f195582i;
                if (i8 != 15) {
                    if (i8 == 17) {
                        return context2.getString(C0966R.string.hu9, new Object[]{""});
                    } else if (i8 == 19) {
                        return context2.getString(C0966R.string.hug, new Object[]{""});
                    } else if (i8 == 33) {
                        return context2.getString(C0966R.string.f7651mp);
                    } else {
                        if (i8 != 44) {
                            if (i8 != 74) {
                                if (i8 != 97) {
                                    if (i8 == 98) {
                                        return ((C98450d) C86312j.m106911c(C98450d.class)).mo137797al(context2, str5);
                                    }
                                    switch (i8) {
                                        case 2:
                                            return context2.getString(C0966R.string.a1p);
                                        case 3:
                                            return context2.getString(C0966R.string.hue, new Object[]{""});
                                        case 4:
                                            return context2.getString(C0966R.string.f361171hv1, new Object[]{""});
                                        case 5:
                                        case 7:
                                            return context2.getString(C0966R.string.f361170hv0, new Object[]{""});
                                        case 6:
                                            break;
                                        case 8:
                                            return context2.getString(C0966R.string.f7958xg);
                                        default:
                                            switch (i8) {
                                                case 24:
                                                    return context2.getString(C0966R.string.huf, new Object[]{""});
                                                case 25:
                                                    return context2.getString(C0966R.string.f7947x4);
                                                case 26:
                                                case 27:
                                                    break;
                                                default:
                                                    Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "default type:%s", Integer.valueOf(i8));
                                                    return context2.getString(C0966R.string.h_0);
                                            }
                                    }
                                }
                            }
                            return context2.getString(C0966R.string.htq, new Object[]{u.f195570f});
                        } else if (Util.isNullOrNil(u.mo93549l(context2, true))) {
                            return context2.getString(C0966R.string.h_0);
                        } else {
                            return u.mo93549l(context2, true) + " " + u.f195570f;
                        }
                    }
                }
                return context2.getString(C0966R.string.f7957xf);
            case 369098801:
            case 452984881:
                return context2.getString(C0966R.string.htl, new Object[]{""});
            case 419430449:
                return context2.getString(C0966R.string.huh);
            case 436207665:
            case 469762097:
                if (u == null) {
                    Log.m105920e("MicroMsg.emoji.AllRemindMsgUI", "decode msg content failed");
                    return "";
                } else if (i2 == 1) {
                    return context2.getString(C0966R.string.htk, new Object[]{u.f195596l1, ""});
                } else {
                    return context2.getString(C0966R.string.htk, new Object[]{u.f195596l1, ""});
                }
            case 503316529:
                if (u == null) {
                    Log.m105920e("MicroMsg.emoji.AllRemindMsgUI", "decode msg content failed");
                    return "";
                }
                return context2.getString(C0966R.string.htk, new Object[]{u.f195596l1, ""});
            case 520093745:
                return context2.getString(C0966R.string.htl, new Object[]{""});
            case 805306417:
            case 822083633:
                return context2.getString(C0966R.string.a3f);
            default:
                return context2.getString(C0966R.string.h_0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6372d1;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.hzi);
        this.f164932d = (RecyclerView) findViewById(C0966R.C0970id.f5791oq);
        this.f164933e = (ProgressBar) findViewById(C0966R.C0970id.i7m);
        this.f164934f = findViewById(C0966R.C0970id.ewb);
        this.f164932d.setVisibility(8);
        this.f164932d.setLayoutManager(new LinearLayoutManager(getContext()));
        C57615d dVar = new C57615d();
        this.f164935g = dVar;
        this.f164932d.setAdapter(dVar);
        this.f164935g.registerAdapterDataObserver(new C57610a());
        setBackBtn(new C57611b());
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(866, this.f164937i);
        C97625j3.m125815e().mo123455a(525, this);
        C115669n.INSTANCE.idkeyStat(795, 3, 1, false);
        initView();
        ThreadPool.post(new C57612c(), "load remind data!");
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(866, this.f164937i);
        C97625j3.m125815e().mo123470p(525, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            C76701a.makeText((Context) getContext(), (CharSequence) Util.nullAs(str, getString(C0966R.string.hcz)), 0).show();
        } else if (yVar.getType() == 525) {
            C50907q24 q242 = (C50907q24) ((C40358f0) yVar).f108456e.f127055a.f127080a;
            LinkedList<C57622f> linkedList = this.f164936h;
            if (linkedList != null) {
                ListIterator<C57622f> listIterator = linkedList.listIterator();
                while (listIterator.hasNext()) {
                    if (listIterator.next().f164964j == q242.f140105e.f144877d) {
                        listIterator.remove();
                    }
                }
            }
            this.f164935g.notifyDataSetChanged();
        }
    }
}
