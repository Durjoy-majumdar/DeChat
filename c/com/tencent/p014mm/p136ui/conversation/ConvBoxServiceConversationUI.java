package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C75045z;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.C74697k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kg3.C76577a;
import kj3.C76587i;
import kr0.C34010q0;
import l31.C61212e;
import nj3.C11184p0;
import o31.C11345b;
import p154fy.C87121j;
import p196ln.C76705f;
import p227rn.C48053v;
import p680ru.C77569h;
import qo3.C89779i0;
import rb0.C48009v0;
import uo3.C78253a;
import wc3.C78538u;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI */
public class ConvBoxServiceConversationUI extends BaseConversationUI {
    public static final String TAG = "MicroMsg.ConvBoxServiceConversationUI";
    private View contentView;

    /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI */
    public static class ConvBoxServiceConversationFmUI extends BaseConversationUI.BaseConversationFmUI {
        public static final int CONTEXT_MENU_LONGCLICK_DELETE = 4;
        public static final int CONTEXT_MENU_LONGCLICK_DISMISS = 3;
        public static final int CONTEXT_MENU_LONGCLICK_MARK_READ = 2;
        public static final int CONTEXT_MENU_LONGCLICK_SET_UN_READ = 1;
        private static final String TAG = "MicroMsg.ConvBoxServiceConversationFmUI";
        /* access modifiers changed from: private */
        public C74697k adapter;
        /* access modifiers changed from: private */
        public ListView appbrandMessageLV;
        /* access modifiers changed from: private */
        public C72976h2 conversation;
        private TextView emptyTipTv;
        public boolean isFirstOnResume = true;
        private String mAppId;
        private String superUsername;
        /* access modifiers changed from: private */
        public String talker = "";
        private C89779i0 tipDialog = null;
        /* access modifiers changed from: private */
        public int x_down;
        /* access modifiers changed from: private */
        public int y_down;

