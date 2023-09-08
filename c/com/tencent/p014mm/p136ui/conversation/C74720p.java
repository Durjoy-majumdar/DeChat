package com.tencent.p014mm.p136ui.conversation;

import ai3.C112789a;
import ai3.C67047d;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import bp3.C79760s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75029y;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitalk.model.C69856h;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C19615i1;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import ed0.C75610d;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import he0.C76158j;
import i61.C98602h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import js3.C60921b;
import jw0.C21287a;
import kg3.C76577a;
import kv1.C99252h;
import ls3.C34356e;
import lt0.C76723a;
import p196ln.C76705f;
import p227rn.C48053v;
import p487da.C31099b;
import p629ny.C76979h;
import p922vj.C78420a;
import t22.C77833z;
import te3.p85;
import vd2.C78384d;
import vd3.C78399i;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.conversation.p */
public class C74720p extends C75029y<String, C72976h2> implements MStorageEx.IOnStorageChange {

    /* renamed from: U0 */
    public static HashMap<String, Integer> f219683U0 = new HashMap<>();

    /* renamed from: A */
    public MMSlideDelView.C73186f f219684A = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: B */
    public C78399i f219685B;

    /* renamed from: C */
    public boolean f219686C = false;

    /* renamed from: D */
    public IListener f219687D = null;

    /* renamed from: E */
    public C74730j f219688E = null;

    /* renamed from: F */
    public boolean f219689F = false;

    /* renamed from: G */
    public HashSet<String> f219690G;

    /* renamed from: H */
    public boolean f219691H = false;

    /* renamed from: I */
    public ListView f219692I;

    /* renamed from: J */
    public HashSet<String> f219693J;

    /* renamed from: K */
    public boolean f219694K;

    /* renamed from: L */
    public boolean f219695L;

    /* renamed from: M */
    public boolean f219696M;

    /* renamed from: N */
    public FolderHelper f219697N;

    /* renamed from: P */
    public NoMeasuredTextView.C73213c f219698P;

    /* renamed from: Q */
    public String f219699Q;

    /* renamed from: Q0 */
    public long f219700Q0;

    /* renamed from: R */
    public String f219701R;

    /* renamed from: R0 */
    public boolean f219702R0;

    /* renamed from: S */
    public boolean f219703S;

    /* renamed from: S0 */
    public boolean f219704S0;

    /* renamed from: T */
    public String f219705T;

    /* renamed from: T0 */
    public boolean f219706T0;

    /* renamed from: U */
    public ColorDrawable f219707U;

    /* renamed from: V */
    public ValueAnimator f219708V;

    /* renamed from: W */
    public MStorage.IOnStorageChange f219709W;

    /* renamed from: X */
    public final C74732l f219710X;

    /* renamed from: Y */
    public final int f219711Y;

    /* renamed from: Z */
    public final int f219712Z;

    /* renamed from: p0 */
    public final int f219713p0;

    /* renamed from: w */
    public List<String> f219714w = null;

    /* renamed from: x */
    public ColorStateList[] f219715x = new ColorStateList[5];

    /* renamed from: x0 */
    public final int f219716x0;

    /* renamed from: y */
    public HashMap<String, C74731k> f219717y;

    /* renamed from: y0 */
    public C74729i f219718y0;

    /* renamed from: z */
    public boolean f219719z = true;

    /* renamed from: com.tencent.mm.ui.conversation.p$a */
    public class C74721a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ C74733m f219720d;

