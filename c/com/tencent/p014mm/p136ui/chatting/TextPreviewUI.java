package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import aw0.C103928o;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.AllRemindMsgUI;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.base.CustomScrollView;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import de3.C45331f0;
import de3.C45335p;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k20.C9557b;
import kb0.C76528a;
import mk3.C76773b;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76891l0;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C11171e;
import p215oo.C77032h;
import p629ny.C76978g;
import p629ny.C76979h;
import p910lj.C76701a;
import uo3.C78253a;
import vo3.C90852c;
import wd3.C53155r0;
import xo3.C78950d;
import xo3.C78967g;
import yk3.C79135b;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI */
public class TextPreviewUI extends BaseMvvmActivity implements C11385n {

    /* renamed from: E */
    public static final /* synthetic */ int f215355E = 0;

    /* renamed from: A */
    public C45335p f215356A = new C73293e();

    /* renamed from: B */
    public boolean f215357B = false;

    /* renamed from: C */
    public ToolsBar f215358C;

    /* renamed from: D */
    public View f215359D;

    /* renamed from: d */
    public TextView f215360d = null;

    /* renamed from: e */
    public CharSequence f215361e = null;

    /* renamed from: f */
    public int f215362f;

    /* renamed from: g */
    public C78950d f215363g;

    /* renamed from: h */
    public C78253a f215364h;

    /* renamed from: i */
    public CharSequence f215365i;

    /* renamed from: j */
    public View f215366j;

    /* renamed from: n */
    public View f215367n;

    /* renamed from: o */
    public View f215368o;

    /* renamed from: p */
    public CustomScrollView f215369p;

    /* renamed from: q */
    public Animation f215370q;

    /* renamed from: r */
    public Animation f215371r;

    /* renamed from: s */
    public int f215372s;

    /* renamed from: t */
    public C72963f4 f215373t;

    /* renamed from: u */
    public int f215374u = 0;

    /* renamed from: v */
    public boolean f215375v = false;

    /* renamed from: w */
    public boolean f215376w = false;

    /* renamed from: x */
    public String f215377x;

    /* renamed from: y */
    public boolean f215378y = false;