        /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$a */
        public class C44895a implements MenuItem.OnMenuItemClickListener {
            public C44895a() {
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                ConvBoxServiceConversationFmUI.this.finish();
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$b */
        public class C44896b implements C6975i1.C6977b {
            public C44896b() {
            }

            /* renamed from: a */
            public void mo1327a(Object obj) {
                ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = ConvBoxServiceConversationFmUI.this;
                convBoxServiceConversationFmUI.setShowView(convBoxServiceConversationFmUI.adapter.getCount());
            }

            /* renamed from: b */
            public void mo1328b(Object obj) {
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$c */
        public class C44897c implements AdapterView.OnItemClickListener {
            public C44897c() {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Long.valueOf(j));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
                ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = ConvBoxServiceConversationFmUI.this;
                C72976h2 unused = convBoxServiceConversationFmUI.conversation = (C72976h2) convBoxServiceConversationFmUI.adapter.getItem(i);
                C72976h2 access$300 = ConvBoxServiceConversationFmUI.this.conversation;
                if (access$300 == null) {
                    Log.m105921e(ConvBoxServiceConversationFmUI.TAG, "user should not be null. position:%d, size:%d", Integer.valueOf(i), Integer.valueOf(ConvBoxServiceConversationFmUI.this.adapter.getCount()));
                    ConvBoxServiceConversationFmUI.this.adapter.notifyDataSetChanged();
                    C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                } else if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(access$300.getUsername()) == null) {
                    Log.m105921e(ConvBoxServiceConversationFmUI.TAG, "position=%s cont is null", Integer.valueOf(i));
                    C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                } else {
                    if (access$300.mo108829v2() > 0) {
                        access$300.mo108799U2(0);
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(access$300, access$300.getUsername());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("specific_chat_from_scene", 7);
                    bundle.putInt("KOpenArticleSceneFromScene", 93);
                    bundle.putInt("chat_from_scene_for_group_chats", 3);
                    bundle.putInt("Main_IndexInSessionList", i);
                    bundle.putInt("Main_UnreadCount", access$300.mo108786G2());
                    bundle.putInt("chat_from_scene", 0);
                    ConvBoxServiceConversationFmUI.this.f219287ui.startChatting(access$300.getUsername(), bundle, true);
                    C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$d */
        public class C44898d implements View.OnTouchListener {
            public C44898d() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getAction() == 0) {
                    ConvBoxServiceConversationFmUI.this.hideVKB();
                    int unused = ConvBoxServiceConversationFmUI.this.x_down = (int) motionEvent.getRawX();
                    int unused2 = ConvBoxServiceConversationFmUI.this.y_down = (int) motionEvent.getRawY();
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$e */
        public class C44899e implements AdapterView.OnItemLongClickListener {

            /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$e$a */
            public class C44900a implements View.OnCreateContextMenuListener {

                /* renamed from: d */
                public final /* synthetic */ int f121774d;

                public C44900a(int i) {
                    this.f121774d = i;
                }

                public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = ConvBoxServiceConversationFmUI.this;
                    if (convBoxServiceConversationFmUI.isReaded(convBoxServiceConversationFmUI.talker)) {
                        contextMenu.add(0, 1, 0, C0966R.string.f361010gm2);
                    } else {
                        contextMenu.add(0, 2, 0, C0966R.string.f361008gm0);
                    }
                    contextMenu.add(this.f121774d, 3, 0, C0966R.string.glt);
                    contextMenu.add(this.f121774d, 4, 0, C0966R.string.bvg);
                }
            }

            /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$e$b */
            public class C44901b implements C11184p0 {

                /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$e$b$a */
                public class C44902a implements Runnable {
                    public C44902a() {
                    }

                    public void run() {
                        Class cls = C48053v.class;
                        if (C72996z1.m85853x5(ConvBoxServiceConversationFmUI.this.talker) || C72996z1.m85827Y4(ConvBoxServiceConversationFmUI.this.talker)) {
                            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i(ConvBoxServiceConversationFmUI.this.talker);
                        } else if (((C48053v) C86312j.m106911c(cls)).mo72617gl(ConvBoxServiceConversationFmUI.this.talker) || ((C48053v) C86312j.m106911c(cls)).mo72614OE(ConvBoxServiceConversationFmUI.this.talker)) {
                            C48009v0.Dx0().mo73021Lo(ConvBoxServiceConversationFmUI.this.talker);
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69763f(ConvBoxServiceConversationFmUI.this.talker);
                        } else {
                            C45629t0.m50823j(ConvBoxServiceConversationFmUI.this.talker);
                        }
                        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(ConvBoxServiceConversationFmUI.this.talker, 14);
                    }
                }

                /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$e$b$b */
                public class C44903b implements Runnable {

                    /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$e$b$b$a */
                    public class C44904a implements Runnable {
                        public C44904a() {
                        }

                        public void run() {
                            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(ConvBoxServiceConversationFmUI.this.talker);
                        }
                    }

                    public C44903b() {
                    }

                    public void run() {
                        ((C119157j) C119157j.f356862d).mo183875f(new C44904a());
                    }
                }

                public C44901b() {
                }

                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    Class cls = C87121j.class;
                    Class cls2 = C77569h.class;
                    int itemId = menuItem.getItemId();
                    if (itemId == 1) {
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69768h0(ConvBoxServiceConversationFmUI.this.talker);
                        ((C77569h) C86312j.m106911c(cls2)).mo35236XG(true, ConvBoxServiceConversationFmUI.this.talker, true);
                        ((C87121j) C86312j.m106911c(cls)).mo71215V9(ConvBoxServiceConversationFmUI.this.talker, 13);
                    } else if (itemId == 2) {
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(ConvBoxServiceConversationFmUI.this.talker);
                        MMAppMgr.m85983c(ConvBoxServiceConversationFmUI.this.talker);
                        ((C87121j) C86312j.m106911c(cls)).mo71215V9(ConvBoxServiceConversationFmUI.this.talker, 1);
                        ((C77569h) C86312j.m106911c(cls2)).mo35236XG(true, ConvBoxServiceConversationFmUI.this.talker, false);
                        C68111c.m80513e().mo93621c(ConvBoxServiceConversationFmUI.this.talker);
                    } else if (itemId == 3) {
                        C75045z.m90001b(ConvBoxServiceConversationFmUI.this.thisActivity(), new C44902a());
                    } else if (itemId == 4) {
                        C44965d.m49844d(ConvBoxServiceConversationFmUI.this.talker, ConvBoxServiceConversationFmUI.this.appbrandMessageLV.getContext(), ConvBoxServiceConversationFmUI.this.conversation, true, new C44903b(), true, false);
                    }
                }
            }

            public C44899e() {
            }

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = ConvBoxServiceConversationFmUI.this;
                C72976h2 unused = convBoxServiceConversationFmUI.conversation = (C72976h2) convBoxServiceConversationFmUI.adapter.getItem(i);
                ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI2 = ConvBoxServiceConversationFmUI.this;
                String unused2 = convBoxServiceConversationFmUI2.talker = convBoxServiceConversationFmUI2.conversation.getUsername();
                new C78253a(ConvBoxServiceConversationFmUI.this.getContext()).mo108272g(view, i, j, new C44900a(i), new C44901b(), ConvBoxServiceConversationFmUI.this.x_down, ConvBoxServiceConversationFmUI.this.y_down);
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$f */
        public static class C44905f extends C74697k {

            /* renamed from: H */
            public HashMap<String, String> f121780H = new HashMap<>();

            /* renamed from: I */
            public List<String> f121781I = new ArrayList();

            /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$f$a */
            public class C44906a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C74697k.C74703f f121782d;

                /* renamed from: e */
                public final /* synthetic */ int f121783e;

                /* renamed from: f */
                public final /* synthetic */ int f121784f;

                public C44906a(C44905f fVar, C74697k.C74703f fVar2, int i, int i2) {
                    this.f121782d = fVar2;
                    this.f121783e = i;
                    this.f121784f = i2;
                }

                public void run() {
                    ViewParent parent = this.f121782d.f219645c.getParent();
                    Log.m105925i("MicroMsg.ConversationAdapter", "expected nicknameParent width: %d, nicknameParent width:%d, expected nickname width: %d, nickname width:%d", Integer.valueOf(this.f121783e), Integer.valueOf(parent instanceof View ? ((View) parent).getWidth() : 0), Integer.valueOf(this.f121784f), Integer.valueOf(this.f121782d.f219645c.getWidth()));
                }
            }

            public C44905f(Context context, String str, C6975i1.C6977b bVar) {
                super(context, bVar);
                new Paint();
            }

            /* renamed from: o */
            public void mo1333o() {
                mo7998r(((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(5, (List<String>) null, "conversationboxservice", -1));
                C6975i1.C6977b bVar = this.f24699h;
                if (bVar != null) {
                    bVar.mo1327a((Object) null);
                }
                notifyDataSetChanged();
            }

            /* renamed from: u */
            public void mo70183u(String str, C74697k.C74703f fVar) {
                int i;
                float f;
                CharSequence charSequence;
                String str2 = str;
                C74697k.C74703f fVar2 = fVar;
                String str3 = this.f121780H.get(str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = C76587i.m92183c(C76587i.m92182b(str));
                    if (!TextUtils.isEmpty(str3)) {
                        this.f121780H.put(str2, str3);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    fVar2.f219646d.setVisibility(0);
                    fVar2.f219646d.setText((CharSequence) this.f24696e.getString(C0966R.string.f7878us, new Object[]{str3}));
                    int i2 = this.f24696e.getResources().getDisplayMetrics() != null ? this.f24696e.getResources().getDisplayMetrics().widthPixels : 0;
                    int i3 = fVar2.f219647e.getLayoutParams().width;
                    if (C76577a.m92147C(this.f24696e)) {
                        i = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3920iz);
                        if (i3 < 0) {
                            i3 = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3674b4);
                        }
                    } else {
                        i = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3921j0);
                        if (i3 < 0) {
                            i3 = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3675b5);
                        }
                    }
                    int dimensionPixelOffset = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6) * 2;
                    int dimensionPixelOffset2 = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6);
                    C74697k.C74701d dVar = this.f219608p.get(str2);
                    String charSequence2 = (dVar == null || (charSequence = dVar.f219625a) == null) ? "" : charSequence.toString();
                    NoMeasuredTextView noMeasuredTextView = fVar2.f219645c;
                    float measureText = ((noMeasuredTextView == null || charSequence2 == null) ? 0.0f : noMeasuredTextView.getPaint().measureText(charSequence2)) + 48.0f;
                    NoMeasuredTextView noMeasuredTextView2 = fVar2.f219645c;
                    if (noMeasuredTextView2 == null || Util.isNullOrNil(charSequence2)) {
                        f = 0.0f;
                    } else {
                        String str4 = charSequence2.substring(0, charSequence2.offsetByCodePoints(0, 1)) + "…";
                        Log.m105924i("MicroMsg.ConversationAdapter", "getMinTextWidth, minText: " + str4);
                        f = noMeasuredTextView2.getPaint().measureText(str4);
                    }
                    float min = (float) ((int) Math.min(measureText, f + 48.0f));
                    Log.m105925i("MicroMsg.ConversationAdapter", "nickNameMinWidth:%f", Float.valueOf(min));
                    int dimensionPixelOffset3 = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3675b5);
                    int dimensionPixelOffset4 = this.f24696e.getResources().getDimensionPixelOffset(C0966R.dimen.f3906ig);
                    Log.m105925i("MicroMsg.ConversationAdapter", "screenWidth:%d, avatarLayoutWidth:%d, timeTVWidth:%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3));
                    float f2 = i2 > 0 ? (float) (((((i2 - i) - dimensionPixelOffset) - i3) - dimensionPixelOffset2) - dimensionPixelOffset4) : 0.0f;
                    float f3 = 0.4f;
                    float f4 = 0.6f;
                    if (measureText <= f2 && measureText < f2 && f2 > 0.0f) {
                        f4 = Math.min(measureText / f2, (f2 - ((float) dimensionPixelOffset3)) / f2);
                        f3 = 1.0f - f4;
                    }
                    Log.m105925i("MicroMsg.ConversationAdapter", "nickNameParentRemainWidth: %f, nicknameTVWeight:%f, sourceTVWeight:%f", Float.valueOf(f2), Float.valueOf(f4), Float.valueOf(f3));
                    if (f2 > 0.0f) {
                        float min2 = Math.min(1.0f, min / f2);
                        if (min2 > f4) {
                            f3 = 1.0f - min2;
                            f4 = min2;
                        }
                    }
                    Log.m105925i("MicroMsg.ConversationAdapter", "weight fixed, nicknameTVWeight:%f, sourceTVWeight:%f", Float.valueOf(f4), Float.valueOf(f3));
                    if (WeChatEnvironment.hasDebugger()) {
                        fVar2.f219645c.post(new C44906a(this, fVar2, (int) (((float) dimensionPixelOffset4) + f2), (int) (f2 * f4)));
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) fVar2.f219645c.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = f4;
                    fVar2.f219645c.setLayoutParams(layoutParams);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) fVar2.f219646d.getLayoutParams();
                    layoutParams2.width = 0;
                    layoutParams2.weight = f3;
                    fVar2.f219646d.setLayoutParams(layoutParams2);
                } else {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) fVar2.f219645c.getLayoutParams();
                    layoutParams3.width = -1;
                    layoutParams3.weight = 0.0f;
                    fVar2.f219645c.setLayoutParams(layoutParams3);
                }
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(fVar2.f219644b, str2, 0.1f);
                if (!((ArrayList) this.f121781I).contains(str2)) {
                    ((ArrayList) this.f121781I).add(str2);
                }
            }
        }