        public C74721a(C74733m mVar) {
            this.f219720d = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r11 = this;
                com.tencent.mm.ui.conversation.p$m r0 = r11.f219720d
                android.widget.ImageView r0 = r0.f219746a
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r11)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x002f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r0 != 0) goto L_0x0023
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r0 != 0) goto L_0x0023
                int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r3 = 788529167(0x2f00000f, float:1.1641553E-10)
                if (r0 != r3) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r0 = 0
                goto L_0x0024
            L_0x0023:
                r0 = 1
            L_0x0024:
                if (r0 != 0) goto L_0x002f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r0 = 0
                goto L_0x0030
            L_0x002f:
                r0 = 1
            L_0x0030:
                if (r0 != 0) goto L_0x003d
                int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                boolean r0 = com.tencent.p014mm.sdk.platformtools.VersionUtilities.checkAlphaVersion(r0)
                if (r0 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r0 = 0
                goto L_0x003e
            L_0x003d:
                r0 = 1
            L_0x003e:
                java.lang.Class<h81.h> r3 = h81.C32735h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                h81.h r3 = (h81.C32735h) r3
                h81.h$b r4 = h81.C32735h.C32738b.clicfg_launcher_avatar_hardware
                int r0 = r3.mo58779Qe(r4, r0)
                if (r0 != r2) goto L_0x0050
                r0 = 1
                goto L_0x0051
            L_0x0050:
                r0 = 0
            L_0x0051:
                r3 = 30
                boolean r3 = p206nj.C11171e.m11046c(r3)
                r4 = 2
                if (r3 == 0) goto L_0x0074
                boolean r3 = p156gj.C87203t.m108279o()
                if (r3 == 0) goto L_0x0074
                com.tencent.mm.ui.conversation.p$m r3 = r11.f219720d
                android.widget.ImageView r3 = r3.f219746a
                boolean r3 = r3.isHardwareAccelerated()
                if (r3 == 0) goto L_0x0074
                if (r0 == 0) goto L_0x0074
                com.tencent.mm.ui.conversation.p$m r0 = r11.f219720d
                android.widget.ImageView r0 = r0.f219746a
                r3 = 0
                r0.setLayerType(r4, r3)
            L_0x0074:
                com.tencent.mm.ui.conversation.p$m r0 = r11.f219720d
                android.widget.ImageView r0 = r0.f219746a
                int r0 = r0.getWidth()
                com.tencent.mm.ui.conversation.p r3 = com.tencent.p014mm.p136ui.conversation.C74720p.this
                android.content.Context r3 = r3.f220760h
                r5 = 2131165582(0x7f07018e, float:1.7945385E38)
                int r3 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r3, r5)
                if (r0 == r3) goto L_0x00e3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r1] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                r4[r2] = r0
                java.lang.String r0 = "MicroMsg.ConversationWithCacheAdapter"
                java.lang.String r5 = "mainUI avatar size error, avatarViewWidth:%s, avatarSettingWidth:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r4)
                com.tencent.mm.ui.conversation.p$m r4 = r11.f219720d
                android.widget.ImageView r4 = r4.f219746a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
                r4.width = r3
                r4.height = r3
                com.tencent.mm.ui.conversation.p$m r3 = r11.f219720d
                android.widget.ImageView r3 = r3.f219746a
                r3.setLayoutParams(r4)
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.tencent.mm.ui.conversation.p$m r4 = r11.f219720d
                android.widget.ImageView r4 = r4.f219746a
                int r4 = r4.getWidth()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r1] = r4
                java.lang.String r1 = "reset avatar size : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
                com.tencent.mm.ui.conversation.p r1 = com.tencent.p014mm.p136ui.conversation.C74720p.this
                boolean r1 = r1.f219702R0
                if (r1 != 0) goto L_0x00e3
                kj2.d r3 = kj2.C117407d.INSTANCE
                r4 = 1055(0x41f, double:5.21E-321)
                r6 = 4
                r8 = 1
                r10 = 0
                r3.idkeyStat(r4, r6, r8, r10)
                java.lang.String r1 = "report avatar size error !!! "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.ui.conversation.p r0 = com.tencent.p014mm.p136ui.conversation.C74720p.this
                r0.f219702R0 = r2
            L_0x00e3:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74720p.C74721a.onPreDraw():boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$b */
    public class C74722b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C74733m f219722d;

        public C74722b(C74720p pVar, C74733m mVar) {
            this.f219722d = mVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f219722d.f219762q.getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
            C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$c */
    public class C74723c implements NoMeasuredTextView.C73213c {
        public C74723c() {
        }

        /* renamed from: a */
        public CharSequence mo101876a(NoMeasuredTextView noMeasuredTextView, CharSequence charSequence, String str, int i, int i2) {
            CharSequence charSequence2;
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence;
            String str2 = str;
            float textSize = noMeasuredTextView.getPaint().getTextSize();
            int b = C76577a.m92151b(C74720p.this.f220760h, i2);
            float f = (float) b;
            noMeasuredTextView.getPaint().setTextSize(f);
            TextPaint paint = noMeasuredTextView.getPaint();
            float measureText = paint.measureText(" " + str2);
            noMeasuredTextView.getPaint().setTextSize(textSize);
            int measuredWidth = (noMeasuredTextView.getMeasuredWidth() - noMeasuredTextView.getCompoundPaddingRight()) - noMeasuredTextView.getCompoundPaddingLeft();
            double d = (double) measuredWidth;
            if (((double) measureText) >= 0.6d * d) {
                charSequence3 = TextUtils.ellipsize(charSequence4, noMeasuredTextView.getPaint(), (float) (d * 0.4d), TextUtils.TruncateAt.END);
                float measureText2 = noMeasuredTextView.getPaint().measureText(charSequence3.toString());
                noMeasuredTextView.getPaint().setTextSize(f);
                CharSequence ellipsize = TextUtils.ellipsize(str2, noMeasuredTextView.getPaint(), (((float) measuredWidth) - measureText2) - 20.0f, TextUtils.TruncateAt.END);
                noMeasuredTextView.getPaint().setTextSize(textSize);
                charSequence2 = ellipsize;
            } else {
                charSequence3 = TextUtils.ellipsize(charSequence4, noMeasuredTextView.getPaint(), ((float) measuredWidth) - measureText, TextUtils.TruncateAt.END);
                charSequence2 = str2;
            }
            Context context = C74720p.this.f220760h;
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, charSequence3 + " " + charSequence2);
            ColorStateList e = C76577a.m92154e(C74720p.this.f220760h, i);
            T1.setSpan(new TextAppearanceSpan((String) null, 0, b, e, e), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
            return T1;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$d */
    public class C74724d implements Runnable {
        public C74724d() {
        }

        public void run() {
            View view;
            C74720p pVar = C74720p.this;
            if (!(pVar.f219705T != null)) {
                Log.m105928w("MicroMsg.ConversationWithCacheAdapter", "is not need dismissClickStatus");
                return;
            }
            ValueAnimator valueAnimator = pVar.f219708V;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int i = 0;
                while (true) {
                    if (i >= pVar.f219692I.getChildCount()) {
                        Log.m105929w("MicroMsg.ConversationWithCacheAdapter", "[findClickStatusView] can't found click view! username:%s", pVar.f219705T);
                        view = null;
                        break;
                    }
                    view = pVar.f219692I.getChildAt(i);
                    if (view.getBackground() == pVar.f219707U) {
                        break;
                    }
                    i++;
                }
                if (view == null) {
                    pVar.f219705T = null;
                    return;
                }
                Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "[dismissClickStatus] %s username:%s", Integer.valueOf(view.hashCode()), pVar.f219705T);
                C74733m mVar = (C74733m) view.getTag();
                int color = view.getContext().getResources().getColor(C0966R.color.FG_3);
                int color2 = view.getContext().getResources().getColor((mVar == null || !mVar.f219758m) ? C0966R.color.f2929c : C0966R.color.amj);
                if (!C85875k4.m106208w() || !pVar.f219703S) {
                    pVar.f219707U = new ColorDrawable(C74933u4.m89765b(color, color2));
                    C76723a aVar = new C76723a(C74933u4.m89765b(color, color2), color2);
                    view.setBackgroundColor(C74933u4.m89765b(color, color2));
                    ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("ratio", new float[]{0.0f, 1.0f})});
                    ofPropertyValuesHolder.addUpdateListener(new C74738q(pVar, aVar, view));
                    ofPropertyValuesHolder.addListener(new C74741r(pVar, mVar, view));
                    if (C85875k4.m106208w()) {
                        ofPropertyValuesHolder.setDuration(10);
                    } else {
                        ofPropertyValuesHolder.setDuration(60);
                    }
                    if (pVar.f219707U != null) {
                        ofPropertyValuesHolder.start();
                        pVar.f219708V = ofPropertyValuesHolder;
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105929w("MicroMsg.ConversationWithCacheAdapter", "[dismissClickStatus] animation is running! %s", pVar.f219705T);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$e */
    public class C74725e implements MStorage.IOnStorageChange {
        public C74725e() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            C74720p.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$f */
    public class C74726f implements Runnable {
        public C74726f(C74720p pVar) {
        }

        public void run() {
            C99252h.m129300e(20);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$g */
    public class C74727g implements View.OnClickListener {
        public C74727g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = C74720p.this.f219692I;
            if (listView == null || listView.getOnItemClickListener() == null) {
                Log.m105920e("MicroMsg.ConversationWithCacheAdapter", "[onClick] pass this click");
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (view.getTag() == null) {
                Log.m105920e("MicroMsg.ConversationWithCacheAdapter", "[onClick] getTag is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C74720p.this.f219689F || C85875k4.m106208w()) {
                int headerViewsCount = ((C74733m) view.getTag()).f219759n + C74720p.this.f219692I.getHeaderViewsCount();
                AdapterView.OnItemClickListener onItemClickListener = C74720p.this.f219692I.getOnItemClickListener();
                C74720p pVar = C74720p.this;
                ListView listView2 = pVar.f219692I;
                pVar.getClass();
                onItemClickListener.onItemClick(listView2, view, headerViewsCount, 0);
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                Log.m105928w("MicroMsg.ConversationWithCacheAdapter", "[onClick] unResume");
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$h */
    public class C74728h implements View.OnLongClickListener {
        public C74728h() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            ListView listView = C74720p.this.f219692I;
            if (listView == null || listView.getOnItemLongClickListener() == null) {
                Log.m105920e("MicroMsg.ConversationWithCacheAdapter", "[onClick] pass this click");
                C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            } else if (view.getTag() == null) {
                Log.m105920e("MicroMsg.ConversationWithCacheAdapter", "[onClick] getTag is null");
                C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            } else if (!C74720p.this.f219689F) {
                Log.m105928w("MicroMsg.ConversationWithCacheAdapter", "[onClick] unResume");
                C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            } else {
                int headerViewsCount = ((C74733m) view.getTag()).f219759n + C74720p.this.f219692I.getHeaderViewsCount();
                AdapterView.OnItemLongClickListener onItemLongClickListener = C74720p.this.f219692I.getOnItemLongClickListener();
                C74720p pVar = C74720p.this;
                ListView listView2 = pVar.f219692I;
                pVar.getClass();
                boolean onItemLongClick = onItemLongClickListener.onItemLongClick(listView2, view, headerViewsCount, 0);
                C117292a.m165362h(onItemLongClick, this, "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return onItemLongClick;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$i */
    public class C74729i {
        public C74729i(C74720p pVar, C74723c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$j */
    public interface C74730j {
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$k */
    public class C74731k {

        /* renamed from: a */
        public CharSequence f219728a;

        /* renamed from: b */
        public String f219729b;

        /* renamed from: c */
        public CharSequence f219730c;

        /* renamed from: d */
        public CharSequence f219731d;

        /* renamed from: e */
        public int f219732e;

        /* renamed from: f */
        public int f219733f;

        /* renamed from: g */
        public int f219734g;

        /* renamed from: h */
        public int f219735h;

        /* renamed from: i */
        public boolean f219736i;

        /* renamed from: j */
        public boolean f219737j;

        /* renamed from: k */
        public boolean f219738k;

        /* renamed from: l */
        public boolean f219739l;

        /* renamed from: m */
        public boolean f219740m;

        /* renamed from: n */
        public boolean f219741n;

        /* renamed from: o */
        public boolean f219742o;

        public C74731k(C74720p pVar, C74723c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$l */
    public class C74732l {

        /* renamed from: a */
        public C72996z1 f219743a = null;

        /* renamed from: b */
        public String f219744b = null;

        /* renamed from: c */
        public boolean f219745c = false;

        public C74732l(C74720p pVar) {
        }

        /* renamed from: a */
        public C72996z1 mo103899a() {
            if (this.f219745c && this.f219743a == null && C97625j3.m125811a()) {
                this.f219743a = C97625j3.m125812b().mo105907v().get(this.f219744b);
            }
            return this.f219743a;
        }

        /* renamed from: b */
        public void mo103900b(String str) {
            this.f219744b = str;
            this.f219743a = null;
            this.f219745c = false;
            if (!Util.isNullOrNil(str)) {
                this.f219745c = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p$m */
    public static class C74733m {

        /* renamed from: a */
        public ImageView f219746a;

        /* renamed from: b */
        public NoMeasuredTextView f219747b;

        /* renamed from: c */
        public NoMeasuredTextView f219748c;

        /* renamed from: d */
        public ImageView f219749d;

        /* renamed from: e */
        public NoMeasuredTextView f219750e;

        /* renamed from: f */
        public TextView f219751f;

        /* renamed from: g */
        public WeImageView f219752g;

        /* renamed from: h */
        public ImageView f219753h;

        /* renamed from: i */
        public ImageView f219754i;

        /* renamed from: j */
        public WeImageView f219755j;

        /* renamed from: k */
        public View f219756k;

        /* renamed from: l */
        public String f219757l;

        /* renamed from: m */
        public boolean f219758m;

        /* renamed from: n */
        public int f219759n;

        /* renamed from: o */
        public int f219760o;

        /* renamed from: p */
        public int f219761p;

        /* renamed from: q */
        public View f219762q;

        /* renamed from: r */
        public View f219763r;

        /* renamed from: s */
        public ImageView f219764s;

        /* renamed from: t */
        public TextView f219765t;

        /* renamed from: u */
        public int f219766u;

        /* renamed from: v */
        public LinearLayout f219767v;

        /* renamed from: w */
        public LinearLayout f219768w;
    }

    public C74720p(Context context, ListView listView, FolderHelper folderHelper, C75029y.C75035d dVar) {
        super(context, 800, 2000);
        new HashMap();
        this.f219694K = false;
        this.f219695L = false;
        this.f219696M = false;
        this.f219698P = new C74723c();
        this.f219699Q = "";
        this.f219701R = "";
        this.f219703S = true;
        this.f219709W = new C74725e();
        this.f219710X = new C74732l(this);
        this.f219700Q0 = 0;
        this.f219702R0 = false;
        this.f219704S0 = false;
        this.f219706T0 = false;
        this.f219692I = listView;
        this.f219697N = folderHelper;
        this.f220756d = "MicroMsg.ConversationWithCacheAdapter";
        this.f220761i = dVar;
        this.f219715x[0] = C76577a.m92154e(context, C0966R.color.f3563xt);
        this.f219715x[1] = C76577a.m92154e(context, C0966R.color.a_3);
        this.f219715x[3] = C76577a.m92154e(context, C0966R.color.a7f);
        this.f219715x[2] = C76577a.m92154e(context, C0966R.color.f2958ae);
        this.f219715x[2] = C76577a.m92154e(context, C0966R.color.f2958ae);
        this.f219715x[4] = C76577a.m92154e(context, C0966R.color.f3563xt);
        if (C76577a.m92148D(context)) {
            this.f219712Z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3673b3);
            this.f219711Y = context.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
        } else if (C76577a.m92147C(context)) {
            this.f219712Z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3672b2);
            this.f219711Y = context.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
        } else {
            this.f219712Z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3671b1);
            this.f219711Y = context.getResources().getDimensionPixelSize(C0966R.dimen.f3675b5);
        }
        this.f219713p0 = (int) (context.getResources().getDimension(C0966R.dimen.f3925j5) + 0.5f);
        this.f219716x0 = (int) (context.getResources().getDimension(C0966R.dimen.f3901ib) + 0.5f);
        this.f219717y = new HashMap<>();
        this.f219690G = new HashSet<>();
        this.f219693J = new HashSet<>();
        ArrayList arrayList = new ArrayList();
        this.f219714w = arrayList;
        arrayList.add("qmessage");
        boolean K = mo103884K();
        this.f219696M = K;
        if (!K) {
            this.f219714w.add("appbrand_notify_message");
        }
    }

    /* renamed from: A */
    public static String m89462A(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
    }

    /* renamed from: B */
    public static void m89463B(ImageView imageView, C72976h2 h2Var) {
        if (C75610d.m90859a() != null) {
            if (((C77833z) C75610d.m90859a()).mo107954g(h2Var.getUsername())) {
                imageView.setVisibility(0);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    /* renamed from: C */
    public static void m89464C(ImageView imageView, C72976h2 h2Var) {
        Class cls = C69856h.class;
        Context context = imageView.getContext();
        if (!C72996z1.m85820U5(h2Var.getUsername()) || C86312j.m106911c(cls) == null || !((C69856h) C86312j.m106911c(cls)).mg0(h2Var.getUsername())) {
            imageView.setVisibility(8);
            return;
        }
        if (!((C69856h) C86312j.m106911c(cls)).mo96146nN() || !((C69856h) C86312j.m106911c(cls)).Bu0(h2Var.getUsername(), C75592q0.m90789s())) {
            imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_groupcall, context.getResources().getColor(C0966R.color.f3107fh)));
        } else {
            imageView.setImageResource(C0966R.raw.chatlist_multitalk_highlight_icon);
        }
        imageView.setVisibility(0);
    }

    /* renamed from: D */
    public final void mo103877D(C74733m mVar, C72976h2 h2Var) {
        if (C72996z1.m85820U5(h2Var.getUsername()) && ((C31099b) C86312j.m106911c(C31099b.class)).mo57979oe() != 0) {
            C60921b sn = ((C34356e) C86312j.m106911c(C34356e.class)).mo58238sn(h2Var.getUsername());
            int O = sn != null ? sn.mo59085O(h2Var.getUsername()) : 0;
            if (O != 0) {
                mVar.f219755j.setVisibility(0);
                if (O == 2) {
                    WeImageView weImageView = mVar.f219755j;
                    weImageView.setIconColor(C76577a.m92153d(weImageView.getContext(), C0966R.color.f3605zw));
                    return;
                }
                WeImageView weImageView2 = mVar.f219755j;
                weImageView2.setIconColor(C76577a.m92153d(weImageView2.getContext(), C0966R.color.FG_2));
                return;
            }
        }
        mVar.f219755j.setVisibility(8);
    }

    /* renamed from: E */
    public CharSequence mo103878E(C72976h2 h2Var) {
        return h2Var.getStatus() == 1 ? this.f220760h.getString(C0966R.string.gmo) : h2Var.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL ? "" : C72715f.m85112e(this.f220760h, h2Var.mo108821o2(), true);
    }

    /* renamed from: F */
    public final String mo103879F(C72976h2 h2Var) {
        Class cls = C75339i.class;
        return (h2Var.mo108832y2() != 0 || !C72996z1.m85820U5(h2Var.getUsername())) ? ((C75339i) C86312j.m106911c(cls)).getDisplayName(h2Var.mo108823q2()) : ((C75339i) C86312j.m106911c(cls)).mo62519pb(h2Var.mo108823q2(), h2Var.getUsername());
    }

    /* renamed from: G */
    public final C72976h2 mo103880G(String str, HashMap<String, C72976h2> hashMap) {
        if (hashMap != null && hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        C75029y<K, T>.f fVar = this.f220758f;
        return (C72976h2) (fVar == null ? null : fVar.f192598a.mo91039p0(str));
    }

    /* renamed from: H */
    public int mo103881H(String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02f4  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo103882I(com.tencent.p014mm.storage.C72976h2 r20, com.tencent.p014mm.p136ui.conversation.C74720p.C74731k r21, int r22, com.tencent.p014mm.p136ui.conversation.C74720p.C74732l r23, boolean r24, te3.p85 r25) {
        /*
            r19 = this;
            r9 = r19
            r2 = r20
            r4 = r22
            r8 = r25
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            int r0 = r20.mo108783D2()
            r6 = 1
            r7 = 0
            r10 = 33
            r11 = 2131101361(0x7f0606b1, float:1.781513E38)
            r12 = 101(0x65, float:1.42E-43)
            java.lang.String r13 = "MicroMsg.ConversationWithCacheAdapter"
            if (r0 != r6) goto L_0x0064
            r8.f139646d = r12
            android.content.Context r0 = r9.f220760h
            r14 = 2131834477(0x7f11366d, float:1.9302065E38)
            java.lang.String r0 = r0.getString(r14)
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r15 = r9.f220760h
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getColor(r11)
            r0.<init>(r15)
            int r15 = r14.length()
            r14.setSpan(r0, r7, r15, r10)
            r5.append(r14)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r14 = r20.getUsername()
            r0[r7] = r14
            int r14 = r20.mo108819m2()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r6] = r14
            java.lang.String r14 = "mark remittance flag conversation: %s, flag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r0)
            goto L_0x00a0
        L_0x0064:
            int r0 = r20.mo108831x2()
            if (r0 != r6) goto L_0x00a0
            r8.f139646d = r12
            android.content.Context r0 = r9.f220760h
            r14 = 2131821992(0x7f1105a8, float:1.9276743E38)
            java.lang.String r0 = r0.getString(r14)
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r15 = r9.f220760h
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getColor(r11)
            r0.<init>(r15)
            int r15 = r14.length()
            r14.setSpan(r0, r7, r15, r10)
            r5.append(r14)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r14 = r20.getUsername()
            r0[r7] = r14
            java.lang.String r14 = "mark hb flag conversation: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r0)
        L_0x00a0:
            java.lang.String r0 = r20.mo108824r2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r14 = " "
            if (r0 == 0) goto L_0x00b6
            long r15 = r20.mo108825s2()
            r17 = 0
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x011a
        L_0x00b6:
            int r0 = r20.mo108818l2()
            if (r0 <= 0) goto L_0x00c8
            int r0 = r20.mo108786G2()
            if (r0 > 0) goto L_0x011a
            int r0 = r20.mo108788I2()
            if (r0 > 0) goto L_0x011a
        L_0x00c8:
            int r0 = r20.mo108829v2()
            if (r0 != 0) goto L_0x011a
            r8.f139646d = r12
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            android.content.Context r1 = r9.f220760h
            r6 = 2131832641(0x7f112f41, float:1.9298342E38)
            java.lang.String r1 = r1.getString(r6)
            r0.<init>(r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            android.content.Context r6 = r9.f220760h
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r11)
            r1.<init>(r6)
            int r6 = r0.length()
            r0.setSpan(r1, r7, r6, r10)
            java.lang.String r1 = r20.mo108824r2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0115
            android.text.SpannableStringBuilder r1 = r0.append(r14)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r6 = r9.f220760h
            java.lang.String r2 = r20.mo108824r2()
            android.text.SpannableString r2 = r3.op0(r6, r2, r4)
            r1.append(r2)
        L_0x0115:
            android.text.SpannableStringBuilder r0 = r5.append(r0)
            return r0
        L_0x011a:
            java.lang.String r0 = r20.mo108781B2()
            int r0 = r9.mo103881H(r0)
            r10 = 10000(0x2710, float:1.4013E-41)
            if (r0 != r10) goto L_0x01c7
            boolean r0 = eb0.C45628s0.m50753R(r20)
            if (r0 != 0) goto L_0x01c7
            int r0 = r20.mo108830w2()
            if (r0 == r6) goto L_0x01c7
            int r0 = r20.mo108829v2()
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = r20.getContent()
            java.lang.String r1 = "weixin://wxpay/transfer/remindrcvmsg"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = "is transfer remind msg "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            android.text.SpannableStringBuilder r0 = r5.append(r14)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r9.f220760h
            java.lang.String r2 = r20.getContent()
            android.text.SpannableString r1 = r1.mo107080qH(r3, r2, r4)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            return r0
        L_0x0163:
            int r0 = r20.mo108831x2()
            if (r0 != r6) goto L_0x0182
            android.text.SpannableStringBuilder r0 = r5.append(r14)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r9.f220760h
            java.lang.String r2 = r20.getContent()
            android.text.SpannableString r1 = r1.mo107080qH(r3, r2, r4)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            return r0
        L_0x0182:
            int r0 = r20.mo108783D2()
            if (r0 != r6) goto L_0x01a1
            android.text.SpannableStringBuilder r0 = r5.append(r14)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r9.f220760h
            java.lang.String r2 = r20.getContent()
            android.text.SpannableString r1 = r1.mo107080qH(r3, r2, r4)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            return r0
        L_0x01a1:
            android.text.SpannableString r6 = new android.text.SpannableString
            di3.d r0 = di3.C86312j.m106911c(r3)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r1 = r9.f220760h
            java.lang.String r3 = r20.getContent()
            android.text.SpannableString r0 = r0.mo107080qH(r1, r3, r4)
            r6.<init>(r0)
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r7 = r24
            r8 = r25
            java.lang.CharSequence r0 = r1.mo103892z(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x01c7:
            java.lang.String r0 = r20.mo108781B2()
            int r0 = r9.mo103881H(r0)
            java.lang.String r10 = ""
            java.lang.String r11 = ": "
            r12 = 49
            r15 = 0
            if (r0 != r12) goto L_0x02d1
            di3.d r0 = di3.C86312j.m106911c(r1)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r12 = r20.mo108823q2()
            java.lang.String r0 = r0.getDisplayName(r12)
            java.lang.String r12 = r20.getContent()
            com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r15)
            if (r12 == 0) goto L_0x02d1
            int r15 = r12.f195582i
            r7 = 4
            if (r15 == r7) goto L_0x027c
            r7 = 5
            if (r15 == r7) goto L_0x027c
            r7 = 19
            r12 = 2131821659(0x7f11045b, float:1.9276067E38)
            if (r15 == r7) goto L_0x0247
            r6 = 40
            if (r15 == r6) goto L_0x0205
            goto L_0x02d1
        L_0x0205:
            java.lang.String r6 = r20.getContent()
            com.tencent.mm.message.o r6 = com.tencent.p014mm.message.C68075o.m80440a(r6)
            int r6 = r6.f195664b
            if (r6 != r7) goto L_0x02d1
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x021e
            android.content.Context r0 = r9.f220760h
            java.lang.String r0 = r0.getString(r12)
            goto L_0x0236
        L_0x021e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r11)
            android.content.Context r0 = r9.f220760h
            java.lang.String r0 = r0.getString(r12)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L_0x0236:
            r2.mo108794O2(r0)
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r9.f220760h
            android.text.SpannableString r0 = r6.op0(r7, r0, r4)
            goto L_0x02d2
        L_0x0247:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x0254
            android.content.Context r0 = r9.f220760h
            java.lang.String r0 = r0.getString(r12)
            goto L_0x026c
        L_0x0254:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r11)
            android.content.Context r0 = r9.f220760h
            java.lang.String r0 = r0.getString(r12)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L_0x026c:
            r2.mo108794O2(r0)
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r9.f220760h
            android.text.SpannableString r0 = r6.op0(r7, r0, r4)
            goto L_0x02d2
        L_0x027c:
            java.lang.String r0 = r20.mo108822p2()     // Catch:{ Exception -> 0x028f }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x028f }
            java.lang.String r6 = r19.mo103879F(r20)     // Catch:{ Exception -> 0x028f }
            r15 = 0
            r7[r15] = r6     // Catch:{ Exception -> 0x028f }
            java.lang.String r0 = java.lang.String.format(r0, r7)     // Catch:{ Exception -> 0x028f }
            goto L_0x0297
        L_0x028f:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r10, r7)
            r0 = 0
        L_0x0297:
            android.content.Context r6 = r9.f220760h
            int r7 = r12.f195582i
            r15 = 4
            if (r7 != r15) goto L_0x02a2
            r7 = 2131821728(0x7f1104a0, float:1.9276207E38)
            goto L_0x02a5
        L_0x02a2:
            r7 = 2131821721(0x7f110499, float:1.9276193E38)
        L_0x02a5:
            java.lang.String r6 = r6.getString(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r15 == 0) goto L_0x02b5
            r0 = r6
        L_0x02b5:
            r7.append(r0)
            r7.append(r14)
            java.lang.String r0 = r12.f195570f
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r9.f220760h
            android.text.SpannableString r0 = r6.mo107080qH(r7, r0, r4)
            goto L_0x02d2
        L_0x02d1:
            r0 = 0
        L_0x02d2:
            java.lang.String r6 = r20.mo108781B2()
            int r6 = r9.mo103881H(r6)
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r7 = 47
            r12 = 49
            if (r6 != r12) goto L_0x039f
            java.lang.String r6 = r20.getContent()
            r12 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r12)
            if (r6 == 0) goto L_0x039f
            int r12 = r6.f195582i
            r15 = 6
            if (r12 == r15) goto L_0x0354
            if (r12 == r7) goto L_0x0314
            r1 = 74
            if (r12 == r1) goto L_0x0354
            r1 = 98
            if (r12 == r1) goto L_0x0300
            goto L_0x039f
        L_0x0300:
            java.lang.Class<hg.d> r0 = p548hg.C98450d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.d r0 = (p548hg.C98450d) r0
            android.content.Context r1 = r9.f220760h
            java.lang.String r6 = r20.getContent()
            java.lang.String r0 = r0.mo137797al(r1, r6)
            goto L_0x039f
        L_0x0314:
            java.lang.String r12 = r20.mo108822p2()
            java.lang.String r13 = "{recver}"
            boolean r15 = r12.contains(r13)
            if (r15 == 0) goto L_0x039f
            java.lang.String r15 = r6.f195591k0
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x039f
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r15 != 0) goto L_0x039f
            di3.d r0 = di3.C86312j.m106911c(r1)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r1 = r6.f195591k0
            java.lang.String r0 = r0.getDisplayName(r1)
            java.lang.String r0 = r12.replace(r13, r0)
            android.text.SpannableString r1 = new android.text.SpannableString
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r12 = r9.f220760h
            float r13 = (float) r4
            r15 = 0
            android.text.SpannableString r0 = r6.mo107070jH(r12, r0, r13, r15)
            r1.<init>(r0)
            r0 = r1
            goto L_0x039f
        L_0x0354:
            java.lang.String r0 = r20.mo108822p2()     // Catch:{ Exception -> 0x0367 }
            r1 = 1
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0367 }
            java.lang.String r1 = r19.mo103879F(r20)     // Catch:{ Exception -> 0x0367 }
            r15 = 0
            r12[r15] = r1     // Catch:{ Exception -> 0x0367 }
            java.lang.String r12 = java.lang.String.format(r0, r12)     // Catch:{ Exception -> 0x0367 }
            goto L_0x036f
        L_0x0367:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r12 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r10, r12)
            r12 = 0
        L_0x036f:
            android.content.Context r0 = r9.f220760h
            r1 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x0384
            r12 = r0
        L_0x0384:
            r1.append(r12)
            r1.append(r14)
            java.lang.String r0 = r6.f195570f
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            di3.d r1 = di3.C86312j.m106911c(r3)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r6 = r9.f220760h
            android.text.SpannableString r0 = r1.mo107080qH(r6, r0, r4)
        L_0x039f:
            java.lang.String r1 = r20.mo108822p2()
            if (r1 == 0) goto L_0x03c0
            java.lang.String r6 = "<img src=\"original_label.png\"/>  "
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L_0x03c0
            android.text.SpannableString r0 = new android.text.SpannableString
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r12 = r9.f220760h
            float r13 = (float) r4
            r15 = 0
            android.text.SpannableString r1 = r6.mo107070jH(r12, r1, r13, r15)
            r0.<init>(r1)
        L_0x03c0:
            java.lang.String r1 = r20.getUsername()
            java.lang.String r6 = "qqmail"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x03f2
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r6 = r6.mo105906u()
            r12 = 17
            r13 = 0
            java.lang.Object r6 = r6.mo119684e(r12, r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r6)
            r12 = 1
            if (r6 != r12) goto L_0x03e6
            r6 = 1
            goto L_0x03e7
        L_0x03e6:
            r6 = 0
        L_0x03e7:
            if (r6 != 0) goto L_0x03f2
            android.content.Context r0 = r9.f220760h
            r6 = 2131836253(0x7f113d5d, float:1.9305668E38)
            java.lang.String r0 = r0.getString(r6)
        L_0x03f2:
            java.lang.String r6 = "tmessage"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0421
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.p r1 = r1.mo105877C()
            com.tencent.mm.storage.s4 r1 = (com.tencent.p014mm.storage.C44667s4) r1
            java.lang.String r6 = "@t.qq.com"
            com.tencent.mm.storage.r4 r1 = r1.mo69821jo(r6)
            if (r1 == 0) goto L_0x0415
            boolean r1 = r1.mo69814c()
            if (r1 == 0) goto L_0x0415
            r1 = 1
            goto L_0x0416
        L_0x0415:
            r1 = 0
        L_0x0416:
            if (r1 != 0) goto L_0x0421
            android.content.Context r0 = r9.f220760h
            r1 = 2131836254(0x7f113d5e, float:1.930567E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x0421:
            java.lang.String r1 = r20.mo108781B2()
            if (r1 == 0) goto L_0x043b
            java.lang.String r1 = r20.mo108781B2()
            r6 = 64
            java.lang.String r6 = java.lang.String.valueOf(r6)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x043b
            java.lang.String r0 = r20.getContent()
        L_0x043b:
            java.lang.String r1 = r20.mo108781B2()
            if (r1 == 0) goto L_0x0538
            java.lang.String r1 = r20.mo108781B2()
            java.lang.String r6 = java.lang.String.valueOf(r7)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0460
            java.lang.String r1 = r20.mo108781B2()
            r6 = 1048625(0x100031, float:1.469437E-39)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0538
        L_0x0460:
            java.lang.String r1 = r20.mo108822p2()
            java.lang.String r1 = m89462A(r1)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r7 = "]"
            java.lang.String r12 = "["
            if (r6 != 0) goto L_0x0486
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L_0x050c
        L_0x0486:
            java.lang.String r1 = r20.mo108822p2()
            if (r1 == 0) goto L_0x050c
            java.lang.String r1 = r20.mo108822p2()
            java.lang.String r6 = ":"
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x050c
            java.lang.String r1 = r20.mo108822p2()
            java.lang.String r13 = r20.mo108822p2()
            int r13 = r13.indexOf(r6)
            r15 = 0
            java.lang.String r1 = r1.substring(r15, r13)
            java.lang.String r13 = r20.mo108822p2()
            java.lang.String r15 = r20.mo108822p2()
            int r6 = r15.indexOf(r6)
            r15 = 1
            int r6 = r6 + r15
            java.lang.String r6 = r13.substring(r6)
            java.lang.String r6 = r6.replace(r14, r10)
            java.lang.String r6 = m89462A(r6)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r10 != 0) goto L_0x050b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r6)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 == 0) goto L_0x04ee
            di3.d r0 = di3.C86312j.m106911c(r3)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r6 = r9.f220760h
            android.text.SpannableString r0 = r0.op0(r6, r1, r4)
            goto L_0x050b
        L_0x04ee:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            di3.d r7 = di3.C86312j.m106911c(r3)
            ny.h r7 = (p629ny.C76979h) r7
            android.content.Context r10 = r9.f220760h
            android.text.SpannableString r7 = r7.op0(r10, r1, r4)
            r6.append(r7)
            r6.append(r11)
            r6.append(r0)
            r10 = r1
            r0 = r6
            goto L_0x050c
        L_0x050b:
            r10 = r1
        L_0x050c:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r1 == 0) goto L_0x0544
            android.content.Context r1 = r9.f220760h
            r6 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r1 = r1.getString(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r6 == 0) goto L_0x0522
            goto L_0x0534
        L_0x0522:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            r6.append(r11)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
        L_0x0534:
            r2.mo108794O2(r1)
            goto L_0x0544
        L_0x0538:
            di3.d r1 = di3.C86312j.m106911c(r3)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r6 = r9.f220760h
            android.text.SpannableString r0 = r1.op0(r6, r0, r4)
        L_0x0544:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r1 == 0) goto L_0x05e3
            java.lang.String r0 = r20.mo108822p2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x05b1
            java.lang.String r0 = r20.mo108781B2()
            int r0 = r9.mo103881H(r0)
            r1 = 975175729(0x3a200031, float:6.103544E-4)
            if (r0 == r1) goto L_0x0569
            r1 = 973078577(0x3a000031, float:4.882841E-4)
            if (r0 != r1) goto L_0x0567
            goto L_0x0569
        L_0x0567:
            r6 = 0
            goto L_0x056a
        L_0x0569:
            r6 = 1
        L_0x056a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x05b1
            java.lang.String r0 = r20.mo108823q2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x05ac
            java.lang.String r0 = r19.mo103879F(r20)
            java.lang.String r1 = r20.mo108822p2()     // Catch:{ Exception -> 0x0591 }
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0591 }
            r7 = 0
            r6[r7] = r0     // Catch:{ Exception -> 0x0591 }
            java.lang.String r0 = java.lang.String.format(r1, r6)     // Catch:{ Exception -> 0x0591 }
            goto L_0x05cb
        L_0x0591:
            int r0 = r20.mo108832y2()
            java.lang.String r1 = r20.getUsername()
            java.lang.String r6 = r20.getContent()
            java.lang.String r7 = r20.mo108781B2()
            int r7 = r9.mo103881H(r7)
            android.content.Context r10 = r9.f220760h
            java.lang.String r0 = p875ci.C67379u.m79745j(r0, r1, r6, r7, r10)
            goto L_0x05cb
        L_0x05ac:
            java.lang.String r0 = r20.mo108822p2()
            goto L_0x05cb
        L_0x05b1:
            int r0 = r20.mo108832y2()
            java.lang.String r1 = r20.getUsername()
            java.lang.String r6 = r20.getContent()
            java.lang.String r7 = r20.mo108781B2()
            int r7 = r9.mo103881H(r7)
            android.content.Context r10 = r9.f220760h
            java.lang.String r0 = p875ci.C67379u.m79745j(r0, r1, r6, r7, r10)
        L_0x05cb:
            java.lang.String r0 = r0.toString()
            r1 = 10
            r6 = 32
            java.lang.String r0 = r0.replace(r1, r6)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r3 = r9.f220760h
            android.text.SpannableString r0 = r1.op0(r3, r0, r4)
        L_0x05e3:
            r6 = r0
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r7 = r24
            r8 = r25
            java.lang.CharSequence r0 = r1.mo103892z(r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74720p.mo103882I(com.tencent.mm.storage.h2, com.tencent.mm.ui.conversation.p$k, int, com.tencent.mm.ui.conversation.p$l, boolean, te3.p85):java.lang.CharSequence");
    }

    /* renamed from: J */
    public final int mo103883J(C72976h2 h2Var) {
        if (h2Var != null && h2Var.mo108372k3(128)) {
            return h2Var.mo108372k3(256) ? 1 : 0;
        }
        if (h2Var == null || h2Var.mo108786G2() <= 0) {
            if (h2Var == null || ((!h2Var.mo108372k3(8388608) && !h2Var.mo108372k3(2097152)) || h2Var.mo108788I2() <= 0)) {
                return (h2Var == null || !C72996z1.m85845p5(h2Var.getUsername()) || h2Var.mo108788I2() <= 0) ? 0 : 1;
            }
            return 1;
        } else if (C72996z1.m85813P4(h2Var.getUsername())) {
            return 1;
        } else {
            if (C72996z1.m85841l5(h2Var.getUsername())) {
                return (h2Var.mo108372k3(16) || h2Var.mo108372k3(64)) ? 1 : 0;
            }
            if (C72996z1.m85840k5(h2Var.getUsername()) && !C97625j3.m125812b().mo105906u().mo119686g(C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
                return 1;
            }
            if (C72996z1.m85808L4(h2Var.getUsername()) && !C97625j3.m125812b().mo105906u().mo119686g(C72994y1.C72995a.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
                return 1;
            }
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(h2Var.getUsername());
            if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                if (C45628s0.m50746K(z1Var)) {
                    if ((z1Var.getType() & 1024) == 0) {
                        return 1;
                    }
                }
                if (C72996z1.m85820U5(h2Var.getUsername()) && z1Var.f149512S == 0) {
                    return 1;
                }
            }
            if (C72996z1.m85806K4(h2Var.getUsername())) {
                return 1;
            }
            return C72996z1.m85828Z4(h2Var.getUsername()) ? 0 : 2;
        }
    }

    /* renamed from: K */
    public final boolean mo103884K() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_notify_msg_enable, false);
        Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "isShowAppBrandNotifyMsgEntry: %b", Boolean.valueOf(wf));
        return wf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0224  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo103885L(android.view.View r20, int r21, java.lang.String r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r4 = r0.f219705T
            java.lang.String r5 = "MicroMsg.ConversationWithCacheAdapter"
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x002a
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r4 != 0) goto L_0x002a
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r1[r8] = r2
            r1[r7] = r3
            java.lang.String r2 = "[onClickItem] has click! position:%s username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r2, r1)
            return
        L_0x002a:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            r4[r8] = r9
            r4[r7] = r3
            java.lang.String r9 = "[onClickItem] position:%s username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r4)
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r22)
            if (r4 == 0) goto L_0x0045
            com.tencent.mm.ui.conversation.FolderHelper r1 = r0.f219697N
            r1.mo103800w()
            return
        L_0x0045:
            r0.f219705T = r3
            java.lang.Object r4 = r20.getTag()
            com.tencent.mm.ui.conversation.p$m r4 = (com.tencent.p014mm.p136ui.conversation.C74720p.C74733m) r4
            android.content.Context r5 = r20.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r5 = r5.getColor(r9)
            android.content.Context r9 = r20.getContext()
            android.content.res.Resources r9 = r9.getResources()
            if (r4 == 0) goto L_0x006e
            boolean r10 = r4.f219758m
            if (r10 == 0) goto L_0x006e
            r10 = 2131101024(0x7f060560, float:1.7814446E38)
            goto L_0x0071
        L_0x006e:
            r10 = 2131099650(0x7f060002, float:1.781166E38)
        L_0x0071:
            int r9 = r9.getColor(r10)
            boolean r10 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r10 == 0) goto L_0x0094
            android.content.Context r9 = r20.getContext()
            android.content.res.Resources r9 = r9.getResources()
            if (r4 == 0) goto L_0x008d
            boolean r10 = r4.f219758m
            if (r10 == 0) goto L_0x008d
            r10 = 2131100336(0x7f0602b0, float:1.781305E38)
            goto L_0x0090
        L_0x008d:
            r10 = 2131100362(0x7f0602ca, float:1.7813103E38)
        L_0x0090:
            int r9 = r9.getColor(r10)
        L_0x0094:
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            int r5 = com.tencent.p014mm.p136ui.C74933u4.m89765b(r5, r9)
            r10.<init>(r5)
            r0.f219707U = r10
            r1.setBackground(r10)
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r1 == 0) goto L_0x00ab
            r19.notifyDataSetChanged()
        L_0x00ab:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85806K4(r22)
            if (r1 == 0) goto L_0x00e0
            ai3.a r1 = r0.getItem(r2)
            com.tencent.mm.storage.h2 r1 = (com.tencent.p014mm.storage.C72976h2) r1
            java.lang.Class<kr0.j0> r5 = kr0.C76626j0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kr0.j0 r5 = (kr0.C76626j0) r5
            f40.e r9 = f40.C86709a0.m107523b()
            int r9 = r9.mo121110g()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            r5.mo56476VX(r9)
            kr0.j0$a r9 = new kr0.j0$a
            int r1 = r1.mo108786G2()
            int r10 = r2 + 1
            r9.<init>(r1, r10)
            r5.t80(r9)
        L_0x00e0:
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            boolean r1 = r1.mo69753Y(r3)
            if (r1 == 0) goto L_0x00fb
            ai3.a r1 = r0.getItem(r2)
            com.tencent.mm.storage.h2 r1 = (com.tencent.p014mm.storage.C72976h2) r1
            com.tencent.mm.ui.conversation.FolderHelper r5 = r0.f219697N
            r5.mo103782d(r1)
        L_0x00fb:
            com.tencent.mm.ui.conversation.FolderHelper r1 = r0.f219697N
            java.util.Collection r1 = r1.mo103792o()
            com.tencent.mm.ui.conversation.FolderHelper r5 = r0.f219697N
            int r5 = r5.f219423y
            android.widget.ListView r9 = r0.f219692I
            r10 = 4
            if (r3 == 0) goto L_0x0235
            if (r1 == 0) goto L_0x0235
            if (r9 == 0) goto L_0x0235
            int r9 = eb0.C45629t0.m50816c(r22)
            if (r9 == r7) goto L_0x0125
            if (r9 == r6) goto L_0x0125
            r6 = 3
            if (r9 == r6) goto L_0x011d
            if (r9 == r10) goto L_0x011d
            goto L_0x0235
        L_0x011d:
            boolean r6 = eb0.C45628s0.m50739D(r22)
            r6 = r6 ^ r7
            r11 = 2
            goto L_0x012b
        L_0x0125:
            boolean r6 = eb0.C45628s0.m50747L(r22)
            r11 = 1
        L_0x012b:
            java.util.Iterator r9 = r1.iterator()
        L_0x012f:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x0148
            java.lang.Object r16 = r9.next()
            r17 = r16
            com.tencent.mm.storage.h2 r17 = (com.tencent.p014mm.storage.C72976h2) r17
            java.lang.String r13 = r17.getUsername()
            boolean r13 = gy3.C87412m.m108589b(r13, r3)
            if (r13 == 0) goto L_0x012f
            goto L_0x014a
        L_0x0148:
            r16 = 0
        L_0x014a:
            com.tencent.mm.storage.h2 r16 = (com.tencent.p014mm.storage.C72976h2) r16
            if (r16 == 0) goto L_0x0153
            int r9 = r16.mo108786G2()
            goto L_0x0154
        L_0x0153:
            r9 = 0
        L_0x0154:
            if (r16 == 0) goto L_0x015b
            int r13 = r16.mo108788I2()
            goto L_0x015c
        L_0x015b:
            r13 = 0
        L_0x015c:
            int r9 = r9 + r13
            java.lang.String r13 = "message_fold_config2"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            java.lang.String r15 = "fold_button_status_int_sync"
            r8 = 65536(0x10000, float:9.18355E-41)
            int r14 = r14.decodeInt(r15, r8)
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r10) goto L_0x0171
            r10 = 1
            goto L_0x0172
        L_0x0171:
            r10 = 0
        L_0x0172:
            eb0.c r14 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r14 = r14.mo105908w()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            boolean r14 = r14.mo69755a0(r3)
            com.tencent.mm.autogen.mmdata.rpt.MainFrameEnterSessionStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.MainFrameEnterSessionStruct
            r8.<init>()
            r8.f194261d = r11
            java.lang.String r11 = "ChatName"
            java.lang.String r3 = r8.mo86045b(r11, r3, r7)
            r8.f194262e = r3
            if (r14 == 0) goto L_0x0194
            r11 = 1
            goto L_0x0196
        L_0x0194:
            r11 = 0
        L_0x0196:
            r8.f194263f = r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01a1:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x01c5
            java.lang.Object r11 = r1.next()
            r12 = r11
            com.tencent.mm.storage.h2 r12 = (com.tencent.p014mm.storage.C72976h2) r12
            eb0.c r18 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r18 = r18.mo105908w()
            r7 = r18
            com.tencent.mm.storage.i2 r7 = (com.tencent.p014mm.storage.C44660i2) r7
            boolean r7 = r7.mo69754Z(r12)
            if (r7 == 0) goto L_0x01c3
            r3.add(r11)
        L_0x01c3:
            r7 = 1
            goto L_0x01a1
        L_0x01c5:
            int r1 = r3.size()
            if (r10 == 0) goto L_0x01cc
            goto L_0x01cd
        L_0x01cc:
            r5 = 0
        L_0x01cd:
            int r1 = r1 + r5
            long r11 = (long) r1
            r8.f194264g = r11
            if (r10 == 0) goto L_0x01d8
            r3 = 65536(0x10000, float:9.18355E-41)
            r11 = 1
            goto L_0x0202
        L_0x01d8:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            r3 = 65536(0x10000, float:9.18355E-41)
            int r1 = r1.decodeInt(r15, r3)
            r5 = 262144(0x40000, float:3.67342E-40)
            if (r1 == r5) goto L_0x01eb
            if (r1 != r3) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r1 = 0
            goto L_0x01ec
        L_0x01eb:
            r1 = 1
        L_0x01ec:
            if (r1 == 0) goto L_0x0200
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
            int r1 = r1.decodeInt(r15, r3)
            if (r1 == r3) goto L_0x01fa
            r1 = 1
            goto L_0x01fb
        L_0x01fa:
            r1 = 0
        L_0x01fb:
            if (r1 == 0) goto L_0x0200
            r11 = 2
            goto L_0x0202
        L_0x0200:
            r11 = 0
        L_0x0202:
            r8.f194265h = r11
            if (r14 != 0) goto L_0x0217
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
            int r1 = r1.decodeInt(r15, r3)
            if (r1 == r3) goto L_0x0212
            r1 = 1
            goto L_0x0213
        L_0x0212:
            r1 = 0
        L_0x0213:
            if (r1 == 0) goto L_0x0217
            long r1 = (long) r2
            goto L_0x021a
        L_0x0217:
            r1 = 1
            int r1 = r1 + r2
            long r1 = (long) r1
        L_0x021a:
            r8.f194266i = r1
            long r1 = (long) r9
            r8.f194267j = r1
            if (r6 == 0) goto L_0x0224
            r11 = 1
            goto L_0x0226
        L_0x0224:
            r11 = 2
        L_0x0226:
            r8.f194268k = r11
            long r1 = eb0.C31543z5.m39451a()
            r8.f194269l = r1
            long r1 = com.tencent.p014mm.storage.C72975h0.f212785a
            r8.f194270m = r1
            r8.mo86054n()
        L_0x0235:
            if (r4 == 0) goto L_0x024f
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r4.f219755j
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x024f
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r4.f219755j
            android.content.Context r2 = r1.getContext()
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = kg3.C76577a.m92153d(r2, r3)
            r1.setIconColor(r2)
        L_0x024f:
            if (r4 == 0) goto L_0x029c
            android.widget.TextView r1 = r4.f219751f
            r2 = 4
            if (r1 == 0) goto L_0x0259
            r1.setVisibility(r2)
        L_0x0259:
            android.view.View r1 = r4.f219756k
            if (r1 == 0) goto L_0x029c
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r6 = r3.mo10232b()
            java.lang.String r7 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r8 = "hideRedDotTemporary"
            java.lang.String r9 = "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = 0
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r7 = "hideRedDotTemporary"
            java.lang.String r8 = "(Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x029c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74720p.mo103885L(android.view.View, int, java.lang.String):void");
    }

    /* renamed from: M */
    public void mo103886M(int i) {
        if (i >= 0 && i < getCount()) {
            C72976h2 h2Var = null;
            try {
                h2Var = (C72976h2) getItem(i);
            } catch (NullPointerException unused) {
                Log.m105929w("MicroMsg.ConversationWithCacheAdapter", "preLoad position:%s is null!", Integer.valueOf(i));
            }
            if (h2Var != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(h2Var.getUsername());
            }
        }
    }

    /* renamed from: N */
    public void mo103887N(int i) {
        if (!(this.f219705T != null)) {
            Log.m105924i("MicroMsg.ConversationWithCacheAdapter", "[requestDismissClickStatus] pass!");
        } else {
            MMHandlerThread.postToMainThreadDelayed(new C74724d(), (long) i);
        }
    }

    /* renamed from: O */
    public void mo103888O() {
        if (this.f219714w == null) {
            this.f219714w = new ArrayList();
        }
        this.f219714w.clear();
        boolean z = false;
        boolean z2 = (C75592q0.m90787q() & 32768) == 0;
        boolean z3 = (C75592q0.m90787q() & 4096) != 0;
        if (z2 && z3) {
            z = true;
        }
        if (z != this.f219695L) {
            if (z) {
                onNotifyChange(5, (MStorageEx) C97625j3.m125812b().mo105908w(), "floatbottle");
            } else {
                onNotifyChange(2, (MStorageEx) C97625j3.m125812b().mo105908w(), "floatbottle");
            }
            this.f219695L = z;
        }
        if (this.f219695L) {
            this.f219714w.add("floatbottle");
        }
        this.f219714w.add("qmessage");
        boolean K = mo103884K();
        if (K != this.f219696M) {
            if (K) {
                onNotifyChange(2, (MStorageEx) C97625j3.m125812b().mo105908w(), "appbrand_notify_message");
            } else {
                onNotifyChange(5, (MStorageEx) C97625j3.m125812b().mo105908w(), "appbrand_notify_message");
            }
            this.f219696M = K;
        }
        if (!this.f219696M) {
            this.f219714w.add("appbrand_notify_message");
        }
    }

    /* renamed from: P */
    public final void mo103889P(C74731k kVar, C72996z1 z1Var) {
        if (kVar.f219738k && Util.isNullOrNil(kVar.f219729b)) {
            kVar.f219728a = this.f220760h.getString(C0966R.string.bba);
        } else if (kVar.f219729b.equalsIgnoreCase("conversationboxservice")) {
            kVar.f219728a = this.f220760h.getString(C0966R.string.fh5);
        } else if (C72996z1.m85843n5(z1Var.getUsername())) {
            kVar.f219728a = ((C76158j) C86312j.m106911c(C76158j.class)).D30(MMApplicationContext.getContext(), kVar.f219729b, z1Var.mo73980x2(), C76577a.m92157h(this.f220760h, C0966R.dimen.f3927j7));
        } else {
            Context context = this.f220760h;
            kVar.f219728a = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, kVar.f219729b, (float) C76577a.m92157h(context, C0966R.dimen.f3927j7));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public C67047d mo103506f() {
        Log.m105918d("MicroMsg.ConversationWithCacheAdapter", "createCursor");
        C30783v3 w = C97625j3.m125812b().mo105908w();
        List<String> list = this.f219714w;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        C44660i2 i2Var = (C44660i2) w;
        i2Var.getClass();
        try {
            C79760s.m96908a("getNecessaryCursorWithConversation");
            StringBuilder sb = new StringBuilder(1024);
            sb.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef");
            sb.append(" from rconversation where ");
            sb.append(i2Var.mo69760d0());
            sb.append(Util.nullAsNil(C45628s0.m50762a(false, 1)));
            if (list != null && list.size() > 0) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    sb.append(" and rconversation.username != '");
                    sb.append((String) it.next());
                    sb.append("'");
                }
            }
            sb.append(" order by flag desc");
            Log.m105918d("MicroMsg.ConversationStorage", "getNecessaryCursorWithConversation sql " + sb.toString());
            Cursor rawQuery = i2Var.f121077c.rawQuery(sb.toString(), (String[]) null, 4);
            C79760s.m96909b();
            return (C67047d) rawQuery;
        } catch (Throwable th) {
            C79760s.m96909b();
            throw th;
        }
    }

    /* renamed from: g */
    public C75029y<String, C72976h2>.f mo103507g(C67047d dVar) {
        try {
            C79760s.m96908a("conv_adapter.createCursorWrapper()");
            return new C75029y.C75037f(dVar);
        } finally {
            C79760s.m96909b();
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v73 */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x09e5, code lost:
        if (r0 == 3) goto L_0x09e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x073d  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x07c8  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x07d6  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x07f4  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x082f  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0831  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x088a  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0896  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0918  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0923  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0939  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x095c  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0976  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0ae8  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0b08  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r40, android.view.View r41, android.view.ViewGroup r42) {
        /*
            r39 = this;
            r8 = r39
            r9 = r40
            java.lang.Class<ln.h> r10 = p196ln.C76707h.class
            com.tencent.mm.ui.conversation.p$i r0 = new com.tencent.mm.ui.conversation.p$i
            r11 = 0
            r0.<init>(r8, r11)
            r8.f219718y0 = r0
            ai3.a r0 = r39.getItem(r40)
            r12 = r0
            com.tencent.mm.storage.h2 r12 = (com.tencent.p014mm.storage.C72976h2) r12
            java.lang.String r13 = r12.getUsername()
            com.tencent.mm.ui.conversation.p$l r0 = r8.f219710X
            r0.mo103900b(r13)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f219683U0
            java.lang.Object r0 = r0.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "\n"
            java.lang.String r3 = "MicroMsg.ConversationWithCacheAdapter"
            if (r0 == 0) goto L_0x012c
            int r0 = r0.intValue()
            if (r9 == r0) goto L_0x0135
            android.util.SparseArray[] r0 = r39.mo104615n()
            java.util.HashMap r2 = r39.mo104614l()
            java.lang.StringBuffer r11 = new java.lang.StringBuffer
            r11.<init>()
            int r15 = r0.length
            r7 = 0
        L_0x0041:
            java.lang.String r6 = "]"
            java.lang.String r5 = "["
            java.lang.String r4 = ","
            if (r7 >= r15) goto L_0x0083
            r14 = r0[r7]
            r22 = r0
            r23 = r15
            r0 = 0
        L_0x0050:
            int r15 = r14.size()
            if (r0 >= r15) goto L_0x007c
            r15 = 50
            if (r0 >= r15) goto L_0x007c
            r11.append(r5)
            r11.append(r0)
            r11.append(r4)
            int r15 = r14.keyAt(r0)
            r11.append(r15)
            r11.append(r4)
            java.lang.Object r15 = r14.valueAt(r0)
            java.lang.String r15 = (java.lang.String) r15
            r11.append(r15)
            r11.append(r6)
            int r0 = r0 + 1
            goto L_0x0050
        L_0x007c:
            int r7 = r7 + 1
            r0 = r22
            r15 = r23
            goto L_0x0041
        L_0x0083:
            r11.append(r1)
            if (r2 == 0) goto L_0x00cb
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = 0
        L_0x0091:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x00c8
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r15 = 50
            if (r7 < r15) goto L_0x00a2
            goto L_0x00c8
        L_0x00a2:
            int r7 = r7 + 1
            r11.append(r5)
            java.lang.Object r15 = r14.getKey()
            r11.append(r15)
            r11.append(r4)
            java.lang.Object r15 = r14.getValue()
            if (r15 == 0) goto L_0x00c4
            java.lang.Object r14 = r14.getValue()
            com.tencent.mm.storage.h2 r14 = (com.tencent.p014mm.storage.C72976h2) r14
            java.lang.String r14 = r14.getUsername()
            r11.append(r14)
        L_0x00c4:
            r11.append(r6)
            goto L_0x0091
        L_0x00c8:
            r11.append(r1)
        L_0x00cb:
            r4 = 5
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r11.toString()
            r5 = 0
            r0[r5] = r4
            r4 = 1
            r0[r4] = r13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r40)
            r5 = 2
            r0[r5] = r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = f219683U0
            java.lang.String r4 = r4.toString()
            r5 = 3
            r0[r5] = r4
            if (r2 == 0) goto L_0x00ef
            int r2 = r2.size()
            goto L_0x00f0
        L_0x00ef:
            r2 = 0
        L_0x00f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 4
            r0[r4] = r2
            java.lang.String r2 = "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            boolean r0 = r8.f219691H
            if (r0 != 0) goto L_0x0112
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.ui.conversation.p$f r2 = new com.tencent.mm.ui.conversation.p$f
            r2.<init>(r8)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r4 = "ConvWithCacheAdapter_FTSReportApiLogic"
            r0.mo183876g(r2, r4)
            r2 = 1
            r8.f219691H = r2
            goto L_0x0113
        L_0x0112:
            r2 = 1
        L_0x0113:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f219700Q0
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0135
            r4 = 0
            r8.mo104618q(r4, r2)
            long r4 = java.lang.System.currentTimeMillis()
            r8.f219700Q0 = r4
            goto L_0x0135
        L_0x012c:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f219683U0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r40)
            r0.put(r13, r2)
        L_0x0135:
            com.tencent.mm.ui.conversation.FolderHelper r0 = r8.f219697N
            r0.getClass()
            int r2 = r12.f212787o1
            r4 = 132(0x84, float:1.85E-43)
            if (r2 != r4) goto L_0x0142
            r4 = 1
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r4 != 0) goto L_0x0152
            r4 = 66
            if (r2 != r4) goto L_0x014b
            r2 = 1
            goto L_0x014c
        L_0x014b:
            r2 = 0
        L_0x014c:
            if (r2 != 0) goto L_0x0152
            r2 = 0
            r0.mo103779a(r12, r2, r2)
        L_0x0152:
            if (r41 != 0) goto L_0x0349
            com.tencent.mm.ui.conversation.p$m r0 = new com.tencent.mm.ui.conversation.p$m
            r0.<init>()
            android.content.Context r2 = r8.f220760h
            float r4 = kg3.C76577a.m92165p(r2)
            kg3.C76577a.f224128b = r4
            float r2 = kg3.C76577a.m92173x(r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x016b
            r2 = 1
            goto L_0x016c
        L_0x016b:
            r2 = 0
        L_0x016c:
            if (r2 == 0) goto L_0x017d
            android.content.Context r2 = r8.f220760h
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r4 = 2131493999(0x7f0c046f, float:1.8611494E38)
            r5 = 0
            android.view.View r2 = r2.inflate(r4, r5)
            goto L_0x018b
        L_0x017d:
            r5 = 0
            android.content.Context r2 = r8.f220760h
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r4 = 2131493998(0x7f0c046e, float:1.8611492E38)
            android.view.View r2 = r2.inflate(r4, r5)
        L_0x018b:
            r4 = 2131315572(0x7f094b74, float:1.8249601E38)
            r5 = 2
            int[] r6 = new int[r5]
            r2.setTag(r4, r6)
            com.tencent.mm.ui.conversation.p$g r4 = new com.tencent.mm.ui.conversation.p$g
            r4.<init>()
            r2.setOnClickListener(r4)
            com.tencent.mm.ui.conversation.p$h r4 = new com.tencent.mm.ui.conversation.p$h
            r4.<init>()
            r2.setOnLongClickListener(r4)
            r4 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f219746a = r4
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            com.tencent.mm.ui.conversation.p$a r5 = new com.tencent.mm.ui.conversation.p$a
            r5.<init>(r0)
            r4.addOnPreDrawListener(r5)
            r4 = 2131300458(0x7f09106a, float:1.8218946E38)
            android.view.View r4 = r2.findViewById(r4)
            r0.f219762q = r4
            r4 = 2131300457(0x7f091069, float:1.8218944E38)
            android.view.View r5 = r2.findViewById(r4)
            r0.f219763r = r5
            r5 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r5 = r2.findViewById(r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r5 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r5
            r0.f219747b = r5
            com.tencent.mm.ui.base.NoMeasuredTextView$c r6 = r8.f219698P
            r5.setLayoutCallback(r6)
            r5 = 2131315971(0x7f094d03, float:1.825041E38)
            android.view.View r5 = r2.findViewById(r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r5 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r5
            r0.f219748c = r5
            r5 = 2131306983(0x7f0929e7, float:1.823218E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f219749d = r5
            r5 = 2131306982(0x7f0929e6, float:1.8232178E38)
            android.view.View r5 = r2.findViewById(r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r5 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r5
            r0.f219750e = r5
            r5 = 2131315309(0x7f094a6d, float:1.8249068E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f219751f = r5
            r5 = 2131306321(0x7f092751, float:1.8230838E38)
            android.view.View r5 = r2.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f219752g = r5
            r5 = 2131297488(0x7f0904d0, float:1.8212922E38)
            android.view.View r5 = r2.findViewById(r5)
            r0.f219756k = r5
            r5 = 2131308093(0x7f092e3d, float:1.8234432E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f219753h = r5
            r5 = 2131309701(0x7f093485, float:1.8237693E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f219754i = r5
            r5 = 2131312619(0x7f093feb, float:1.8243612E38)
            android.view.View r5 = r2.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f219755j = r5
            r5 = 2131313096(0x7f0941c8, float:1.824458E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f219764s = r5
            r5 = 2131305053(0x7f09225d, float:1.8228266E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f219765t = r5
            android.view.View r4 = r2.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f219767v = r4
            r4 = 2131300455(0x7f091067, float:1.821894E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f219768w = r4
            android.widget.TextView r4 = r0.f219751f
            android.content.Context r5 = r8.f220760h
            int r5 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r5)
            r4.setBackgroundResource(r5)
            android.widget.TextView r4 = r0.f219751f
            android.content.Context r5 = r8.f220760h
            r6 = 2131167343(0x7f07086f, float:1.7948957E38)
            int r5 = kg3.C76577a.m92155f(r5, r6)
            float r5 = (float) r5
            android.content.Context r6 = r8.f220760h
            float r6 = kg3.C76577a.m92161l(r6)
            float r5 = r5 * r6
            r6 = 0
            r4.setTextSize(r6, r5)
            r2.setTag(r0)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219750e
            android.content.Context r5 = r8.f220760h
            r7 = 2131165650(0x7f0701d2, float:1.7945523E38)
            int r5 = kg3.C76577a.m92157h(r5, r7)
            float r5 = (float) r5
            r4.mo153549i(r6, r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219748c
            android.content.Context r5 = r8.f220760h
            r7 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r5 = kg3.C76577a.m92157h(r5, r7)
            float r5 = (float) r5
            r4.mo153549i(r6, r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219747b
            android.content.Context r5 = r8.f220760h
            r7 = 2131165591(0x7f070197, float:1.7945403E38)
            int r5 = kg3.C76577a.m92157h(r5, r7)
            float r5 = (float) r5
            r4.mo153549i(r6, r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219747b
            r4.getTextSize()
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219750e
            android.content.res.ColorStateList[] r5 = r8.f219715x
            r5 = r5[r6]
            r4.setTextColor((android.content.res.ColorStateList) r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219748c
            android.content.res.ColorStateList[] r5 = r8.f219715x
            r6 = 4
            r5 = r5[r6]
            r4.setTextColor((android.content.res.ColorStateList) r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219747b
            android.content.res.ColorStateList[] r5 = r8.f219715x
            r6 = 3
            r5 = r5[r6]
            r4.setTextColor((android.content.res.ColorStateList) r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219750e
            r5 = 1
            r4.setShouldEllipsize(r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219748c
            r6 = 0
            r4.setShouldEllipsize(r6)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219747b
            r4.setShouldEllipsize(r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219747b
            android.text.TextPaint r4 = r4.getPaint()
            if (r4 == 0) goto L_0x0301
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219747b
            android.text.TextPaint r4 = r4.getPaint()
            r5 = 1036831949(0x3dcccccd, float:0.1)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r5)
        L_0x0301:
            java.lang.String r4 = r12.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85828Z4(r4)
            if (r4 == 0) goto L_0x0310
            int r4 = r8.f219716x0
            r0.f219760o = r4
            goto L_0x0314
        L_0x0310:
            int r4 = r8.f219713p0
            r0.f219760o = r4
        L_0x0314:
            com.tencent.mm.ui.conversation.FolderHelper r4 = r8.f219697N
            int r4 = r4.f219403J
            r0.f219761p = r4
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r0.f219748c
            r5 = 5
            r4.setGravity(r5)
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r40)
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = r12.getUsername()
            r6 = 1
            r5[r6] = r4
            java.lang.String r4 = r12.mo108782C2()
            r6 = 2
            r5[r6] = r4
            int r4 = r12.f212787o1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 3
            r5[r6] = r4
            java.lang.String r4 = "[getNewView] position=%s, username=%s, parentRef=%s, foldFlag=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            r14 = r0
            r11 = r2
            goto L_0x0352
        L_0x0349:
            java.lang.Object r0 = r41.getTag()
            com.tencent.mm.ui.conversation.p$m r0 = (com.tencent.p014mm.p136ui.conversation.C74720p.C74733m) r0
            r11 = r41
            r14 = r0
        L_0x0352:
            java.lang.String r0 = r12.getUsername()
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.p$k> r2 = r8.f219717y
            r5 = -1
            if (r2 == 0) goto L_0x036c
            java.lang.Object r2 = r2.get(r0)
            com.tencent.mm.ui.conversation.p$k r2 = (com.tencent.p014mm.p136ui.conversation.C74720p.C74731k) r2
            if (r2 == 0) goto L_0x036c
            r6 = r2
            r29 = r11
            r15 = r12
            r7 = 2
            r11 = 0
            goto L_0x04ec
        L_0x036c:
            com.tencent.mm.ui.conversation.p$k r2 = new com.tencent.mm.ui.conversation.p$k
            r4 = 0
            r2.<init>(r8, r4)
            com.tencent.mm.ui.conversation.p$l r4 = r8.f219710X
            r4.mo103900b(r0)
            com.tencent.mm.ui.conversation.p$l r4 = r8.f219710X
            com.tencent.mm.storage.z1 r4 = r4.mo103899a()
            if (r4 == 0) goto L_0x0389
            int r15 = r4.f149511R0
            r2.f219734g = r15
            long r6 = r4.f108320R1
            int r7 = (int) r6
            r2.f219733f = r7
            goto L_0x038d
        L_0x0389:
            r2.f219734g = r5
            r2.f219733f = r5
        L_0x038d:
            if (r4 == 0) goto L_0x0391
            r6 = 1
            goto L_0x0392
        L_0x0391:
            r6 = 0
        L_0x0392:
            r2.f219741n = r6
            if (r4 == 0) goto L_0x039c
            int r6 = r4.f149512S
            if (r6 != 0) goto L_0x039c
            r6 = 1
            goto L_0x039d
        L_0x039c:
            r6 = 0
        L_0x039d:
            r2.f219742o = r6
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            r2.f219738k = r6
            if (r6 == 0) goto L_0x03b3
            boolean r6 = r2.f219742o
            if (r6 == 0) goto L_0x03b3
            int r6 = r12.mo108786G2()
            if (r6 <= 0) goto L_0x03b3
            r6 = 1
            goto L_0x03b4
        L_0x03b3:
            r6 = 0
        L_0x03b4:
            r2.f219740m = r6
            r6 = 0
            r2.f219735h = r6
            java.lang.String r6 = r12.mo108781B2()
            int r6 = r8.mo103881H(r6)
            r7 = 34
            if (r6 != r7) goto L_0x0489
            int r6 = r12.mo108832y2()
            if (r6 != 0) goto L_0x0489
            java.lang.String r6 = r12.getContent()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0489
            java.lang.String r6 = r12.getContent()
            java.lang.String r7 = r12.getUsername()
            java.lang.String r15 = "officialaccounts"
            boolean r7 = r7.equals(r15)
            java.lang.String r15 = ":"
            if (r7 != 0) goto L_0x03f7
            r7 = 2097152(0x200000, float:2.938736E-39)
            boolean r7 = r12.mo108372k3(r7)
            if (r7 != 0) goto L_0x03f7
            r7 = 8388608(0x800000, float:1.17549435E-38)
            boolean r7 = r12.mo108372k3(r7)
            if (r7 == 0) goto L_0x0425
        L_0x03f7:
            java.lang.String[] r7 = r6.split(r15)
            if (r7 == 0) goto L_0x0425
            int r5 = r7.length
            r29 = r11
            r11 = 3
            if (r5 <= r11) goto L_0x0428
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 1
            r11 = r7[r6]
            r5.append(r11)
            r5.append(r15)
            r6 = 2
            r11 = r7[r6]
            r5.append(r11)
            r5.append(r15)
            r11 = 3
            r6 = r7[r11]
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            goto L_0x0428
        L_0x0425:
            r29 = r11
            r11 = 3
        L_0x0428:
            boolean r1 = r6.endsWith(r1)     // Catch:{ Exception -> 0x0477 }
            if (r1 == 0) goto L_0x0439
            int r1 = r6.length()     // Catch:{ Exception -> 0x0477 }
            r5 = 1
            int r1 = r1 - r5
            r5 = 0
            java.lang.String r6 = r6.substring(r5, r1)     // Catch:{ Exception -> 0x0477 }
        L_0x0439:
            java.lang.String[] r1 = r6.split(r15)     // Catch:{ Exception -> 0x0477 }
            int r5 = r1.length     // Catch:{ Exception -> 0x0477 }
            r6 = 4
            if (r5 != r6) goto L_0x044c
            r5 = 0
            r6 = r1[r5]     // Catch:{ Exception -> 0x0477 }
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r6)     // Catch:{ Exception -> 0x0477 }
            if (r5 == 0) goto L_0x044c
            r5 = 1
            goto L_0x044d
        L_0x044c:
            r5 = 0
        L_0x044d:
            int r6 = r1.length     // Catch:{ Exception -> 0x0477 }
            if (r6 <= r5) goto L_0x0452
            r6 = r1[r5]     // Catch:{ Exception -> 0x0477 }
        L_0x0452:
            int r6 = r1.length     // Catch:{ Exception -> 0x0477 }
            int r7 = r5 + 1
            if (r6 <= r7) goto L_0x0464
            r6 = r1[r7]     // Catch:{ Exception -> 0x0460 }
            r15 = r12
            r11 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getLong(r6, r11)     // Catch:{ Exception -> 0x0475 }
            goto L_0x0467
        L_0x0460:
            r15 = r12
            r11 = 0
            goto L_0x0475
        L_0x0464:
            r15 = r12
            r11 = 0
        L_0x0467:
            int r6 = r1.length     // Catch:{ Exception -> 0x0475 }
            r7 = 2
            int r5 = r5 + r7
            if (r6 <= r5) goto L_0x0482
            r1 = r1[r5]     // Catch:{ Exception -> 0x047b }
            java.lang.String r5 = "1"
            boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x047b }
            goto L_0x0483
        L_0x0475:
            r7 = 2
            goto L_0x047b
        L_0x0477:
            r15 = r12
            r7 = 2
            r11 = 0
        L_0x047b:
            java.lang.String r1 = "MicroMsg.VoiceContent"
            java.lang.String r5 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
        L_0x0482:
            r5 = 0
        L_0x0483:
            if (r5 != 0) goto L_0x048f
            r1 = 1
            r2.f219735h = r1
            goto L_0x048f
        L_0x0489:
            r29 = r11
            r15 = r12
            r7 = 2
            r11 = 0
        L_0x048f:
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            boolean r5 = r2.f219738k
            java.lang.String r1 = r1.As0(r4, r0, r5)
            r2.f219729b = r1
            r8.mo103889P(r2, r4)
            java.lang.CharSequence r1 = r8.mo103878E(r15)
            r2.f219730c = r1
            int r1 = r15.getStatus()
            r5 = 1
            if (r1 == r5) goto L_0x04bc
            r5 = 5
            if (r1 == r5) goto L_0x04b8
            r5 = 8
            if (r1 == r5) goto L_0x04bc
            r1 = -1
            goto L_0x04bf
        L_0x04b8:
            r1 = 2131756708(0x7f1006a4, float:1.9144331E38)
            goto L_0x04bf
        L_0x04bc:
            r1 = 2131756709(0x7f1006a5, float:1.9144333E38)
        L_0x04bf:
            r2.f219732e = r1
            boolean r1 = eb0.C45628s0.m50772f(r15)
            r2.f219736i = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            boolean r1 = r1.mo69754Z(r15)
            r2.f219737j = r1
            if (r4 == 0) goto L_0x04e1
            boolean r1 = eb0.C45628s0.m50746K(r4)
            if (r1 == 0) goto L_0x04e1
            r5 = 1
            goto L_0x04e2
        L_0x04e1:
            r5 = 0
        L_0x04e2:
            r2.f219739l = r5
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.p$k> r1 = r8.f219717y
            if (r1 == 0) goto L_0x04eb
            r1.put(r0, r2)
        L_0x04eb:
            r6 = r2
        L_0x04ec:
            r14.f219759n = r9
            r14.f219757l = r13
            boolean r0 = r6.f219737j
            r21 = -1
            if (r0 == 0) goto L_0x0500
            long r0 = r15.mo108821o2()
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0500
            r5 = 1
            goto L_0x0501
        L_0x0500:
            r5 = 0
        L_0x0501:
            r14.f219758m = r5
            int r0 = r15.f212787o1
            r14.f219766u = r0
            te3.p85 r5 = new te3.p85
            r5.<init>()
            r4 = 0
            r5.f139646d = r4
            int r0 = r6.f219735h
            r2 = 101(0x65, float:1.42E-43)
            r1 = 1
            if (r0 != r1) goto L_0x0518
            r5.f139646d = r2
        L_0x0518:
            java.lang.CharSequence r0 = r6.f219731d
            if (r0 == 0) goto L_0x0545
            java.lang.String r0 = r15.mo108781B2()
            int r0 = r8.mo103881H(r0)
            r1 = 975175729(0x3a200031, float:6.103544E-4)
            if (r0 == r1) goto L_0x0531
            r1 = 973078577(0x3a000031, float:4.882841E-4)
            if (r0 != r1) goto L_0x052f
            goto L_0x0531
        L_0x052f:
            r0 = 0
            goto L_0x0532
        L_0x0531:
            r0 = 1
        L_0x0532:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x053d
            goto L_0x0545
        L_0x053d:
            r19 = r5
            r17 = r10
            r9 = r11
            r12 = r3
            r11 = r6
            goto L_0x0570
        L_0x0545:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            float r0 = r0.getTextSize()
            int r0 = (int) r0
            com.tencent.mm.ui.conversation.p$l r1 = r8.f219710X
            boolean r7 = r6.f219740m
            r18 = r1
            r19 = 1
            r1 = r39
            r11 = 101(0x65, float:1.42E-43)
            r2 = r15
            r12 = r3
            r3 = r6
            r11 = 0
            r4 = r0
            r19 = r5
            r11 = 1
            r5 = r18
            r11 = r6
            r17 = r10
            r9 = 0
            r6 = r7
            r7 = r19
            java.lang.CharSequence r0 = r1.mo103882I(r2, r3, r4, r5, r6, r7)
            r11.f219731d = r0
        L_0x0570:
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85841l5(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0646
            java.lang.CharSequence r0 = r11.f219731d
            if (r0 == 0) goto L_0x0646
            com.tencent.mm.storage.c0 r2 = com.tencent.p014mm.storage.C19601c0.f55446a
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.storage.C19601c0.f55451f = r0
            boolean r0 = com.tencent.p014mm.p136ui.conversation.C74693i.f219592d
            if (r0 == 0) goto L_0x0646
            android.widget.ListView r0 = r8.f219692I
            rx3.g r2 = com.tencent.p014mm.storage.C19601c0.f55458m
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x05a0
            goto L_0x0640
        L_0x05a0:
            if (r0 == 0) goto L_0x0640
            int r2 = com.tencent.p014mm.p136ui.conversation.C74693i.f219590b
            if (r2 < 0) goto L_0x0640
            int r2 = com.tencent.p014mm.p136ui.conversation.C74693i.f219591c
            if (r2 >= 0) goto L_0x05ac
            goto L_0x0640
        L_0x05ac:
            int r0 = r0.getHeaderViewsCount()
            int r2 = com.tencent.p014mm.p136ui.conversation.C74693i.f219590b
            if (r2 <= r0) goto L_0x05b9
            int r2 = r2 - r0
            r3 = 1
            int r4 = r2 + 1
            goto L_0x05bb
        L_0x05b9:
            r3 = 1
            r4 = 0
        L_0x05bb:
            int r2 = com.tencent.p014mm.p136ui.conversation.C74693i.f219591c
            if (r2 < r0) goto L_0x05c2
            int r2 = r2 - r0
            int r2 = r2 - r3
            goto L_0x05c3
        L_0x05c2:
            r2 = 0
        L_0x05c3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "checkOfficialAccountShow headerCount="
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = ", firstPos="
            r3.append(r0)
            int r0 = com.tencent.p014mm.p136ui.conversation.C74693i.f219590b
            r3.append(r0)
            java.lang.String r0 = ", lastPos="
            r3.append(r0)
            int r0 = com.tencent.p014mm.p136ui.conversation.C74693i.f219591c
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MicroMsg.ConvExposeHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r0)
            r0 = 0
            if (r4 > r2) goto L_0x0612
        L_0x05f0:
            ai3.a r5 = r8.getItem(r4)     // Catch:{ Exception -> 0x0610 }
            com.tencent.mm.storage.h2 r5 = (com.tencent.p014mm.storage.C72976h2) r5     // Catch:{ Exception -> 0x0610 }
            if (r5 != 0) goto L_0x05f9
            goto L_0x060b
        L_0x05f9:
            java.lang.String r0 = r5.getUsername()     // Catch:{ Exception -> 0x0610 }
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85841l5(r0)     // Catch:{ Exception -> 0x0610 }
            if (r0 == 0) goto L_0x060a
            java.lang.String r0 = r5.mo108822p2()     // Catch:{ Exception -> 0x0610 }
            r2 = r5
            r5 = 1
            goto L_0x0616
        L_0x060a:
            r0 = r5
        L_0x060b:
            if (r4 == r2) goto L_0x0612
            int r4 = r4 + 1
            goto L_0x05f0
        L_0x0610:
            r0 = move-exception
            goto L_0x0630
        L_0x0612:
            r2 = r0
            r0 = r1
            r4 = 0
            r5 = 0
        L_0x0616:
            if (r5 == 0) goto L_0x0640
            com.tencent.mm.storage.c0 r5 = com.tencent.p014mm.storage.C19601c0.f55446a     // Catch:{ Exception -> 0x0610 }
            if (r2 != 0) goto L_0x061d
            goto L_0x0640
        L_0x061d:
            int r5 = r2.mo108786G2()     // Catch:{ Exception -> 0x0610 }
            zt3.t r6 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0610 }
            com.tencent.mm.storage.e0 r7 = new com.tencent.mm.storage.e0     // Catch:{ Exception -> 0x0610 }
            r7.<init>(r0, r4, r2, r5)     // Catch:{ Exception -> 0x0610 }
            zt3.j r6 = (zt3.C119157j) r6     // Catch:{ Exception -> 0x0610 }
            java.lang.String r0 = "MicroMsg.BizMainCellExposeHelper"
            r6.mo183876g(r7, r0)     // Catch:{ Exception -> 0x0610 }
            goto L_0x0640
        L_0x0630:
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "checkOfficialAccountShow ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            goto L_0x0641
        L_0x0640:
            r2 = 1
        L_0x0641:
            fx0.h r0 = fx0.C45825h.f123727a
            r0.mo71296i(r2, r1, r1)
        L_0x0646:
            java.lang.CharSequence r0 = r11.f219730c
            if (r0 != 0) goto L_0x0650
            java.lang.CharSequence r0 = r8.mo103878E(r15)
            r11.f219730c = r0
        L_0x0650:
            boolean r0 = r11.f219740m
            if (r0 == 0) goto L_0x0661
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            android.content.res.ColorStateList[] r2 = r8.f219715x
            r3 = 0
            r2 = r2[r3]
            r0.setTextColor((android.content.res.ColorStateList) r2)
            r3 = r19
            goto L_0x06c2
        L_0x0661:
            int r0 = r11.f219735h
            r2 = 1
            if (r0 != r2) goto L_0x06b6
            int r0 = r15.mo108832y2()
            if (r0 != 0) goto L_0x06b6
            android.content.Context r0 = r8.f220760h
            r2 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.CharSequence r2 = r11.f219731d
            java.lang.String r2 = r2.toString()
            int r2 = r2.lastIndexOf(r0)
            if (r2 < 0) goto L_0x06b6
            r3 = r19
            r4 = 101(0x65, float:1.42E-43)
            r3.f139646d = r4     // Catch:{ Exception -> 0x06ad }
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x06ad }
            java.lang.CharSequence r5 = r11.f219731d     // Catch:{ Exception -> 0x06ad }
            r4.<init>(r5)     // Catch:{ Exception -> 0x06ad }
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x06ad }
            android.content.Context r6 = r8.f220760h     // Catch:{ Exception -> 0x06ad }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x06ad }
            r7 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r6 = r6.getColor(r7)     // Catch:{ Exception -> 0x06ad }
            r5.<init>(r6)     // Catch:{ Exception -> 0x06ad }
            int r0 = r0.length()     // Catch:{ Exception -> 0x06ad }
            int r0 = r0 + r2
            r6 = 33
            r4.setSpan(r5, r2, r0, r6)     // Catch:{ Exception -> 0x06ad }
            r11.f219731d = r4     // Catch:{ Exception -> 0x06ad }
            goto L_0x06b8
        L_0x06ad:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r5, r4)
            goto L_0x06b9
        L_0x06b6:
            r3 = r19
        L_0x06b8:
            r2 = 0
        L_0x06b9:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            android.content.res.ColorStateList[] r4 = r8.f219715x
            r4 = r4[r2]
            r0.setTextColor((android.content.res.ColorStateList) r4)
        L_0x06c2:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            int r0 = r0.getWidth()
            p875ci.C67379u.f193255e = r0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            float r0 = r0.getTextSize()
            int r0 = (int) r0
            p875ci.C67379u.f193256f = r0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            android.text.TextPaint r0 = r0.getPaint()
            p875ci.C67379u.m79748m(r0)
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r13)
            if (r0 != 0) goto L_0x06f5
            boolean r0 = eb0.C45628s0.m50735A(r13)
            if (r0 == 0) goto L_0x06e9
            goto L_0x06f5
        L_0x06e9:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            boolean r2 = r0.f318772G
            if (r2 == 0) goto L_0x06f3
            r2 = 0
            r0.setDrawRightDrawable(r2)
        L_0x06f3:
            r2 = 1
            goto L_0x0703
        L_0x06f5:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            r2 = 2131756796(0x7f1006fc, float:1.914451E38)
            r0.setCompoundRightDrawablesWithIntrinsicBounds((int) r2)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            r2 = 1
            r0.setDrawRightDrawable(r2)
        L_0x0703:
            int r0 = r11.f219732e
            r4 = -1
            if (r0 == r4) goto L_0x0727
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r14.f219750e
            r4.setCompoundLeftDrawablesWithIntrinsicBounds((int) r0)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            r0.setDrawLeftDrawable(r2)
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r5 = 0
            r0[r5] = r13
            int r6 = r11.f219732e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r2] = r6
            java.lang.String r2 = "userName:%s, status:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r0)
            goto L_0x0733
        L_0x0727:
            r4 = 2
            r5 = 0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            r0.setDrawLeftDrawable(r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            r0.invalidate()
        L_0x0733:
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x079a
            com.tencent.mm.ui.conversation.p$l r0 = r8.f219710X
            java.lang.String r2 = r15.getUsername()
            r0.mo103900b(r2)
            com.tencent.mm.ui.conversation.p$l r0 = r8.f219710X
            com.tencent.mm.storage.z1 r0 = r0.mo103899a()
            if (r0 == 0) goto L_0x0763
            java.lang.Class<he0.j> r2 = he0.C76158j.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            he0.j r2 = (he0.C76158j) r2
            java.lang.String r5 = r0.mo73980x2()
            java.lang.String r6 = r0.mo73976t2()
            java.lang.String r2 = r2.mo106373wo(r5, r6)
            goto L_0x0764
        L_0x0763:
            r2 = r1
        L_0x0764:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x0792
            java.lang.String r0 = r0.mo73980x2()
            java.lang.String r5 = "3552365301"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0787
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "@"
            r0.append(r5)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L_0x0787:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            r5 = 2131100996(0x7f060544, float:1.781439E38)
            r6 = 14
            r0.mo153515g(r2, r5, r6)
            goto L_0x07b1
        L_0x0792:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            r2 = 0
            r5 = 0
            r0.mo153515g(r2, r5, r5)
            goto L_0x07b1
        L_0x079a:
            r2 = 0
            r5 = 0
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x07ac
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            r0.mo153515g(r2, r5, r5)
            goto L_0x07b1
        L_0x07ac:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            r0.mo153515g(r2, r5, r5)
        L_0x07b1:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219747b
            java.lang.CharSequence r2 = r11.f219728a
            r0.setText((java.lang.CharSequence) r2)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219748c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.CharSequence r2 = r11.f219730c
            int r2 = r2.length()
            r5 = 9
            if (r2 < r5) goto L_0x07d6
            int r2 = r0.width
            int r6 = r8.f219712Z
            if (r2 == r6) goto L_0x07e3
            r0.width = r6
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r14.f219748c
            r2.setLayoutParams(r0)
            goto L_0x07e3
        L_0x07d6:
            int r2 = r0.width
            int r6 = r8.f219711Y
            if (r2 == r6) goto L_0x07e3
            r0.width = r6
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r14.f219748c
            r2.setLayoutParams(r0)
        L_0x07e3:
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85813P4(r0)
            if (r0 == 0) goto L_0x07f4
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219748c
            r2 = 4
            r0.setVisibility(r2)
            goto L_0x0801
        L_0x07f4:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219748c
            r2 = 0
            r0.setVisibility(r2)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219748c
            java.lang.CharSequence r2 = r11.f219730c
            r0.setText((java.lang.CharSequence) r2)
        L_0x0801:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r14.f219750e
            java.lang.CharSequence r2 = r11.f219731d
            r0.setText((java.lang.CharSequence) r2)
            java.lang.Class<mm.h> r0 = p606mm.C99933h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            mm.h r0 = (p606mm.C99933h) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "report_"
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r6 = 13
            r0.mo84407yo(r6, r2, r3)
            r0 = 7
            long r2 = g62.C45881a.m51165b(r15, r0, r9)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0831
            r2 = 1
            goto L_0x0832
        L_0x0831:
            r2 = 0
        L_0x0832:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r40)
            r7 = 0
            r3[r7] = r6
            java.lang.String r6 = r15.getUsername()
            r7 = 1
            r3[r7] = r6
            long r6 = r15.mo108821o2()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r4] = r6
            java.lang.CharSequence r6 = r11.f219730c
            r7 = 3
            r3[r7] = r6
            boolean r6 = r14.f219758m
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r16 = 4
            r3[r16] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r16 = 5
            r3[r16] = r6
            long r19 = r15.mo108828u2()
            java.lang.Long r6 = java.lang.Long.valueOf(r19)
            r7 = 6
            r3[r7] = r6
            long r19 = r15.mo108828u2()
            r23 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r19 = r19 & r23
            java.lang.Long r6 = java.lang.Long.valueOf(r19)
            r3[r0] = r6
            java.lang.CharSequence r6 = r11.f219728a
            if (r6 == 0) goto L_0x0896
            int r6 = r6.length()
            if (r6 > 0) goto L_0x088a
            goto L_0x0896
        L_0x088a:
            java.lang.CharSequence r6 = r11.f219728a
            r4 = 0
            char r6 = r6.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r6)
            goto L_0x0898
        L_0x0896:
            java.lang.String r4 = "?"
        L_0x0898:
            r6 = 8
            r3[r6] = r4
            int r4 = r15.mo108786G2()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r5] = r4
            r4 = 10
            int r5 = r15.mo108831x2()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r4 = 11
            java.lang.String r5 = r15.mo108782C2()
            r3[r4] = r5
            r4 = 12
            int r5 = r15.f212787o1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r4 = "[getView] position=%s username=%s conversationTime=%s updateTime=%s isPlacedTop=%s isTalkRoomTopPlace=%s flag=%s flagTime=%s nickname=%s unread=%s, hbMarkRed=%s, parentRef=%s, foldFlag=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            if (r2 == 0) goto L_0x08ef
            long r2 = g62.C45881a.m51165b(r15, r0, r9)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x08ef
            long r2 = r15.mo108821o2()
            long r2 = g62.C45881a.m51165b(r15, r7, r2)
            r15.mo101161T2(r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            java.lang.String r2 = r15.getUsername()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69773k0(r15, r2)
        L_0x08ef:
            android.widget.ImageView r0 = r14.f219749d
            r2 = 8
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r14.f219752g
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r14.f219752g
            android.content.Context r2 = r8.f220760h
            r3 = 2131756230(0x7f1004c6, float:1.9143362E38)
            android.content.res.Resources r4 = r2.getResources()
            r5 = 2131100124(0x7f0601dc, float:1.781262E38)
            int r4 = r4.getColor(r5)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r4)
            r0.setImageDrawable(r2)
            boolean r0 = r11.f219738k
            if (r0 == 0) goto L_0x0923
            boolean r0 = r11.f219742o
            if (r0 == 0) goto L_0x092d
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r14.f219752g
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x092d
        L_0x0923:
            r2 = 0
            boolean r0 = r11.f219739l
            if (r0 == 0) goto L_0x092d
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r14.f219752g
            r0.setVisibility(r2)
        L_0x092d:
            di3.d r0 = di3.C86312j.m106911c(r17)
            ln.h r0 = (p196ln.C76707h) r0
            boolean r0 = r0.mo106990am(r13)
            if (r0 == 0) goto L_0x0945
            di3.d r0 = di3.C86312j.m106911c(r17)
            ln.h r0 = (p196ln.C76707h) r0
            android.widget.ImageView r2 = r14.f219746a
            r0.mo106991g4(r2, r13)
            goto L_0x0952
        L_0x0945:
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r14.f219746a
            r0.mo106836g4(r2, r13)
        L_0x0952:
            android.widget.ImageView r0 = r14.f219746a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            boolean r0 = r0 instanceof vd3.C78399i.C78400a
            if (r0 == 0) goto L_0x0972
            android.widget.ImageView r0 = r14.f219746a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            vd3.i$a r0 = (vd3.C78399i.C78400a) r0
            vd3.i r2 = r8.f219685B
            if (r2 == 0) goto L_0x0972
            java.util.ArrayList<java.lang.ref.WeakReference<vd3.i$a>> r2 = r2.f229724e
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.add(r3)
        L_0x0972:
            boolean r0 = r8.f219719z
            if (r0 == 0) goto L_0x0ac3
            java.lang.String r0 = "handleShowTipCnt."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            android.widget.TextView r0 = r14.f219751f
            r2 = 4
            r0.setVisibility(r2)
            android.view.View r0 = r14.f219756k
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r32 = r3.mo10232b()
            java.lang.String r33 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r34 = "handleShowTipCnt"
            java.lang.String r35 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ConversationItem;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r0
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r2 = 0
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r0.setVisibility(r2)
            java.lang.String r32 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r33 = "handleShowTipCnt"
            java.lang.String r34 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ConversationItem;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85795C5(r0)
            if (r0 != 0) goto L_0x09f4
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85805J5(r0)
            if (r0 == 0) goto L_0x09d8
            goto L_0x09f4
        L_0x09d8:
            boolean r0 = r11.f219741n
            if (r0 == 0) goto L_0x09ee
            int r0 = r11.f219734g
            r2 = 1
            if (r0 == r2) goto L_0x09e8
            r2 = 2
            if (r0 == r2) goto L_0x09e9
            r3 = 3
            if (r0 != r3) goto L_0x09ef
            goto L_0x09e9
        L_0x09e8:
            r2 = 2
        L_0x09e9:
            android.content.res.ColorStateList[] r0 = r8.f219715x
            r0 = r0[r2]
            goto L_0x09f9
        L_0x09ee:
            r3 = 3
        L_0x09ef:
            android.content.res.ColorStateList[] r0 = r8.f219715x
            r0 = r0[r3]
            goto L_0x09f9
        L_0x09f4:
            r3 = 3
            android.content.res.ColorStateList[] r0 = r8.f219715x
            r0 = r0[r3]
        L_0x09f9:
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r14.f219747b
            r2.setTextColor((android.content.res.ColorStateList) r0)
            boolean r0 = r11.f219741n
            if (r0 == 0) goto L_0x0a06
            int r0 = r11.f219733f
            if (r0 != 0) goto L_0x0a0b
        L_0x0a06:
            java.lang.String r0 = "handle show tip count, but talker is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
        L_0x0a0b:
            int r0 = r8.mo103883J(r15)
            r2 = 1
            if (r0 != r2) goto L_0x0a64
            android.view.View r0 = r14.f219756k
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r31 = r1.mo10232b()
            java.lang.String r32 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r33 = "handleShowTipCnt"
            java.lang.String r34 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ConversationItem;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r0
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r32 = "handleShowTipCnt"
            java.lang.String r33 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationWithCacheAdapter$ConversationItem;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            fn3.d r0 = fn3.C75778d.f222377a
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r14.f219752g
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0a5f
            r6 = 1
            goto L_0x0a60
        L_0x0a5f:
            r6 = 2
        L_0x0a60:
            r0.mo106087a(r15, r6)
            goto L_0x0ac3
        L_0x0a64:
            r2 = 2
            if (r0 != r2) goto L_0x0ac3
            int r0 = r15.mo108786G2()
            r2 = 99
            if (r0 <= r2) goto L_0x0a83
            android.widget.TextView r0 = r14.f219751f
            r0.setText(r1)
            android.widget.TextView r0 = r14.f219751f
            r1 = 2131755223(0x7f1000d7, float:1.914132E38)
            r0.setBackgroundResource(r1)
            android.widget.TextView r0 = r14.f219751f
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x0aae
        L_0x0a83:
            if (r0 <= 0) goto L_0x0aae
            android.widget.TextView r2 = r14.f219751f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            int r1 = r15.mo108786G2()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            android.widget.TextView r1 = r14.f219751f
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r14.f219751f
            android.content.Context r2 = r8.f220760h
            int r0 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r2, r0)
            r1.setBackgroundResource(r0)
        L_0x0aae:
            com.tencent.mm.ui.conversation.p$i r0 = r8.f219718y0
            r0.getClass()
            fn3.d r0 = fn3.C75778d.f222377a
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r14.f219752g
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0abf
            r6 = 1
            goto L_0x0ac0
        L_0x0abf:
            r6 = 2
        L_0x0ac0:
            r0.mo106087a(r15, r6)
        L_0x0ac3:
            boolean r0 = r11.f219736i
            if (r0 != 0) goto L_0x0ade
            boolean r0 = r11.f219737j
            if (r0 == 0) goto L_0x0ade
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x0ade
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69770i0(r15)
        L_0x0ade:
            java.lang.String r0 = r8.f219705T
            if (r0 == 0) goto L_0x0b08
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0b08
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r1 = r29.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r8.f219705T
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "convertView:%s, clickUsername:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            android.view.View r0 = r14.f219762q
            android.graphics.drawable.ColorDrawable r1 = r8.f219707U
            r0.setBackground(r1)
            goto L_0x0b25
        L_0x0b08:
            boolean r0 = r11.f219737j
            if (r0 == 0) goto L_0x0b1d
            long r0 = r15.mo108821o2()
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0b1d
            android.view.View r0 = r14.f219762q
            r1 = 2131233605(0x7f080b45, float:1.8083352E38)
            r0.setBackgroundResource(r1)
            goto L_0x0b25
        L_0x0b1d:
            android.view.View r0 = r14.f219762q
            r1 = 2131231854(0x7f08046e, float:1.80798E38)
            r0.setBackgroundResource(r1)
        L_0x0b25:
            android.view.View r0 = r14.f219762q
            com.tencent.mm.ui.conversation.p$b r1 = new com.tencent.mm.ui.conversation.p$b
            r1.<init>(r8, r14)
            r0.setOnTouchListener(r1)
            android.widget.ImageView r0 = r14.f219753h
            m89463B(r0, r15)
            android.widget.ImageView r0 = r14.f219754i
            m89464C(r0, r15)
            java.lang.Class<yy.k> r0 = p773yy.C79168k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            yy.k r0 = (p773yy.C79168k) r0
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r14.f219747b
            qy2.a$c r2 = qy2.C63347a.C47892c.CONVERSATION_LIST
            r0.mo74124Yl(r1, r13, r2)
            r8.mo103877D(r14, r15)
            com.tencent.mm.ui.conversation.p$i r0 = r8.f219718y0
            java.lang.CharSequence r1 = r11.f219731d
            java.lang.String.valueOf(r1)
            r0.getClass()
            com.tencent.mm.ui.conversation.p$i r0 = r8.f219718y0
            r0.getClass()
            com.tencent.mm.ui.conversation.p$i r0 = r8.f219718y0
            java.lang.CharSequence r1 = r11.f219730c
            java.lang.String.valueOf(r1)
            r0.getClass()
            r0 = 2131300447(0x7f09105f, float:1.8218924E38)
            boolean r1 = r11.f219737j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7 = r29
            r7.setTag(r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.mo10233c(r0)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r24 = "getView"
            java.lang.String r25 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setAlpha"
            java.lang.String r28 = "(F)V"
            r21 = r7
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r0 = r1.mo10231a(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7.setAlpha(r0)
            java.lang.String r22 = "com/tencent/mm/ui/conversation/ConversationWithCacheAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setAlpha"
            java.lang.String r27 = "(F)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            r0 = 2131300448(0x7f091060, float:1.8218926E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r40)
            r7.setTag(r0, r1)
            r0 = 2131300446(0x7f09105e, float:1.8218922E38)
            r7.setTag(r0, r15)
            com.tencent.mm.ui.conversation.j r0 = com.tencent.p014mm.p136ui.conversation.C44992j.f122046a
            r0.mo70304a(r13, r7)
            com.tencent.mm.ui.conversation.FolderHelper r1 = r8.f219697N
            r2 = r14
            r3 = r15
            r4 = r7
            r5 = r40
            r6 = r42
            r1.mo103787j(r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74720p.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: h */
    public C112789a mo103510h() {
        return new C72976h2();
    }

    public void notifyDataSetChanged() {
        if (!this.f219706T0) {
            super.notifyDataSetChanged();
            f219683U0.clear();
            FolderHelper folderHelper = this.f219697N;
            if (folderHelper != null && folderHelper.f219396C) {
                folderHelper.f219396C = false;
                folderHelper.f219397D = false;
                ConversationListView conversationListView = folderHelper.f219407f;
                if (conversationListView != null) {
                    conversationListView.postDelayed(new C74707l0(folderHelper), folderHelper.f219423y > folderHelper.f219394A ? 100 : 0);
                }
            }
        }
        Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap %s", Boolean.valueOf(this.f219706T0));
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        HashMap<String, C74731k> hashMap;
        HashSet<String> hashSet;
        C72996z1 z1Var;
        boolean z = false;
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.ConversationWithCacheAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        String str = (String) obj;
        if (mStorageEx instanceof C30783v3) {
            Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onConversationStorageNotifyChange event type %d, username %s", Integer.valueOf(i), str);
            if (!(str.contains("@") && !str.endsWith("@chatroom") && !str.endsWith("@im.chatroom") && !str.endsWith("@micromsg.qq.com") && !C72996z1.m85843n5(str))) {
                if (this.f219717y != null) {
                    if (!obj.equals("")) {
                        this.f219693J.add(str);
                    } else if (i == 5) {
                        this.f219694K = true;
                        mo104618q(null, 1);
                        return;
                    }
                }
                if (i != 8) {
                    z = true;
                }
                if (i == 3 || i == 8) {
                    i = 2;
                }
                mo104619r(str, i, null, z);
            }
        } else if (mStorageEx instanceof C44668u3) {
            Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onContactStorageNotifyChange event type %d, username %s, isIniting %b", Integer.valueOf(i), obj, Boolean.valueOf(this.f219704S0));
            if (!this.f219704S0) {
                if (!Util.isNullOrNil(str) && (z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str)) != null && ((int) z1Var.f108320R1) > 0) {
                    Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onContactStorageNotifyChange contact isMute %s, ChatRoomNotify %d", Boolean.valueOf(C45628s0.m50746K(z1Var)), Integer.valueOf(z1Var.f149512S));
                }
                if (i != 5 && i != 2 && (hashMap = this.f219717y) != null && hashMap.containsKey(str) && (hashSet = this.f219690G) != null) {
                    hashSet.add(str);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable, java.lang.String] */
    /* renamed from: s */
    public ArrayList<C72976h2> mo103512s(ArrayList<String> arrayList) {
        Log.m105919d("MicroMsg.ConversationWithCacheAdapter", "rebulidAllChangeData obj.size() %d", Integer.valueOf(arrayList.size()));
        ArrayList<C72976h2> arrayList2 = new ArrayList<>(arrayList.size());
        Cursor cursor = 0;
        try {
            C30783v3 w = C97625j3.m125812b().mo105908w();
            List<String> list = this.f219714w;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
            cursor = ((C44660i2) w).mo69746Q(arrayList, 1, list, cursor);
            while (cursor.moveToNext()) {
                C72976h2 h2Var = new C72976h2();
                h2Var.convertFrom(cursor);
                arrayList2.add(h2Var);
            }
            return arrayList2;
        } finally {
            Util.qualityClose(cursor);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02da  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.SparseArray<java.lang.String>[] mo103513u(java.util.HashSet<com.tencent.p014mm.p136ui.C75029y.C75036e<java.lang.String, com.tencent.p014mm.storage.C72976h2>> r26, android.util.SparseArray<java.lang.String>[] r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r2 = 2
            java.lang.String r3 = "MicroMsg.ConversationWithCacheAdapter"
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x02eb
            int r6 = r1.length
            if (r6 <= 0) goto L_0x02eb
            boolean r6 = f40.C86709a0.m107522a()
            if (r6 != 0) goto L_0x0016
            goto L_0x02eb
        L_0x0016:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r7 = r26.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            r7 = r1[r4]
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r5] = r7
            java.lang.String r7 = "refreshPosistion events size %d oldPosistion size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r26.iterator()
        L_0x003c:
            boolean r8 = r7.hasNext()
            r9 = 5
            if (r8 == 0) goto L_0x0078
            java.lang.Object r8 = r7.next()
            com.tencent.mm.ui.y$e r8 = (com.tencent.p014mm.p136ui.C75029y.C75036e) r8
            if (r8 != 0) goto L_0x004c
            goto L_0x003c
        L_0x004c:
            int r10 = r8.f220779b
            if (r10 == r9) goto L_0x003c
            K r9 = r8.f220778a
            boolean r9 = r6.contains(r9)
            if (r9 != 0) goto L_0x003c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "searchArray.add(event.object) "
            r9.append(r10)
            K r10 = r8.f220778a
            java.lang.String r10 = (java.lang.String) r10
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r9)
            K r8 = r8.f220778a
            java.lang.String r8 = (java.lang.String) r8
            r6.add(r8)
            goto L_0x003c
        L_0x0078:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r8 = r6.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            java.lang.String r8 = r6.toString()
            r7[r5] = r8
            java.lang.String r8 = "refreshChangedConversation searchArray:%s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r8 = r8.mo105908w()
            java.util.List<java.lang.String> r10 = r0.f219714w
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r11 = p922vj.C78420a.f229768m1
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8
            r11 = 0
            android.database.Cursor r8 = r8.mo69746Q(r6, r5, r10, r11)
        L_0x00a7:
            boolean r10 = r8.moveToNext()
            if (r10 == 0) goto L_0x00cd
            com.tencent.mm.storage.h2 r10 = new com.tencent.mm.storage.h2
            r10.<init>()
            r10.convertFrom(r8)
            java.lang.String r12 = r10.getUsername()
            r7.put(r12, r10)
            com.tencent.mm.ui.conversation.FolderHelper r12 = r0.f219697N
            java.lang.String r13 = r10.getUsername()
            com.tencent.mm.storage.h2 r12 = r12.mo103789l(r13)
            if (r12 == 0) goto L_0x00a7
            int r12 = r12.f212787o1
            r10.f212787o1 = r12
            goto L_0x00a7
        L_0x00cd:
            r8.close()
            java.util.Iterator r8 = r26.iterator()
        L_0x00d4:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x011e
            java.lang.Object r10 = r8.next()
            com.tencent.mm.ui.y$e r10 = (com.tencent.p014mm.p136ui.C75029y.C75036e) r10
            if (r10 != 0) goto L_0x00e3
            goto L_0x00d4
        L_0x00e3:
            int r12 = r10.f220779b
            if (r12 == r9) goto L_0x011b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "evnet name,"
            r12.append(r13)
            K r13 = r10.f220778a
            java.lang.String r13 = (java.lang.String) r13
            r12.append(r13)
            java.lang.String r13 = "  event.newObj   =="
            r12.append(r13)
            K r13 = r10.f220778a
            java.lang.Object r13 = r7.get(r13)
            if (r13 != 0) goto L_0x0107
            r13 = 1
            goto L_0x0108
        L_0x0107:
            r13 = 0
        L_0x0108:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            K r12 = r10.f220778a
            java.lang.Object r12 = r7.get(r12)
            r10.f220780c = r12
            goto L_0x00d4
        L_0x011b:
            r10.f220780c = r11
            goto L_0x00d4
        L_0x011e:
            r6.clear()
            r7.clear()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r7 = r26.iterator()
        L_0x012d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02ea
            java.lang.Object r8 = r7.next()
            com.tencent.mm.ui.y$e r8 = (com.tencent.p014mm.p136ui.C75029y.C75036e) r8
            if (r8 != 0) goto L_0x013c
            goto L_0x012d
        L_0x013c:
            r10 = r1[r4]
            K r11 = r8.f220778a
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r10.size()
            T r13 = r8.f220780c
            com.tencent.mm.storage.h2 r13 = (com.tencent.p014mm.storage.C72976h2) r13
            int r14 = r10.size()
            r15 = 0
        L_0x014f:
            r16 = -1
            if (r15 >= r14) goto L_0x0166
            java.lang.Object r17 = r10.get(r15)
            r9 = r17
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0162
            goto L_0x0167
        L_0x0162:
            int r15 = r15 + 1
            r9 = 5
            goto L_0x014f
        L_0x0166:
            r15 = -1
        L_0x0167:
            r9 = 4
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r14[r4] = r11
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r14[r5] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r15)
            r14[r2] = r17
            int r9 = r8.f220779b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r17 = 3
            r14[r17] = r9
            java.lang.String r9 = "resortPosition username %s,  size %d, position %d, changeType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r14)
            int r9 = r8.f220779b
            if (r9 == r2) goto L_0x01af
            r14 = 5
            if (r9 == r14) goto L_0x0190
            goto L_0x020a
        L_0x0190:
            if (r15 >= 0) goto L_0x0199
            java.lang.String r9 = "CursorDataAdapter.CHANGE_TYPE_DELETE  position < 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            goto L_0x02d5
        L_0x0199:
            int r9 = r12 + -1
            if (r15 >= r9) goto L_0x01aa
            int r9 = r15 + 1
            java.lang.Object r11 = r10.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            r10.put(r15, r11)
            r15 = r9
            goto L_0x0199
        L_0x01aa:
            r10.remove(r9)
            goto L_0x02d5
        L_0x01af:
            if (r13 != 0) goto L_0x01d7
            java.lang.String r9 = "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            if (r15 < 0) goto L_0x02d5
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r4] = r11
            java.lang.String r11 = "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null delete it username %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r11, r9)
        L_0x01c1:
            int r9 = r12 + -1
            if (r15 >= r9) goto L_0x01d2
            int r9 = r15 + 1
            java.lang.Object r11 = r10.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            r10.put(r15, r11)
            r15 = r9
            goto L_0x01c1
        L_0x01d2:
            r10.remove(r9)
            goto L_0x02d5
        L_0x01d7:
            if (r15 >= 0) goto L_0x020a
            r9 = 0
        L_0x01da:
            if (r9 >= r12) goto L_0x01f6
            java.lang.Object r14 = r10.get(r9)
            java.lang.String r14 = (java.lang.String) r14
            com.tencent.mm.storage.h2 r14 = r0.mo103880G(r14, r6)
            long r14 = r14.mo108828u2()
            long r16 = r13.mo108828u2()
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 > 0) goto L_0x01f3
            goto L_0x01f6
        L_0x01f3:
            int r9 = r9 + 1
            goto L_0x01da
        L_0x01f6:
            if (r12 <= r9) goto L_0x0205
            int r13 = r12 + -1
            java.lang.Object r14 = r10.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            r10.put(r12, r14)
            r12 = r13
            goto L_0x01f6
        L_0x0205:
            r10.put(r9, r11)
            goto L_0x02d5
        L_0x020a:
            if (r15 >= 0) goto L_0x0213
            java.lang.String r9 = "CursorDataAdapter.CHANGE_TYPE_UPDATE  position < 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            goto L_0x02d5
        L_0x0213:
            com.tencent.mm.storage.h2 r9 = r0.mo103880G(r11, r6)
            if (r13 != 0) goto L_0x0238
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r4] = r11
            java.lang.String r11 = "CursorDataAdapter.CHANGE_TYPE_UPDATE  cov == null delete it username %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r11, r9)
        L_0x0222:
            int r9 = r12 + -1
            if (r15 >= r9) goto L_0x0233
            int r9 = r15 + 1
            java.lang.Object r11 = r10.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            r10.put(r15, r11)
            r15 = r9
            goto L_0x0222
        L_0x0233:
            r10.remove(r9)
            goto L_0x02d5
        L_0x0238:
            long r18 = r9.mo108828u2()
            long r20 = r13.mo108828u2()
            int r9 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r9 != 0) goto L_0x0246
            goto L_0x02d5
        L_0x0246:
            if (r9 >= 0) goto L_0x024e
            int r9 = r15 + -1
            r12 = r9
            r9 = 0
            r14 = 1
            goto L_0x0253
        L_0x024e:
            int r9 = r15 + 1
            int r12 = r12 + -1
            r14 = 0
        L_0x0253:
            r2 = r9
        L_0x0254:
            if (r2 > r12) goto L_0x0274
            java.lang.Object r19 = r10.get(r2)
            r5 = r19
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.storage.h2 r5 = r0.mo103880G(r5, r6)
            long r21 = r5.mo108828u2()
            long r23 = r13.mo108828u2()
            int r5 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r5 > 0) goto L_0x0270
            r5 = 1
            goto L_0x0275
        L_0x0270:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0254
        L_0x0274:
            r5 = 0
        L_0x0275:
            r13 = 6
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13[r4] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r19 = 1
            r13[r19] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            r16 = 2
            r13[r16] = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            r13[r17] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r16 = 4
            r13[r16] = r9
            r9 = 5
            r13[r9] = r11
            java.lang.String r9 = "resortPosition: begin-%d end-%d tempUpdate-%d found-%b position-%d username-%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r13)
            if (r5 != 0) goto L_0x02ad
            if (r14 != 0) goto L_0x02ad
            int r12 = r12 + 1
            if (r2 != r12) goto L_0x02ad
            r5 = 1
        L_0x02ad:
            if (r5 != 0) goto L_0x02b0
            goto L_0x02d5
        L_0x02b0:
            if (r14 == 0) goto L_0x02c1
        L_0x02b2:
            if (r15 <= r2) goto L_0x02d2
            int r5 = r15 + -1
            java.lang.Object r9 = r10.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            r10.put(r15, r9)
            r15 = r5
            goto L_0x02b2
        L_0x02c1:
            int r2 = r2 + -1
        L_0x02c3:
            if (r15 >= r2) goto L_0x02d2
            int r5 = r15 + 1
            java.lang.Object r9 = r10.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            r10.put(r15, r9)
            r15 = r5
            goto L_0x02c3
        L_0x02d2:
            r10.put(r2, r11)
        L_0x02d5:
            int r2 = r8.f220779b
            r5 = 5
            if (r2 == r5) goto L_0x02e5
            K r2 = r8.f220778a
            java.lang.String r2 = (java.lang.String) r2
            T r8 = r8.f220780c
            com.tencent.mm.storage.h2 r8 = (com.tencent.p014mm.storage.C72976h2) r8
            r6.put(r2, r8)
        L_0x02e5:
            r2 = 2
            r5 = 1
            r9 = 5
            goto L_0x012d
        L_0x02ea:
            return r1
        L_0x02eb:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r1 != 0) goto L_0x02f2
            java.lang.String r5 = "null"
            goto L_0x02f7
        L_0x02f2:
            int r5 = r1.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x02f7:
            r2[r4] = r5
            boolean r4 = f40.C86709a0.m107522a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "refreshPosistion oldPosistion:%s, accHasReady:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74720p.mo103513u(java.util.HashSet, android.util.SparseArray[]):android.util.SparseArray[]");
    }

    /* renamed from: z */
    public final CharSequence mo103892z(C72976h2 h2Var, C74731k kVar, int i, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, boolean z, p85 p85) {
        C68070l.C68072b u;
        Class cls = C76979h.class;
        if (h2Var.mo108372k3(TPMediaCodecProfileLevel.HEVCHighTierLevel62) && (h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0)) {
            p85.f139646d = 101;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f220760h.getString(C0966R.string.f361422js1));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append(" ").append(charSequence);
            return spannableStringBuilder.append(spannableStringBuilder2);
        } else if (h2Var.mo108787H2() > 0) {
            p85.f139646d = 101;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(h2Var.mo108787H2() < 4096 ? this.f220760h.getString(C0966R.string.glq, new Object[]{Integer.valueOf(h2Var.mo108787H2())}) : this.f220760h.getString(C0966R.string.gln));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.append(" ").append(charSequence);
            return spannableStringBuilder3;
        } else if (h2Var.mo108818l2() > 0 && (h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0)) {
            p85.f139646d = 101;
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f220760h.getString(h2Var.mo108818l2() < 4096 ? C0966R.string.glp : ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(h2Var.getUsername()) ? C0966R.string.glo : C0966R.string.glr));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder4.append(" ").append(charSequence);
            return spannableStringBuilder4;
        } else if (h2Var.mo108829v2() > 0 && (h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0)) {
            p85.f139646d = 1;
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f220760h.getString(C0966R.string.f361403jm1));
            spannableStringBuilder5.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder5.length(), 33);
            spannableStringBuilder5.append(" ").append(charSequence);
            return spannableStringBuilder5;
        } else if (h2Var.mo108830w2() == 1) {
            p85.f139646d = 101;
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f220760h.getString(C0966R.string.k3e));
            spannableStringBuilder6.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder6.length(), 33);
            spannableStringBuilder6.append(" ").append(charSequence);
            return spannableStringBuilder6;
        } else if (h2Var.mo108372k3(TPMediaCodecProfileLevel.HEVCMainTierLevel62) && (h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0)) {
            p85.f139646d = 101;
            String string = this.f220760h.getString(C0966R.string.f7284bi);
            String replace = charSequence.toString().replace(string, "");
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(string);
            spannableStringBuilder7.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder7.length(), 33);
            spannableStringBuilder7.append(((C76979h) C86312j.m106911c(cls)).op0(this.f220760h, replace, i));
            return spannableStringBuilder.append(spannableStringBuilder7);
        } else if (h2Var.mo108783D2() == 1) {
            spannableStringBuilder.append(charSequence.toString().replace(this.f220760h.getString(C0966R.string.huh), ""));
            return spannableStringBuilder;
        } else {
            if (h2Var.mo108831x2() == 1) {
                if (mo103881H(h2Var.mo108781B2()) == 436207665 && (u = C68070l.C68072b.m80422u(h2Var.getContent(), (String) null)) != null) {
                    charSequence = ((C76979h) C86312j.m106911c(cls)).op0(this.f220760h, charSequence.toString().replace("[" + u.f195596l1 + "]", ""), i);
                }
            } else if (z && (h2Var.mo108786G2() > 1 || h2Var.mo108788I2() > 0)) {
                spannableStringBuilder.append(this.f220760h.getString(C0966R.string.gls, new Object[]{Integer.valueOf(h2Var.mo108786G2()), ""}));
                spannableStringBuilder.append(charSequence);
                return spannableStringBuilder;
            } else if (C72996z1.m85841l5(h2Var.getUsername())) {
                C21287a aVar = C21287a.f60143a;
                CharSequence c = aVar.mo33262c(i, this.f220760h, h2Var);
                if (c != null && c.length() > 0) {
                    return c;
                }
                boolean k3 = h2Var.mo108372k3(16);
                if (h2Var.mo108786G2() > 1 || (!k3 && h2Var.mo108786G2() > 0)) {
                    if (k3) {
                        if (h2Var.mo108372k3(32)) {
                            return TextUtils.concat(new CharSequence[]{this.f220760h.getString(C0966R.string.gll, new Object[]{Integer.valueOf(h2Var.mo108786G2())}), " ", aVar.mo33263d(i, this.f220760h), charSequence});
                        }
                        spannableStringBuilder.append(this.f220760h.getString(C0966R.string.gls, new Object[]{Integer.valueOf(h2Var.mo108786G2()), ""}));
                        spannableStringBuilder.append(charSequence);
                        return spannableStringBuilder;
                    } else if (C19615i1.m21055b()) {
                        spannableStringBuilder.append(this.f220760h.getString(C0966R.string.glm, new Object[]{Integer.valueOf(h2Var.mo108786G2()), ""}));
                        spannableStringBuilder.append(charSequence);
                        return spannableStringBuilder;
                    }
                } else if (h2Var.mo108372k3(32)) {
                    return TextUtils.concat(new CharSequence[]{aVar.mo33263d(i, this.f220760h), charSequence});
                }
            } else if (C72996z1.m85806K4(h2Var.getUsername()) && (h2Var.mo108786G2() > 1 || h2Var.mo108788I2() > 0)) {
                spannableStringBuilder.append(this.f220760h.getString(C0966R.string.gls, new Object[]{Integer.valueOf(h2Var.mo108786G2()), ""}));
                spannableStringBuilder.append(charSequence);
                return spannableStringBuilder;
            } else if (mo103881H(h2Var.mo108781B2()) == 889192497 || mo103881H(h2Var.mo108781B2()) == 922746929) {
                return ((C78384d) C86312j.m106911c(C78384d.class)).mo108132v9(this.f220760h, mo103881H(h2Var.mo108781B2()), h2Var.getContent(), h2Var.getUsername(), i);
            } else {
                if ((h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0) && mo103881H(h2Var.mo108781B2()) == 318767153 && !C45628s0.m50770e(h2Var.getUsername()) && !C72996z1.m85840k5(h2Var.getUsername())) {
                    String str = "[" + this.f220760h.getString(C0966R.string.f360873fi2) + "]";
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(str);
                    spannableStringBuilder8.setSpan(new ForegroundColorSpan(this.f220760h.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder8.length(), 33);
                    if (h2Var.mo108822p2() != null) {
                        if (h2Var.mo108822p2().startsWith("[" + this.f220760h.getString(C0966R.string.f360873fi2) + "]")) {
                            spannableStringBuilder8.append(h2Var.mo108822p2().replace(str, ""));
                            return spannableStringBuilder.append(spannableStringBuilder8);
                        }
                    }
                    spannableStringBuilder8.append(h2Var.mo108822p2());
                    return spannableStringBuilder.append(spannableStringBuilder8);
                }
            }
            return spannableStringBuilder.append(charSequence);
        }
    }
}
