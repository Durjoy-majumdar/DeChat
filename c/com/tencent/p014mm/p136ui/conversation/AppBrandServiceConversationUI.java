package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandResetAllServiceUnreadCountEvent;
import com.tencent.p014mm.autogen.events.OnWxaOptionsChangedEvent;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.ServiceNotifySettingsUI;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.C74697k;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import eb0.z3$$g;
import g62.C32330n;
import h81.C32735h;
import j20.C117292a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import kj3.C76587i;
import kj3.C88158f;
import kr0.C33993f0;
import kr0.C76629w0;
import nj3.C11184p0;
import nj3.C76879j;
import p154fy.C87121j;
import p196ln.C76705f;
import qo3.C89779i0;
import tc0.C77885p;
import te3.C50904q20;
import te3.C51163rv3;
import wc3.C78538u;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI */
public final class AppBrandServiceConversationUI extends BaseConversationUI {
    private static final String TAG = "MicroMsg.AppBrandServiceConversationUI";
    private View contentView;

    /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI */
    public static class AppBrandServiceConversationFmUI extends BaseConversationUI.BaseConversationFmUI implements C11184p0 {
        private static final int CONTEXT_MENU_LONGCLICK_ACCEPT_MSG = 1;
        private static final int CONTEXT_MENU_LONGCLICK_DELETE = 3;
        private static final int CONTEXT_MENU_LONGCLICK_DISMISS = 4;
        private static final int CONTEXT_MENU_LONGCLICK_REFUSE_MSG = 2;
        private static final String TAG = "MicroMsg.AppBrandServiceConversationFmUI";
        /* access modifiers changed from: private */
        public C74697k adapter;
        private C88158f appBrandServiceActionSheet;
        /* access modifiers changed from: private */
        public ListView appbrandMessageLV;
        /* access modifiers changed from: private */
        public C45082x0 contextMenuHelper;
        /* access modifiers changed from: private */
        public C72976h2 conversation;
        private TextView emptyTipTv;
        /* access modifiers changed from: private */
        public int fromScene;
        /* access modifiers changed from: private */
        public boolean isDeleteCancel = false;
        private String mAppId;
        /* access modifiers changed from: private */
        public String mSceneId;
        private String superUsername;
        /* access modifiers changed from: private */
        public String talker = "";
        private C89779i0 tipDialog = null;

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$a */
        public class C30846a implements Runnable {
            public C30846a(AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
            }