        /* access modifiers changed from: private */
        public boolean isReaded(String str) {
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
            return j != null && j.mo108786G2() <= 0 && !j.mo108372k3(1048576);
        }

        /* access modifiers changed from: private */
        public void setShowView(int i) {
            if (i <= 0) {
                this.emptyTipTv.setVisibility(0);
                this.appbrandMessageLV.setVisibility(8);
                return;
            }
            this.emptyTipTv.setVisibility(8);
            this.appbrandMessageLV.setVisibility(0);
        }

        public int getLayoutId() {
            return C0966R.C0971layout.c_r;
        }

        public String getUserName() {
            return this.superUsername;
        }

        public void initView() {
            setMMTitle(getString(C0966R.string.bva));
            this.appbrandMessageLV = (ListView) findViewById(C0966R.C0970id.kpr);
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
            this.emptyTipTv = textView;
            textView.setTextColor(getResources().getColor(C0966R.color.FG_2));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.emptyTipTv.getLayoutParams();
            layoutParams.topMargin = 200;
            this.emptyTipTv.setLayoutParams(layoutParams);
            this.emptyTipTv.setText(C0966R.string.bv_);
            setBackBtn(new C44895a());
            this.adapter = new C44905f(thisActivity(), this.superUsername, new C44896b());
            this.adapter.getClass();
            this.appbrandMessageLV.setAdapter(this.adapter);
            this.appbrandMessageLV.setOnItemClickListener(new C44897c());
            this.appbrandMessageLV.setOnTouchListener(new C44898d());
            this.appbrandMessageLV.setOnItemLongClickListener(new C44899e());
            this.adapter.getClass();
            this.adapter.getClass();
        }