    /* renamed from: z */
    public boolean f215379z = false;

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$a */
    public class C73289a implements View.OnClickListener {
        public C73289a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(TextPreviewUI.this, WebViewUI.class);
            intent.putExtra("rawUrl", C75569c4.m90684q(TextPreviewUI.this.f215373t));
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            TextPreviewUI textPreviewUI = TextPreviewUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            TextPreviewUI textPreviewUI2 = textPreviewUI;
            C117292a.m165358d(textPreviewUI2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/TextPreviewUI$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            textPreviewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(textPreviewUI2, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$b */
    public class C73290b implements MenuItem.OnMenuItemClickListener {
        public C73290b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TextPreviewUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$c */
    public class C73291c implements View.OnTouchListener {
        public C73291c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                TextPreviewUI.this.f215375v = true;
            } else if (action == 1) {
                TextPreviewUI textPreviewUI = TextPreviewUI.this;
                textPreviewUI.f215375v = false;
                textPreviewUI.f215376w = false;
            } else if (action == 2) {
                TextPreviewUI textPreviewUI2 = TextPreviewUI.this;
                if (!textPreviewUI2.f215376w) {
                    textPreviewUI2.f215376w = true;
                    textPreviewUI2.f215375v = true;
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/TextPreviewUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$d */
    public class C73292d implements CustomScrollView.C57659a {
        public C73292d() {
        }

        /* renamed from: a */
        public void mo12459a(ScrollView scrollView, int i, int i2, int i3, int i4) {
            View view;
            C9557b bVar = new C9557b();
            bVar.mo10236c(scrollView);
            bVar.mo10235b(i);
            bVar.mo10235b(i2);
            bVar.mo10235b(i3);
            bVar.mo10235b(i4);
            C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$13", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", this, bVar.mo10234a());
            int i5 = i2 - i4;
            int i6 = TextPreviewUI.this.f215372s;
            if (scrollView.getChildAt(0).getMeasuredHeight() == scrollView.getHeight() + scrollView.getScrollY()) {
                TextPreviewUI.this.f215374u = scrollView.getScrollY();
            }
            if (scrollView.getScrollY() > 0) {
                int scrollY = scrollView.getScrollY();
                TextPreviewUI textPreviewUI = TextPreviewUI.this;
                int i7 = textPreviewUI.f215374u;
                if (scrollY < i7 - 10 || i7 <= 0) {
                    if (textPreviewUI.f215375v) {
                        if (i4 > i2) {
                            TextPreviewUI.m86435H7(textPreviewUI);
                        } else if (i4 < i2 && (view = textPreviewUI.f215359D) != null) {
                            view.setAnimation(textPreviewUI.f215371r);
                            View view2 = textPreviewUI.f215359D;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/TextPreviewUI", "hideToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/TextPreviewUI", "hideToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextPreviewUI.this.f215375v = false;
                    }
                    TextPreviewUI.this.f215372s = i5;
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$13", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V");
                }
            }
            TextPreviewUI.m86435H7(TextPreviewUI.this);
            TextPreviewUI.this.f215372s = i5;
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$13", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$e */
    public class C73293e implements C45335p {
        public C73293e() {
        }

        /* renamed from: a */
        public Object mo22792a(C53155r0 r0Var) {
            TextPreviewUI.this.f215379z = true;
            return null;
        }

        /* renamed from: b */
        public Object mo22793b(C53155r0 r0Var) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$f */
    public class C73294f implements ViewTreeObserver.OnPreDrawListener {
        public C73294f() {
        }

        public boolean onPreDraw() {
            TextPreviewUI.this.f215360d.getViewTreeObserver().removeOnPreDrawListener(this);
            if (TextPreviewUI.this.f215360d.getLineCount() != 1) {
                return false;
            }
            TextPreviewUI.this.f215360d.setGravity(1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$g */
    public class C73295g implements C76891l0 {
        public C73295g() {
        }

        /* renamed from: a */
        public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            TextPreviewUI.m86436I7(TextPreviewUI.this.f215373t, 7, 0);
            e0Var.clear();
            e0Var.mo107144g(0, TextPreviewUI.this.getResources().getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
            int h = C75569c4.m90675h(TextPreviewUI.this.f215373t);
            if (h <= 0 || h >= C78967g.m95477j(TextPreviewUI.this.f215360d).length()) {
                e0Var.mo107144g(1, TextPreviewUI.this.getResources().getString(C0966R.string.gs4), C0966R.raw.icons_filled_allselect);
            }
            e0Var.mo107144g(2, TextPreviewUI.this.getResources().getString(C0966R.string.f361028gs2), C0966R.raw.icons_filled_share);
            AppCompatActivity context = TextPreviewUI.this.getContext();
            TextPreviewUI textPreviewUI = TextPreviewUI.this;
            C78253a aVar = textPreviewUI.f215364h;
            Resources resources = textPreviewUI.getResources();
            TextPreviewUI textPreviewUI2 = TextPreviewUI.this;
            C79135b.m95725a(context, aVar, e0Var, resources, textPreviewUI2.f215365i, textPreviewUI2.f215373t, 4);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$h */
    public class C73296h implements View.OnCreateContextMenuListener {
        public C73296h(TextPreviewUI textPreviewUI) {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$i */
    public class C73297i implements C11184p0 {

        /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$i$a */
        public class C73298a implements Runnable {
            public C73298a() {
            }

            public void run() {
                C78950d dVar = TextPreviewUI.this.f215363g;
                if (dVar != null) {
                    dVar.mo108926j();
                }
            }
        }

        public C73297i() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                Context context = MMApplicationContext.getContext();
                CharSequence charSequence = TextPreviewUI.this.f215365i;
                ClipboardHelper.setText(context, charSequence, charSequence);
                C78950d dVar = TextPreviewUI.this.f215363g;
                if (dVar != null) {
                    dVar.mo108922f();
                    C78950d dVar2 = TextPreviewUI.this.f215363g;
                    dVar2.f231828C = true;
                    dVar2.f231829D = true;
                    dVar2.mo108921e();
                }
                TextPreviewUI textPreviewUI = TextPreviewUI.this;
                C72963f4 f4Var = textPreviewUI.f215373t;
                CharSequence charSequence2 = textPreviewUI.f215365i;
                TextPreviewUI.m86436I7(f4Var, 8, charSequence2 == null ? 0 : charSequence2.length());
                C76701a.makeText((Context) TextPreviewUI.this.getContext(), (int) C0966R.string.f7938wv, 0).show();
            } else if (itemId == 1) {
                C78950d dVar3 = TextPreviewUI.this.f215363g;
                if (dVar3 != null) {
                    dVar3.mo108921e();
                    TextPreviewUI.this.f215363g.mo108919c();
                    TextPreviewUI textPreviewUI2 = TextPreviewUI.this;
                    textPreviewUI2.f215363g.mo108923g(0, textPreviewUI2.f215360d.getText().length());
                    C78950d dVar4 = TextPreviewUI.this.f215363g;
                    dVar4.f231828C = false;
                    dVar4.f231829D = false;
                    dVar4.mo108924h();
                }
                TextPreviewUI.m86436I7(TextPreviewUI.this.f215373t, 10, 0);
                MMHandlerThread.postToMainThreadDelayed(new C73298a(), 100);
            } else if (itemId == 2) {
                TextPreviewUI.m86436I7(TextPreviewUI.this.f215373t, 9, 0);
                TextPreviewUI textPreviewUI3 = TextPreviewUI.this;
                TextPreviewUI.m86437J7(textPreviewUI3, textPreviewUI3.getContext(), TextPreviewUI.this.f215365i);
            } else if (itemId == 101) {
                TextView textView = TextPreviewUI.this.f215360d;
                boolean z = textView == null || textView.getText() == null || Util.isNullOrNil(TextPreviewUI.this.f215365i) || TextPreviewUI.this.f215360d.getText().length() == TextPreviewUI.this.f215365i.length();
                TextPreviewUI textPreviewUI4 = TextPreviewUI.this;
                Resources resources = textPreviewUI4.getResources();
                TextPreviewUI textPreviewUI5 = TextPreviewUI.this;
                C79135b.m95726b(textPreviewUI4, resources, textPreviewUI5.f215365i, textPreviewUI5.f215373t, 4, z);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$j */
    public class C73299j implements View.OnTouchListener {

        /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$j$a */
        public class C73300a implements Runnable {
            public C73300a() {
            }

            public void run() {
                TextPreviewUI.this.f215360d.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }

        public C73299j() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                TextPreviewUI.this.f215357B = true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
                TextPreviewUI textPreviewUI = TextPreviewUI.this;
                textPreviewUI.f215357B = false;
                if (textPreviewUI.f215360d.getMovementMethod() == null) {
                    TextPreviewUI.this.f215360d.post(new C73300a());
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/TextPreviewUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$k */
    public class C73301k implements C78950d.C78961k {
        public C73301k() {
        }

        /* renamed from: a */
        public void mo102127a(CharSequence charSequence) {
            TextPreviewUI textPreviewUI = TextPreviewUI.this;
            textPreviewUI.f215365i = charSequence;
            if (textPreviewUI.f215357B) {
                textPreviewUI.f215360d.setMovementMethod((MovementMethod) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$l */
    public class C73302l implements View.OnClickListener {
        public C73302l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextPreviewUI textPreviewUI = TextPreviewUI.this;
            C78950d dVar = textPreviewUI.f215363g;
            if (dVar == null) {
                textPreviewUI.finish();
            } else if (!dVar.f231828C || !dVar.f231829D) {
                dVar.mo108922f();
                C78950d dVar2 = TextPreviewUI.this.f215363g;
                dVar2.f231828C = true;
                dVar2.f231829D = true;
                dVar2.mo108921e();
            } else {
                textPreviewUI.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI$m */
    public class C73303m implements View.OnClickListener {
        public C73303m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextPreviewUI textPreviewUI = TextPreviewUI.this;
            C78950d dVar = textPreviewUI.f215363g;
            if (dVar != null) {
                if (!dVar.f231828C || !dVar.f231829D) {
                    dVar.mo108922f();
                    C78950d dVar2 = TextPreviewUI.this.f215363g;
                    dVar2.f231828C = true;
                    dVar2.f231829D = true;
                    dVar2.mo108921e();
                } else if (textPreviewUI.f215379z) {
                    textPreviewUI.f215379z = false;
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    textPreviewUI.finish();
                }
            } else if (textPreviewUI.f215379z) {
                textPreviewUI.f215379z = false;
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                textPreviewUI.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m86435H7(TextPreviewUI textPreviewUI) {
        if (textPreviewUI.f215359D != null && Util.isNullOrNil(C75569c4.m90684q(textPreviewUI.f215373t)) && !textPreviewUI.f215378y) {
            textPreviewUI.f215359D.setAnimation(textPreviewUI.f215370q);
            View view = textPreviewUI.f215359D;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/TextPreviewUI", "showToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/TextPreviewUI", "showToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: I7 */
    public static void m86436I7(C72963f4 f4Var, int i, int i2) {
        int i3;
        if (f4Var != null && (i3 = C75569c4.m90676i(f4Var)) > 0) {
            MessageSecurityInterceptStruct messageSecurityInterceptStruct = new MessageSecurityInterceptStruct();
            int i4 = 0;
            int i5 = C72996z1.m85820U5(f4Var.mo108768t()) || C72996z1.m85847r5(f4Var.mo108768t()) ? 2 : 1;
            if (f4Var.mo108769t2() == 1) {
                i4 = 1;
            }
            messageSecurityInterceptStruct.f194273f = f4Var.mo108774y2();
            messageSecurityInterceptStruct.f194271d = (long) i5;
            messageSecurityInterceptStruct.f194272e = (long) i4;
            messageSecurityInterceptStruct.f194276i = (long) i3;
            messageSecurityInterceptStruct.f194274g = (long) i;
            messageSecurityInterceptStruct.f194275h = (long) i2;
            messageSecurityInterceptStruct.mo86054n();
        }
    }

    /* renamed from: J7 */
    public static void m86437J7(TextPreviewUI textPreviewUI, Context context, CharSequence charSequence) {
        textPreviewUI.getClass();
        Intent intent = new Intent(context, MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", charSequence);
        intent.putExtra("Retr_Msg_Id", textPreviewUI.f215373t.getMsgId());
        intent.putExtra("Retr_Msg_Type", 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/TextPreviewUI", "sendMsg", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/chatting/TextPreviewUI", "sendMsg", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
    }

    /* renamed from: K7 */
    public String mo102118K7(C72963f4 f4Var) {
        C68070l.C68072b u;
        int i;
        if (f4Var.mo100993e4() || f4Var.mo100963C3()) {
            String content = f4Var.getContent();
            int t = C75604z3.m90848t(content);
            return t != -1 ? content.substring(t + 1).trim() : content;
        }
        if (f4Var.mo100977P3() || f4Var.mo100987Z3()) {
            String content2 = f4Var.getContent();
            int indexOf = f4Var.getContent().indexOf(58);
            if (indexOf != -1) {
                content2 = f4Var.getContent().substring(indexOf + 1);
            }
            if (!(content2 == null || (u = C68070l.C68072b.m80422u(content2, f4Var.mo108775z2())) == null || ((i = u.f195582i) != 53 && i != 57))) {
                return u.f195570f;
            }
        }
        String H7 = AllRemindMsgUI.m66358H7(getContext(), f4Var.getType(), f4Var.getContent(), f4Var.mo108768t(), f4Var.mo108769t2());
        Log.m105925i("MicroMsg.TextPreviewUI", "[getRemindTitle] msgId:%s type:%s title:%s", Long.valueOf(f4Var.getMsgId()), Integer.valueOf(f4Var.getType()), H7);
        return H7;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6920s9;
    }

    public final void init() {
        this.f215366j = findViewById(C0966R.C0970id.kik);
        this.f215361e = getIntent().getCharSequenceExtra("key_chat_text");
        this.f215362f = getIntent().getIntExtra("key_msg_type", 0);
        this.f215373t = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(getIntent().getLongExtra("Chat_Msg_Id", 0));
        this.f215360d = (TextView) findViewById(C0966R.C0970id.f358336eh2);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358337eh3);
        CharSequence charSequence = this.f215361e;
        String t = this.f215373t.mo108768t();
        if (charSequence instanceof String) {
            charSequence = ((String) charSequence).replaceAll(APLogFileUtil.SEPARATOR_LINE, "\n").replaceAll("\r", "\n");
        }
        String spannableString = new SpannableString(charSequence).toString();
        Bundle a = C45331f0.m50242a(getIntent().getBooleanExtra("is_group_chat", false), C76528a.m92004a(t));
        a.putString("geta8key_username", t);
        a.putInt("KMsgType", this.f215373t.getType());
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107061Zz(textView.getContext(), spannableString, (int) textView.getTextSize(), 1, a, (String) null, 1, C76979h.f224926w0, !C75569c4.m90693z(this.f215373t)));
        this.f215361e = textView.getText();
        this.f215360d.setText(C96963p0.wx0().mo83004M(getContext(), this.f215361e));
        this.f215377x = C75592q0.m90789s();
        C76773b.C76774a aVar = C76773b.f224572a;
        TextView textView2 = this.f215360d;
        C72963f4 f4Var = this.f215373t;
        aVar.mo107028a(textView2, f4Var, C72996z1.m85820U5(f4Var.mo108768t()) || C72996z1.m85847r5(f4Var.mo108768t()), this.f215377x);
        View findViewById = findViewById(C0966R.C0970id.fgi);
        this.f215367n = findViewById;
        this.f215368o = findViewById.findViewById(C0966R.C0970id.f358488ff0);
        this.f215369p = (CustomScrollView) findViewById(C0966R.C0970id.f358335eh1);
        this.f215360d.setMovementMethod(LinkMovementMethod.getInstance());
        ViewTreeObserver viewTreeObserver = this.f215360d.getViewTreeObserver();
        this.f215378y = getIntent().getBooleanExtra("key_chat_preview_hide_toolbar", false);
        viewTreeObserver.addOnPreDrawListener(new C73294f());
        this.f215370q = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2471dv);
        this.f215371r = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2469dt);
        C78253a aVar2 = new C78253a(getContext(), this.f215360d);
        this.f215364h = aVar2;
        aVar2.f229257z = true;
        aVar2.f229230F = false;
        aVar2.f229253v = new C73295g();
        aVar2.f229249r = new C73296h(this);
        aVar2.f229251t = new C73297i();
        C73299j jVar = new C73299j();
        if (this.f215363g == null && !C75569c4.m90690w(this.f215373t) && !C75569c4.m90688u(this.f215373t) && !C75569c4.m90687t(this.f215373t)) {
            C78950d.C78958h hVar = new C78950d.C78958h(this.f215360d, this.f215364h, (C78950d.C78963m) null, (View.OnClickListener) null, jVar);
            hVar.f231878g = C0966R.color.aak;
            hVar.f231877f = C0966R.color.f3274lt;
            hVar.f231880i = C74942w4.m89784a(getContext(), 20);
            C78950d dVar = new C78950d(hVar);
            this.f215363g = dVar;
            dVar.f231842d = new C73301k();
        }
        this.f215366j.setOnClickListener(new C73302l());
        this.f215360d.setOnClickListener(new C73303m());
        if (!Util.isNullOrNil(C75569c4.m90684q(this.f215373t))) {
            View view = this.f215367n;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/TextPreviewUI", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/TextPreviewUI", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f215368o.setOnClickListener(new C73289a());
        } else if (!C75569c4.m90690w(this.f215373t) && !C75569c4.m90688u(this.f215373t)) {
            if (!(this.f215362f == 1) && !C75569c4.m90687t(this.f215373t)) {
                if (!C72996z1.m85812O4(this.f215373t.mo108768t())) {
                    ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.l9h);
                    if (viewStub != null) {
                        this.f215359D = viewStub.inflate();
                    }
                    ToolsBar toolsBar = (ToolsBar) findViewById(C0966R.C0970id.kqt);
                    this.f215358C = toolsBar;
                    toolsBar.setVisibility(!this.f215378y ? 0 : 8);
                }
                ToolsBar toolsBar2 = this.f215358C;
                if (toolsBar2 != null) {
                    toolsBar2.mo102130a(0, new C74337w4(this));
                    this.f215358C.mo102130a(1, new C57812x4(this));
                    this.f215358C.mo102130a(2, new C57813y4(this));
                }
            }
        }
        setBackBtn(new C73290b());
        this.f215369p.setOnTouchListener(new C73291c());
        this.f215369p.setOnScrollChangeListener(new C73292d());
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(67109888, 67109888);
        }
        init();
        C97625j3.m125815e().mo123455a(525, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(525, this);
    }

    public void onPause() {
        super.onPause();
        C103928o.m138642b();
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f215356A);
    }

    public void onResume() {
        super.onResume();
        C103928o.m138641a(true, true, true);
        C78950d dVar = this.f215363g;
        if (dVar != null) {
            if (!dVar.f231828C) {
                dVar.mo108926j();
            }
            C78950d dVar2 = this.f215363g;
            if (!dVar2.f231829D) {
                dVar2.mo108924h();
            }
        }
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f215356A);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 525) {
                Log.m105924i("MicroMsg.TextPreviewUI", "set msg remind!");
                C75026b.m89953c(getContext(), getContext().getResources().getString(C0966R.string.fjf), "", (C75018a.C75024d) null);
            }
        } else if (yVar.getType() == 525) {
            Log.m105921e("MicroMsg.TextPreviewUI", "[setMsgRemind] scene type:%s errCode:%s, errType:%s, errMsg:%s", 525, Integer.valueOf(i2), Integer.valueOf(i), Util.nullAsNil(str));
            AppCompatActivity context = getContext();
            if (Util.isNullOrNil(str)) {
                str = getResources().getString(C0966R.string.hzc);
            }
            C76879j.m92748s(context, str, getContext().getResources().getString(C0966R.string.hzd));
            C115669n.INSTANCE.idkeyStat(795, 4, 1, false);
        }
    }
}