            public void run() {
                ((C33993f0) C86312j.m106911c(C33993f0.class)).am0((C72976h2) null);
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$AppBrandConversationAdapter */
        public static class AppBrandConversationAdapter extends C74697k {

            /* renamed from: H */
            public String f121752H;

            /* renamed from: I */
            public HashMap<String, Boolean> f121753I = new HashMap<>();

            /* renamed from: J */
            public IListener<OnWxaOptionsChangedEvent> f121754J;

            /* renamed from: K */
            public HashMap<String, String> f121755K = new HashMap<>();

            /* renamed from: L */
            public List<String> f121756L = new ArrayList();

            /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$AppBrandConversationAdapter$a */
            public class C44887a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C74697k.C74703f f121758d;

                /* renamed from: e */
                public final /* synthetic */ int f121759e;

                /* renamed from: f */
                public final /* synthetic */ int f121760f;

                public C44887a(AppBrandConversationAdapter appBrandConversationAdapter, C74697k.C74703f fVar, int i, int i2) {
                    this.f121758d = fVar;
                    this.f121759e = i;
                    this.f121760f = i2;
                }

                public void run() {
                    ViewParent parent = this.f121758d.f219645c.getParent();
                    Log.m105925i("MicroMsg.ConversationAdapter", "expected nicknameParent width: %d, nicknameParent width:%d, expected nickname width: %d, nickname width:%d", Integer.valueOf(this.f121759e), Integer.valueOf(parent instanceof View ? ((View) parent).getWidth() : 0), Integer.valueOf(this.f121760f), Integer.valueOf(this.f121758d.f219645c.getWidth()));
                }
            }

            public AppBrandConversationAdapter(Context context, String str, C6975i1.C6977b bVar) {
                super(context, bVar);
                new Paint();
                this.f121752H = str;
                C448861 r1 = new IListener<OnWxaOptionsChangedEvent>(C40008f.f107254d) {
                    {
                        this.__eventId = 495598387;
                    }

                    public boolean callback(IEvent iEvent) {
                        OnWxaOptionsChangedEvent onWxaOptionsChangedEvent = (OnWxaOptionsChangedEvent) iEvent;
                        OnWxaOptionsChangedEvent.C67747a aVar = onWxaOptionsChangedEvent.f193781d;
                        String str = aVar.f193782a;
                        if (str != null) {
                            boolean z = false;
                            Log.m105919d("MicroMsg.ConversationAdapter", "OnWxaOptionsChangedEvent event.brandId:%s,event.newValue:%d", str, Integer.valueOf(aVar.f193783b));
                            OnWxaOptionsChangedEvent.C67747a aVar2 = onWxaOptionsChangedEvent.f193781d;
                            if ((aVar2.f193783b & 2) > 0) {
                                z = true;
                            }
                            AppBrandConversationAdapter.this.f121753I.remove(aVar2.f193782a);
                            AppBrandConversationAdapter.this.f121753I.put(onWxaOptionsChangedEvent.f193781d.f193782a, Boolean.valueOf(z));
                            AppBrandConversationAdapter.this.notifyDataSetChanged();
                        } else {
                            Log.m105920e("MicroMsg.ConversationAdapter", "OnWxaOptionsChangedEvent event.brandId is null");
                        }
                        return true;
                    }
                };
                this.f121754J = r1;
                r1.alive();
            }

            /* renamed from: o */
            public void mo1333o() {
                mo7998r(((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(4, (List<String>) null, this.f121752H, -1));
                C6975i1.C6977b bVar = this.f24699h;
                if (bVar != null) {
                    bVar.mo1327a((Object) null);
                }
                notifyDataSetChanged();
            }

            /* renamed from: u */
            public void mo70183u(String str, C74697k.C74703f fVar) {
                boolean z;
                String str2;
                int i;
                float f;
                CharSequence charSequence;
                String str3 = str;
                C74697k.C74703f fVar2 = fVar;
                Boolean bool = this.f121753I.get(str3);
                if (bool == null) {
                    WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(str3);
                    z = N2 != null && (N2.field_appOpt & 2) > 0;
                    this.f121753I.put(str3, bool);
                } else {
                    z = bool.booleanValue();
                }
                String str4 = this.f121755K.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = C76587i.m92183c(C76587i.m92182b(str));
                    if (!TextUtils.isEmpty(str4)) {
                        this.f121755K.put(str3, str4);
                    }
                }
                if (!TextUtils.isEmpty(str4)) {
                    fVar2.f219646d.setVisibility(0);
                    fVar2.f219646d.setText((CharSequence) this.f24696e.getString(C0966R.string.f7878us, new Object[]{str4}));
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
                    C74697k.C74701d dVar = this.f219608p.get(str3);
                    String charSequence2 = (dVar == null || (charSequence = dVar.f219625a) == null) ? "" : charSequence.toString();
                    NoMeasuredTextView noMeasuredTextView = fVar2.f219645c;
                    float measureText = ((noMeasuredTextView == null || charSequence2 == null) ? 0.0f : noMeasuredTextView.getPaint().measureText(charSequence2)) + 48.0f;
                    NoMeasuredTextView noMeasuredTextView2 = fVar2.f219645c;
                    if (noMeasuredTextView2 == null || Util.isNullOrNil(charSequence2)) {
                        f = 0.0f;
                    } else {
                        String str5 = charSequence2.substring(0, charSequence2.offsetByCodePoints(0, 1)) + "…";
                        Log.m105924i("MicroMsg.ConversationAdapter", "getMinTextWidth, minText: " + str5);
                        f = noMeasuredTextView2.getPaint().measureText(str5);
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
                        fVar2.f219645c.post(new C44887a(this, fVar2, (int) (((float) dimensionPixelOffset4) + f2), (int) (f2 * f4)));
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
                if (z) {
                    fVar2.f219650h.setVisibility(0);
                    fVar2.f219650h.setImageResource(C85875k4.m106211z() ? C0966R.raw.chat_reject_title_icon : C0966R.raw.chat_reject_icon);
                    if (fVar2.f219646d.getVisibility() == 0) {
                        str2 = fVar2.f219645c.getText() + ", " + fVar2.f219646d.getText() + ", " + fVar2.f219647e.getText() + ", " + fVar2.f219648f.getText() + ", " + this.f24696e.getString(C0966R.string.f7754qj);
                    } else {
                        str2 = fVar2.f219645c.getText() + ", " + fVar2.f219647e.getText() + ", " + fVar2.f219648f.getText() + ", " + this.f24696e.getString(C0966R.string.f7754qj);
                    }
                    fVar2.f219643a.setContentDescription(str2);
                } else {
                    fVar2.f219650h.setVisibility(8);
                }
                String str6 = str;
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(fVar2.f219644b, str6);
                if (!((ArrayList) this.f121756L).contains(str6)) {
                    ((ArrayList) this.f121756L).add(str6);
                }
            }

            /* renamed from: w */
            public void mo70184w() {
                this.f121753I = null;
                this.f121754J.dead();
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$b */
        public class C44888b implements DialogInterface.OnCancelListener {
            public C44888b() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                boolean unused = AppBrandServiceConversationFmUI.this.isDeleteCancel = true;
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$c */
        public class C44889c implements z3$$g {

            /* renamed from: d */
            public final /* synthetic */ ProgressDialog f121762d;

            public C44889c(ProgressDialog progressDialog) {
                this.f121762d = progressDialog;
            }

            /* renamed from: b */
            public boolean mo24603b() {
                return AppBrandServiceConversationFmUI.this.isDeleteCancel;
            }

            /* renamed from: c */
            public void mo24604c() {
                ProgressDialog progressDialog = this.f121762d;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$d */
        public class C44890d implements MenuItem.OnMenuItemClickListener {
            public C44890d() {
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent(AppBrandServiceConversationFmUI.this.getContext(), ServiceNotifySettingsUI.class);
                intent.putExtra("mode", 1);
                intent.putExtra("scene_id", AppBrandServiceConversationFmUI.this.mSceneId);
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = AppBrandServiceConversationFmUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI2 = appBrandServiceConversationFmUI;
                C117292a.m165358d(appBrandServiceConversationFmUI2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appBrandServiceConversationFmUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appBrandServiceConversationFmUI2, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$e */
        public class C44891e implements MenuItem.OnMenuItemClickListener {
            public C44891e() {
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                AppBrandServiceConversationFmUI.this.finish();
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$f */
        public class C44892f implements C6975i1.C6977b {
            public C44892f() {
            }

            /* renamed from: a */
            public void mo1327a(Object obj) {
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = AppBrandServiceConversationFmUI.this;
                appBrandServiceConversationFmUI.setShowView(appBrandServiceConversationFmUI.adapter.getCount());
            }

            /* renamed from: b */
            public void mo1328b(Object obj) {
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$g */
        public class C44893g implements AdapterView.OnItemClickListener {
            public C44893g() {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Long.valueOf(j));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = AppBrandServiceConversationFmUI.this;
                C72976h2 unused = appBrandServiceConversationFmUI.conversation = (C72976h2) appBrandServiceConversationFmUI.adapter.getItem(i);
                C72976h2 access$400 = AppBrandServiceConversationFmUI.this.conversation;
                if (access$400 == null) {
                    Log.m105921e(AppBrandServiceConversationFmUI.TAG, "user should not be null. position:%d, size:%d", Integer.valueOf(i), Integer.valueOf(AppBrandServiceConversationFmUI.this.adapter.getCount()));
                    AppBrandServiceConversationFmUI.this.adapter.notifyDataSetChanged();
                    C117292a.m165361g(this, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                String unused2 = AppBrandServiceConversationFmUI.this.talker = access$400.getUsername();
                Bundle bundle = new Bundle();
                bundle.putBoolean("finish_direct", false);
                boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
                C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
                if (hVar != null) {
                    z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
                }
                Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
                if (!z) {
                    bundle.putBoolean("key_need_send_video", false);
                }
                bundle.putString("key_scene_id", AppBrandServiceConversationFmUI.this.mSceneId);
                bundle.putInt("app_brand_chatting_from_scene", AppBrandServiceConversationFmUI.this.fromScene);
                bundle.putInt("app_brand_chatting_from_scene_new", 3);
                AppBrandServiceConversationFmUI.this.f219287ui.startChatting(access$400.getUsername(), bundle, true);
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$h */
        public class C44894h implements AdapterView.OnItemLongClickListener {
            public C44894h() {
            }

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = AppBrandServiceConversationFmUI.this;
                C72976h2 unused = appBrandServiceConversationFmUI.conversation = (C72976h2) appBrandServiceConversationFmUI.adapter.getItem(i);
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI2 = AppBrandServiceConversationFmUI.this;
                String unused2 = appBrandServiceConversationFmUI2.talker = appBrandServiceConversationFmUI2.conversation.getUsername();
                C45082x0 access$700 = AppBrandServiceConversationFmUI.this.contextMenuHelper;
                AppBrandServiceConversationFmUI appBrandServiceConversationFmUI3 = AppBrandServiceConversationFmUI.this;
                access$700.mo70437c(view, i, j, appBrandServiceConversationFmUI3, appBrandServiceConversationFmUI3);
                return true;
            }
        }

        private void asyncDelMsg(String str) {
            Log.m105925i(TAG, "async del msg talker:%s", str);
            C72963f4 Rx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str);
            C50904q20 q202 = new C50904q20();
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = Util.nullAsNil(str);
            rv32.f141176e = true;
            q202.f140097d = rv32;
            q202.f140099f = Rx0.mo108774y2();
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(8, q202));
            this.isDeleteCancel = false;
            C89779i0 Q = C76879j.m92723Q(thisActivity(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C44888b());
            customerMsgOperateReport(5);
            C75604z3.m90836h(str, new C44889c(Q));
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
        }

        private void batchSyncForWxaContact() {
            List<String> list;
            C74697k kVar = this.adapter;
            if (kVar != null && kVar.getCount() != 0) {
                Log.m105925i(TAG, "batchSyncForWxaContact, size:%d", Integer.valueOf(this.adapter.getCount()));
                C74697k kVar2 = this.adapter;
                if ((kVar2 instanceof AppBrandConversationAdapter) && (list = ((AppBrandConversationAdapter) kVar2).f121756L) != null && ((ArrayList) list).size() > 0) {
                    ((C76629w0) C86312j.m106911c(C76629w0.class)).Aj0(list);
                }
            }
        }

        private void cleadAllServiceAppBrandUnreadCount() {
            new AppBrandResetAllServiceUnreadCountEvent().publish();
        }

        /* access modifiers changed from: private */
        public void delConversationAndMsg(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e(TAG, "Delete Conversation and messages fail because username is null or nil.");
                return;
            }
            asyncDelMsg(str);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str);
            ((C119157j) C119157j.f356862d).mo183875f(new C30846a(this));
        }

        private void enterConversationReport() {
            String str;
            int i;
            if (this.adapter == null) {
                Log.m105918d(TAG, "adapter is null!");
                return;
            }
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j("appbrandcustomerservicemsg");
            int G2 = (j == null || Util.isNullOrNil(j.getUsername())) ? 0 : j.mo108786G2();
            C72976h2 h2Var = (C72976h2) this.adapter.getItem(0);
            if (h2Var == null || Util.isNullOrNil(h2Var.getUsername())) {
                str = "";
            } else {
                str = Util.nullAsNil(h2Var.getContent());
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(h2Var.getUsername());
                this.mAppId = N2 == null ? null : N2.field_appId;
            }
            if (G2 > 0) {
                int count = this.adapter.getCount();
                i = 0;
                for (int i2 = 0; i2 < count; i2++) {
                    C72976h2 h2Var2 = (C72976h2) this.adapter.getItem(i2);
                    if (h2Var2.mo108786G2() + h2Var2.mo108788I2() > 0) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            Log.m105919d(TAG, "stev report(%s), sceneId : %s, unReadCount %d, unReadAppCount %d, lastPushAppId %s, lastPushMsg %s", 13797, this.mSceneId, Integer.valueOf(G2), Integer.valueOf(i), this.mAppId, str);
            C115669n.INSTANCE.mo160131h(13797, this.mSceneId, Integer.valueOf(G2), Integer.valueOf(i), this.mAppId, Long.valueOf(Util.nowSecond()), 0, str);
        }

        private String intToString(int i) {
            return new BigInteger(Integer.toBinaryString(i), 2).toString();
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

        public void customerMsgOperateReport(int i) {
            Log.m105919d(TAG, "stev report(%s), eventId : %s, appId %s, sceneId %s", 13798, Integer.valueOf(i), this.mAppId, this.mSceneId);
            C115669n.INSTANCE.mo160131h(13798, Integer.valueOf(i), this.mAppId, 0, this.mSceneId, Long.valueOf(Util.nowSecond()));
        }

        public void entryCustomerMsgDialogReport(String str, int i) {
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
            if (j == null) {
                Log.m105921e(TAG, "cvs:%s is null, error", str);
                return;
            }
            int G2 = j.mo108786G2();
            String nullAsNil = Util.nullAsNil(this.mSceneId);
            Log.m105919d(TAG, "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s", 13799, this.mAppId, Integer.valueOf(i), Integer.valueOf(G2), nullAsNil);
            C115669n.INSTANCE.mo160131h(13799, this.mAppId, Integer.valueOf(i), Integer.valueOf(G2), nullAsNil, Long.valueOf(Util.nowSecond()));
        }

        public int getLayoutId() {
            return C0966R.C0971layout.c_r;
        }

        public String getUserName() {
            return this.superUsername;
        }

        public void initView() {
            setMMTitle(getString(C0966R.string.f7645mi));
            this.appbrandMessageLV = (ListView) findViewById(C0966R.C0970id.kpr);
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
            this.emptyTipTv = textView;
            textView.setText(C0966R.string.f7671ng);
            setBackBtn(new C44891e());
            this.appBrandServiceActionSheet = new C88158f(thisActivity());
            this.adapter = new AppBrandConversationAdapter(thisActivity(), this.superUsername, new C44892f());
            this.adapter.getClass();
            this.appbrandMessageLV.setAdapter(this.adapter);
            this.contextMenuHelper = new C45082x0(thisActivity());
            this.appbrandMessageLV.setOnItemClickListener(new C44893g());
            this.appbrandMessageLV.setOnItemLongClickListener(new C44894h());
            this.adapter.getClass();
            this.adapter.getClass();
            this.adapter.getClass();
        }

        public void onActivityCreated(Bundle bundle) {
            Log.m105924i(TAG, "onActivityCreated");
            super.onActivityCreated(bundle);
            String stringExtra = getStringExtra("Contact_User");
            this.superUsername = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                this.superUsername = "appbrandcustomerservicemsg";
            }
            int intExtra = getIntExtra("app_brand_conversation_from_scene", 1);
            this.fromScene = intExtra;
            Log.m105925i(TAG, "fromScene:%d", Integer.valueOf(intExtra));
            String intToString = intToString(C97625j3.m125812b().mo105881G());
            this.mSceneId = System.currentTimeMillis() + intToString;
            initView();
            addIconOptionMenu(1, (int) C0966R.string.f7371ea, (int) C0966R.raw.app_brand_setting, (MenuItem.OnMenuItemClickListener) new C44890d());
            C97625j3.m125812b().mo105908w().add(this.adapter);
            cleadAllServiceAppBrandUnreadCount();
            enterConversationReport();
            batchSyncForWxaContact();
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            String str = this.talker;
            if (str != null && !str.isEmpty()) {
                this.talker = "";
            }
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.talker);
            if (N2 != null && (N2.field_appOpt & 2) > 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 0, C0966R.string.f7752qh);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 0, C0966R.string.f7754qj);
            }
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, C0966R.string.byd);
        }

        public void onDestroy() {
            if (C97625j3.m125811a()) {
                C97625j3.m125812b().mo105908w().remove(this.adapter);
            }
            batchSyncForWxaContact();
            C74697k kVar = this.adapter;
            if (kVar != null) {
                kVar.mo70227D();
            }
            super.onDestroy();
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.talker);
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                Log.m105920e(TAG, "changed biz stick status failed, contact is null, talker = " + this.talker);
                return;
            }
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                C88158f fVar = this.appBrandServiceActionSheet;
                fVar.f254948e = this.talker;
                fVar.f254951h = this.fromScene;
                fVar.f254950g = this.mSceneId;
                fVar.f254952i = true;
                fVar.mo122570e(3);
            } else if (itemId == 2) {
                C88158f fVar2 = this.appBrandServiceActionSheet;
                fVar2.f254948e = this.talker;
                fVar2.f254951h = this.fromScene;
                fVar2.f254950g = this.mSceneId;
                fVar2.f254952i = true;
                fVar2.mo122570e(4);
            } else if (itemId == 3) {
                delConversationAndMsg(this.talker);
            }
        }

        public void onPause() {
            Log.m105924i(TAG, "on pause");
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.superUsername);
            C74697k kVar = this.adapter;
            if (kVar != null) {
                kVar.mo103859E();
            }
            super.onPause();
        }

        public void onResume() {
            Log.m105924i(TAG, "on resume");
            C74697k kVar = this.adapter;
            if (kVar != null) {
                kVar.mo103860F();
            }
            super.onResume();
        }
    }

    public void finish() {
        super.finish();
    }

    public ChattingUIFragment getChattingUIFragment() {
        return new AppBrandServiceChattingUI.AppBrandServiceChattingFmUI();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6655kx, (ViewGroup) null);
        this.contentView = inflate;
        setContentView(inflate);
        this.conversationFm = new AppBrandServiceConversationFmUI();
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.gvl, this.conversationFm, (String) null, 1);
        beginTransaction.mo165162d();
        C78538u.m94869e(this, this.contentView);
    }
}