        public void onActivityCreated(Bundle bundle) {
            Log.m105924i(TAG, "onActivityCreated");
            super.onActivityCreated(bundle);
            String stringExtra = getStringExtra("Contact_User");
            this.superUsername = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                this.superUsername = "conversationboxservice";
            }
            initView();
            C97625j3.m125812b().mo105908w().add(this.adapter);
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            String str = this.talker;
            if (str != null && !str.isEmpty()) {
                this.talker = "";
            }
        }

        public void onDestroy() {
            if (C97625j3.m125811a()) {
                C97625j3.m125812b().mo105908w().remove(this.adapter);
            }
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this.adapter);
            C74697k kVar = this.adapter;
            if (kVar != null) {
                kVar.mo70227D();
            }
            super.onDestroy();
        }

        public void onPause() {
            Log.m105924i(TAG, "on pause");
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.superUsername);
            C74697k kVar = this.adapter;
            if (kVar != null) {
                kVar.mo103859E();
            }
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("@placeholder_foldgroup", 1);
            super.onPause();
        }

        public void onResume() {
            Log.m105924i(TAG, "on resume");
            C74697k kVar = this.adapter;
            if (kVar != null) {
                kVar.mo103860F();
            }
            this.adapter.mo1333o();
            if (this.isFirstOnResume) {
                ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("@placeholder_foldgroup", 1);
                this.isFirstOnResume = false;
            }
            super.onResume();
        }
    }

    public void finish() {
        super.finish();
        ((C34010q0) C86312j.m106911c(C34010q0.class)).mo59405u9(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6655kx, (ViewGroup) null);
        this.contentView = inflate;
        setContentView(inflate);
        this.conversationFm = new ConvBoxServiceConversationFmUI();
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.gvl, this.conversationFm, (String) null, 1);
        beginTransaction.mo165162d();
        C78538u.m94869e(this, this.contentView);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.ConvBoxServiceConversationUI);
    }
}
