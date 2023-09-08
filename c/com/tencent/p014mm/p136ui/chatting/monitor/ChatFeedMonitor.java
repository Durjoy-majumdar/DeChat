package com.tencent.p014mm.p136ui.chatting.monitor;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.AbsListView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60151b;
import ia1.C98619b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import o91.C100313f;
import o91.C100317j;
import op3.C117877b;
import op3.C117882j;
import p185kq.C10383h;
import te3.C64623p81;
import te3.e74;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J,\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J6\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\"\u0010\u0015\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J$\u0010\u0016\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001d\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010!\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\b\u0010\"\u001a\u00020\bH\u0002R\u0014\u0010$\u001a\u00020#8\u0002XT¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u001e0&j\b\u0012\u0004\u0012\u00020\u001e`'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0*j\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e`+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010/R\u0016\u00105\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00106\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010/¨\u00069"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/monitor/ChatFeedMonitor;", "", "Landroid/view/View;", "listView", "adapter", "", "firstPostion", "visibleItemCount", "Lrx3/b0;", "monitor", "feedView", "position", "firstPos", "Lop3/b;", "Lo91/f;", "", "_getHellFeed", "view", "_getLiveFeedUIParams", "getY", "feed", "onFeedAppear", "onFeedDisappear", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "init", "Landroid/app/Activity;", "initStatusBarHeight", "initActionBarHeight", "initScreenHeight", "Lia1/b;", "listener", "registerListener", "unregisterListener", "resetCache", "", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mChatFeedCache", "Ljava/util/HashMap;", "mFirstPostion", "I", "mVisibleItemCount", "mScreenRealHeight", "mScreenHeight", "mStatusBarHeight", "mActionBarHeight", "virtualKeyHeight", "chatFooterHeight", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.monitor.ChatFeedMonitor */
public final class ChatFeedMonitor {
    public static final int $stable = 8;
    public static final ChatFeedMonitor INSTANCE = new ChatFeedMonitor();
    private static final String TAG = "HABBYGE-MALI.ChatFeedMonitor";
    private static int chatFooterHeight;
    private static final ArrayList<C98619b> listeners = new ArrayList<>();
    private static int mActionBarHeight;
    private static final HashMap<String, C100313f> mChatFeedCache = new HashMap<>();
    private static int mFirstPostion = -1;
    private static int mScreenHeight;
    private static int mScreenRealHeight;
    private static int mStatusBarHeight;
    private static int mVisibleItemCount = -1;
    private static int virtualKeyHeight;

    private ChatFeedMonitor() {
    }

