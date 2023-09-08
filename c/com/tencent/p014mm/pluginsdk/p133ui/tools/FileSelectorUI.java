package com.tencent.p014mm.pluginsdk.p133ui.tools;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.SendFileInWidgetStruct;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.chatting.C106690i4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C97243i1;
import com.tencent.p014mm.plugin.fts.p059ui.C68987c;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.p133ui.pin.PinnedHeaderRecyclerView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.FileReaderHelper;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import ee3.C45650a;
import ew1.C97754e;
import f40.C86709a0;
import fe3.C58970b;
import fy3.C32224a;
import ge3.C59409a;
import ge3.C59414b;
import ge3.C59415c;
import ge3.C59416d;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hw1.C60220r;
import hw1.C60222v;
import hw1.C98554s;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C99664b;
import lv1.C99681n;
import nd3.C88930e;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import p1042u.C118556h;
import p1042u.C90590d;
import p262wm.C22921c;
import p272xq.C102712e;
import p447aw.C103918d;
import p90.C100687b;
import q90.C101069i;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C77691f;
import sx3.C64197v;
import sx3.C77813z;
import z04.C112550d0;
import z04.C112551y;
import zd3.C66789c;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/FileSelectorUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(19)
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI */
public final class FileSelectorUI extends MMSecDataActivity {

    /* renamed from: y */
    public static final C72909b f283702y = new C72909b((C8480h) null);

    /* renamed from: d */
    public int f283703d;

    /* renamed from: e */
    public String f283704e;

    /* renamed from: f */
    public ListView f283705f;

    /* renamed from: g */
    public final C13601g f283706g = C36568h.m40985a(new C57544o(this));

    /* renamed from: h */
    public TextView f283707h;

    /* renamed from: i */
    public C96831e f283708i;

    /* renamed from: j */
    public C97243i1 f283709j;

    /* renamed from: n */
    public View f283710n;

    /* renamed from: o */
    public boolean f283711o;

    /* renamed from: p */
    public String f283712p;

    /* renamed from: q */
    public DropdownListView f283713q;

    /* renamed from: r */
    public DropdownListView.C72901b f283714r;

    /* renamed from: s */
    public final IListener<?> f283715s = new FileSelectorUI$exitMultiTalkListener$1(this, C40008f.f107254d);

    /* renamed from: t */
    public boolean f283716t = true;

    /* renamed from: u */
    public C96837f f283717u = new C96837f();

    /* renamed from: v */
    public C106690i4 f283718v;

    /* renamed from: w */
    public boolean f283719w;

    /* renamed from: x */
    public final AdapterView.OnItemClickListener f283720x = new C96858z(this);

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$o */
    public static final class C57544o extends C87413o implements C32224a<C59409a> {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f164788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57544o(FileSelectorUI fileSelectorUI) {
            super(0);
            this.f164788d = fileSelectorUI;
        }

