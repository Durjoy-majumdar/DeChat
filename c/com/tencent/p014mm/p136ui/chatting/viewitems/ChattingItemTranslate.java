package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecallVoiceTransTextActEvent;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import de3.C107029o;
import de3.C75355a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88494d;
import sn0.C90259e;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate */
public class ChattingItemTranslate extends RelativeLayout {

    /* renamed from: d */
    public MMNeat7extView f216945d;

    /* renamed from: e */
    public LinearLayout f216946e;

    /* renamed from: f */
    public ProgressBar f216947f;

    /* renamed from: g */
    public TextView f216948g;

    /* renamed from: h */
    public int f216949h = 0;

    /* renamed from: i */
    public boolean f216950i = false;

    /* renamed from: j */
    public MTimerHandler f216951j = null;

    /* renamed from: n */
    public long f216952n = 0;

    /* renamed from: o */
    public NeatTextView.C75245c f216953o;

    /* renamed from: p */
    public SpannableStringBuilder f216954p = new SpannableStringBuilder();

    /* renamed from: q */
    public int f216955q = 3;

    /* renamed from: r */
    public CharacterStyle f216956r = new ForegroundColorSpan(-5066062);

    /* renamed from: s */
    public CharacterStyle f216957s = new ForegroundColorSpan(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));

    /* renamed from: t */
    public GestureDetector f216958t = new GestureDetector(getContext(), new C73915b());

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$a */
    public class C73914a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ int f216959d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f216960e;

        /* renamed from: f */
        public final /* synthetic */ long f216961f;

        public C73914a(int i, CharSequence charSequence, long j) {
            this.f216959d = i;
            this.f216960e = charSequence;
            this.f216961f = j;
        }

        public boolean onTimerExpired() {
            ChattingItemTranslate.this.f216954p.clear();
            ChattingItemTranslate chattingItemTranslate = ChattingItemTranslate.this;
            int i = chattingItemTranslate.f216949h + 2;
            int i2 = this.f216959d;
            if (i > i2) {
                i = i2;
            }
            Log.m105919d("MicroMsg.ChattingItemTranslate", "(%s)currentContentLength:%s newCurrentContentLength:%s endNum:%s animating:%s", Integer.valueOf(chattingItemTranslate.f216945d.hashCode()), Integer.valueOf(ChattingItemTranslate.this.f216949h), Integer.valueOf(i), Integer.valueOf(this.f216959d), Boolean.valueOf(ChattingItemTranslate.this.f216950i));
            ChattingItemTranslate chattingItemTranslate2 = ChattingItemTranslate.this;
            chattingItemTranslate2.f216949h = i;
            MMNeat7extView mMNeat7extView = chattingItemTranslate2.f216945d;
            SpannableStringBuilder spannableStringBuilder = chattingItemTranslate2.f216954p;
            CharSequence charSequence = this.f216960e;
            chattingItemTranslate2.getClass();
            if (!(spannableStringBuilder == null || charSequence == null || charSequence.length() == 0)) {
                int length = charSequence.length();
                if (charSequence.length() >= i) {
                    length = i + 3;
                    if (length > charSequence.length()) {
                        length = charSequence.length();
                    }
                } else {
                    i = length;
                }
                spannableStringBuilder.append(charSequence.subSequence(0, length)).setSpan(chattingItemTranslate2.f216957s, i, length, 33);
            }
            mMNeat7extView.mo104279b(spannableStringBuilder);
            int i3 = this.f216959d;
            ChattingItemTranslate chattingItemTranslate3 = ChattingItemTranslate.this;
            if (i3 != chattingItemTranslate3.f216949h) {
                return true;
            }
            if (!chattingItemTranslate3.f216950i) {
                RecallVoiceTransTextActEvent recallVoiceTransTextActEvent = new RecallVoiceTransTextActEvent();
                recallVoiceTransTextActEvent.f193871d.f193872a = this.f216961f;
                recallVoiceTransTextActEvent.publish();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$b */
    public class C73915b extends GestureDetector.SimpleOnGestureListener {
        public C73915b() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            ChattingItemTranslate chattingItemTranslate = ChattingItemTranslate.this;
            NeatTextView.C75245c cVar = chattingItemTranslate.f216953o;
            if (cVar == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return false;
            }
            boolean b = cVar.mo103047b(chattingItemTranslate.f216945d, motionEvent);
            C117292a.m165362h(b, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return b;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c */
    public static class C73916c extends C74243t8 {

        /* renamed from: T */
        public int f216964T = 1;

        /* renamed from: U */
        public CharSequence f216965U;

        public C73916c(C72963f4 f4Var, boolean z, C78208e eVar, String str) {
            super(f4Var, z, eVar, str);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$d */
    public enum C73917d {
        Text,
        Voice
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e */
    public enum C73918e {
        NoTransform,
        PreTransform,
        Transforming,
        Transformed
    }

    public ChattingItemTranslate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo102991a(CharSequence charSequence, int i, long j) {
        if (i <= this.f216949h) {
            this.f216949h = i - 2;
        }
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(this.f216945d.hashCode());
        objArr[1] = Long.valueOf(j);
        objArr[2] = charSequence != null ? Util.secPrint(charSequence.toString()) : "null";
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(this.f216949h);
        Log.m105925i("MicroMsg.ChattingItemTranslate", "doVoiceTextAnimation(%s) %s %s %s %s", objArr);
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C73914a(i, charSequence, j), true);
        this.f216951j = mTimerHandler;
        mTimerHandler.startTimer(0, 200);
    }

    /* renamed from: b */
    public void mo102992b() {
        this.f216945d = (MMNeat7extView) findViewById(C0966R.C0970id.b9s);
        this.f216947f = (ProgressBar) findViewById(C0966R.C0970id.b9t);
        this.f216946e = (LinearLayout) findViewById(C0966R.C0970id.b9q);
        this.f216948g = (TextView) findViewById(C0966R.C0970id.b9p);
        MMNeat7extView mMNeat7extView = this.f216945d;
        mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(this.f216945d.getContext())));
    }

    /* renamed from: c */
    public void mo102993c(CharSequence charSequence, C73918e eVar) {
        mo102994d(charSequence, eVar, false, C73917d.Text, 0, (C67391b) null);
    }

    /* renamed from: d */
    public void mo102994d(CharSequence charSequence, C73918e eVar, boolean z, C73917d dVar, long j, C67391b bVar) {
        int i;
        int i2;
        C73918e eVar2 = C73918e.Transformed;
        C73918e eVar3 = C73918e.Transforming;
        if (!Util.isNullOrNil(charSequence)) {
            if (bVar != null) {
                new WeakReference(bVar);
            }
            this.f216945d.setMinWidth(C76577a.m92151b(MMApplicationContext.getContext(), 80));
            this.f216945d.setMaxWidth(((int) (((float) C74023i.m87885l(MMApplicationContext.getContext())) / C88494d.f255615g)) - C76577a.m92151b(MMApplicationContext.getContext(), 5));
            this.f216945d.setVisibility(0);
            this.f216947f.setVisibility(8);
            if (dVar == C73917d.Voice) {
                mo102995e(false);
                Log.m105919d("MicroMsg.ChattingItemTranslate", "setContent(%s) msgId:%s currentMsgId:%s content:%s status:%s canAnimation:%s currentContentLength:%s", Integer.valueOf(this.f216945d.hashCode()), Long.valueOf(j), Long.valueOf(this.f216952n), Util.secPrint(charSequence.toString()), eVar, Boolean.valueOf(z), Integer.valueOf(this.f216949h));
                if (this.f216952n != j) {
                    this.f216945d.mo104279b("");
                    this.f216949h = 0;
                    MTimerHandler mTimerHandler = this.f216951j;
                    if (mTimerHandler != null) {
                        mTimerHandler.stopTimer();
                    }
                    this.f216951j = null;
                    this.f216950i = false;
                }
                this.f216952n = j;
                if (z) {
                    this.f216945d.mo104279b("");
                    this.f216949h = 0;
                    MTimerHandler mTimerHandler2 = this.f216951j;
                    if (mTimerHandler2 != null) {
                        mTimerHandler2.stopTimer();
                    }
                    this.f216951j = null;
                    this.f216950i = true;
                }
                if (eVar == eVar2 && z) {
                    MTimerHandler mTimerHandler3 = this.f216951j;
                    if (mTimerHandler3 != null) {
                        mTimerHandler3.stopTimer();
                    }
                    mo102991a(charSequence, charSequence.length(), j);
                    this.f216950i = false;
                } else if (eVar == eVar3 || z) {
                    MTimerHandler mTimerHandler4 = this.f216951j;
                    if (mTimerHandler4 != null) {
                        mTimerHandler4.stopTimer();
                    }
                    if (charSequence.length() > 3) {
                        mo102991a(charSequence, charSequence.length() - 3, j);
                    } else {
                        this.f216945d.mo104279b(charSequence);
                    }
                } else if (eVar != eVar2 || this.f216951j == null) {
                    this.f216945d.mo104279b(charSequence);
                } else if (this.f216949h == charSequence.length()) {
                    this.f216945d.mo104279b(charSequence);
                } else if (this.f216950i) {
                    MTimerHandler mTimerHandler5 = this.f216951j;
                    if (mTimerHandler5 != null) {
                        mTimerHandler5.stopTimer();
                    }
                    mo102991a(charSequence, charSequence.length(), j);
                    this.f216950i = false;
                }
            } else {
                if (eVar == eVar3) {
                    this.f216954p.clear();
                    MMNeat7extView mMNeat7extView = this.f216945d;
                    SpannableStringBuilder spannableStringBuilder = this.f216954p;
                    if (!(spannableStringBuilder == null || charSequence == null || charSequence.length() == 0)) {
                        if (charSequence.length() < this.f216955q) {
                            i2 = charSequence.length();
                            i = 0;
                        } else {
                            i2 = charSequence.length();
                            i = i2 - this.f216955q;
                        }
                        spannableStringBuilder.append(charSequence).setSpan(this.f216956r, i, i2, 33);
                    }
                    mMNeat7extView.mo104279b(spannableStringBuilder);
                } else {
                    this.f216945d.mo104279b(charSequence);
                }
                if (eVar == eVar2) {
                    mo102995e(true);
                } else {
                    mo102995e(false);
                }
            }
        } else if (eVar != C73918e.NoTransform) {
            this.f216947f.setVisibility(0);
            this.f216945d.setVisibility(8);
            mo102995e(false);
        }
        setVisibility(0);
    }

    /* renamed from: e */
    public final void mo102995e(boolean z) {
        Context context = MMApplicationContext.getContext();
        if (context != null) {
            if (z) {
                this.f216945d.setPadding(C76577a.m92151b(context, 10), C76577a.m92151b(context, 8), C76577a.m92151b(context, 10), C76577a.m92151b(context, 4));
                this.f216946e.setVisibility(0);
                return;
            }
            this.f216945d.setPadding(C76577a.m92151b(context, 10), C76577a.m92151b(context, 8), C76577a.m92151b(context, 10), C76577a.m92151b(context, 8));
            this.f216946e.setVisibility(8);
        }
    }

    public MMNeat7extView getContentView() {
        return this.f216945d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        int action = motionEvent.getAction();
        boolean z = false;
        if (!(this.f216953o == null || (gestureDetector = this.f216958t) == null)) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, z, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    public void setBrandWording(String str) {
        this.f216948g.setText(str);
    }

    public void setOnDoubleClickListener(NeatTextView.C75245c cVar) {
        this.f216953o = cVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            this.f216947f.setVisibility(8);
        }
    }
}