    private final C117877b<C100313f, Boolean> _getHellFeed(View view, int i, View view2, int i2) {
        int i3;
        Object b;
        C72963f4 f4Var;
        String content;
        String str;
        String str2;
        String str3;
        String str4;
        int i4;
        RecyclerView.C16613e adapter;
        View view3 = view2;
        String str5 = null;
        if (!C100317j.m131147e(view2) || (i3 = i2 + i) >= C100317j.m131145c(view2) || (b = C100317j.m131144b(view3, i3)) == null || !(b instanceof C72963f4) || view.getTag() == null || !(view.getTag() instanceof ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder)) {
            return null;
        }
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder");
        ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder = (ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder) tag;
        C74023i iVar = appMsgFinderLiveFeedHolder.chattingItem;
        if (iVar == null) {
            return null;
        }
        String talkerUserName = appMsgFinderLiveFeedHolder.getTalkerUserName();
        if ((!(iVar instanceof ChatingItemAppMsgFinderLiveFeed.C57711c) && !(iVar instanceof ChatingItemAppMsgFinderLiveFeed.C57709b)) || (content = f4Var.getContent()) == null) {
            return null;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, (f4Var = (C72963f4) b).mo108775z2());
        boolean z = true;
        if (u != null) {
            C60151b bVar = (C60151b) u.mo93555w(C60151b.class);
            if (bVar == null) {
                return null;
            }
            C64623p81 p812 = bVar.f171698b;
            str4 = p812.f184780f;
            str3 = p812.f184778d;
            str2 = p812.f184779e;
            str = p812.f184781g;
            int i5 = p812.f184791t;
            String str6 = u.f195488G;
            if (Util.isNullOrNil(str6) && f4Var.mo108769t2() == 1) {
                str6 = C86709a0.m107523b().mo121112j();
            }
            String str7 = str6;
            i4 = i5;
            str5 = str7;
        } else {
            i4 = -1;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        C117877b<Integer, Integer> _getLiveFeedUIParams = _getLiveFeedUIParams(view);
        Integer num = (Integer) _getLiveFeedUIParams.mo182596a(1);
        C100313f fVar = new C100313f();
        Integer num2 = (Integer) _getLiveFeedUIParams.mo182596a(0);
        fVar.f293871e = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(f4Var.getMsgId());
        fVar.f293875i = str5;
        e74 e74 = new e74();
        fVar.f293867a = e74;
        e74.f298179d = str4;
        fVar.f293869c = str3;
        fVar.f293870d = i4;
        e74.f298197y = str2;
        e74.f298178A = str;
        fVar.f293876j = talkerUserName;
        if (TextUtils.isEmpty(str4)) {
            e74 e742 = fVar.f293867a;
            long j = Long.MIN_VALUE;
            if (view3 instanceof AbsListView) {
                j = ((AbsListView) view3).getItemIdAtPosition(i3);
            } else if ((view3 instanceof RecyclerView) && (adapter = ((RecyclerView) view3).getAdapter()) != null) {
                j = adapter.getItemId(i3);
            }
            e742.f298179d = String.valueOf(j);
        }
        e74 e743 = fVar.f293867a;
        Integer num3 = num2;
        C87412m.m108593f(num3, "y");
        e743.f298180e = num3.intValue();
        e74 e744 = fVar.f293867a;
        C87412m.m108593f(num, "height");
        e744.f298181f = num.intValue();
        e74 e745 = fVar.f293867a;
        int i6 = mScreenRealHeight;
        e745.f298182g = i6;
        int i7 = i6 - mScreenHeight;
        e745.f298183h = i7;
        int i8 = mStatusBarHeight;
        e745.f298184i = i8;
        int i9 = mActionBarHeight;
        if (i9 <= 0) {
            i9 = 144;
        }
        e745.f298185j = i9;
        fVar.f293868b = i3;
        int i15 = i8 + i9;
        int i16 = (i6 - i7) - chatFooterHeight;
        int i17 = e745.f298180e;
        int i18 = e745.f298181f + i17;
        if (i17 >= i16 || i18 <= i15) {
            z = false;
        }
        return C117882j.m166284c(fVar, Boolean.valueOf(z));
    }

    private final C117877b<Integer, Integer> _getLiveFeedUIParams(View view) {
        int y = getY(view);
        float y2 = view.getY();
        int a = C79406f.m96347a(view.getContext(), 6.0f);
        int max = Math.max(y, (int) y2) + a;
        int i = 721 - (a * 2);
        if (view.getHeight() > 721) {
            max += 107;
        }
        return C117882j.m166284c(Integer.valueOf(max), Integer.valueOf(i));
    }

    private final int getY(View view) {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = -1;
        }
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    private final void init(AppCompatActivity appCompatActivity) {
        initStatusBarHeight(appCompatActivity);
        initActionBarHeight(appCompatActivity);
        initScreenHeight(appCompatActivity);
        Log.m105924i(TAG, "init: mScreenRealHeight=" + mScreenRealHeight + ", mScreenHeight=" + mScreenHeight + ", mStatusBarHeight=" + mStatusBarHeight + ", mActionBarHeight=" + mActionBarHeight + ", chatFooterHeight=" + chatFooterHeight + ", virtualKeyHeight=" + virtualKeyHeight);
    }

    private final void initActionBarHeight(Activity activity) {
        if (activity != null) {
            try {
                if (activity instanceof AppCompatActivity) {
                    ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
                    View j = supportActionBar != null ? supportActionBar.mo91099j() : null;
                    mActionBarHeight = j != null ? j.getHeight() : -1;
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "initBarHeight", new Object[0]);
            }
        }
    }

    private final void initScreenHeight(Activity activity) {
        if (activity != null) {
            Display display = null;
            try {
                Object systemService = MMApplicationContext.getContext().getSystemService("window");
                WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                if (windowManager != null) {
                    display = windowManager.getDefaultDisplay();
                }
            } catch (Exception unused) {
                WindowManager windowManager2 = activity.getWindowManager();
                if (windowManager2 != null) {
                    display = windowManager2.getDefaultDisplay();
                }
            }
            if (display != null) {
                Point point = new Point();
                display.getSize(point);
                Point point2 = new Point();
                display.getRealSize(point2);
                int i = point.y;
                mScreenHeight = i;
                int i2 = point2.y;
                mScreenRealHeight = i2;
                int i3 = i2 - i;
                if (i3 <= 0) {
                    i3 = 0;
                }
                virtualKeyHeight = i3;
                Resources resources = activity.getResources();
                chatFooterHeight = resources != null ? resources.getDimensionPixelSize(C0966R.dimen.f3758d_) : C79406f.m96347a(MMApplicationContext.getContext(), 56.0f);
            }
        }
    }

    private final void initStatusBarHeight(Activity activity) {
        if (activity != null) {
            Resources resources = activity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID));
            mStatusBarHeight = dimensionPixelSize;
            if (dimensionPixelSize <= 0) {
                mStatusBarHeight = resources.getDimensionPixelSize(C0966R.dimen.a54);
            }
        }
    }

    public static final void monitor(View view, Object obj, int i, int i2) {
        ChatFeedMonitor chatFeedMonitor;
        C117877b<C100313f, Boolean> _getHellFeed;
        if (view != null && obj != null) {
            if (mScreenHeight <= 0) {
                ChatFeedMonitor chatFeedMonitor2 = INSTANCE;
                Context context = view.getContext();
                chatFeedMonitor2.init(context instanceof AppCompatActivity ? (AppCompatActivity) context : null);
            }
            if (i >= 0 && i2 > 0) {
                mFirstPostion = i;
                mVisibleItemCount = i2;
            }
            int i3 = mVisibleItemCount;
            for (int i4 = 0; i4 < i3; i4++) {
                View a = C100317j.m131143a(view, i4);
                if (!(a == null || (_getHellFeed = chatFeedMonitor._getHellFeed(a, i4, view, mFirstPostion)) == null)) {
                    C100313f fVar = (C100313f) _getHellFeed.mo182596a(0);
                    Boolean bool = (Boolean) _getHellFeed.mo182596a(1);
                    C87412m.m108593f(bool, "isShow");
                    if (bool.booleanValue()) {
                        HashMap<String, C100313f> hashMap = mChatFeedCache;
                        if (!hashMap.containsKey(fVar.f293871e)) {
                            String str = fVar.f293871e;
                            C87412m.m108593f(str, "chatFeed.msgId");
                            hashMap.put(str, fVar);
                            chatFeedMonitor.onFeedAppear(obj, fVar, a);
                        }
                    } else {
                        HashMap<String, C100313f> hashMap2 = mChatFeedCache;
                        if (hashMap2.containsKey(fVar.f293871e)) {
                            hashMap2.remove(fVar.f293871e);
                            (chatFeedMonitor = INSTANCE).onFeedDisappear(obj, fVar, a);
                        }
                    }
                }
            }
        }
    }

    private final void onFeedAppear(Object obj, C100313f fVar, View view) {
        Iterator<C98619b> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().mo74775b(obj, fVar, view);
        }
    }

    private final void onFeedDisappear(Object obj, C100313f fVar, View view) {
        Iterator<C98619b> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().mo74774a(obj, fVar, view);
        }
    }

    public static final void registerListener(C98619b bVar) {
        if (bVar != null) {
            ArrayList<C98619b> arrayList = listeners;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
    }

    private final void resetCache() {
        mFirstPostion = -1;
        mVisibleItemCount = -1;
        mChatFeedCache.clear();
    }

    public static final void unregisterListener(C98619b bVar) {
        INSTANCE.resetCache();
        if (bVar != null) {
            listeners.remove(bVar);
        }
    }
}