        public Object invoke() {
            return new C59409a(this.f164788d);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$b */
    public static final class C72909b {
        public C72909b(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo100786a(Context context) {
            C87412m.m108594g(context, "context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            if (rotation == 0) {
                return 0;
            }
            if (rotation == 1) {
                return 90;
            }
            if (rotation != 2) {
                return rotation != 3 ? 0 : 270;
            }
            return 180;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$t */
    public static final class C72910t implements DropdownListView.C72904e {
        /* renamed from: a */
        public void mo100776a(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$u */
    public static final class C72911u implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f212500d;

        public C72911u(FileSelectorUI fileSelectorUI) {
            this.f212500d = fileSelectorUI;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f212500d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$x */
    public static final class C72912x implements View.OnClickListener {

        /* renamed from: d */
        public static final C72912x f212501d = new C72912x();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$a */
    public final class C96826a extends C96830d implements C61173o {

        /* renamed from: o */
        public final MMHandler f283721o = new MMHandler();

        /* renamed from: p */
        public C99664b f283722p;

        /* renamed from: q */
        public final List<Long> f283723q = new ArrayList();

        /* renamed from: r */
        public final /* synthetic */ FileSelectorUI f283724r;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$a$a */
        public static final class C96827a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C96826a f283725d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96827a(C96826a aVar) {
                super(0);
                this.f283725d = aVar;
            }

            public Object invoke() {
                this.f283725d.f283728d.mo135156i();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96826a(FileSelectorUI fileSelectorUI, C96831e eVar) {
            super(fileSelectorUI, eVar);
            C87412m.m108594g(eVar, "adapter");
            this.f283724r = fileSelectorUI;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            C87412m.m108594g(lVar, "ftsResult");
            int i = lVar.f32074c;
            if (i == -3 || i == -2 || i == -1) {
                Log.m105920e("MicroMsg.FileSelectorUI", "get msgId fail, errorCode:" + lVar.f32074c);
            } else if (i == 0) {
                Log.m105924i("MicroMsg.FileSelectorUI", "onFTSSearchEnd, size:" + lVar.f32076e.size());
                for (C99681n next : lVar.f32076e) {
                    ((ArrayList) this.f283723q).add(Long.valueOf(next.f292150d));
                    Log.m105918d("MicroMsg.FileSelectorUI", "msgId:" + next.f292150d);
                }
            }
            mo135140d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x01b0 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x02aa  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x02c5 A[SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo135140d() {
            /*
                r20 = this;
                r0 = r20
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r1 = r0.f283730f
                int r1 = r1.size()
            L_0x0008:
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r2 = r0.f283730f
                int r2 = r2.size()
                int r2 = r2 - r1
                r3 = 10
                if (r2 >= r3) goto L_0x02f0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                int r4 = r0.f283733i
                int r5 = r0.f283729e
                int r4 = r4 + r5
                java.util.List<java.lang.Long> r5 = r0.f283723q
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                int r5 = r5.size()
                if (r4 <= r5) goto L_0x0030
                java.util.List<java.lang.Long> r4 = r0.f283723q
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                int r4 = r4.size()
                goto L_0x0035
            L_0x0030:
                int r4 = r0.f283733i
                int r5 = r0.f283729e
                int r4 = r4 + r5
            L_0x0035:
                int r5 = r0.f283733i
                java.lang.String r6 = "MicroMsg.FileSelectorUI"
                if (r4 > r5) goto L_0x005b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "coreLoad, not data to load, "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = " < "
                r1.append(r2)
                int r2 = r0.f283733i
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x02f0
            L_0x005b:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "coreLoad, startIndex:"
                r5.append(r7)
                int r7 = r0.f283733i
                r5.append(r7)
                java.lang.String r7 = ", endIndex:"
                r5.append(r7)
                r5.append(r4)
                java.lang.String r7 = ", totalCnt:"
                r5.append(r7)
                java.util.List<java.lang.Long> r7 = r0.f283723q
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                int r7 = r7.size()
                r5.append(r7)
                java.lang.String r7 = ", PageSize:"
                r5.append(r7)
                int r7 = r0.f283729e
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                int r5 = r0.f283733i
            L_0x0095:
                if (r5 >= r4) goto L_0x00a5
                java.util.List<java.lang.Long> r7 = r0.f283723q
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.lang.Object r7 = r7.get(r5)
                r2.add(r7)
                int r5 = r5 + 1
                goto L_0x0095
            L_0x00a5:
                eb0.c r4 = eb0.C97625j3.m125812b()
                g62.l r4 = r4.mo105911z()
                java.lang.String r5 = r0.f283734j
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                r4.getClass()
                java.lang.StringBuffer r7 = new java.lang.StringBuffer
                r7.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00bd:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x00d2
                java.lang.Object r8 = r2.next()
                java.lang.Long r8 = (java.lang.Long) r8
                r7.append(r8)
                java.lang.String r8 = ","
                r7.append(r8)
                goto L_0x00bd
            L_0x00d2:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "SELECT * FROM "
                r8.append(r9)
                java.lang.String r5 = r4.hy0(r5)
                r8.append(r5)
                java.lang.String r5 = " WHERE "
                r8.append(r5)
                java.lang.String r5 = "msgId"
                r8.append(r5)
                java.lang.String r5 = " IN ("
                r8.append(r5)
                int r5 = r7.length()
                r9 = 1
                int r5 = r5 - r9
                r10 = 0
                java.lang.String r5 = r7.substring(r10, r5)
                r8.append(r5)
                java.lang.String r5 = ") ORDER BY "
                r8.append(r5)
                java.lang.String r5 = "createTime"
                r8.append(r5)
                java.lang.String r5 = " DESC "
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                java.lang.Object[] r7 = new java.lang.Object[r9]
                r7[r10] = r5
                java.lang.String r8 = "MicroMsg.MsgInfoStorage"
                java.lang.String r11 = "getAppMsgTypeList sql=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r11, r7)
                zh3.f r4 = r4.f212775p
                r7 = 0
                r8 = 2
                android.database.Cursor r4 = r4.rawQuery(r5, r7, r8)
            L_0x012c:
                boolean r5 = r4.moveToNext()
                if (r5 == 0) goto L_0x0144
                com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4
                r5.<init>()
                r5.convertFrom(r4)
                boolean r11 = r5.mo101020w3()
                if (r11 == 0) goto L_0x012c
                r2.add(r5)
                goto L_0x012c
            L_0x0144:
                r4.close()
                int r4 = r0.f283733i
                int r5 = r0.f283729e
                int r4 = r4 + r5
                r0.f283733i = r4
                int r4 = r2.size()
                if (r4 != 0) goto L_0x0156
                goto L_0x02f0
            L_0x0156:
                java.util.Iterator r4 = r2.iterator()
            L_0x015a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x02ce
                java.lang.Object r5 = r4.next()
                com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
                long r11 = java.lang.System.currentTimeMillis()
                if (r5 != 0) goto L_0x016d
                goto L_0x01ca
            L_0x016d:
                java.lang.String r13 = r5.getContent()
                com.tencent.mm.message.l$b r13 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r13, r7)
                if (r13 != 0) goto L_0x0178
                goto L_0x01ca
            L_0x0178:
                int r14 = r13.f195582i
                r15 = 6
                if (r14 == r15) goto L_0x0184
                java.lang.String r5 = "is not FILE?!! MayBe queryConversationTypeMessage wrong"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
                goto L_0x01ca
            L_0x0184:
                java.lang.String r14 = r13.f195606o
                com.tencent.mm.pluginsdk.model.app.d r14 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r14)
                if (r14 == 0) goto L_0x01a7
                com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
                java.lang.String r3 = r14.field_fileFullPath
                r7.<init>((java.lang.String) r3)
                boolean r3 = r7.mo119967g()
                if (r3 == 0) goto L_0x01a7
                long r16 = r7.mo119980r()
                r18 = r11
                long r10 = r14.field_totalLen
                int r7 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x01a9
                r7 = 1
                goto L_0x01aa
            L_0x01a7:
                r18 = r11
            L_0x01a9:
                r7 = 0
            L_0x01aa:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r10 = r0.f283724r
                int r10 = r10.f283703d
                if (r10 == 0) goto L_0x01b2
                if (r9 != r10) goto L_0x01cf
            L_0x01b2:
                if (r7 != 0) goto L_0x01cf
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "file not download, "
                r5.append(r7)
                java.lang.String r7 = r13.f195570f
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            L_0x01ca:
                r11 = r4
                r8 = 10
                goto L_0x025e
            L_0x01cf:
                long r10 = r5.getMsgId()
                java.lang.String r12 = r13.f195606o
                com.tencent.mm.pluginsdk.model.app.d r12 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r12)
                if (r12 != 0) goto L_0x01e3
                com.tencent.mm.pluginsdk.model.app.e r12 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                com.tencent.mm.pluginsdk.model.app.d r12 = r12.mo100150Yt(r10)
            L_0x01e3:
                if (r12 != 0) goto L_0x01f8
                java.lang.Object[] r10 = new java.lang.Object[r9]
                com.tencent.mm.sdk.platformtools.MMStack r11 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
                r3 = 0
                r10[r3] = r11
                java.lang.String r11 = "felix getAppAttachInfo is null stack[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r11, r10)
                r11 = r4
                r3 = 0
                r8 = 10
                goto L_0x0253
            L_0x01f8:
                r3 = 0
                r10 = 11
                java.lang.Object[] r10 = new java.lang.Object[r10]
                r10[r3] = r12
                r11 = r4
                long r3 = r12.systemRowid
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r10[r9] = r3
                boolean r3 = r12.field_isUpload
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r10[r8] = r3
                r3 = 3
                java.lang.String r4 = r12.field_fileFullPath
                r10[r3] = r4
                r3 = 4
                long r8 = r12.field_totalLen
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r10[r3] = r8
                r3 = 5
                long r8 = r12.field_offset
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r10[r3] = r8
                java.lang.String r3 = r12.field_mediaSvrId
                r10[r15] = r3
                r3 = 7
                java.lang.String r8 = r12.field_mediaId
                r10[r3] = r8
                r3 = 8
                long r8 = r12.field_msgInfoId
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r10[r3] = r8
                r3 = 9
                long r8 = r12.field_type
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r10[r3] = r8
                com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
                r8 = 10
                r10[r8] = r3
                java.lang.String r3 = "felix getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r10)
                java.lang.String r3 = r12.field_fileFullPath
            L_0x0253:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r9 == 0) goto L_0x0260
                java.lang.String r3 = "createFileListItem, chatting filePath is null, filter!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)
            L_0x025e:
                r9 = 0
                goto L_0x02a7
            L_0x0260:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r9 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r10 = r0.f283724r
                r9.<init>()
                long r14 = r5.getMsgId()
                r9.f283780d = r14
                long r14 = r5.getCreateTime()
                r9.f283781e = r14
                java.lang.String r5 = r13.f195488G
                java.lang.String r5 = r0.mo135142a(r5)
                r9.f283782f = r5
                de3.u r5 = new de3.u
                java.lang.String r12 = r13.f195570f
                r5.<init>((java.lang.String) r12)
                r9.f283783g = r5
                int r5 = r13.f195594l
                long r12 = (long) r5
                r9.f283785i = r12
                r9.f283784h = r3
                r9.f283787k = r7
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "end create, cost:"
                r3.append(r5)
                long r12 = java.lang.System.currentTimeMillis()
                long r12 = r12 - r18
                r3.append(r12)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            L_0x02a7:
                if (r9 != 0) goto L_0x02aa
                goto L_0x02c5
            L_0x02aa:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$g r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96838g.TYPE_FILE
                r9.f283792a = r3
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96839h.FROM_CHATTING
                r9.f283793b = r3
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r3 = r0.f283724r
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                long r12 = r9.f283781e
                java.lang.String r3 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85108a(r3, r12)
                r9.f283794c = r3
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r3 = r0.f283730f
                r3.add(r9)
            L_0x02c5:
                r4 = r11
                r3 = 10
                r7 = 0
                r8 = 2
                r9 = 1
                r10 = 0
                goto L_0x015a
            L_0x02ce:
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5 = 0
                r3[r5] = r2
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r2 = r0.f283730f
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 1
                r3[r4] = r2
                java.lang.String r2 = "append file item list size %d, current total size is %d(chatting)"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r3)
                goto L_0x0008
            L_0x02f0:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$a$a r1 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$a$a
                r1.<init>(r0)
                o40.C61926c.m72668M(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96826a.mo135140d():void");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$a0 */
    public static final class C96828a0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283726d;

        public C96828a0(FileSelectorUI fileSelectorUI) {
            this.f283726d = fileSelectorUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.FileSelectorUI", "onKeyDown, go back");
            FileSelectorUI fileSelectorUI = this.f283726d;
            C72909b bVar = FileSelectorUI.f283702y;
            fileSelectorUI.mo135137M7(true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$c */
    public final class C96829c extends C96830d {

        /* renamed from: o */
        public final /* synthetic */ FileSelectorUI f283727o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96829c(FileSelectorUI fileSelectorUI, C96831e eVar) {
            super(fileSelectorUI, eVar);
            C87412m.m108594g(eVar, "adapter");
            this.f283727o = fileSelectorUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0218, code lost:
            if (r13 != 18) goto L_0x02bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0241, code lost:
            if (r12.mo119967g() == false) goto L_0x02b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b0, code lost:
            if (r12.mo119967g() == false) goto L_0x02b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b7, code lost:
            if (r12.mo119967g() == false) goto L_0x02b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b9, code lost:
            r16 = true;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x02e9  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0304 A[SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final int m124383d(com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96829c r17) {
            /*
                r1 = r17
                r17.getClass()
                java.lang.Class<pb1.j1> r2 = pb1.C100718j1.class
                di3.d r0 = di3.C86312j.m106911c(r2)
                pb1.j1 r0 = (pb1.C100718j1) r0
                pb1.w0 r0 = r0.mo128199Jq()
                int r3 = r1.f283733i
                int r4 = r1.f283729e
                xb1.d r0 = (xb1.C102614d) r0
                r0.getClass()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "SELECT xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid FROM FavItemInfo WHERE itemStatus > 0 AND (type = 8 OR type = 14"
                r6.append(r7)
                java.lang.String r7 = " OR type = 18)"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                java.lang.String r6 = " ORDER BY updateTime DESC LIMIT "
                r7.append(r6)
                r7.append(r3)
                java.lang.String r3 = " , "
                r7.append(r3)
                r7.append(r4)
                java.lang.String r3 = r7.toString()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f302175d
                r4 = 2
                r6 = 0
                android.database.Cursor r0 = r0.rawQuery(r3, r6, r4)
                if (r0 != 0) goto L_0x0059
                goto L_0x006e
            L_0x0059:
                boolean r3 = r0.moveToNext()
                if (r3 == 0) goto L_0x006b
                pb1.z r3 = new pb1.z
                r3.<init>()
                r3.convertFrom(r0)
                r5.add(r3)
                goto L_0x0059
            L_0x006b:
                r0.close()
            L_0x006e:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x007c:
                boolean r0 = r5.hasNext()
                java.lang.String r8 = "MicroMsg.FileSelectorUI"
                r9 = 8
                r10 = 18
                r11 = 14
                r12 = 0
                r13 = 1
                if (r0 == 0) goto L_0x013b
                java.lang.Object r0 = r5.next()
                pb1.z r0 = (pb1.C100755z) r0
                int r14 = r0.field_type
                if (r14 == r10) goto L_0x009d
                if (r14 != r11) goto L_0x0099
                goto L_0x009d
            L_0x0099:
                r7.add(r0)
                goto L_0x007c
            L_0x009d:
                te3.kd0 r11 = r0.field_favProto     // Catch:{ Exception -> 0x0113 }
                java.util.LinkedList<te3.rc0> r11 = r11.f298618f     // Catch:{ Exception -> 0x0113 }
                java.lang.String r14 = "favItemInfo.field_favProto.getDataList()"
                gy3.C87412m.m108593f(r11, r14)     // Catch:{ Exception -> 0x0113 }
                int r14 = r0.field_type     // Catch:{ Exception -> 0x0113 }
                if (r14 != r10) goto L_0x00ac
                r10 = 1
                goto L_0x00ad
            L_0x00ac:
                r10 = 0
            L_0x00ad:
                int r14 = r11.size()     // Catch:{ Exception -> 0x0113 }
                if (r10 >= r14) goto L_0x007c
                java.lang.Object r14 = r11.get(r10)     // Catch:{ Exception -> 0x0113 }
                te3.rc0 r14 = (te3.C101834rc0) r14     // Catch:{ Exception -> 0x0113 }
                int r15 = r14.f299258I     // Catch:{ Exception -> 0x0113 }
                if (r15 != r9) goto L_0x010a
                pb1.z r15 = r0.clone()     // Catch:{ Exception -> 0x0113 }
                r15.field_type = r9     // Catch:{ Exception -> 0x0113 }
                r15.f295172Q0 = r13     // Catch:{ Exception -> 0x0113 }
                r15.f295173R0 = r0     // Catch:{ Exception -> 0x0113 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0113 }
                r6.<init>()     // Catch:{ Exception -> 0x0113 }
                r16 = r5
                long r4 = r0.field_localId     // Catch:{ Exception -> 0x0108 }
                r6.append(r4)     // Catch:{ Exception -> 0x0108 }
                r4 = 95
                r6.append(r4)     // Catch:{ Exception -> 0x0108 }
                java.lang.String r4 = r14.f299280T     // Catch:{ Exception -> 0x0108 }
                r6.append(r4)     // Catch:{ Exception -> 0x0108 }
                java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0108 }
                r15.f295174S0 = r4     // Catch:{ Exception -> 0x0108 }
                java.lang.String r4 = r14.f299280T     // Catch:{ Exception -> 0x0108 }
                r15.f295175T0 = r4     // Catch:{ Exception -> 0x0108 }
                te3.kd0 r4 = r0.field_favProto     // Catch:{ Exception -> 0x0108 }
                te3.kd0 r4 = rb1.C101369c.m133013a(r4)     // Catch:{ Exception -> 0x0108 }
                r15.field_favProto = r4     // Catch:{ Exception -> 0x0108 }
                java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ Exception -> 0x0108 }
                r5.<init>()     // Catch:{ Exception -> 0x0108 }
                r4.f298618f = r5     // Catch:{ Exception -> 0x0108 }
                te3.kd0 r4 = r15.field_favProto     // Catch:{ Exception -> 0x0108 }
                java.util.LinkedList<te3.rc0> r4 = r4.f298618f     // Catch:{ Exception -> 0x0108 }
                r4.add(r14)     // Catch:{ Exception -> 0x0108 }
                te3.kd0 r4 = r15.field_favProto     // Catch:{ Exception -> 0x0108 }
                java.lang.String r5 = r14.f299297d     // Catch:{ Exception -> 0x0108 }
                r4.mo141220r(r5)     // Catch:{ Exception -> 0x0108 }
                r7.add(r15)     // Catch:{ Exception -> 0x0108 }
                goto L_0x010c
            L_0x0108:
                r0 = move-exception
                goto L_0x0116
            L_0x010a:
                r16 = r5
            L_0x010c:
                int r10 = r10 + 1
                r5 = r16
                r4 = 2
                r6 = 0
                goto L_0x00ad
            L_0x0113:
                r0 = move-exception
                r16 = r5
            L_0x0116:
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
                r4[r12] = r5
                java.lang.Class r5 = r0.getClass()
                java.lang.String r5 = r5.getSimpleName()
                r4[r13] = r5
                java.lang.String r0 = r0.getMessage()
                r5 = 2
                r4[r5] = r0
                java.lang.String r0 = "getSearchList() [%s] Exception:%s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r4)
                r5 = r16
                r4 = 2
                r6 = 0
                goto L_0x007c
            L_0x013b:
                r3.addAll(r7)
                int r0 = r1.f283733i
                int r4 = r1.f283729e
                int r0 = r0 + r4
                r1.f283733i = r0
                int r0 = r3.size()
                if (r0 > 0) goto L_0x014d
                goto L_0x032c
            L_0x014d:
                java.util.Iterator r0 = r3.iterator()
            L_0x0151:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0308
                java.lang.Object r4 = r0.next()
                pb1.z r4 = (pb1.C100755z) r4
                java.lang.Class<xq.e> r5 = p272xq.C102712e.class
                if (r4 != 0) goto L_0x0162
                goto L_0x01c3
            L_0x0162:
                te3.kd0 r6 = r4.field_favProto
                if (r6 != 0) goto L_0x0167
                goto L_0x01c3
            L_0x0167:
                java.util.LinkedList<te3.rc0> r6 = r6.f298618f
                if (r6 != 0) goto L_0x016c
                goto L_0x01c3
            L_0x016c:
                int r6 = r6.size()
                if (r6 > 0) goto L_0x0173
                goto L_0x01c3
            L_0x0173:
                te3.kd0 r6 = r4.field_favProto
                java.util.LinkedList<te3.rc0> r6 = r6.f298618f
                java.lang.Object r6 = r6.get(r12)
                te3.rc0 r6 = (te3.C101834rc0) r6
                if (r6 != 0) goto L_0x0180
                goto L_0x01c3
            L_0x0180:
                di3.d r7 = di3.C86312j.m106911c(r5)
                xq.e r7 = (p272xq.C102712e) r7
                java.lang.String r7 = r7.mo142091L2(r6)
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r14 == 0) goto L_0x0196
                java.lang.String r4 = "createFileListItem, fav filePath is null ,filter"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r4)
                goto L_0x01c3
            L_0x0196:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$i r14 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$i
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r15 = r1.f283727o
                r14.<init>()
                long r12 = r4.field_updateTime
                r14.f283781e = r12
                java.lang.String r12 = r4.field_fromUser
                java.lang.String r12 = r1.mo135142a(r12)
                r14.f283782f = r12
                long r12 = r6.f299276R
                r14.f283785i = r12
                int r12 = r6.f299322q1
                r14.f283786j = r12
                java.lang.String r12 = r6.f299325s
                r14.f283778q = r12
                java.lang.String r12 = r6.f299297d
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x01c6
                java.lang.String r4 = "invalid title"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            L_0x01c3:
                r14 = 0
                goto L_0x02e6
            L_0x01c6:
                java.lang.String r12 = r6.f299297d
                java.lang.String r13 = "dataItem.title"
                gy3.C87412m.m108593f(r12, r13)
                r14.f283783g = r12
                r14.f283784h = r7
                int r7 = r4.field_itemStatus
                if (r7 <= 0) goto L_0x01dd
                boolean r7 = pb1.C100734q.m131841c0(r4)
                if (r7 != 0) goto L_0x01dd
                goto L_0x02bd
            L_0x01dd:
                di3.d r7 = di3.C86312j.m106911c(r2)
                java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.plugin.fav.api.IPluginFav"
                gy3.C87412m.m108592e(r7, r12)
                pb1.j1 r7 = (pb1.C100718j1) r7
                pb1.w0 r7 = r7.mo128199Jq()
                long r12 = r4.field_localId
                xb1.d r7 = (xb1.C102614d) r7
                pb1.z r7 = r7.mo142266Yt(r12)
                com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1
                di3.d r13 = di3.C86312j.m106911c(r5)
                xq.e r13 = (p272xq.C102712e) r13
                te3.rc0 r15 = pb1.C100734q.m131813D(r4)
                java.lang.String r13 = r13.mo142091L2(r15)
                r12.<init>((java.lang.String) r13)
                int r13 = r4.field_type
                r15 = 2
                if (r13 == r15) goto L_0x02b3
                r15 = 4
                if (r13 == r15) goto L_0x029b
                if (r13 == r9) goto L_0x02b3
                if (r13 == r11) goto L_0x0245
                r15 = 16
                if (r13 == r15) goto L_0x021c
                if (r13 == r10) goto L_0x0245
                goto L_0x02bd
            L_0x021c:
                java.lang.Class<lc3.b> r5 = lc3.C10485b.class
                k40.a r5 = f40.C86709a0.m107533q(r5)
                lc3.b r5 = (lc3.C10485b) r5
                pj.f r5 = r5.vh0()
                java.lang.String r7 = "SIGHTCannotTransmitForFav"
                java.lang.String r5 = r5.mo107405c(r7)
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
                if (r5 == 0) goto L_0x023d
                java.lang.String r5 = "MicroMsg.FavSendFilter"
                java.lang.String r7 = "can not retransmit short video"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
                goto L_0x02bd
            L_0x023d:
                boolean r5 = r12.mo119967g()
                if (r5 != 0) goto L_0x02bd
                goto L_0x02b9
            L_0x0245:
                int r12 = r4.field_id
                if (r12 > 0) goto L_0x024d
                if (r7 == 0) goto L_0x024d
                goto L_0x02bd
            L_0x024d:
                te3.kd0 r7 = r4.field_favProto
                if (r7 == 0) goto L_0x02bd
                java.util.LinkedList<te3.rc0> r7 = r7.f298618f
                int r7 = r7.size()
                r12 = 1
                if (r7 > r12) goto L_0x025b
                goto L_0x02bd
            L_0x025b:
                te3.kd0 r7 = r4.field_favProto
                java.util.LinkedList<te3.rc0> r7 = r7.f298618f
                java.util.Iterator r7 = r7.iterator()
                java.lang.String r12 = "info.field_favProto.getDataList().iterator()"
                gy3.C87412m.m108593f(r7, r12)
            L_0x0268:
                boolean r12 = r7.hasNext()
                if (r12 == 0) goto L_0x02bd
                java.lang.Object r12 = r7.next()
                java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavDataItem"
                gy3.C87412m.m108592e(r12, r13)
                te3.rc0 r12 = (te3.C101834rc0) r12
                java.lang.String r13 = r12.f299325s
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 != 0) goto L_0x0268
                java.lang.String r13 = r12.f299329u
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 != 0) goto L_0x0268
                di3.d r13 = di3.C86312j.m106911c(r5)
                xq.e r13 = (p272xq.C102712e) r13
                java.lang.String r12 = r13.mo142091L2(r12)
                boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
                if (r12 != 0) goto L_0x0268
                goto L_0x02b9
            L_0x029b:
                te3.rc0 r5 = pb1.C100734q.m131813D(r4)
                java.lang.String r7 = "getFirstDataItem(info)"
                gy3.C87412m.m108593f(r5, r7)
                java.lang.String r5 = r5.f299242A
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x02bd
                boolean r5 = r12.mo119967g()
                if (r5 != 0) goto L_0x02bd
                goto L_0x02b9
            L_0x02b3:
                boolean r5 = r12.mo119967g()
                if (r5 != 0) goto L_0x02bd
            L_0x02b9:
                r5 = 1
                r16 = 1
                goto L_0x02c0
            L_0x02bd:
                r5 = 1
                r16 = 0
            L_0x02c0:
                r7 = r16 ^ 1
                r14.f283787k = r7
                java.lang.String r5 = r6.f299297d
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x02cf
                java.lang.String r5 = r6.f299297d
                goto L_0x02d3
            L_0x02cf:
                te3.kd0 r5 = r4.field_favProto
                java.lang.String r5 = r5.f298626q
            L_0x02d3:
                r14.f283776o = r5
                java.lang.String r5 = r6.f299301f
                r14.f283774m = r5
                java.lang.String r5 = r6.f299280T
                java.lang.String r6 = "dataItem.dataId"
                gy3.C87412m.m108593f(r5, r6)
                r14.f283775n = r5
                long r4 = r4.field_localId
                r14.f283777p = r4
            L_0x02e6:
                if (r14 != 0) goto L_0x02e9
                goto L_0x0304
            L_0x02e9:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$g r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96838g.TYPE_FILE
                r14.f283792a = r4
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96839h.FROM_FAV
                r14.f283793b = r4
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r4 = r1.f283727o
                androidx.appcompat.app.AppCompatActivity r4 = r4.getContext()
                long r5 = r14.f283781e
                java.lang.String r4 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85108a(r4, r5)
                r14.f283794c = r4
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r4 = r1.f283730f
                r4.add(r14)
            L_0x0304:
                r12 = 0
                r13 = 1
                goto L_0x0151
            L_0x0308:
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                int r2 = r3.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 0
                r0[r4] = r2
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r1 = r1.f283730f
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = "append file item list size %d, current total size is %d(fav)"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r1, r0)
                int r12 = r3.size()
            L_0x032c:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96829c.m124383d(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$c):int");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$d */
    public abstract class C96830d {

        /* renamed from: d */
        public final C96831e f283728d;

        /* renamed from: e */
        public int f283729e = 100;

        /* renamed from: f */
        public List<C96841j> f283730f;

        /* renamed from: g */
        public List<C96841j> f283731g;

        /* renamed from: h */
        public boolean f283732h;

        /* renamed from: i */
        public int f283733i;

        /* renamed from: j */
        public String f283734j;

        /* renamed from: n */
        public final /* synthetic */ FileSelectorUI f283735n;

        public C96830d(FileSelectorUI fileSelectorUI, C96831e eVar) {
            C87412m.m108594g(eVar, "adapter");
            this.f283735n = fileSelectorUI;
            this.f283728d = eVar;
            List<C96841j> synchronizedList = Collections.synchronizedList(new ArrayList());
            C87412m.m108593f(synchronizedList, "synchronizedList(ArrayList<ListFileItem>())");
            this.f283730f = synchronizedList;
            List<C96841j> synchronizedList2 = Collections.synchronizedList(new ArrayList());
            C87412m.m108593f(synchronizedList2, "synchronizedList(ArrayList<ListFileItem>())");
            this.f283731g = synchronizedList2;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            this.f283734j = s;
        }

        /* renamed from: a */
        public final String mo135142a(String str) {
            String string = this.f283735n.getString(C0966R.string.bby, new Object[]{(Util.isNullOrNil(str) || C87412m.m108589b(str, C75592q0.m90789s())) ? this.f283735n.getString(C0966R.string.f361084h53) : ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str)});
            C87412m.m108593f(string, "getString(R.string.chatt…ce_from, displayFromUser)");
            return string;
        }

        /* renamed from: b */
        public final CharSequence mo135143b(String str, CharSequence charSequence) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(charSequence);
            int B = C112550d0.m153766B(charSequence, str, 0, true);
            spannableString.setSpan(new ForegroundColorSpan(C68987c.f198231a), B, str.length() + B, 33);
            spannableStringBuilder.append(spannableString);
            return spannableStringBuilder;
        }

        /* renamed from: c */
        public final List<C96841j> mo135144c(String str) {
            C87412m.m108594g(str, "key");
            this.f283731g.clear();
            if (Util.isNullOrNil(str)) {
                for (C96841j next : this.f283730f) {
                    next.f283782f = String.valueOf(next.f283782f);
                    String obj = next.mo135164c().toString();
                    C87412m.m108594g(obj, "<set-?>");
                    next.f283783g = obj;
                    this.f283731g.add(next.mo135162a());
                }
            } else {
                for (C96841j next2 : this.f283730f) {
                    CharSequence charSequence = next2.f283782f;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    boolean u = C112550d0.m153801u(next2.mo135164c(), str, true);
                    boolean u2 = C112550d0.m153801u(charSequence, str, true);
                    if (u || u2) {
                        if (u) {
                            next2.f283783g = mo135143b(str, next2.mo135164c());
                        }
                        if (u2) {
                            next2.f283782f = mo135143b(str, charSequence);
                        }
                        this.f283731g.add(next2);
                    }
                }
            }
            return this.f283731g;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e */
    public final class C96831e extends BaseAdapter {

        /* renamed from: d */
        public final String f283736d = "MicroMsg.FileSelectorAdapter";

        /* renamed from: e */
        public final int f283737e = 4;

        /* renamed from: f */
        public List<C96843l> f283738f;

        /* renamed from: g */
        public final List<C96841j> f283739g;

        /* renamed from: h */
        public final C96826a f283740h;

        /* renamed from: i */
        public final C96829c f283741i;

        /* renamed from: j */
        public final C96845n f283742j;

        /* renamed from: n */
        public C96839h f283743n;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$a */
        public final class C96832a {

            /* renamed from: a */
            public FrameLayout f283745a;

            /* renamed from: b */
            public CheckBox f283746b;

            /* renamed from: c */
            public ImageView f283747c;

            /* renamed from: d */
            public TextView f283748d;

            /* renamed from: e */
            public TextView f283749e;

            /* renamed from: f */
            public TextView f283750f;

            /* renamed from: g */
            public TextView f283751g;

            /* renamed from: h */
            public View f283752h;

            public C96832a(C96831e eVar) {
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$b */
        public final class C96833b {

            /* renamed from: a */
            public FrameLayout f283753a;

            /* renamed from: b */
            public CheckBox f283754b;

            /* renamed from: c */
            public ImageView f283755c;

            /* renamed from: d */
            public TextView f283756d;

            /* renamed from: e */
            public TextView f283757e;

            /* renamed from: f */
            public TextView f283758f;

            public C96833b(C96831e eVar) {
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$c */
        public final class C96834c {

            /* renamed from: a */
            public TextView f283759a;

            public C96834c(C96831e eVar) {
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$d */
        public static final class C96835d implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C96831e f283760d;

            public C96835d(C96831e eVar) {
                this.f283760d = eVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C96831e eVar = this.f283760d;
                C87412m.m108593f(view, "v");
                C96831e.m124387a(eVar, view);
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$e */
        public static final class C96836e implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C96831e f283761d;

            public C96836e(C96831e eVar) {
                this.f283761d = eVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C96831e eVar = this.f283761d;
                C87412m.m108593f(view, "v");
                C96831e.m124387a(eVar, view);
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C96831e() {
            List<C96843l> synchronizedList = Collections.synchronizedList(new ArrayList());
            C87412m.m108593f(synchronizedList, "synchronizedList(ArrayList<ListItem>())");
            this.f283738f = synchronizedList;
            List<C96841j> synchronizedList2 = Collections.synchronizedList(new ArrayList());
            C87412m.m108593f(synchronizedList2, "synchronizedList(ArrayList<ListFileItem>())");
            this.f283739g = synchronizedList2;
            this.f283740h = new C96826a(FileSelectorUI.this, this);
            this.f283741i = new C96829c(FileSelectorUI.this, this);
            this.f283742j = new C96845n(FileSelectorUI.this, this);
            this.f283743n = C96839h.FROM_CHATTING;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m124387a(com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96831e r11, android.view.View r12) {
            /*
                r11.getClass()
                java.lang.Object r0 = r12.getTag()
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
                gy3.C87412m.m108592e(r0, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 1
                r2 = 0
                r3 = 5
                if (r0 >= r3) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$l> r4 = r11.f283738f
                java.lang.Object r0 = r4.get(r0)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$l r0 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96843l) r0
                r4 = 2131306669(0x7f0928ad, float:1.8231544E38)
                android.view.View r12 = r12.findViewById(r4)
                java.lang.String r4 = "null cannot be cast to non-null type android.widget.CheckBox"
                gy3.C87412m.m108592e(r12, r4)
                android.widget.CheckBox r12 = (android.widget.CheckBox) r12
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.ListFileItem"
                gy3.C87412m.m108592e(r0, r4)
                r4 = r0
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r4
                boolean r5 = r11.mo135145b(r4)
                r6 = 1
                if (r5 == 0) goto L_0x0064
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r1 = r11.f283739g
                r1.remove(r0)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                if (r3 == 0) goto L_0x0056
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r0 = r0.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r0 = r0.f283762a
                long r3 = r0.f265856m
                long r3 = r3 - r6
                r0.f265856m = r3
                goto L_0x005f
            L_0x0056:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r0 = r0.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r0 = r0.f283762a
                long r3 = r0.f265857n
                long r3 = r3 - r6
                r0.f265857n = r3
            L_0x005f:
                r12.setChecked(r2)
                goto L_0x00fe
            L_0x0064:
                r5 = 9
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$b r9 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.f283702y
                ge3.a r8 = r8.mo135134J7()
                if (r8 == 0) goto L_0x0087
                fe3.b r8 = r8.f169797p
                if (r8 == 0) goto L_0x007f
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r8.f168742h
                int r8 = r8.size()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x0080
            L_0x007f:
                r8 = 0
            L_0x0080:
                if (r8 == 0) goto L_0x0087
                int r8 = r8.intValue()
                goto L_0x0088
            L_0x0087:
                r8 = 0
            L_0x0088:
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r9 = r11.f283739g
                int r9 = r9.size()
                int r8 = r8 + r9
                if (r8 < r5) goto L_0x00b3
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r11 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                r3 = 2131825935(0x7f11150f, float:1.928474E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r1[r2] = r4
                java.lang.String r11 = r11.getString(r3, r1)
                android.widget.Toast r11 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r11, (int) r2)
                r11.show()
                r12.setChecked(r2)
                goto L_0x0112
            L_0x00b3:
                long r8 = p645pj.C77092c.m93047i()
                long r4 = r4.f283785i
                int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r10 < 0) goto L_0x00df
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r11 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                r3 = 2131825934(0x7f11150e, float:1.9284738E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r8)
                r1[r2] = r4
                java.lang.String r11 = r11.getString(r3, r1)
                android.widget.Toast r11 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r11, (int) r2)
                r11.show()
                r12.setChecked(r2)
                goto L_0x0112
            L_0x00df:
                r12.setChecked(r1)
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r12 = r11.f283739g
                r12.add(r0)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r12 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                if (r3 == 0) goto L_0x00f5
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r12 = r12.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r12 = r12.f283762a
                long r0 = r12.f265856m
                long r0 = r0 + r6
                r12.f265856m = r0
                goto L_0x00fe
            L_0x00f5:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r12 = r12.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r12 = r12.f283762a
                long r0 = r12.f265857n
                long r0 = r0 + r6
                r12.f265857n = r0
            L_0x00fe:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r12 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$b r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.f283702y
                r12.mo135139O7()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r12 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                r12.hideVKB()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r11 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                com.tencent.mm.ui.tools.i1 r11 = r11.f283709j
                if (r11 == 0) goto L_0x0112
                r11.f285340r = r2
            L_0x0112:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96831e.m124387a(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e, android.view.View):void");
        }

        /* renamed from: b */
        public final boolean mo135145b(C96841j jVar) {
            Iterator<T> it = this.f283739g.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    return false;
                }
                C96841j jVar2 = (C96841j) it.next();
                C96838g gVar = jVar2.f283792a;
                C96838g gVar2 = C96838g.TYPE_FOLDER;
                if (gVar == gVar2) {
                    if (jVar.f283792a == gVar2 && (jVar instanceof C96842k) && ((C96842k) jVar).f283790n) {
                        boolean z2 = jVar.f283781e == jVar2.f283781e;
                        if (jVar.f283785i == jVar2.f283785i) {
                            z = true;
                        }
                        boolean b = C87412m.m108589b(jVar.f283784h, jVar2.f283784h);
                        if (z && z2 && b) {
                            return true;
                        }
                    }
                } else if (jVar2.mo135164c() == jVar.mo135164c() && jVar2.f283781e == jVar.f283781e && jVar2.f283780d == jVar.f283780d) {
                    return true;
                }
            }
        }

        /* renamed from: d */
        public final int mo135146d(String str) {
            String lowerCase = str.toLowerCase();
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
            String nullAsNil = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil, "nullAsNil(fileName)");
            String lowerCase2 = nullAsNil.toLowerCase();
            C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase()");
            boolean z = true;
            if (C112551y.m153808h(lowerCase2, ".doc", false, 2, (Object) null) || C112551y.m153808h(lowerCase2, ".docx", false, 2, (Object) null) || C112551y.m153808h(lowerCase2, FileReaderHelper.WPS_EXT, false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_word;
            }
            if (mo135155h(lowerCase)) {
                return C0966R.C0969drawable.btu;
            }
            String nullAsNil2 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil2, "nullAsNil(fileName)");
            String lowerCase3 = nullAsNil2.toLowerCase();
            C87412m.m108593f(lowerCase3, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase3, ".rar", false, 2, (Object) null) || C112551y.m153808h(lowerCase3, ".zip", false, 2, (Object) null) || C112551y.m153808h(lowerCase3, ".7z", false, 2, (Object) null) || C112551y.m153808h(lowerCase3, "tar", false, 2, (Object) null) || C112551y.m153808h(lowerCase3, ".iso", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_rar;
            }
            String nullAsNil3 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil3, "nullAsNil(fileName)");
            String lowerCase4 = nullAsNil3.toLowerCase();
            C87412m.m108593f(lowerCase4, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase4, ".txt", false, 2, (Object) null) || C112551y.m153808h(lowerCase4, ".rtf", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_txt;
            }
            String nullAsNil4 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil4, "nullAsNil(fileName)");
            String lowerCase5 = nullAsNil4.toLowerCase();
            C87412m.m108593f(lowerCase5, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase5, ".pdf", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_pdf;
            }
            String nullAsNil5 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil5, "nullAsNil(fileName)");
            String lowerCase6 = nullAsNil5.toLowerCase();
            C87412m.m108593f(lowerCase6, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase6, ".ppt", false, 2, (Object) null) || C112551y.m153808h(lowerCase6, ".pptx", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_ppt;
            }
            String nullAsNil6 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil6, "nullAsNil(fileName)");
            String lowerCase7 = nullAsNil6.toLowerCase();
            C87412m.m108593f(lowerCase7, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase7, ".xls", false, 2, (Object) null) || C112551y.m153808h(lowerCase7, ".xlsx", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_excel;
            }
            String nullAsNil7 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil7, "nullAsNil(fileName)");
            String lowerCase8 = nullAsNil7.toLowerCase();
            C87412m.m108593f(lowerCase8, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase8, ".mp3", false, 2, (Object) null) || C112551y.m153808h(lowerCase8, ".wma", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_music;
            }
            String nullAsNil8 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil8, "nullAsNil(fileName)");
            String lowerCase9 = nullAsNil8.toLowerCase();
            C87412m.m108593f(lowerCase9, "this as java.lang.String).toLowerCase()");
            if (!C112551y.m153808h(lowerCase9, ".mp4", false, 2, (Object) null) && !C112551y.m153808h(lowerCase9, ".rm", false, 2, (Object) null)) {
                z = false;
            }
            if (z) {
                return C0966R.raw.app_attach_file_icon_video;
            }
            String nullAsNil9 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil9, "nullAsNil(fileName)");
            String lowerCase10 = nullAsNil9.toLowerCase();
            C87412m.m108593f(lowerCase10, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase10, ".html", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_webpage;
            }
            String nullAsNil10 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil10, "nullAsNil(fileName)");
            String lowerCase11 = nullAsNil10.toLowerCase();
            C87412m.m108593f(lowerCase11, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase11, ".key", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_keynote;
            }
            String nullAsNil11 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil11, "nullAsNil(fileName)");
            String lowerCase12 = nullAsNil11.toLowerCase();
            C87412m.m108593f(lowerCase12, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase12, ".number", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_number;
            }
            String nullAsNil12 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil12, "nullAsNil(fileName)");
            String lowerCase13 = nullAsNil12.toLowerCase();
            C87412m.m108593f(lowerCase13, "this as java.lang.String).toLowerCase()");
            if (C112551y.m153808h(lowerCase13, ".ofd", false, 2, (Object) null)) {
                return C0966R.raw.app_attach_file_icon_ofd;
            }
            String nullAsNil13 = Util.nullAsNil(lowerCase);
            C87412m.m108593f(nullAsNil13, "nullAsNil(fileName)");
            String lowerCase14 = nullAsNil13.toLowerCase();
            C87412m.m108593f(lowerCase14, "this as java.lang.String).toLowerCase()");
            return C112551y.m153808h(lowerCase14, ".pages", false, 2, (Object) null) ? C0966R.raw.app_attach_file_icon_page : C0966R.raw.app_attach_file_icon_unknow;
        }

        /* renamed from: f */
        public final ArrayList<C96843l> mo135147f(List<C96841j> list) {
            C96838g gVar;
            ArrayList<C96843l> arrayList = new ArrayList<>();
            Iterator<C96841j> it = list.iterator();
            String str = "";
            while (it.hasNext()) {
                C96841j next = it.next();
                if (next == null || C96838g.TYPE_INVALID == (gVar = next.f283792a)) {
                    Log.m105920e(this.f283736d, next == null ? "getListItemFromData, fileItem=null" : "getListItemFromData, type:FileType.TYPE_INVALID");
                } else {
                    if (C96838g.TYPE_FOLDER != gVar && !C87412m.m108589b(str, next.f283794c)) {
                        C96844m mVar = new C96844m(FileSelectorUI.this);
                        String str2 = next.f283794c;
                        mVar.f283794c = str2;
                        if (str2 == null) {
                            str2 = "";
                        }
                        mVar.f283792a = C96838g.TYPE_TIME;
                        arrayList.add(mVar);
                        str = str2;
                    }
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: g */
        public final Bitmap mo135148g(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e(this.f283736d, "getThumbnail fail, path not exist");
                return null;
            }
            Cursor query = FileSelectorUI.this.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=?", new String[]{str}, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(query.getColumnIndex("_id"));
                    query.close();
                    return MediaStore.Images.Thumbnails.getThumbnail(FileSelectorUI.this.getContentResolver(), (long) i, 3, (BitmapFactory.Options) null);
                }
                query.close();
            }
            return null;
        }

        public int getCount() {
            return this.f283738f.size();
        }

        public Object getItem(int i) {
            return this.f283738f.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return this.f283738f.get(i).f283792a.ordinal();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0127 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0129 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0131 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0132 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0139 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x013a A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0147 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0148 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0166 A[Catch:{ Exception -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0192 A[Catch:{ Exception -> 0x01bd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r25, android.view.View r26, android.view.ViewGroup r27) {
            /*
                r24 = this;
                r1 = r24
                r0 = r25
                java.lang.String r2 = "parent"
                r3 = r27
                gy3.C87412m.m108594g(r3, r2)
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$l> r2 = r1.f283738f
                java.lang.Object r2 = r2.get(r0)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$l r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96843l) r2
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$g r4 = r2.f283792a
                int r4 = r4.ordinal()
                r5 = 2131306678(0x7f0928b6, float:1.8231562E38)
                java.lang.String r6 = "null cannot be cast to non-null type android.widget.TextView"
                r7 = 0
                r8 = 1
                if (r4 == r8) goto L_0x039c
                r10 = 2131306671(0x7f0928af, float:1.8231548E38)
                r11 = 2131306613(0x7f092875, float:1.823143E38)
                java.lang.String r12 = "null cannot be cast to non-null type android.widget.CheckBox"
                r13 = 2131306669(0x7f0928ad, float:1.8231544E38)
                r14 = 2131306670(0x7f0928ae, float:1.8231546E38)
                r15 = 2
                r8 = 3
                r9 = 4
                if (r4 == r15) goto L_0x01e2
                if (r4 == r8) goto L_0x0045
                java.lang.String r0 = r1.f283736d
                java.lang.String r2 = "impossible path, Kick felixzhou!"
                com.tencent.p014mm.sdk.platformtools.Log.m105922f(r0, r2)
                gy3.C87412m.m108591d(r26)
                return r26
            L_0x0045:
                if (r26 != 0) goto L_0x00a1
                android.content.Context r3 = r27.getContext()
                r4 = 2131495634(0x7f0c0ad2, float:1.861481E38)
                android.view.View r3 = android.view.View.inflate(r3, r4, r7)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$b r4 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$b
                r4.<init>(r1)
                android.view.View r6 = r3.findViewById(r14)
                android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
                r4.f283753a = r6
                if (r6 == 0) goto L_0x0066
                android.view.View r6 = r6.findViewById(r13)
                goto L_0x0067
            L_0x0066:
                r6 = r7
            L_0x0067:
                gy3.C87412m.m108592e(r6, r12)
                android.widget.CheckBox r6 = (android.widget.CheckBox) r6
                r4.f283754b = r6
                android.view.View r6 = r3.findViewById(r11)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r4.f283755c = r6
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283756d = r5
                android.view.View r5 = r3.findViewById(r10)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283757e = r5
                r5 = 2131306676(0x7f0928b4, float:1.8231558E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283758f = r5
                android.widget.FrameLayout r5 = r4.f283753a
                if (r5 == 0) goto L_0x009d
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$e r6 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$e
                r6.<init>(r1)
                r5.setOnClickListener(r6)
            L_0x009d:
                r3.setTag(r4)
                goto L_0x00b0
            L_0x00a1:
                java.lang.Object r3 = r26.getTag()
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.FileSelectorAdapter.FolderViewHolder"
                gy3.C87412m.m108592e(r3, r4)
                r4 = r3
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$b r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96831e.C96833b) r4
                r3 = r26
            L_0x00b0:
                r5 = r2
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$k r5 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96842k) r5     // Catch:{ Exception -> 0x01bd }
                android.widget.TextView r6 = r4.f283756d     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x00b8
                goto L_0x00bf
            L_0x00b8:
                java.lang.CharSequence r10 = r5.mo135164c()     // Catch:{ Exception -> 0x01bd }
                r6.setText(r10)     // Catch:{ Exception -> 0x01bd }
            L_0x00bf:
                boolean r6 = r5.f283790n     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x0108
                android.widget.ImageView r6 = r4.f283755c     // Catch:{ Exception -> 0x01bd }
                if (r6 == 0) goto L_0x00cd
                r7 = 2131755085(0x7f10004d, float:1.914104E38)
                r6.setImageResource(r7)     // Catch:{ Exception -> 0x01bd }
            L_0x00cd:
                android.widget.FrameLayout r6 = r4.f283753a     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x00d2
                goto L_0x00d5
            L_0x00d2:
                r6.setVisibility(r9)     // Catch:{ Exception -> 0x01bd }
            L_0x00d5:
                android.widget.TextView r6 = r4.f283757e     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                r7 = 0
                r6.setVisibility(r7)     // Catch:{ Exception -> 0x01bd }
            L_0x00de:
                android.widget.TextView r6 = r4.f283758f     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x00e3
                goto L_0x00e8
            L_0x00e3:
                r7 = 8
                r6.setVisibility(r7)     // Catch:{ Exception -> 0x01bd }
            L_0x00e8:
                android.widget.TextView r6 = r4.f283757e     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x00ee
                goto L_0x01a1
            L_0x00ee:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this     // Catch:{ Exception -> 0x01bd }
                r8 = 2131825904(0x7f1114f0, float:1.9284677E38)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01bd }
                int r5 = r5.f283789m     // Catch:{ Exception -> 0x01bd }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01bd }
                r9 = 0
                r10[r9] = r5     // Catch:{ Exception -> 0x01bd }
                java.lang.String r5 = r7.getString(r8, r10)     // Catch:{ Exception -> 0x01bd }
                r6.setText(r5)     // Catch:{ Exception -> 0x01bd }
                goto L_0x01a1
            L_0x0108:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this     // Catch:{ Exception -> 0x01bd }
                int r6 = r6.f283703d     // Catch:{ Exception -> 0x01bd }
                if (r8 == r6) goto L_0x011b
                if (r9 != r6) goto L_0x0111
                goto L_0x011b
            L_0x0111:
                android.widget.FrameLayout r6 = r4.f283753a     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x0116
                goto L_0x0123
            L_0x0116:
                r8 = 0
                r6.setVisibility(r8)     // Catch:{ Exception -> 0x01bd }
                goto L_0x0123
            L_0x011b:
                android.widget.FrameLayout r6 = r4.f283753a     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x0120
                goto L_0x0123
            L_0x0120:
                r6.setVisibility(r9)     // Catch:{ Exception -> 0x01bd }
            L_0x0123:
                android.widget.TextView r6 = r4.f283757e     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x0129
                r8 = 0
                goto L_0x012d
            L_0x0129:
                r8 = 0
                r6.setVisibility(r8)     // Catch:{ Exception -> 0x01bd }
            L_0x012d:
                android.widget.TextView r6 = r4.f283758f     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x0132
                goto L_0x0135
            L_0x0132:
                r6.setVisibility(r8)     // Catch:{ Exception -> 0x01bd }
            L_0x0135:
                android.widget.TextView r6 = r4.f283757e     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x013a
                goto L_0x0143
            L_0x013a:
                long r8 = r5.f283785i     // Catch:{ Exception -> 0x01bd }
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r8)     // Catch:{ Exception -> 0x01bd }
                r6.setText(r8)     // Catch:{ Exception -> 0x01bd }
            L_0x0143:
                android.widget.TextView r6 = r4.f283758f     // Catch:{ Exception -> 0x01bd }
                if (r6 != 0) goto L_0x0148
                goto L_0x0158
            L_0x0148:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this     // Catch:{ Exception -> 0x01bd }
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()     // Catch:{ Exception -> 0x01bd }
                long r9 = r5.f283781e     // Catch:{ Exception -> 0x01bd }
                r11 = 1
                java.lang.CharSequence r8 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r8, r9, r11)     // Catch:{ Exception -> 0x01bd }
                r6.setText(r8)     // Catch:{ Exception -> 0x01bd }
            L_0x0158:
                java.lang.CharSequence r6 = r5.mo135164c()     // Catch:{ Exception -> 0x01bd }
                java.lang.String r8 = r6.toString()     // Catch:{ Exception -> 0x01bd }
                boolean r8 = r1.mo135155h(r8)     // Catch:{ Exception -> 0x01bd }
                if (r8 == 0) goto L_0x0192
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this     // Catch:{ Exception -> 0x01bd }
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e r8 = r8.f283708i     // Catch:{ Exception -> 0x01bd }
                if (r8 == 0) goto L_0x018c
                java.lang.String r5 = r5.f283784h     // Catch:{ Exception -> 0x01bd }
                android.graphics.Bitmap r5 = r8.mo135148g(r5)     // Catch:{ Exception -> 0x01bd }
                if (r5 == 0) goto L_0x017c
                android.widget.ImageView r6 = r4.f283755c     // Catch:{ Exception -> 0x01bd }
                if (r6 == 0) goto L_0x01a1
                r6.setImageBitmap(r5)     // Catch:{ Exception -> 0x01bd }
                goto L_0x01a1
            L_0x017c:
                android.widget.ImageView r5 = r4.f283755c     // Catch:{ Exception -> 0x01bd }
                if (r5 == 0) goto L_0x01a1
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01bd }
                int r6 = r1.mo135146d(r6)     // Catch:{ Exception -> 0x01bd }
                r5.setImageResource(r6)     // Catch:{ Exception -> 0x01bd }
                goto L_0x01a1
            L_0x018c:
                java.lang.String r0 = "adapter"
                gy3.C87412m.m108603p(r0)     // Catch:{ Exception -> 0x01bd }
                throw r7     // Catch:{ Exception -> 0x01bd }
            L_0x0192:
                android.widget.ImageView r5 = r4.f283755c     // Catch:{ Exception -> 0x01bd }
                if (r5 == 0) goto L_0x01a1
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01bd }
                int r6 = r1.mo135146d(r6)     // Catch:{ Exception -> 0x01bd }
                r5.setImageResource(r6)     // Catch:{ Exception -> 0x01bd }
            L_0x01a1:
                android.widget.CheckBox r5 = r4.f283754b     // Catch:{ Exception -> 0x01bd }
                if (r5 != 0) goto L_0x01a6
                goto L_0x01b0
            L_0x01a6:
                r6 = r2
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r6 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r6     // Catch:{ Exception -> 0x01bd }
                boolean r6 = r1.mo135145b(r6)     // Catch:{ Exception -> 0x01bd }
                r5.setChecked(r6)     // Catch:{ Exception -> 0x01bd }
            L_0x01b0:
                android.widget.FrameLayout r4 = r4.f283753a     // Catch:{ Exception -> 0x01bd }
                if (r4 != 0) goto L_0x01b5
                goto L_0x01e1
            L_0x01b5:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r25)     // Catch:{ Exception -> 0x01bd }
                r4.setTag(r0)     // Catch:{ Exception -> 0x01bd }
                goto L_0x01e1
            L_0x01bd:
                r0 = move-exception
                java.lang.String r4 = r1.f283736d
                java.lang.String r0 = r0.getMessage()
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "item is ListFileItem:"
                r6.append(r7)
                boolean r2 = r2 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r6 = 0
                r5[r6] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r5)
            L_0x01e1:
                return r3
            L_0x01e2:
                if (r26 != 0) goto L_0x02b5
                android.content.Context r3 = r27.getContext()
                r4 = 2131494429(0x7f0c061d, float:1.8612366E38)
                android.view.View r3 = android.view.View.inflate(r3, r4, r7)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$a r4 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$a
                r4.<init>(r1)
                android.view.View r7 = r3.findViewById(r14)
                java.lang.String r14 = "null cannot be cast to non-null type android.widget.FrameLayout"
                gy3.C87412m.m108592e(r7, r14)
                android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
                r4.f283745a = r7
                android.view.View r7 = r7.findViewById(r13)
                gy3.C87412m.m108592e(r7, r12)
                android.widget.CheckBox r7 = (android.widget.CheckBox) r7
                r4.f283746b = r7
                android.view.View r7 = r3.findViewById(r11)
                java.lang.String r11 = "null cannot be cast to non-null type android.widget.ImageView"
                gy3.C87412m.m108592e(r7, r11)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r4.f283747c = r7
                android.view.View r5 = r3.findViewById(r5)
                gy3.C87412m.m108592e(r5, r6)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283748d = r5
                android.view.View r5 = r3.findViewById(r10)
                gy3.C87412m.m108592e(r5, r6)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283749e = r5
                r5 = 2131306676(0x7f0928b4, float:1.8231558E38)
                android.view.View r5 = r3.findViewById(r5)
                gy3.C87412m.m108592e(r5, r6)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283750f = r5
                r5 = 2131306609(0x7f092871, float:1.8231422E38)
                android.view.View r5 = r3.findViewById(r5)
                gy3.C87412m.m108592e(r5, r6)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f283751g = r5
                r5 = 2131306632(0x7f092888, float:1.8231469E38)
                android.view.View r5 = r3.findViewById(r5)
                r4.f283752h = r5
                int r5 = r24.getCount()
                r6 = 1
                int r5 = r5 - r6
                if (r5 != r0) goto L_0x02a5
                android.view.View r5 = r4.f283752h
                if (r5 != 0) goto L_0x0263
                goto L_0x02a5
            L_0x0263:
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r6.mo10233c(r7)
                java.lang.Object[] r17 = r6.mo10232b()
                java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter"
                java.lang.String r19 = "getView"
                java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r5
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                r7 = 0
                java.lang.Object r6 = r6.mo10231a(r7)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r5.setVisibility(r6)
                java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            L_0x02a5:
                android.widget.FrameLayout r5 = r4.f283745a
                if (r5 == 0) goto L_0x02b1
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$d r6 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$d
                r6.<init>(r1)
                r5.setOnClickListener(r6)
            L_0x02b1:
                r3.setTag(r4)
                goto L_0x02c4
            L_0x02b5:
                java.lang.Object r3 = r26.getTag()
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.FileSelectorAdapter.FileViewHolder"
                gy3.C87412m.m108592e(r3, r4)
                r4 = r3
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$a r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96831e.C96832a) r4
                r3 = r26
            L_0x02c4:
                android.widget.TextView r5 = r4.f283748d
                if (r5 != 0) goto L_0x02c9
                goto L_0x02d3
            L_0x02c9:
                r6 = r2
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r6 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r6
                java.lang.CharSequence r6 = r6.mo135164c()
                r5.setText(r6)
            L_0x02d3:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r5 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                int r5 = r5.f283703d
                if (r8 == r5) goto L_0x02e7
                if (r9 != r5) goto L_0x02dc
                goto L_0x02e7
            L_0x02dc:
                android.widget.FrameLayout r5 = r4.f283745a
                if (r5 != 0) goto L_0x02e2
                r6 = 0
                goto L_0x02f0
            L_0x02e2:
                r6 = 0
                r5.setVisibility(r6)
                goto L_0x02f0
            L_0x02e7:
                r6 = 0
                android.widget.FrameLayout r5 = r4.f283745a
                if (r5 != 0) goto L_0x02ed
                goto L_0x02f0
            L_0x02ed:
                r5.setVisibility(r9)
            L_0x02f0:
                android.widget.TextView r5 = r4.f283749e
                if (r5 != 0) goto L_0x02f5
                goto L_0x02f8
            L_0x02f5:
                r5.setVisibility(r6)
            L_0x02f8:
                android.widget.TextView r5 = r4.f283750f
                if (r5 != 0) goto L_0x02fd
                goto L_0x0300
            L_0x02fd:
                r5.setVisibility(r6)
            L_0x0300:
                android.widget.TextView r5 = r4.f283748d
                if (r5 != 0) goto L_0x0305
                goto L_0x030f
            L_0x0305:
                r6 = r2
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r6 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r6
                java.lang.CharSequence r6 = r6.mo135164c()
                r5.setText(r6)
            L_0x030f:
                android.widget.TextView r5 = r4.f283749e
                if (r5 != 0) goto L_0x0314
                goto L_0x0320
            L_0x0314:
                r6 = r2
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r6 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r6
                long r6 = r6.f283785i
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r6)
                r5.setText(r6)
            L_0x0320:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r2
                int r5 = r2.f283786j
                if (r5 != r15) goto L_0x0351
                android.widget.TextView r5 = r4.f283749e
                if (r5 != 0) goto L_0x032b
                goto L_0x0351
            L_0x032b:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r7 = 62
                r6.append(r7)
                java.lang.Class<pb1.j1> r7 = pb1.C100718j1.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                pb1.j1 r7 = (pb1.C100718j1) r7
                r8 = 1
                int r7 = r7.mo128211cX(r8)
                r6.append(r7)
                java.lang.String r7 = "MB"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5.setText(r6)
            L_0x0351:
                android.widget.TextView r5 = r4.f283750f
                if (r5 != 0) goto L_0x0356
                goto L_0x0366
            L_0x0356:
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.this
                androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()
                long r7 = r2.f283781e
                r9 = 1
                java.lang.CharSequence r6 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r6, r7, r9)
                r5.setText(r6)
            L_0x0366:
                android.widget.ImageView r5 = r4.f283747c
                if (r5 == 0) goto L_0x0379
                java.lang.CharSequence r6 = r2.mo135164c()
                java.lang.String r6 = r6.toString()
                int r6 = r1.mo135146d(r6)
                r5.setImageResource(r6)
            L_0x0379:
                android.widget.TextView r5 = r4.f283751g
                if (r5 != 0) goto L_0x037e
                goto L_0x0383
            L_0x037e:
                java.lang.CharSequence r6 = r2.f283782f
                r5.setText(r6)
            L_0x0383:
                android.widget.CheckBox r5 = r4.f283746b
                if (r5 != 0) goto L_0x0388
                goto L_0x038f
            L_0x0388:
                boolean r2 = r1.mo135145b(r2)
                r5.setChecked(r2)
            L_0x038f:
                android.widget.FrameLayout r2 = r4.f283745a
                if (r2 != 0) goto L_0x0394
                goto L_0x039b
            L_0x0394:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
                r2.setTag(r0)
            L_0x039b:
                return r3
            L_0x039c:
                if (r26 != 0) goto L_0x03bd
                android.content.Context r0 = r27.getContext()
                r3 = 2131494430(0x7f0c061e, float:1.8612368E38)
                android.view.View r0 = android.view.View.inflate(r0, r3, r7)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$c r3 = new com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$c
                r3.<init>(r1)
                android.view.View r4 = r0.findViewById(r5)
                gy3.C87412m.m108592e(r4, r6)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f283759a = r4
                r0.setTag(r3)
                goto L_0x03cc
            L_0x03bd:
                java.lang.Object r0 = r26.getTag()
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.FileSelectorAdapter.TimeViewHolder"
                gy3.C87412m.m108592e(r0, r3)
                r3 = r0
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e$c r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96831e.C96834c) r3
                r0 = r26
            L_0x03cc:
                android.widget.TextView r3 = r3.f283759a
                if (r3 != 0) goto L_0x03d1
                goto L_0x03d6
            L_0x03d1:
                java.lang.String r2 = r2.f283794c
                r3.setText(r2)
            L_0x03d6:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96831e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return this.f283737e;
        }

        /* renamed from: h */
        public final boolean mo135155h(String str) {
            C87412m.m108594g(str, DownloadInfo.FILENAME);
            String nullAsNil = Util.nullAsNil(str);
            C87412m.m108593f(nullAsNil, "nullAsNil(fileName)");
            String lowerCase = nullAsNil.toLowerCase();
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
            return (Build.VERSION.SDK_INT >= 28 && C112551y.m153808h(lowerCase, ".heic", false, 2, (Object) null)) || C112551y.m153808h(lowerCase, ".bmp", false, 2, (Object) null) || C112551y.m153808h(lowerCase, ".png", false, 2, (Object) null) || C112551y.m153808h(lowerCase, ".jpg", false, 2, (Object) null) || C112551y.m153808h(lowerCase, ".jpeg", false, 2, (Object) null) || C112551y.m153808h(lowerCase, ".gif", false, 2, (Object) null);
        }

        /* renamed from: i */
        public final void mo135156i() {
            ArrayList<C96843l> arrayList;
            int ordinal = this.f283743n.ordinal();
            if (ordinal == 0) {
                arrayList = mo135147f(this.f283740h.f283730f);
            } else if (ordinal == 1) {
                arrayList = mo135147f(this.f283741i.f283730f);
            } else if (ordinal != 2) {
                TextView textView = FileSelectorUI.this.f283707h;
                if (textView != null) {
                    textView.setText("");
                }
                arrayList = new ArrayList<>();
            } else {
                arrayList = mo135147f(this.f283742j.f283730f);
            }
            this.f283738f = arrayList;
            notifyDataSetChanged();
            if (this.f283738f.size() <= 0 && C96839h.FROM_ALBUM != this.f283743n) {
                FileSelectorUI fileSelectorUI = FileSelectorUI.this;
                TextView textView2 = fileSelectorUI.f283707h;
                if (textView2 != null) {
                    textView2.setText(fileSelectorUI.getString(C0966R.string.cuo));
                }
                TextView textView3 = FileSelectorUI.this.f283707h;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
        }

        /* renamed from: j */
        public final void mo135157j(String str) {
            C87412m.m108594g(str, "content");
            int ordinal = this.f283743n.ordinal();
            this.f283738f = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? new ArrayList<>() : mo135147f(this.f283742j.mo135144c(str)) : mo135147f(this.f283741i.mo135144c(str)) : mo135147f(this.f283740h.mo135144c(str));
            notifyDataSetChanged();
        }

        /* renamed from: k */
        public final void mo135158k(C96839h hVar) {
            C87412m.m108594g(hVar, "fromType");
            int ordinal = hVar.ordinal();
            if (!(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? true : this.f283742j.f283732h : this.f283741i.f283732h : this.f283740h.f283732h)) {
                int ordinal2 = hVar.ordinal();
                if (ordinal2 == 0) {
                    C96826a aVar = this.f283740h;
                    aVar.f283732h = false;
                    aVar.f283733i = 0;
                    aVar.f283729e = 30;
                    ((C119157j) C119157j.f356862d).mo183875f(new C96864a0(aVar));
                } else if (ordinal2 == 1) {
                    C96829c cVar = this.f283741i;
                    cVar.f283732h = false;
                    cVar.f283733i = 0;
                    cVar.f283729e = 100;
                    ((C119157j) C119157j.f356862d).mo183875f(new C96865b0(cVar));
                } else if (ordinal2 == 2) {
                    C96845n nVar = this.f283742j;
                    nVar.getClass();
                    nVar.f283795o = new C86009m1(C112760b.m154217Y());
                    nVar.f283798r = false;
                    nVar.mo135166e(new C86009m1(C112760b.m154217Y()));
                }
            }
            this.f283743n = hVar;
            mo135156i();
        }

        /* renamed from: l */
        public final void mo135159l(String str) {
            C87412m.m108594g(str, "path");
            if (this.f283743n == C96839h.FROM_SDCARD) {
                this.f283742j.mo135166e(new C86009m1(str));
                C96831e eVar = FileSelectorUI.this.f283708i;
                if (eVar != null) {
                    eVar.mo135156i();
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f */
    public static final class C96837f {

        /* renamed from: a */
        public final SendFileInWidgetStruct f283762a = new SendFileInWidgetStruct();

        /* renamed from: b */
        public final Vector<String> f283763b = new Vector<>();
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$g */
    public enum C96838g {
        TYPE_INVALID,
        TYPE_TIME,
        TYPE_FILE,
        TYPE_FOLDER
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h */
    public enum C96839h {
        FROM_CHATTING,
        FROM_FAV,
        FROM_SDCARD,
        FROM_ALBUM
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$i */
    public class C96840i extends C96841j {

        /* renamed from: m */
        public String f283774m;

        /* renamed from: n */
        public String f283775n;

        /* renamed from: o */
        public String f283776o;

        /* renamed from: p */
        public long f283777p;

        /* renamed from: q */
        public String f283778q;

        public C96840i() {
            super();
        }

        /* renamed from: a */
        public C96841j mo135162a() {
            C96840i iVar = new C96840i();
            mo135163b(iVar);
            iVar.f283774m = this.f283774m;
            String str = this.f283775n;
            if (str != null) {
                iVar.f283775n = str;
                iVar.f283776o = this.f283776o;
                iVar.f283777p = this.f283777p;
                iVar.f283778q = this.f283778q;
                return iVar;
            }
            C87412m.m108603p("dataId");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j */
    public class C96841j extends C96843l {

        /* renamed from: d */
        public long f283780d;

        /* renamed from: e */
        public long f283781e;

        /* renamed from: f */
        public CharSequence f283782f;

        /* renamed from: g */
        public CharSequence f283783g;

        /* renamed from: h */
        public String f283784h;

        /* renamed from: i */
        public long f283785i;

        /* renamed from: j */
        public int f283786j;

        /* renamed from: k */
        public boolean f283787k;

        public C96841j() {
            super(FileSelectorUI.this);
        }

        /* renamed from: a */
        public C96841j mo135162a() {
            C96841j jVar = new C96841j();
            mo135163b(jVar);
            return jVar;
        }

        /* renamed from: b */
        public final void mo135163b(C96841j jVar) {
            C87412m.m108594g(jVar, "des");
            C96838g gVar = this.f283792a;
            C87412m.m108594g(gVar, "<set-?>");
            jVar.f283792a = gVar;
            jVar.f283794c = this.f283794c;
            C96839h hVar = this.f283793b;
            if (hVar != null) {
                jVar.f283793b = hVar;
                jVar.f283780d = this.f283780d;
                jVar.f283781e = this.f283781e;
                jVar.f283782f = this.f283782f;
                jVar.f283783g = mo135164c();
                jVar.f283784h = this.f283784h;
                jVar.f283785i = this.f283785i;
                jVar.f283786j = this.f283786j;
                jVar.f283787k = this.f283787k;
                return;
            }
            C87412m.m108603p("from");
            throw null;
        }

        /* renamed from: c */
        public final CharSequence mo135164c() {
            CharSequence charSequence = this.f283783g;
            if (charSequence != null) {
                return charSequence;
            }
            C87412m.m108603p(DownloadInfo.FILENAME);
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$k */
    public final class C96842k extends C96841j {

        /* renamed from: m */
        public int f283789m;

        /* renamed from: n */
        public boolean f283790n;

        public C96842k() {
            super();
        }

        /* renamed from: a */
        public C96841j mo135162a() {
            C96842k kVar = new C96842k();
            mo135163b(kVar);
            kVar.f283790n = this.f283790n;
            kVar.f283789m = this.f283789m;
            return kVar;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$l */
    public class C96843l {

        /* renamed from: a */
        public C96838g f283792a = C96838g.TYPE_INVALID;

        /* renamed from: b */
        public C96839h f283793b;

        /* renamed from: c */
        public String f283794c;

        public C96843l(FileSelectorUI fileSelectorUI) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$m */
    public final class C96844m extends C96843l {
        public C96844m(FileSelectorUI fileSelectorUI) {
            super(fileSelectorUI);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$n */
    public final class C96845n extends C96830d {

        /* renamed from: o */
        public C86009m1 f283795o;

        /* renamed from: p */
        public C86009m1 f283796p;

        /* renamed from: q */
        public C86009m1[] f283797q = new C86009m1[0];

        /* renamed from: r */
        public boolean f283798r;

        /* renamed from: s */
        public final /* synthetic */ FileSelectorUI f283799s;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$n$a */
        public final class C96846a {

            /* renamed from: a */
            public C86009m1 f283800a;

            /* renamed from: b */
            public long f283801b;

            /* renamed from: c */
            public String f283802c = "";

            public C96846a(C96845n nVar) {
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$n$b */
        public static final class C96847b implements C86011o1 {

            /* renamed from: a */
            public final /* synthetic */ C96845n f283803a;

            public C96847b(C96845n nVar) {
                this.f283803a = nVar;
            }

            public final boolean accept(C86009m1 m1Var) {
                C87412m.m108594g(m1Var, "pathname");
                if (m1Var.f250486d.getPath().isEmpty() ? false : m1Var.getName().startsWith(".")) {
                    return false;
                }
                return !this.f283803a.f283798r || !m1Var.mo119977o();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96845n(FileSelectorUI fileSelectorUI, C96831e eVar) {
            super(fileSelectorUI, eVar);
            C87412m.m108594g(eVar, "adapter");
            this.f283799s = fileSelectorUI;
        }

        /* renamed from: d */
        public final C86009m1 mo135165d() {
            C86009m1 m1Var = this.f283796p;
            if (m1Var != null) {
                int hashCode = m1Var.hashCode();
                C86009m1 m1Var2 = this.f283795o;
                if (m1Var2 == null) {
                    C87412m.m108603p("rootPath");
                    throw null;
                } else if (hashCode == m1Var2.hashCode()) {
                    return null;
                } else {
                    C86009m1 m1Var3 = this.f283796p;
                    if (m1Var3 != null) {
                        return m1Var3.mo119974l();
                    }
                    C87412m.m108603p("curFile");
                    throw null;
                }
            } else {
                C87412m.m108603p("curFile");
                throw null;
            }
        }

        /* renamed from: e */
        public final void mo135166e(C86009m1 m1Var) {
            C87412m.m108594g(m1Var, "curFile");
            this.f283796p = m1Var;
            if (m1Var.mo119961a()) {
                C86009m1 m1Var2 = this.f283796p;
                if (m1Var2 == null) {
                    C87412m.m108603p("curFile");
                    throw null;
                } else if (m1Var2.mo119977o()) {
                    C86009m1 m1Var3 = this.f283796p;
                    if (m1Var3 != null) {
                        C86009m1[] v = m1Var3.mo119985v(new C96847b(this));
                        this.f283797q = v;
                        if (v != null) {
                            if (!(v.length == 0)) {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList = new ArrayList();
                                for (C86009m1 m1Var4 : v) {
                                    if (m1Var4 != null) {
                                        if (!m1Var4.mo119977o()) {
                                            arrayList.add(m1Var4);
                                        } else {
                                            String i = m1Var4.mo119971i();
                                            C87412m.m108593f(i, "file.absolutePath");
                                            if (!hashSet.contains(i)) {
                                                String i2 = m1Var4.mo119971i();
                                                C87412m.m108593f(i2, "file.absolutePath");
                                                hashSet.add(i2);
                                                arrayList.add(m1Var4);
                                            }
                                        }
                                    }
                                }
                                Object[] array = arrayList.toArray(new C86009m1[0]);
                                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                v = (C86009m1[]) array;
                            }
                            this.f283797q = v;
                            if (!(v.length == 0)) {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator a = C32617c.m39769a(v);
                                while (true) {
                                    C32616b bVar = (C32616b) a;
                                    if (!bVar.hasNext()) {
                                        break;
                                    }
                                    C86009m1 m1Var5 = (C86009m1) bVar.next();
                                    if (m1Var5 != null) {
                                        C96846a aVar = new C96846a(this);
                                        aVar.f283800a = m1Var5;
                                        aVar.f283801b = m1Var5.mo119979q();
                                        if (m1Var5.mo119977o()) {
                                            String a2 = C77691f.m93686a(m1Var5.getName());
                                            C87412m.m108593f(a2, "getFullSpell(file.name)");
                                            String upperCase = a2.toUpperCase();
                                            C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase()");
                                            aVar.f283802c = upperCase;
                                            arrayList2.add(aVar);
                                        } else {
                                            arrayList3.add(aVar);
                                        }
                                    }
                                }
                                C77813z.m93909o(arrayList2, C96867d0.f283842d);
                                Collections.sort(arrayList3, C96868e0.f283843d);
                                Iterator it = arrayList2.iterator();
                                int i3 = 0;
                                while (it.hasNext()) {
                                    v[i3] = ((C96846a) it.next()).f283800a;
                                    i3++;
                                }
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    v[i3] = ((C96846a) it4.next()).f283800a;
                                    i3++;
                                }
                            }
                        }
                    } else {
                        C87412m.m108603p("curFile");
                        throw null;
                    }
                }
            }
            this.f283730f.clear();
            C86009m1[] m1VarArr = this.f283797q;
            if (m1VarArr != null) {
                FileSelectorUI fileSelectorUI = this.f283799s;
                for (C86009m1 m1Var6 : m1VarArr) {
                    if (m1Var6 != null) {
                        String i4 = m1Var6.mo119971i();
                        C87412m.m108593f(i4, "vFile.absolutePath");
                        if (Util.isNullOrNil(i4)) {
                            Log.m105920e("MicroMsg.FileSelectorUI", "createTargetList, folder filePath is null, filter!!");
                        } else {
                            C96842k kVar = new C96842k();
                            kVar.f283792a = C96838g.TYPE_FOLDER;
                            kVar.f283793b = C96839h.FROM_SDCARD;
                            kVar.f283790n = !m1Var6.mo119977o();
                            String name = m1Var6.getName();
                            C87412m.m108593f(name, "vFile.name");
                            kVar.f283783g = name;
                            kVar.f283784h = i4;
                            if (m1Var6.mo119977o()) {
                                String[] t = m1Var6.mo119982t(C30703c0.f82611a);
                                kVar.f283789m = t == null ? 0 : t.length;
                            } else if (m1Var6.mo119978p()) {
                                kVar.f283785i = m1Var6.mo119980r();
                                kVar.f283781e = m1Var6.mo119979q();
                            }
                            this.f283730f.add(kVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$p */
    public static final class C96848p implements DropdownListView.C72903d {

        /* renamed from: a */
        public final /* synthetic */ FileSelectorUI f283804a;

        public C96848p(FileSelectorUI fileSelectorUI) {
            this.f283804a = fileSelectorUI;
        }

        /* renamed from: a */
        public void mo100775a() {
            FileSelectorUI fileSelectorUI = this.f283804a;
            fileSelectorUI.f283714r = null;
            fileSelectorUI.playActionBarOperationAreaAnim();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$q */
    public static final class C96849q implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283805d;

        public C96849q(FileSelectorUI fileSelectorUI) {
            this.f283805d = fileSelectorUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.FileSelectorUI", "backBtn");
            FileSelectorUI fileSelectorUI = this.f283805d;
            C72909b bVar = FileSelectorUI.f283702y;
            fileSelectorUI.mo135137M7(true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$r */
    public static final class C96850r implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283806d;

        public C96850r(FileSelectorUI fileSelectorUI) {
            this.f283806d = fileSelectorUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fb  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x022b  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x026a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onMenuItemClick(android.view.MenuItem r22) {
            /*
                r21 = this;
                r1 = r21
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r2 = r1.f283806d
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$b r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.f283702y
                r2.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e r0 = r2.f283708i
                r5 = 0
                if (r0 == 0) goto L_0x02f6
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r0 = r0.f283739g
                java.util.Iterator r0 = r0.iterator()
            L_0x001e:
                boolean r6 = r0.hasNext()
                r7 = 1
                if (r6 == 0) goto L_0x0074
                java.lang.Object r6 = r0.next()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r6 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r6
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r9 = r6.f283793b
                java.lang.String r10 = "from"
                if (r9 == 0) goto L_0x0070
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r11 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96839h.FROM_FAV
                if (r9 != r11) goto L_0x0043
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r9 = r2.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r9 = r9.f283762a
                long r10 = r9.f265854k
                long r10 = r10 + r7
                r9.f265854k = r10
                r4.add(r6)
                goto L_0x001e
            L_0x0043:
                r3.add(r6)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r6 = r6.f283793b
                if (r6 == 0) goto L_0x006c
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r9 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96839h.FROM_CHATTING
                if (r6 != r9) goto L_0x0058
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r6 = r2.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r6 = r6.f283762a
                long r9 = r6.f265853j
                long r9 = r9 + r7
                r6.f265853j = r9
                goto L_0x001e
            L_0x0058:
                if (r6 == 0) goto L_0x0068
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$h r9 = com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96839h.FROM_SDCARD
                if (r6 != r9) goto L_0x001e
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r6 = r2.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r6 = r6.f283762a
                long r9 = r6.f265855l
                long r9 = r9 + r7
                r6.f265855l = r9
                goto L_0x001e
            L_0x0068:
                gy3.C87412m.m108603p(r10)
                throw r5
            L_0x006c:
                gy3.C87412m.m108603p(r10)
                throw r5
            L_0x0070:
                gy3.C87412m.m108603p(r10)
                throw r5
            L_0x0074:
                int r0 = r4.size()
                r6 = 2131820549(0x7f110005, float:1.9273816E38)
                java.lang.String r9 = ", download:"
                java.lang.String r10 = "path:"
                java.lang.String r11 = "MicroMsg.FileSelectorUI"
                r12 = 2
                r13 = 1
                if (r0 <= 0) goto L_0x0147
                int r0 = r2.f283703d
                if (r13 == r0) goto L_0x0147
                java.util.Iterator r14 = r4.iterator()
            L_0x008e:
                boolean r0 = r14.hasNext()
                if (r0 == 0) goto L_0x0147
                java.lang.Object r0 = r14.next()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r0 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r0
                java.lang.String r15 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.ListFavFileItem"
                gy3.C87412m.m108592e(r0, r15)     // Catch:{ ClassCastException -> 0x0139 }
                r15 = r0
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$i r15 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96840i) r15     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r7 = r15.f283784h     // Catch:{ ClassCastException -> 0x0139 }
                r8 = r0
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$i r8 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96840i) r8     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r8 = r8.f283778q     // Catch:{ ClassCastException -> 0x0139 }
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ ClassCastException -> 0x0139 }
                if (r8 != 0) goto L_0x00f7
                int r8 = r0.f283786j     // Catch:{ ClassCastException -> 0x0139 }
                if (r8 == 0) goto L_0x00b5
                goto L_0x00f7
            L_0x00b5:
                if (r7 == 0) goto L_0x00d1
                boolean r8 = r0.f283787k     // Catch:{ ClassCastException -> 0x0139 }
                if (r8 != 0) goto L_0x00bc
                goto L_0x00d1
            L_0x00bc:
                java.lang.String r0 = r2.f283704e     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r8 = r15.f283776o     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r13 = r15.f283774m     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r15 = r15.f283775n     // Catch:{ ClassCastException -> 0x0139 }
                if (r15 == 0) goto L_0x00cb
                com.tencent.p014mm.plugin.fav.p047ui.C93594f1.m118179g(r0, r7, r8, r13, r15)     // Catch:{ ClassCastException -> 0x0139 }
                goto L_0x0141
            L_0x00cb:
                java.lang.String r0 = "dataId"
                gy3.C87412m.m108603p(r0)     // Catch:{ ClassCastException -> 0x0139 }
                throw r5     // Catch:{ ClassCastException -> 0x0139 }
            L_0x00d1:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassCastException -> 0x0139 }
                r8.<init>()     // Catch:{ ClassCastException -> 0x0139 }
                r8.append(r10)     // Catch:{ ClassCastException -> 0x0139 }
                r8.append(r7)     // Catch:{ ClassCastException -> 0x0139 }
                r8.append(r9)     // Catch:{ ClassCastException -> 0x0139 }
                boolean r0 = r0.f283787k     // Catch:{ ClassCastException -> 0x0139 }
                r8.append(r0)     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r0 = r8.toString()     // Catch:{ ClassCastException -> 0x0139 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ ClassCastException -> 0x0139 }
                androidx.appcompat.app.AppCompatActivity r0 = r2.getContext()     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r7 = r2.getString(r6)     // Catch:{ ClassCastException -> 0x0139 }
                nj3.C76879j.m92726T(r0, r7)     // Catch:{ ClassCastException -> 0x0139 }
                goto L_0x0141
            L_0x00f7:
                int r0 = r0.f283786j     // Catch:{ ClassCastException -> 0x0139 }
                if (r0 != r12) goto L_0x0126
                java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ ClassCastException -> 0x0139 }
                pb1.j1 r0 = (pb1.C100718j1) r0     // Catch:{ ClassCastException -> 0x0139 }
                r7 = 8
                r8 = 1
                int r0 = r0.mo128200Jt(r8, r7)     // Catch:{ ClassCastException -> 0x0139 }
                androidx.appcompat.app.AppCompatActivity r7 = r2.getContext()     // Catch:{ ClassCastException -> 0x0139 }
                androidx.appcompat.app.AppCompatActivity r13 = r2.getContext()     // Catch:{ ClassCastException -> 0x0139 }
                r15 = 2131825638(0x7f1113e6, float:1.9284138E38)
                java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ ClassCastException -> 0x0139 }
                r8 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassCastException -> 0x0139 }
                r5[r8] = r0     // Catch:{ ClassCastException -> 0x0139 }
                java.lang.String r0 = r13.getString(r15, r5)     // Catch:{ ClassCastException -> 0x0139 }
                nj3.C76879j.m92726T(r7, r0)     // Catch:{ ClassCastException -> 0x0139 }
                goto L_0x0141
            L_0x0126:
                androidx.appcompat.app.AppCompatActivity r0 = r2.getContext()     // Catch:{ ClassCastException -> 0x0139 }
                androidx.appcompat.app.AppCompatActivity r5 = r2.getContext()     // Catch:{ ClassCastException -> 0x0139 }
                r7 = 2131825639(0x7f1113e7, float:1.928414E38)
                java.lang.String r5 = r5.getString(r7)     // Catch:{ ClassCastException -> 0x0139 }
                nj3.C76879j.m92726T(r0, r5)     // Catch:{ ClassCastException -> 0x0139 }
                goto L_0x0141
            L_0x0139:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            L_0x0141:
                r5 = 0
                r7 = 1
                r13 = 1
                goto L_0x008e
            L_0x0147:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                ge3.a r7 = r2.mo135134J7()
                r7.getClass()
                com.tencent.mm.plugin.gallery.model.f r8 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118749i()
                java.util.HashMap<java.lang.Integer, java.lang.Boolean> r8 = r8.f271162h
                r8.clear()
                fe3.b r8 = r7.f169797p
                if (r8 == 0) goto L_0x01f5
                java.util.ArrayList r13 = r8.mo84202w5()
                int r13 = r13.size()
                java.lang.String r14 = "FS.AlbumFileUIC"
                if (r13 != 0) goto L_0x017f
                java.lang.String r8 = "selectedMediaPaths.size is 0, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r7 = r7.f169788d
                r8 = -2
                r7.setResult(r8)
                goto L_0x01f5
            L_0x017f:
                long r18 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                long r12 = r7.f169800s
                long r18 = r18 - r12
                r12 = 1000(0x3e8, double:4.94E-321)
                int r20 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
                if (r20 >= 0) goto L_0x0194
                java.lang.String r7 = "sendImg btn event frequency limit"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r7)
                goto L_0x01f5
            L_0x0194:
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r7.f169800s = r12
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r8.f168742h
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x01a5:
                boolean r12 = r7.hasNext()
                if (r12 == 0) goto L_0x01f2
                java.lang.Object r12 = r7.next()
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r12
                int r13 = r12.getType()
                java.lang.String r14 = "selectedItem.originalPath"
                r15 = 1
                if (r13 != r15) goto L_0x01e2
                java.lang.String r13 = r12.f162755o
                java.lang.String r15 = "edit"
                boolean r13 = gy3.C87412m.m108589b(r13, r15)
                if (r13 == 0) goto L_0x01d9
                java.lang.String r13 = r12.f162749f
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 != 0) goto L_0x01d9
                java.lang.String r12 = r12.f162749f
                java.lang.String r13 = "selectedItem.tmpEditPath"
                gy3.C87412m.m108593f(r12, r13)
                r8.add(r12)
                goto L_0x01a5
            L_0x01d9:
                java.lang.String r12 = r12.f162747d
                gy3.C87412m.m108593f(r12, r14)
                r8.add(r12)
                goto L_0x01a5
            L_0x01e2:
                int r13 = r12.getType()
                r15 = 2
                if (r13 != r15) goto L_0x01a5
                java.lang.String r12 = r12.f162747d
                gy3.C87412m.m108593f(r12, r14)
                r8.add(r12)
                goto L_0x01a5
            L_0x01f2:
                r17 = r8
                goto L_0x01f7
            L_0x01f5:
                r17 = 0
            L_0x01f7:
                java.lang.String r7 = ""
                if (r17 == 0) goto L_0x0223
                java.util.Iterator r8 = r17.iterator()
            L_0x01ff:
                boolean r12 = r8.hasNext()
                if (r12 == 0) goto L_0x0223
                java.lang.Object r12 = r8.next()
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r13 = "item"
                gy3.C87412m.m108593f(r12, r13)
                r0.add(r12)
                r5.add(r7)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r12 = r2.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r12 = r12.f283762a
                long r13 = r12.f265860q
                r15 = 1
                long r13 = r13 + r15
                r12.f265860q = r13
                goto L_0x01ff
            L_0x0223:
                int r8 = r3.size()
                java.lang.String r12 = "get path fail, msgInfo:"
                if (r8 <= 0) goto L_0x0265
                java.util.Iterator r3 = r3.iterator()
            L_0x022f:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x0265
                java.lang.Object r8 = r3.next()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r8 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r8
                java.lang.String r13 = r8.f283784h
                if (r13 != 0) goto L_0x0256
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r12)
                java.lang.CharSequence r8 = r8.mo135164c()
                r13.append(r8)
                java.lang.String r8 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
                goto L_0x022f
            L_0x0256:
                r0.add(r13)
                java.lang.CharSequence r8 = r8.mo135164c()
                java.lang.String r8 = r8.toString()
                r5.add(r8)
                goto L_0x022f
            L_0x0265:
                int r3 = r2.f283703d
                r8 = 1
                if (r8 != r3) goto L_0x02cd
                java.util.Iterator r3 = r4.iterator()
            L_0x026e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x02cd
                java.lang.Object r4 = r3.next()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96841j) r4
                java.lang.String r8 = r4.f283784h
                if (r8 != 0) goto L_0x0295
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r12)
                java.lang.CharSequence r4 = r4.mo135164c()
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r4)
                goto L_0x026e
            L_0x0295:
                boolean r13 = r4.f283787k
                if (r13 != 0) goto L_0x02bf
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r10)
                r13.append(r8)
                r13.append(r9)
                boolean r4 = r4.f283787k
                r13.append(r4)
                java.lang.String r4 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r4)
                androidx.appcompat.app.AppCompatActivity r4 = r2.getContext()
                java.lang.String r8 = r2.getString(r6)
                nj3.C76879j.m92726T(r4, r8)
                goto L_0x026e
            L_0x02bf:
                r0.add(r8)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$i r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96840i) r4
                java.lang.String r4 = r4.f283776o
                if (r4 != 0) goto L_0x02c9
                r4 = r7
            L_0x02c9:
                r5.add(r4)
                goto L_0x026e
            L_0x02cd:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                java.lang.String r4 = "selected_file_lst"
                r3.putStringArrayListExtra(r4, r0)
                java.lang.String r0 = "selected_file_title_lst"
                r3.putStringArrayListExtra(r0, r5)
                java.lang.String r0 = r2.f283704e
                java.lang.String r4 = "GalleryUI_ToUser"
                r3.putExtra(r4, r0)
                r0 = -1
                r2.setResult(r0, r3)
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$f r0 = r2.f283717u
                com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct r0 = r0.f283762a
                r3 = 1
                r0.f265847d = r3
                r2.finish()
                r2 = 1
                return r2
            L_0x02f6:
                java.lang.String r0 = "adapter"
                gy3.C87412m.m108603p(r0)
                r2 = 0
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.C96850r.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$s */
    public static final class C96851s implements DropdownListView.C72902c {

        /* renamed from: a */
        public final /* synthetic */ FileSelectorUI f283807a;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$s$a */
        public static final class C96852a implements C88930e {

            /* renamed from: a */
            public final /* synthetic */ FileSelectorUI f283808a;

            /* renamed from: b */
            public final /* synthetic */ DropdownListView.C72901b f283809b;

            /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$s$a$a */
            public static final class C96853a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ FileSelectorUI f283810d;

                public C96853a(FileSelectorUI fileSelectorUI) {
                    this.f283810d = fileSelectorUI;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f283810d.getContext());
                }
            }

            public C96852a(FileSelectorUI fileSelectorUI, DropdownListView.C72901b bVar) {
                this.f283808a = fileSelectorUI;
                this.f283809b = bVar;
            }

            public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                C87412m.m108591d(iArr);
                if (iArr[0] == 0) {
                    FileSelectorUI.m124373H7(this.f283808a, this.f283809b);
                } else {
                    C76879j.m92709C(this.f283808a.getContext(), this.f283808a.getContext().getString(C0966R.string.hi9), this.f283808a.getContext().getString(C0966R.string.hif), this.f283808a.getContext().getString(C0966R.string.fyd), this.f283808a.getContext().getString(C0966R.string.f360830f51), false, new C96853a(this.f283808a), (DialogInterface.OnClickListener) null);
                }
            }
        }

        public C96851s(FileSelectorUI fileSelectorUI) {
            this.f283807a = fileSelectorUI;
        }

        /* renamed from: a */
        public void mo100774a(DropdownListView.C72901b bVar) {
            if (bVar != null) {
                FileSelectorUI fileSelectorUI = this.f283807a;
                Log.m105924i("MicroMsg.FileSelectorUI", "item " + bVar.f212491d + " selected");
                int i = bVar.f212491d;
                if (i == 1 || i == 2) {
                    FileSelectorUI.m124373H7(fileSelectorUI, bVar);
                } else {
                    ((C103918d) C86312j.m106911c(C103918d.class)).eu0(145, new C96852a(fileSelectorUI, bVar), "android.permission.READ_EXTERNAL_STORAGE");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$v */
    public static final class C96854v implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283811d;

        public C96854v(FileSelectorUI fileSelectorUI) {
            this.f283811d = fileSelectorUI;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C87412m.m108594g(absListView, "view");
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C87412m.m108594g(absListView, "view");
            FileSelectorUI fileSelectorUI = this.f283811d;
            if (fileSelectorUI.f283711o) {
                Log.m105924i("MicroMsg.FileSelectorUI", "search mode, not load data");
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            if (i == 0) {
                ListView listView = fileSelectorUI.f283705f;
                if (listView != null) {
                    boolean z = false;
                    if (listView.getChildAt(listView.getChildCount() - 1) != null) {
                        ListView listView2 = fileSelectorUI.f283705f;
                        if (listView2 != null) {
                            int lastVisiblePosition = listView2.getLastVisiblePosition();
                            ListView listView3 = fileSelectorUI.f283705f;
                            if (listView3 == null) {
                                C87412m.m108603p("listView");
                                throw null;
                            } else if (lastVisiblePosition == listView3.getAdapter().getCount() - 1) {
                                z = true;
                            }
                        } else {
                            C87412m.m108603p("listView");
                            throw null;
                        }
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.FileSelectorUI", "will load data when it at bottom");
                        C96831e eVar = this.f283811d.f283708i;
                        if (eVar != null) {
                            int ordinal = eVar.f283743n.ordinal();
                            if (ordinal == 0) {
                                C96826a aVar = eVar.f283740h;
                                aVar.getClass();
                                ((C119157j) C119157j.f356862d).mo183875f(new C96864a0(aVar));
                            } else if (ordinal == 1) {
                                C96829c cVar = eVar.f283741i;
                                cVar.getClass();
                                ((C119157j) C119157j.f356862d).mo183875f(new C96865b0(cVar));
                            } else if (ordinal == 2) {
                                eVar.f283742j.getClass();
                            }
                        } else {
                            C87412m.m108603p("adapter");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("listView");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$w */
    public static final class C96855w implements C58970b.C58973c {

        /* renamed from: a */
        public final /* synthetic */ FileSelectorUI f283812a;

        public C96855w(FileSelectorUI fileSelectorUI) {
            this.f283812a = fileSelectorUI;
        }

        /* renamed from: a */
        public void mo84205a(int i, View view, int i2) {
            this.f283812a.f283717u.f283762a.f265852i = 1;
        }

        /* renamed from: b */
        public void mo84206b(int i, boolean z) {
            boolean z2 = i < 5;
            if (z) {
                if (z2) {
                    this.f283812a.f283717u.f283762a.f265856m++;
                    return;
                }
                this.f283812a.f283717u.f283762a.f265857n++;
            } else if (z2) {
                this.f283812a.f283717u.f283762a.f265856m--;
            } else {
                this.f283812a.f283717u.f283762a.f265857n--;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$y */
    public static final class C96856y implements C106742j1.C106756o {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283813d;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$y$a */
        public static final class C96857a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FileSelectorUI f283814d;

            public C96857a(FileSelectorUI fileSelectorUI) {
                this.f283814d = fileSelectorUI;
            }

            public final void run() {
                C96831e eVar = this.f283814d.f283708i;
                if (eVar == null) {
                    C87412m.m108603p("adapter");
                    throw null;
                } else if (eVar != null) {
                    eVar.mo135157j("");
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
        }

        public C96856y(FileSelectorUI fileSelectorUI) {
            this.f283813d = fileSelectorUI;
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            this.f283813d.f283711o = false;
            Log.m105918d("MicroMsg.FileSelectorUI", "onQuitSearch()");
            MMHandlerThread.postToMainThread(new C96857a(this.f283813d));
            this.f283813d.getController().mo177047G0();
            View view = this.f283813d.f283710n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$9", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$9", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            C87412m.m108594g(str, "searchText");
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
            DropdownListView dropdownListView = this.f283813d.f283713q;
            if (dropdownListView != null) {
                if (dropdownListView.f212477h) {
                    if (dropdownListView != null) {
                        dropdownListView.mo100758b();
                    } else {
                        C87412m.m108603p("dropdownListView");
                        throw null;
                    }
                }
                FileSelectorUI fileSelectorUI = this.f283813d;
                fileSelectorUI.f283711o = true;
                View view = fileSelectorUI.f283710n;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$9", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$9", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                FileSelectorUI fileSelectorUI2 = this.f283813d;
                C97243i1 i1Var = fileSelectorUI2.f283709j;
                if (i1Var != null) {
                    i1Var.f285340r = true;
                }
                fileSelectorUI2.f283717u.f283762a.f265851h = 1;
                Log.m105924i("MicroMsg.FileSelectorUI", "enter search");
                return;
            }
            C87412m.m108603p("dropdownListView");
            throw null;
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            View view;
            C87412m.m108594g(str, "searchText");
            FileSelectorUI fileSelectorUI = this.f283813d;
            if (!fileSelectorUI.f283716t && (view = fileSelectorUI.f283710n) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$9", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$9", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C96831e eVar = this.f283813d.f283708i;
            if (eVar != null) {
                eVar.mo135157j(str);
                this.f283813d.f283717u.f283763b.add(str);
                this.f283813d.f283716t = false;
                return;
            }
            C87412m.m108603p("adapter");
            throw null;
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$z */
    public static final class C96858z implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI f283815d;

        public C96858z(FileSelectorUI fileSelectorUI) {
            this.f283815d = fileSelectorUI;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C96831e eVar = this.f283815d.f283708i;
            if (eVar != null) {
                C96843l lVar = eVar.f283738f.get(i);
                if (this.f283815d.f283719w) {
                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                } else if (lVar == null) {
                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                } else {
                    int ordinal = lVar.f283792a.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            this.f283815d.f283717u.f283762a.f265852i = 1;
                            C96841j jVar = (C96841j) lVar;
                            String str = jVar.f283784h;
                            int H = C112550d0.m153772H(jVar.mo135164c(), ".", 0, false, 6, (Object) null) + 1;
                            if (H >= jVar.mo135164c().length()) {
                                Log.m105924i("MicroMsg.FileSelectorUI", "open file error : file path error");
                                FileSelectorUI fileSelectorUI = this.f283815d;
                                C76912y0.m92767f(fileSelectorUI, fileSelectorUI.getResources().getString(C0966R.string.ife));
                                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                                return;
                            }
                            CharSequence c = jVar.mo135164c();
                            String obj = c.subSequence(H, c.length()).toString();
                            FileSelectorUI fileSelectorUI2 = this.f283815d;
                            if (3 == fileSelectorUI2.f283703d && !jVar.f283787k) {
                                C96839h hVar = C96839h.FROM_CHATTING;
                                C96831e eVar2 = fileSelectorUI2.f283708i;
                                if (eVar2 == null) {
                                    C87412m.m108603p("adapter");
                                    throw null;
                                } else if (hVar == eVar2.f283743n) {
                                    if (C112551y.m153809i(obj, FileReaderHelper.PPT_EXT, true) || C112551y.m153809i(obj, FileReaderHelper.PDF_EXT, true) || C112551y.m153809i(obj, FileReaderHelper.DOC_EXT, true) || C112551y.m153809i(obj, FileReaderHelper.DOCX_EXT, true) || C112551y.m153809i(obj, FileReaderHelper.PPTX_EXT, true)) {
                                        FileSelectorUI fileSelectorUI3 = this.f283815d;
                                        long j2 = jVar.f283780d;
                                        fileSelectorUI3.getClass();
                                        if (!C86709a0.m107535s().mo121147n()) {
                                            C76912y0.m92771j(fileSelectorUI3.getContext(), (View) null);
                                        } else {
                                            Intent intent = new Intent();
                                            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, fileSelectorUI3.f283703d);
                                            intent.setClassName(fileSelectorUI3, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                                            intent.putExtra("app_msg_id", j2);
                                            fileSelectorUI3.startActivityForResult(intent, 4);
                                        }
                                    } else {
                                        FileSelectorUI fileSelectorUI4 = this.f283815d;
                                        C76912y0.m92767f(fileSelectorUI4, fileSelectorUI4.getResources().getString(C0966R.string.iff));
                                    }
                                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                                    return;
                                }
                            }
                            C96839h hVar2 = C96839h.FROM_FAV;
                            C96831e eVar3 = fileSelectorUI2.f283708i;
                            if (eVar3 == null) {
                                C87412m.m108603p("adapter");
                                throw null;
                            } else if (hVar2 != eVar3.f283743n || C86013q1.m106450k(jVar.f283784h)) {
                                FileSelectorUI.m124374I7(this.f283815d, str, jVar.mo135164c().toString());
                            } else {
                                C96840i iVar = (C96840i) lVar;
                                FileSelectorUI fileSelectorUI5 = this.f283815d;
                                long j3 = iVar.f283777p;
                                String str2 = iVar.f283775n;
                                if (str2 != null) {
                                    fileSelectorUI5.getClass();
                                    Intent intent2 = new Intent();
                                    intent2.putExtra("key_detail_info_id", j3);
                                    intent2.putExtra("key_detail_data_id", str2);
                                    intent2.putExtra("show_share", true);
                                    ((C102712e) C86312j.m106911c(C102712e.class)).F20(fileSelectorUI5.getContext(), ".ui.detail.FavoriteFileDetailUI", intent2);
                                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                                    return;
                                }
                                C87412m.m108603p("dataId");
                                throw null;
                            }
                        } else if (ordinal == 3) {
                            FileSelectorUI fileSelectorUI6 = this.f283815d;
                            fileSelectorUI6.f283717u.f283762a.f265852i = 1;
                            try {
                                C96842k kVar = (C96842k) lVar;
                                if (kVar.f283790n) {
                                    FileSelectorUI.m124374I7(fileSelectorUI6, kVar.f283784h, kVar.mo135164c().toString());
                                } else if (Util.isNullOrNil(kVar.f283784h)) {
                                    Log.m105920e("MicroMsg.FileSelectorUI", "can not open sub path because current path not exist");
                                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                                    return;
                                } else {
                                    String str3 = kVar.f283784h;
                                    if (str3 != null) {
                                        C96831e eVar4 = this.f283815d.f283708i;
                                        if (eVar4 != null) {
                                            eVar4.mo135159l(str3);
                                        } else {
                                            C87412m.m108603p("adapter");
                                            throw null;
                                        }
                                    }
                                    C96831e eVar5 = this.f283815d.f283708i;
                                    if (eVar5 != null) {
                                        eVar5.notifyDataSetChanged();
                                    } else {
                                        C87412m.m108603p("adapter");
                                        throw null;
                                    }
                                }
                            } catch (Exception e) {
                                Log.m105920e("MicroMsg.FileSelectorUI", "error:" + e.getMessage());
                                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                                return;
                            }
                        }
                        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                        return;
                    }
                    C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                }
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
    }

    /* renamed from: H7 */
    public static final void m124373H7(FileSelectorUI fileSelectorUI, DropdownListView.C72901b bVar) {
        C58970b bVar2;
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView;
        FileSelectorUI fileSelectorUI2 = fileSelectorUI;
        DropdownListView.C72901b bVar3 = bVar;
        fileSelectorUI.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("onMenuSelected. type:");
        sb.append(bVar3 != null ? Integer.valueOf(bVar3.f212491d) : null);
        Log.m105924i("MicroMsg.FileSelectorUI", sb.toString());
        fileSelectorUI.mo135139O7();
        fileSelectorUI2.f283714r = bVar3;
        if (bVar3 == null || C87412m.m108589b(Util.nullAs(fileSelectorUI2.f283712p, ""), bVar3.f212488a)) {
            Log.m105928w("MicroMsg.FileSelectorUI", "want to reset item, item is " + bVar3 + " or no need load data when same load");
        } else {
            ListView listView = fileSelectorUI2.f283705f;
            if (listView != null) {
                listView.setVisibility(0);
                PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = fileSelectorUI.mo135134J7().f169796o;
                if (pinnedHeaderRecyclerView2 != null) {
                    pinnedHeaderRecyclerView2.setVisibility(8);
                }
                fileSelectorUI2.addSearchMenu(true, fileSelectorUI2.f283709j);
                C96837f fVar = fileSelectorUI2.f283717u;
                int i = bVar3.f212491d;
                if (i == 1) {
                    fVar.f283762a.f265848e++;
                } else if (i == 2) {
                    fVar.f283762a.f265849f++;
                } else if (i == 3) {
                    fVar.f283762a.f265850g++;
                } else if (i != 4) {
                    fVar.getClass();
                } else {
                    fVar.f283762a.f265859p++;
                }
                int i2 = bVar3.f212491d;
                if (i2 == 1) {
                    C96831e eVar = fileSelectorUI2.f283708i;
                    if (eVar != null) {
                        eVar.mo135158k(C96839h.FROM_CHATTING);
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else if (i2 == 2) {
                    C96831e eVar2 = fileSelectorUI2.f283708i;
                    if (eVar2 != null) {
                        eVar2.mo135158k(C96839h.FROM_FAV);
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else if (i2 == 3) {
                    C96831e eVar3 = fileSelectorUI2.f283708i;
                    if (eVar3 != null) {
                        eVar3.mo135158k(C96839h.FROM_SDCARD);
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else if (i2 == 4) {
                    C96831e eVar4 = fileSelectorUI2.f283708i;
                    if (eVar4 != null) {
                        eVar4.mo135158k(C96839h.FROM_ALBUM);
                        fileSelectorUI.removeSearchMenu();
                        ListView listView2 = fileSelectorUI2.f283705f;
                        if (listView2 != null) {
                            listView2.setVisibility(8);
                            C59409a J7 = fileSelectorUI.mo135134J7();
                            if (!J7.f169807z) {
                                Log.m105925i("FS.AlbumFileUIC", "onCreate, %s.", J7);
                                FileSelectorUI fileSelectorUI3 = J7.f169788d;
                                boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(fileSelectorUI3, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, fileSelectorUI3.getString(C0966R.string.hif), J7.f169788d.getString(C0966R.string.f5g));
                                J7.f169789e = Uu0;
                                Log.m105925i("FS.AlbumFileUIC", "checkPermission checkMediaStorage[%b]", Boolean.valueOf(Uu0));
                                System.currentTimeMillis();
                                C59409a.f169785C = System.currentTimeMillis();
                                J7.f169798q = J7.f169788d.getIntent().getStringExtra("GalleryUI_FromUser");
                                J7.f169799r = J7.f169788d.getIntent().getStringExtra("GalleryUI_ToUser");
                                FileSelectorUI fileSelectorUI4 = J7.f169788d;
                                J7.f169792h = C89779i0.m112246c(fileSelectorUI4, fileSelectorUI4.getString(C0966R.string.a4d), false, 0, (DialogInterface.OnCancelListener) null);
                                J7.f169805x = C59409a.C59410a.CREATE;
                                C93958f.m118750j().f271196f = J7.f169790f;
                                C93958f.m118750j().mo128903I(J7.f169791g);
                                Log.m105924i("FS.AlbumFileUIC", "query source: " + J7.f169790f + ", queryType: " + J7.f169791g);
                                Bundle extras = J7.f169788d.getIntent().getExtras();
                                if (extras != null) {
                                    for (String next : extras.keySet()) {
                                        Log.m105919d("FS.AlbumFileUIC", "key=%s | value=%s", next, extras.get(next));
                                    }
                                } else {
                                    Log.m105920e("FS.AlbumFileUIC", "initView, oops! no extras data!");
                                }
                                J7.f169793i = J7.f169788d.getIntent().getIntExtra("max_select_count", 9);
                                J7.f169796o = (PinnedHeaderRecyclerView) J7.f169788d.findViewById(C0966R.C0970id.gq7);
                                C58970b bVar4 = new C58970b(J7.f169788d, J7.f169786A);
                                J7.f169797p = bVar4;
                                PinnedHeaderRecyclerView pinnedHeaderRecyclerView3 = J7.f169796o;
                                if (pinnedHeaderRecyclerView3 != null) {
                                    pinnedHeaderRecyclerView3.setAdapter(bVar4);
                                }
                                GridLayoutManager gridLayoutManager = new GridLayoutManager(J7.f169788d.getContext(), 3);
                                gridLayoutManager.f44666B = new C59414b(J7);
                                PinnedHeaderRecyclerView pinnedHeaderRecyclerView4 = J7.f169796o;
                                if (pinnedHeaderRecyclerView4 != null) {
                                    pinnedHeaderRecyclerView4.setLayoutManager(gridLayoutManager);
                                }
                                PinnedHeaderRecyclerView pinnedHeaderRecyclerView5 = J7.f169796o;
                                if (pinnedHeaderRecyclerView5 != null) {
                                    pinnedHeaderRecyclerView5.mo17085h0(new C66789c());
                                }
                                PinnedHeaderRecyclerView pinnedHeaderRecyclerView6 = J7.f169796o;
                                if (pinnedHeaderRecyclerView6 != null) {
                                    pinnedHeaderRecyclerView6.mo17043c(new C59415c(J7, gridLayoutManager));
                                }
                                C58970b bVar5 = J7.f169797p;
                                if (bVar5 != null) {
                                    bVar5.f168747p = J7.f169787B;
                                }
                                if (bVar5 != null) {
                                    bVar5.f168740f = J7.f169793i;
                                }
                                Log.m105924i("FS.AlbumFileUIC", "limit count = " + J7.f169793i);
                                if (J7.f169789e) {
                                    ((C101069i) C100687b.m131710a(C100687b.f295006d)).mo140531a(1.0d);
                                    C97754e.C97756b.f286807a.mo137084c(J7.f169790f);
                                    Log.m105925i("FS.AlbumFileUIC", "start queryMediaInAlbums %s", J7);
                                    C93958f.m118750j().mo128902C5(J7);
                                    J7.f169794j = System.currentTimeMillis();
                                    C93958f.m118750j().mo128911o1("", J7.f169794j);
                                    PinnedHeaderRecyclerView pinnedHeaderRecyclerView7 = J7.f169796o;
                                    if (pinnedHeaderRecyclerView7 != null) {
                                        pinnedHeaderRecyclerView7.postDelayed(new C59416d(J7), 300);
                                    }
                                    C98554s sVar = C98554s.f289007d;
                                    sVar.mo137927a(new C60220r());
                                    sVar.mo137927a(new C60222v());
                                }
                                C93958f.m118754n();
                                J7.f169807z = true;
                            }
                            C59409a J72 = fileSelectorUI.mo135134J7();
                            if (!(J72 == null || (pinnedHeaderRecyclerView = J72.f169796o) == null)) {
                                pinnedHeaderRecyclerView.setVisibility(0);
                            }
                            C59409a J73 = fileSelectorUI.mo135134J7();
                            if (!(J73 == null || (bVar2 = J73.f169797p) == null)) {
                                J73.mo84528c(bVar2.f168742h.size());
                            }
                        } else {
                            C87412m.m108603p("listView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("listView");
                throw null;
            }
        }
        DropdownListView.C72901b bVar6 = fileSelectorUI2.f283714r;
        if (bVar6 != null) {
            Log.m105925i("MicroMsg.FileSelectorUI", "reset folder[%s]", bVar6.f212488a);
            String str = bVar6.f212488a;
            fileSelectorUI2.f283712p = str;
            fileSelectorUI2.updateActionBarOperationAreaTxt(str);
        }
        DropdownListView dropdownListView = fileSelectorUI2.f283713q;
        if (dropdownListView != null) {
            dropdownListView.mo100757a();
        } else {
            C87412m.m108603p("dropdownListView");
            throw null;
        }
    }

    /* renamed from: I7 */
    public static final void m124374I7(FileSelectorUI fileSelectorUI, String str, String str2) {
        fileSelectorUI.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FileSelectorUI", "open file but file not exist");
            return;
        }
        String o = C86013q1.m106454o(str);
        int i = fileSelectorUI.f283703d;
        if (3 != i && 4 != i) {
            ((C22921c) C86312j.m106911c(C22921c.class)).mo35876EU(fileSelectorUI, str, o, 1);
        } else if (!C112551y.m153809i(o, FileReaderHelper.PPT_EXT, true) && !C112551y.m153809i(o, FileReaderHelper.PDF_EXT, true) && !C112551y.m153809i(o, FileReaderHelper.DOC_EXT, true) && !C112551y.m153809i(o, FileReaderHelper.DOCX_EXT, true) && !C112551y.m153809i(o, FileReaderHelper.PPTX_EXT, true)) {
            C76912y0.m92767f(fileSelectorUI, fileSelectorUI.getResources().getString(C0966R.string.iff));
        } else if (str != null) {
            C87412m.m108593f(o, "ext");
            fileSelectorUI.mo135136L7(str2, str, o);
        }
    }

    /* renamed from: J7 */
    public final C59409a mo135134J7() {
        return (C59409a) ((C36570n) this.f283706g).getValue();
    }

    /* renamed from: K7 */
    public final int mo135135K7() {
        C96831e eVar = this.f283708i;
        if (eVar != null) {
            return eVar.f283739g.size();
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    /* renamed from: L7 */
    public final void mo135136L7(String str, String str2, String str3) {
        String str4 = str2;
        String str5 = str3;
        int i = this.f283703d;
        String str6 = "";
        if (i != 3) {
            if (i == 4) {
                setMMTitle(str);
                hideActionBarOperationArea();
                removeSearchMenu();
                setBackBtn(new C96869f0(this), C0966R.raw.actionbar_icon_dark_back);
                this.f283719w = true;
                DropdownListView dropdownListView = this.f283713q;
                if (dropdownListView != null) {
                    dropdownListView.setVisibility(4);
                    String i2 = C86013q1.m106448i(str4, false);
                    if (i2 != null) {
                        str6 = i2;
                    }
                    if (Util.isNullOrNil(str6)) {
                        Log.m105920e("MicroMsg.FileSelectorUI", "goToScreenProfile, exportExternalPath is null");
                    }
                    AppCompatActivity context = getContext();
                    C87412m.m108593f(context, "context");
                    C106690i4 i4Var = new C106690i4(context, str6, str5, 4);
                    this.f283718v = i4Var;
                    i4Var.mo153640d();
                    View contentView = getContentView();
                    C87412m.m108592e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) contentView).addView(this.f283718v);
                    return;
                }
                C87412m.m108603p("dropdownListView");
                throw null;
            }
        } else if (C105851w0.zx0().mo150684z()) {
            setMMTitle(str);
            hideActionBarOperationArea();
            removeSearchMenu();
            setBackBtn(new C96871g0(this), C0966R.raw.actionbar_icon_dark_back);
            this.f283719w = true;
            DropdownListView dropdownListView2 = this.f283713q;
            if (dropdownListView2 != null) {
                dropdownListView2.setVisibility(4);
                String i3 = C86013q1.m106448i(str4, false);
                if (i3 != null) {
                    str6 = i3;
                }
                if (Util.isNullOrNil(str6)) {
                    Log.m105920e("MicroMsg.FileSelectorUI", "goToScreenProfile, exportExternalPath is null");
                }
                AppCompatActivity context2 = getContext();
                C87412m.m108593f(context2, "context");
                C106690i4 i4Var2 = new C106690i4(context2, str6, str5, 3);
                this.f283718v = i4Var2;
                i4Var2.mo153640d();
                View contentView2 = getContentView();
                C87412m.m108592e(contentView2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) contentView2).addView(this.f283718v);
                setRequestedOrientation(4);
                return;
            }
            C87412m.m108603p("dropdownListView");
            throw null;
        }
    }

    /* renamed from: M7 */
    public final void mo135137M7(boolean z) {
        C86009m1 d;
        DropdownListView dropdownListView = this.f283713q;
        if (dropdownListView == null) {
            C87412m.m108603p("dropdownListView");
            throw null;
        } else if (dropdownListView != null) {
            if (dropdownListView.f212477h) {
                if (dropdownListView != null) {
                    dropdownListView.mo100758b();
                    playActionBarOperationAreaAnim();
                } else {
                    C87412m.m108603p("dropdownListView");
                    throw null;
                }
            }
            if (!z) {
                C96831e eVar = this.f283708i;
                if (eVar != null) {
                    C96839h hVar = C96839h.FROM_SDCARD;
                    if ((!(hVar == eVar.f283743n) ? null : eVar.f283742j.mo135165d()) != null) {
                        C96831e eVar2 = this.f283708i;
                        if (eVar2 != null) {
                            if (eVar2.f283743n == hVar && (d = eVar2.f283742j.mo135165d()) != null) {
                                FileSelectorUI fileSelectorUI = FileSelectorUI.this;
                                eVar2.f283742j.mo135166e(d);
                                C96831e eVar3 = fileSelectorUI.f283708i;
                                if (eVar3 != null) {
                                    eVar3.mo135156i();
                                } else {
                                    C87412m.m108603p("adapter");
                                    throw null;
                                }
                            }
                            C96831e eVar4 = this.f283708i;
                            if (eVar4 != null) {
                                eVar4.notifyDataSetChanged();
                                return;
                            } else {
                                C87412m.m108603p("adapter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("adapter");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
            setResult(-2);
            if (z) {
                setResult(0);
            }
            finish();
        } else {
            C87412m.m108603p("dropdownListView");
            throw null;
        }
    }

    /* renamed from: N7 */
    public final void mo135138N7() {
        initActionBarOperationArea();
        String str = this.f283712p;
        if (Util.isNullOrNil(str)) {
            str = getString(C0966R.string.cuv);
        }
        String str2 = str;
        if (str2 != null) {
            initActionBarOperationAreaTxt(str2, C0966R.color.FG_0, C0966R.color.FG_0, C0966R.C0969drawable.f5022uf, C0966R.C0969drawable.f5021ue);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135139O7() {
        /*
            r6 = this;
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$e r0 = r6.f283708i
            r1 = 0
            if (r0 == 0) goto L_0x0074
            java.util.List<com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI$j> r0 = r0.f283739g
            int r0 = r0.size()
            ge3.a r2 = r6.mo135134J7()
            r3 = 0
            if (r2 == 0) goto L_0x0027
            fe3.b r2 = r2.f169797p
            if (r2 == 0) goto L_0x0020
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r2.f168742h
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            int r1 = r1.intValue()
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            int r0 = r0 + r1
            r1 = 3
            int r2 = r6.f283703d
            if (r1 == r2) goto L_0x0073
            r1 = 2131820938(0x7f11018a, float:1.9274605E38)
            r4 = 1
            r5 = 2131821677(0x7f11046d, float:1.9276104E38)
            if (r0 <= 0) goto L_0x0063
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r6.f283703d
            if (r4 != r3) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r1 = 2131821677(0x7f11046d, float:1.9276104E38)
        L_0x0044:
            java.lang.String r1 = r6.getString(r1)
            r2.append(r1)
            r1 = 40
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "/9)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.updateOptionMenuText(r4, r0)
            r6.enableOptionMenu(r4, r4)
            goto L_0x0073
        L_0x0063:
            if (r4 != r2) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r1 = 2131821677(0x7f11046d, float:1.9276104E38)
        L_0x0069:
            java.lang.String r0 = r6.getString(r1)
            r6.updateOptionMenuText(r4, r0)
            r6.enableOptionMenu(r4, r3)
        L_0x0073:
            return
        L_0x0074:
            java.lang.String r0 = "adapter"
            gy3.C87412m.m108603p(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI.mo135139O7():void");
    }

    public void finish() {
        super.finish();
        C96831e eVar = this.f283708i;
        if (eVar != null) {
            C96826a aVar = eVar.f283740h;
            if (aVar.f283722p != null) {
                ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(aVar.f283722p);
            }
            C96837f fVar = this.f283717u;
            SendFileInWidgetStruct sendFileInWidgetStruct = fVar.f283762a;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = fVar.f283763b.iterator();
            int i = 0;
            while (it.hasNext()) {
                String next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    stringBuffer.append(next);
                    if (i < fVar.f283763b.size() - 1) {
                        stringBuffer.append("|");
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            C87412m.m108593f(stringBuffer2, "sb.toString()");
            sendFileInWidgetStruct.f265858o = sendFileInWidgetStruct.mo86045b("searchKeyword", stringBuffer2, true);
            fVar.f283762a.mo86054n();
            SendFileInWidgetStruct sendFileInWidgetStruct2 = fVar.f283762a;
            C87412m.m108594g(sendFileInWidgetStruct2, "struct");
            sendFileInWidgetStruct2.mo86056r();
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public int getForceOrientation() {
        return !this.f283719w ? 1 : 4;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8_;
    }

    public boolean isActionbarCenterLayoutMode() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        PinnedHeaderRecyclerView pinnedHeaderRecyclerView = mo135134J7().f169796o;
        if (pinnedHeaderRecyclerView != null && pinnedHeaderRecyclerView.getVisibility() == 0) {
            C59409a J7 = mo135134J7();
            J7.getClass();
            if (i4 == -2) {
                Log.m105920e("FS.AlbumFileUIC", "WTF!!!");
                J7.f169788d.finish();
            } else if (i4 == 0 && intent2 != null) {
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("preview_image_list");
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(stringArrayListExtra != null ? stringArrayListExtra.size() : 0);
                Log.m105925i("FS.AlbumFileUIC", "paths size: %d.", objArr);
                if (stringArrayListExtra != null && J7.f169797p != null) {
                    C90590d dVar = new C90590d();
                    int i5 = 0;
                    while (true) {
                        C58970b bVar = J7.f169797p;
                        C87412m.m108591d(bVar);
                        if (i5 >= bVar.f168742h.size()) {
                            break;
                        }
                        C58970b bVar2 = J7.f169797p;
                        C87412m.m108591d(bVar2);
                        GalleryItem$MediaItem galleryItem$MediaItem = bVar2.f168742h.get(i5);
                        C87412m.m108593f(galleryItem$MediaItem, "adapter!!.selectedMediaItems[i]");
                        C58970b bVar3 = J7.f169797p;
                        C87412m.m108591d(bVar3);
                        int indexOf = bVar3.f168741g.indexOf(galleryItem$MediaItem);
                        if (indexOf != -1) {
                            dVar.add(Integer.valueOf(indexOf));
                        }
                        i5++;
                    }
                    C58970b bVar4 = J7.f169797p;
                    if (bVar4 != null) {
                        Log.m105919d("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s].", bVar4.f168742h);
                        bVar4.f168742h.clear();
                        Iterator<String> it = stringArrayListExtra.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            C87412m.m108593f(next, "selectedPaths");
                            String str = next;
                            GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(0, 0, str, "", "");
                            if (C93958f.m118751k() != null) {
                                int indexOf2 = C93958f.m118751k().indexOf(c);
                                if (indexOf2 >= 0) {
                                    GalleryItem$MediaItem galleryItem$MediaItem2 = C93958f.m118751k().get(indexOf2);
                                    C87412m.m108593f(galleryItem$MediaItem2, "GalleryCore.getPreviewItems()[index]");
                                    bVar4.f168742h.add(galleryItem$MediaItem2);
                                } else {
                                    Log.m105918d("MicroMsg.AlbumAdapter", "media item no exist on preview items.");
                                    String lowerCase = str.toLowerCase();
                                    C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                                    if (C112551y.m153808h(lowerCase, "mp4", false, 2, (Object) null)) {
                                        bVar4.f168742h.add(GalleryItem$MediaItem.m65488c(2, 0, str, "", ""));
                                    } else {
                                        bVar4.f168742h.add(GalleryItem$MediaItem.m65488c(1, 0, str, "", ""));
                                    }
                                }
                            }
                        }
                        Log.m105919d("MicroMsg.AlbumAdapter", "after set selected paths, selected[%s].", bVar4.f168742h);
                    }
                    C58970b bVar5 = J7.f169797p;
                    if (bVar5 != null) {
                        int size = bVar5.f168742h.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            GalleryItem$MediaItem galleryItem$MediaItem3 = bVar5.f168742h.get(i6);
                            C87412m.m108593f(galleryItem$MediaItem3, "mSelectMediaItems[i]");
                            int indexOf3 = bVar5.f168741g.indexOf(galleryItem$MediaItem3);
                            if (indexOf3 != -1) {
                                dVar.add(Integer.valueOf(indexOf3));
                            }
                        }
                        Iterator it4 = dVar.iterator();
                        while (true) {
                            C118556h.C118557a aVar = (C118556h.C118557a) it4;
                            if (!aVar.hasNext()) {
                                break;
                            }
                            Object next2 = aVar.next();
                            C87412m.m108593f(next2, "notifiedItems");
                            bVar5.notifyItemChanged(((Number) next2).intValue());
                        }
                    }
                    J7.mo84528c(stringArrayListExtra.size());
                }
            }
        } else if (i3 == 4 && intent2 != null) {
            String stringExtra = intent2.getStringExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            String stringExtra2 = intent2.getStringExtra(DownloadInfo.FILENAME);
            String stringExtra3 = intent2.getStringExtra("fileExt");
            if (C112551y.m153809i(stringExtra3, FileReaderHelper.PPT_EXT, true) || C112551y.m153809i(stringExtra3, FileReaderHelper.PDF_EXT, true) || C112551y.m153809i(stringExtra3, FileReaderHelper.DOC_EXT, true) || C112551y.m153809i(stringExtra3, FileReaderHelper.DOCX_EXT, true) || C112551y.m153809i(stringExtra3, FileReaderHelper.PPTX_EXT, true)) {
                if (stringExtra2 != null && stringExtra != null && stringExtra3 != null) {
                    mo135136L7(stringExtra2, stringExtra, stringExtra3);
                }
            } else if (intent2.getBooleanExtra("resLoadFailed", false)) {
                C76912y0.m92767f(this, getResources().getString(C0966R.string.cuz));
            } else {
                C76912y0.m92767f(this, getResources().getString(C0966R.string.iff));
            }
        } else if (!(i3 == 0 && i4 == -1) && i3 == 2) {
            ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, true, C0966R.string.c1b, C0966R.string.c1c, 1);
            C76912y0.makeText((Context) this, (int) C0966R.string.cul, 0).show();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C106690i4 i4Var;
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (this.f283719w && (i4Var = this.f283718v) != null && i4Var != null) {
            i4Var.mo153637a();
            i4Var.mo153638b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long currentTimeMillis = System.currentTimeMillis();
        this.f283704e = getIntent().getStringExtra("TO_USER");
        this.f283703d = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        setActionBarOperationAreaClickListener(new C96873h0(this));
        setBackBtn(new C96849q(this), C0966R.raw.actionbar_quit_webview_icon);
        int i = this.f283703d;
        if (3 != i && 4 != i) {
            addTextOptionMenu(1, getString(1 == i ? C0966R.string.f7566ju : C0966R.string.a2s), new C96850r(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        } else if (!EventCenter.instance.hadListened(this.f283715s)) {
            this.f283715s.alive();
        }
        initActionBarOperationArea();
        initActionBarOperationAreaTxt(getString(C0966R.string.cuv), C0966R.color.FG_0, C0966R.color.FG_0, C0966R.C0969drawable.f5022uf, C0966R.C0969drawable.f5021ue);
        View findViewById = findViewById(C0966R.C0970id.ca7);
        C87412m.m108593f(findViewById, "findViewById(R.id.dropdown_list_view)");
        this.f283713q = (DropdownListView) findViewById;
        String string = getString(C0966R.string.cuv);
        C87412m.m108593f(string, "getString(R.string.file_explorer_title_chatting)");
        String string2 = getString(C0966R.string.cuw);
        C87412m.m108593f(string2, "getString(R.string.file_explorer_title_fav)");
        String string3 = getString(C0966R.string.cux);
        C87412m.m108593f(string3, "getString(R.string.file_explorer_title_local)");
        ArrayList c = C64197v.m75534c(new DropdownListView.C72901b(string, C0966R.raw.icons_outlined_copy, C0966R.color.FG_0, 1), new DropdownListView.C72901b(string2, C0966R.raw.icons_outlined_favorites, C0966R.color.FG_0, 2), new DropdownListView.C72901b(string3, C0966R.raw.icons_outlined_folder, C0966R.color.FG_0, 3));
        int i2 = this.f283703d;
        if (!(3 == i2 && 1 == i2)) {
            String string4 = getString(C0966R.string.cuu);
            C87412m.m108593f(string4, "getString(R.string.file_explorer_title_album)");
            c.add(new DropdownListView.C72901b(string4, C0966R.raw.icons_outlined_album, C0966R.color.FG_0, 4));
        }
        DropdownListView dropdownListView = this.f283713q;
        if (dropdownListView != null) {
            dropdownListView.setItems(c);
            DropdownListView dropdownListView2 = this.f283713q;
            if (dropdownListView2 != null) {
                dropdownListView2.setListener(new C96851s(this));
                DropdownListView dropdownListView3 = this.f283713q;
                if (dropdownListView3 != null) {
                    dropdownListView3.setOnItemStateChanged(new C72910t());
                    this.f283708i = new C96831e();
                    View findViewById2 = findViewById(C0966R.C0970id.d0k);
                    C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.ListView");
                    this.f283705f = (ListView) findViewById2;
                    C96831e eVar = this.f283708i;
                    if (eVar != null) {
                        eVar.mo135158k(C96839h.FROM_CHATTING);
                        ListView listView = this.f283705f;
                        if (listView != null) {
                            C96831e eVar2 = this.f283708i;
                            if (eVar2 != null) {
                                listView.setAdapter(eVar2);
                                ListView listView2 = this.f283705f;
                                if (listView2 != null) {
                                    listView2.setOnTouchListener(new C72911u(this));
                                    ListView listView3 = this.f283705f;
                                    if (listView3 != null) {
                                        listView3.setOnItemClickListener(this.f283720x);
                                        ListView listView4 = this.f283705f;
                                        if (listView4 != null) {
                                            listView4.setOnScrollListener(new C96854v(this));
                                            TextView textView = (TextView) findViewById(C0966R.C0970id.d0e);
                                            this.f283707h = textView;
                                            if (textView != null) {
                                                textView.setVisibility(8);
                                            }
                                            ListView listView5 = this.f283705f;
                                            if (listView5 != null) {
                                                listView5.setEmptyView(this.f283707h);
                                                PinnedHeaderRecyclerView pinnedHeaderRecyclerView = mo135134J7().f169796o;
                                                if (pinnedHeaderRecyclerView != null) {
                                                    pinnedHeaderRecyclerView.setVisibility(8);
                                                }
                                                mo135134J7().f169806y = new C96855w(this);
                                                View findViewById3 = findViewById(C0966R.C0970id.j6c);
                                                this.f283710n = findViewById3;
                                                if (findViewById3 != null) {
                                                    C9556a aVar = new C9556a();
                                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                                    aVar.mo10233c(8);
                                                    View view = findViewById3;
                                                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                    findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                                    C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                }
                                                View view2 = this.f283710n;
                                                if (view2 != null) {
                                                    view2.setOnClickListener(C72912x.f212501d);
                                                }
                                                C97243i1 i1Var = new C97243i1(true, true);
                                                this.f283709j = i1Var;
                                                i1Var.f319122j = new C96856y(this);
                                                addSearchMenu(true, i1Var);
                                                mo135139O7();
                                                Log.m105924i("MicroMsg.FileSelectorUI", "onCreate, cost:" + (System.currentTimeMillis() - currentTimeMillis));
                                                DropdownListView dropdownListView4 = this.f283713q;
                                                if (dropdownListView4 != null) {
                                                    dropdownListView4.setFolderAlbumDialogDismiss(new C96848p(this));
                                                    C44706b.m49451b((TextView) findViewById(C0966R.C0970id.f5690ly), C0966R.dimen.f3619c);
                                                    return;
                                                }
                                                C87412m.m108603p("dropdownListView");
                                                throw null;
                                            }
                                            C87412m.m108603p("listView");
                                            throw null;
                                        }
                                        C87412m.m108603p("listView");
                                        throw null;
                                    }
                                    C87412m.m108603p("listView");
                                    throw null;
                                }
                                C87412m.m108603p("listView");
                                throw null;
                            }
                            C87412m.m108603p("adapter");
                            throw null;
                        }
                        C87412m.m108603p("listView");
                        throw null;
                    }
                    C87412m.m108603p("adapter");
                    throw null;
                }
                C87412m.m108603p("dropdownListView");
                throw null;
            }
            C87412m.m108603p("dropdownListView");
            throw null;
        }
        C87412m.m108603p("dropdownListView");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C59409a J7 = mo135134J7();
        if (J7 != null) {
            C93958f.m118750j().mo128910i0(J7);
            C93958f.m118742b();
        }
        this.f283715s.dead();
        C97243i1 i1Var = this.f283709j;
        if (i1Var != null) {
            i1Var.mo153850b();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (i == 4) {
            Log.m105924i("MicroMsg.FileSelectorUI", "onKeyDown back");
            if (this.f283719w) {
                C106690i4 i4Var = this.f283718v;
                if (i4Var != null) {
                    i4Var.mo153639c();
                }
                C106690i4 i4Var2 = this.f283718v;
                if (i4Var2 != null) {
                    i4Var2.removeAllViews();
                }
                View contentView = getContentView();
                C87412m.m108592e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) contentView).removeView(this.f283718v);
                setBackBtn(new C96828a0(this), C0966R.raw.actionbar_quit_webview_icon);
                DropdownListView dropdownListView = this.f283713q;
                if (dropdownListView != null) {
                    dropdownListView.setVisibility(0);
                    setActionBarOperationAreaClickListener(new C96873h0(this));
                    mo135138N7();
                    setRequestedOrientation(1);
                    addSearchMenu(true, this.f283709j);
                    Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markExitDuringProfileUI");
                    C115669n.INSTANCE.mo175913w(1538, 2, 1);
                    this.f283719w = false;
                } else {
                    C87412m.m108603p("dropdownListView");
                    throw null;
                }
            } else {
                mo135137M7(false);
            }
            return true;
        } else if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        } else {
            DropdownListView dropdownListView2 = this.f283713q;
            if (dropdownListView2 != null) {
                dropdownListView2.mo100758b();
                return true;
            }
            C87412m.m108603p("dropdownListView");
            throw null;
        }
    }

    public void onPause() {
        super.onPause();
        if (!isFinishing() && !isDestroyed()) {
            DropdownListView dropdownListView = this.f283713q;
            if (dropdownListView == null) {
                C87412m.m108603p("dropdownListView");
                throw null;
            } else if (dropdownListView == null) {
                C87412m.m108603p("dropdownListView");
                throw null;
            } else if (!dropdownListView.f212477h) {
            } else {
                if (dropdownListView != null) {
                    dropdownListView.mo100757a();
                } else {
                    C87412m.m108603p("dropdownListView");
                    throw null;
                }
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C45650a.class);
    }
}
