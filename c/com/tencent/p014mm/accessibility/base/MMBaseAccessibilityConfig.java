package com.tencent.p014mm.accessibility.base;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.core.AccConstants;
import com.tencent.p014mm.accessibility.core.AccOnHierarchyChangeListenerMerger;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.core.provider.AccProviderFactory;
import com.tencent.p014mm.accessibility.type.IdType;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.accessibility.uitl.TimeBlocker;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64186f0;
import sx3.C64197v;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 µ\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\nµ\u0001¶\u0001·\u0001¸\u0001¹\u0001B\u0013\u0012\b\u0010²\u0001\u001a\u00030±\u0001¢\u0006\u0006\b³\u0001\u0010´\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J6\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u00160\u0016H\u0002J*\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001dH\u0002J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001a\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001b\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020\u0004H&J\u0012\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010.\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010/\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\u001c\u00104\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010\u001d2\b\u00103\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u00105\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010\u001d2\b\u00103\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\u001a\u0010#\u001a\u0002092\b\b\u0001\u00107\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u00020\u0017J\u001a\u0010:\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u00020\u0017J\u0010\u0010!\u001a\u00020;2\b\b\u0001\u0010!\u001a\u00020\u0017J\u0006\u0010=\u001a\u00020<J\u0010\u0010>\u001a\u00020\u00042\b\b\u0001\u00108\u001a\u00020\u0017J\u001a\u0010>\u001a\u00020\u00042\b\b\u0001\u00108\u001a\u00020\u00172\b\b\u0001\u0010?\u001a\u00020\u0017J\u0016\u0010B\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u0014J\u0016\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u0014J#\u0010H\u001a\u0002092\b\b\u0001\u00107\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u00020\u0017H\u0000¢\u0006\u0004\bF\u0010GJ#\u0010J\u001a\u0002092\b\b\u0001\u00107\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u00020\u0017H\u0000¢\u0006\u0004\bI\u0010GJ5\u0010O\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140KH\u0000¢\u0006\u0004\bM\u0010NJ'\u0010T\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\u001d2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00170PH\u0000¢\u0006\u0004\bR\u0010SJ\u0006\u0010U\u001a\u00020\u0004R\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u001a8\u0000X\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R2\u0010_\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020^0\u00160\u00168\u0000X\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00168\u0000X\u0004¢\u0006\f\n\u0004\bc\u0010`\u001a\u0004\bd\u0010bR>\u0010e\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140K0\u00160\u00168\u0000X\u0004¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010bR,\u0010g\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00168\u0000X\u0004¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bh\u0010bR>\u0010i\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0K0\u00160\u00168\u0000X\u0004¢\u0006\f\n\u0004\bi\u0010`\u001a\u0004\bj\u0010bR,\u0010k\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00168\u0000X\u0004¢\u0006\f\n\u0004\bk\u0010`\u001a\u0004\bl\u0010bR$\u0010m\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010s\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bs\u0010n\u001a\u0004\bt\u0010p\"\u0004\bu\u0010rR4\u0010v\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bv\u0010`\u001a\u0004\bw\u0010b\"\u0004\bx\u0010yR$\u0010z\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010R(\u0010\u0001\u001a\u00020V8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b\u0001\u0010X\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u00010\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR#\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010[\u001a\u0005\b\u0001\u0010]R/\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR6\u0010\u0001\u001a\u001b\u0012\u0004\u0012\u00020\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u00010\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR6\u0010\u0001\u001a\u001b\u0012\u0004\u0012\u00020\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u00010\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bRA\u0010\u0001\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0K0\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR5\u0010\u0001\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bRN\u0010\u0001\u001a3\u0012\u0004\u0012\u00020\u0017\u0012)\u0012'\u0012\u0004\u0012\u00020\u0017\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0K0\u00010\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR6\u0010\u0001\u001a\u001b\u0012\u0004\u0012\u00020\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u00010\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR/\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bRZ\u0010\u0001\u001a?\u0012\u0004\u0012\u00020\u0017\u00125\u00123\u0012\u0004\u0012\u00020\u0017\u0012)\u0012'\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0K\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0K0\u00010\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR^\u0010\u0001\u001aC\u0012\u0004\u0012\u00020\u0017\u00129\u00127\u0012\u0004\u0012\u00020\u0017\u0012-\u0012+\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010K\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010K0\u00010\u00160\u00168\u0000X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010£\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010nR\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010§\u0001\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010XR\u001a\u0010©\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010«\u0001\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010XR\u0018\u0010¬\u0001\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010XR5\u0010®\u0001\u001a!\u0012\u0004\u0012\u00020\u0017\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u001d0­\u00010\u00160\u00168\u0002X\u0004¢\u0006\u0007\n\u0005\b®\u0001\u0010`R(\u0010¯\u0001\u001a\u00020V8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b¯\u0001\u0010X\u001a\u0006\b¯\u0001\u0010\u0001\"\u0006\b°\u0001\u0010\u0001¨\u0006º\u0001"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "Lcom/tencent/mm/ui/component/UIComponent;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Lrx3/b0;", "tryInitLayoutMethod", "initCore", "checkInit", "checkNeedPreDeal", "checkNeedPreDealOnResume", "preDealAccessibility", "dealChildAdded", "Landroid/view/ViewGroup;", "viewGroup", "listener", "setOnHierarchyChangeListener", "tryInitHierarchyListener", "dealFirstFocus", "logConfig", "T", "", "mapName", "", "", "map", "logViewRootMap", "", "logViewRootList", "confirmConfig", "Landroid/view/View;", "getStartView", "bindConfigAsync", "unbindConfigAsync", "root", "mockInflateAsync", "view", "mockInflateCore", "targetParent", "getRootViewWithLayoutId", "getRootViewWithViewId", "getLayoutId", "(Landroid/view/View;)Ljava/lang/Integer;", "initConfig", "Landroid/os/Bundle;", "savedInstanceState", "onCreateBefore", "onCreate", "onCreateAfter", "onResume", "onGlobalLayout", "parent", "child", "onChildViewAdded", "onChildViewRemoved", "onDestroy", "rootId", "id", "Lcom/tencent/mm/accessibility/base/ViewSetter;", "disable", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$ConfigHelper;", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$GlobalFocusOrderHelper;", "focusOrder", "focusFirst", "layoutId", "key", "value", "setValue", "v", "s", "talk", "addComplexContentDesc$plugin_autoaccessibility_release", "(II)Lcom/tencent/mm/accessibility/base/ViewSetter;", "addComplexContentDesc", "addSimpleContentDesc$plugin_autoaccessibility_release", "addSimpleContentDesc", "Lkotlin/Function1;", "callback", "addCallback$plugin_autoaccessibility_release", "(IILfy3/l;)V", "addCallback", "", "rootIds", "findRoot$plugin_autoaccessibility_release", "(Landroid/view/View;Ljava/util/List;)Landroid/view/View;", "findRoot", "disableWholeExpand", "", "firstResume", "Z", "Lcom/tencent/mm/accessibility/base/Confirmable;", "confirmableList", "Ljava/util/List;", "getConfirmableList$plugin_autoaccessibility_release", "()Ljava/util/List;", "", "viewRootDescMap", "Ljava/util/Map;", "getViewRootDescMap$plugin_autoaccessibility_release", "()Ljava/util/Map;", "paramMap", "getParamMap$plugin_autoaccessibility_release", "viewRootCallbackMap", "getViewRootCallbackMap$plugin_autoaccessibility_release", "disFocusViewRootMap", "getDisFocusViewRootMap$plugin_autoaccessibility_release", "disFocusConditionViewRootMap", "getDisFocusConditionViewRootMap$plugin_autoaccessibility_release", "disableChildViewRootMap", "getDisableChildViewRootMap$plugin_autoaccessibility_release", "startViewId", "Ljava/lang/Integer;", "getStartViewId$plugin_autoaccessibility_release", "()Ljava/lang/Integer;", "setStartViewId$plugin_autoaccessibility_release", "(Ljava/lang/Integer;)V", "startViewLayoutId", "getStartViewLayoutId$plugin_autoaccessibility_release", "setStartViewLayoutId$plugin_autoaccessibility_release", "startViewRootMap", "getStartViewRootMap$plugin_autoaccessibility_release", "setStartViewRootMap$plugin_autoaccessibility_release", "(Ljava/util/Map;)V", "startView", "Landroid/view/View;", "getStartView$plugin_autoaccessibility_release", "()Landroid/view/View;", "setStartView$plugin_autoaccessibility_release", "(Landroid/view/View;)V", "hasFocusStartView", "getHasFocusStartView$plugin_autoaccessibility_release", "()Z", "setHasFocusStartView$plugin_autoaccessibility_release", "(Z)V", "", "globalTraversalMap", "getGlobalTraversalMap$plugin_autoaccessibility_release", "globalOrderList", "getGlobalOrderList$plugin_autoaccessibility_release", "localOrderList", "getLocalOrderList$plugin_autoaccessibility_release", "localTraversalMap", "getLocalTraversalMap$plugin_autoaccessibility_release", "Lcom/tencent/mm/accessibility/type/ViewType;", "typeMap", "getTypeMap$plugin_autoaccessibility_release", "talkMap", "getTalkMap$plugin_autoaccessibility_release", "talkStringMap", "getTalkStringMap$plugin_autoaccessibility_release", "Lrx3/l;", "clickViewRootTargetMap", "getClickViewRootTargetMap$plugin_autoaccessibility_release", "viewRootAreaMap", "getViewRootAreaMap$plugin_autoaccessibility_release", "viewRootDisableExpandList", "getViewRootDisableExpandList$plugin_autoaccessibility_release", "viewRootCheckedMap", "getViewRootCheckedMap$plugin_autoaccessibility_release", "viewRootSeekCallback", "getViewRootSeekCallback$plugin_autoaccessibility_release", "Ljava/lang/reflect/Method;", "getLayoutMethod", "Ljava/lang/reflect/Method;", "contentLayoutId", "Ljava/lang/reflect/Field;", "mOnHierarchyListenerFiled", "Ljava/lang/reflect/Field;", "hasTryReflectHierarchy", "", "beforeCreateTime", "J", "hasPreDeal", "hasInitAccConfig", "Ljava/lang/ref/WeakReference;", "viewRootCache", "isDisableExpandWhole", "setDisableExpandWhole", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "ConfigHelper", "FocusOrderHelper", "GlobalFocusOrderHelper", "LocalFocusOrderHelper", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig */
public abstract class MMBaseAccessibilityConfig extends UIComponent implements ViewTreeObserver.OnGlobalLayoutListener, ViewGroup.OnHierarchyChangeListener {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String ID_RESOURCE_TYPE = "id_resource_type";
    public static final long MOCK_INFLATE_DELAY = 200;
    public static final String PARAM_METHOD_TYPE = "param_method_type";
    public static final String STRING_RESOURCE_TYPE = "string_resource_type";
    public static final String TAG = "MicroMsg.Acc.MMBaseAccessibilityConfig";
    private byte _hellAccFlag_;
    private long beforeCreateTime;
    private final Map<Integer, Map<Integer, C13604l<Integer, C32226l<View, Boolean>>>> clickViewRootTargetMap = new LinkedHashMap();
    private final List<Confirmable> confirmableList = new ArrayList();
    /* access modifiers changed from: private */
    public Integer contentLayoutId;
    private final Map<Integer, Map<Integer, C32226l<View, Boolean>>> disFocusConditionViewRootMap = new LinkedHashMap();
    private final Map<Integer, List<Integer>> disFocusViewRootMap = new LinkedHashMap();
    private final Map<Integer, List<Integer>> disableChildViewRootMap = new LinkedHashMap();
    private boolean firstResume = true;
    private Method getLayoutMethod;
    private final List<Integer> globalOrderList = new ArrayList();
    private final Map<Integer, int[]> globalTraversalMap = new LinkedHashMap();
    private boolean hasFocusStartView;
    private boolean hasInitAccConfig;
    /* access modifiers changed from: private */
    public boolean hasPreDeal;
    private boolean hasTryReflectHierarchy;
    private boolean isDisableExpandWhole;
    private final Map<Integer, List<Integer>> localOrderList = new LinkedHashMap();
    private final Map<Integer, Map<Integer, int[]>> localTraversalMap = new LinkedHashMap();
    private Field mOnHierarchyListenerFiled;
    private final Map<String, String> paramMap = new LinkedHashMap();
    private View startView;
    private Integer startViewId;
    private Integer startViewLayoutId;
    private Map<Integer, List<Integer>> startViewRootMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, C32226l<View, Boolean>>> talkMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, Integer>> talkStringMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, ViewType>> typeMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, int[]>> viewRootAreaMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, WeakReference<View>>> viewRootCache = new LinkedHashMap();
    private final Map<Integer, Map<Integer, C32226l<View, String>>> viewRootCallbackMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, C13604l<C32226l<View, Boolean>, C32226l<View, Boolean>>>> viewRootCheckedMap = new LinkedHashMap();
    private final Map<Integer, Map<Integer, Object>> viewRootDescMap = new LinkedHashMap();
    private final Map<Integer, List<Integer>> viewRootDisableExpandList = new LinkedHashMap();
    private final Map<Integer, Map<Integer, C13604l<C32226l<View, C13598b0>, C32226l<View, C13598b0>>>> viewRootSeekCallback = new LinkedHashMap();

    @Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$Companion;", "", "()V", "ID_RESOURCE_TYPE", "", "MOCK_INFLATE_DELAY", "", "PARAM_METHOD_TYPE", "STRING_RESOURCE_TYPE", "TAG", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$FocusOrderHelper;", "", "next", "id", "", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$FocusOrderHelper */
    public interface FocusOrderHelper {
        FocusOrderHelper next(int i);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$ConfigHelper;", "", "", "id", "Lcom/tencent/mm/accessibility/base/ViewSetter;", "addComplexContentDesc$plugin_autoaccessibility_release", "(I)Lcom/tencent/mm/accessibility/base/ViewSetter;", "addComplexContentDesc", "view", "Lrx3/b0;", "disable", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$FocusOrderHelper;", "focusOrder", "focusFirst", "rootId", "I", "getRootId", "()I", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "ownerConfig", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "<init>", "(ILcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$ConfigHelper */
    public static final class ConfigHelper {
        public static final int $stable = 8;
        private final MMBaseAccessibilityConfig ownerConfig;
        private final int rootId;

        public ConfigHelper(int i, MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
            C87412m.m108594g(mMBaseAccessibilityConfig, "ownerConfig");
            this.rootId = i;
            this.ownerConfig = mMBaseAccessibilityConfig;
        }

        public final ViewSetter addComplexContentDesc$plugin_autoaccessibility_release(int i) {
            return new ViewSetter(this.ownerConfig, this.rootId, i);
        }

        public final void disable(int i) {
            this.ownerConfig.disable(this.rootId, i);
        }

        public final void focusFirst(int i) {
            Integer access$getContentLayoutId$p = this.ownerConfig.contentLayoutId;
            int i2 = this.rootId;
            if (access$getContentLayoutId$p != null && access$getContentLayoutId$p.intValue() == i2) {
                this.ownerConfig.setStartViewId$plugin_autoaccessibility_release(Integer.valueOf(i));
            }
            Map<Integer, List<Integer>> startViewRootMap$plugin_autoaccessibility_release = this.ownerConfig.getStartViewRootMap$plugin_autoaccessibility_release();
            Integer valueOf = Integer.valueOf(i);
            List<Integer> list = startViewRootMap$plugin_autoaccessibility_release.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                startViewRootMap$plugin_autoaccessibility_release.put(valueOf, list);
            }
            list.add(Integer.valueOf(this.rootId));
        }

        public final FocusOrderHelper focusOrder() {
            if (this.ownerConfig.contentLayoutId == null) {
                Log.m105920e(MMBaseAccessibilityConfig.TAG, "damn it! contentLayoutId is null");
                return new GlobalFocusOrderHelper(this.ownerConfig, C64186f0.f181907d);
            }
            IdUtil idUtil = IdUtil.INSTANCE;
            if (idUtil.getType(this.rootId) == IdType.Layout) {
                int i = this.rootId;
                Integer access$getContentLayoutId$p = this.ownerConfig.contentLayoutId;
                if (access$getContentLayoutId$p == null || i != access$getContentLayoutId$p.intValue()) {
                    Log.m105924i(MMBaseAccessibilityConfig.TAG, "start LocalFocusOrderHelper type:" + idUtil.getType(this.rootId) + " rootId: " + idUtil.getName(this.rootId) + " activity:" + this.ownerConfig.contentLayoutId);
                    return new LocalFocusOrderHelper(this.ownerConfig, this.rootId, C64186f0.f181907d);
                }
            }
            Log.m105924i(MMBaseAccessibilityConfig.TAG, "start GlobalFocusOrderHelper type:" + idUtil.getType(this.rootId) + " rootId: " + idUtil.getName(this.rootId) + " activity:" + this.ownerConfig.contentLayoutId);
            return new GlobalFocusOrderHelper(this.ownerConfig, C64186f0.f181907d);
        }

        public final int getRootId() {
            return this.rootId;
        }

        public final ViewSetter view(int i) {
            return new ViewSetter(this.ownerConfig, this.rootId, i);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$GlobalFocusOrderHelper;", "Lcom/tencent/mm/accessibility/base/Confirmable;", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$FocusOrderHelper;", "", "id", "next", "Lrx3/b0;", "confirm$plugin_autoaccessibility_release", "()V", "confirm", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "ownerConfig", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "", "orderList", "Ljava/util/List;", "", "internalList", "<init>", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;Ljava/util/List;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$GlobalFocusOrderHelper */
    public static final class GlobalFocusOrderHelper extends Confirmable implements FocusOrderHelper {
        public static final int $stable = 8;
        private final List<Integer> internalList;
        private final List<Integer> orderList;
        private final MMBaseAccessibilityConfig ownerConfig;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GlobalFocusOrderHelper(MMBaseAccessibilityConfig mMBaseAccessibilityConfig, List<Integer> list) {
            super(mMBaseAccessibilityConfig);
            C87412m.m108594g(mMBaseAccessibilityConfig, "ownerConfig");
            C87412m.m108594g(list, "orderList");
            this.ownerConfig = mMBaseAccessibilityConfig;
            this.orderList = list;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.internalList = arrayList;
        }

        public void confirm$plugin_autoaccessibility_release() {
            List<Integer> list = this.internalList;
            this.ownerConfig.getGlobalOrderList$plugin_autoaccessibility_release().addAll(this.internalList);
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = -1;
                int intValue = i > 0 ? list.get(i - 1).intValue() : -1;
                if (i < list.size() - 1) {
                    i2 = list.get(i + 1).intValue();
                }
                if (this.ownerConfig.getGlobalTraversalMap$plugin_autoaccessibility_release().get(list.get(i)) != null) {
                    Log.m105920e("", "there is repeat id:" + IdUtil.INSTANCE.getName(list.get(i).intValue()) + '@' + list.get(i).intValue() + " from " + list.getClass().getClass().getSimpleName());
                }
                this.ownerConfig.getGlobalTraversalMap$plugin_autoaccessibility_release().put(list.get(i), new int[2]);
                int[] iArr = this.ownerConfig.getGlobalTraversalMap$plugin_autoaccessibility_release().get(list.get(i));
                if (iArr != null) {
                    iArr[0] = i2;
                }
                int[] iArr2 = this.ownerConfig.getGlobalTraversalMap$plugin_autoaccessibility_release().get(list.get(i));
                if (iArr2 != null) {
                    iArr2[1] = intValue;
                }
                i++;
            }
        }

        public GlobalFocusOrderHelper next(int i) {
            this.internalList.add(Integer.valueOf(i));
            return this;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$LocalFocusOrderHelper;", "Lcom/tencent/mm/accessibility/base/Confirmable;", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig$FocusOrderHelper;", "", "id", "next", "Lrx3/b0;", "confirm$plugin_autoaccessibility_release", "()V", "confirm", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "ownerConfig", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "localLayoutId", "I", "", "orderList", "Ljava/util/List;", "", "internalList", "<init>", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;ILjava/util/List;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$LocalFocusOrderHelper */
    public static final class LocalFocusOrderHelper extends Confirmable implements FocusOrderHelper {
        public static final int $stable = 8;
        private final List<Integer> internalList;
        private final int localLayoutId;
        private final List<Integer> orderList;
        private final MMBaseAccessibilityConfig ownerConfig;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LocalFocusOrderHelper(MMBaseAccessibilityConfig mMBaseAccessibilityConfig, int i, List<Integer> list) {
            super(mMBaseAccessibilityConfig);
            C87412m.m108594g(mMBaseAccessibilityConfig, "ownerConfig");
            C87412m.m108594g(list, "orderList");
            this.ownerConfig = mMBaseAccessibilityConfig;
            this.localLayoutId = i;
            this.orderList = list;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.internalList = arrayList;
        }

        public void confirm$plugin_autoaccessibility_release() {
            List<Integer> list = this.internalList;
            Map<Integer, List<Integer>> localOrderList$plugin_autoaccessibility_release = this.ownerConfig.getLocalOrderList$plugin_autoaccessibility_release();
            Integer valueOf = Integer.valueOf(this.localLayoutId);
            List<Integer> list2 = localOrderList$plugin_autoaccessibility_release.get(valueOf);
            if (list2 == null) {
                list2 = new ArrayList<>();
                localOrderList$plugin_autoaccessibility_release.put(valueOf, list2);
            }
            List list3 = list2;
            list3.clear();
            list3.addAll(this.orderList);
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = -1;
                int intValue = i > 0 ? list.get(i - 1).intValue() : -1;
                if (i < list.size() - 1) {
                    i2 = list.get(i + 1).intValue();
                }
                if (this.ownerConfig.getLocalTraversalMap$plugin_autoaccessibility_release().get(list.get(i)) != null) {
                    Log.m105920e(MMBaseAccessibilityConfig.TAG, "there is repeat id:" + IdUtil.INSTANCE.getName(list.get(i).intValue()) + '@' + list.get(i).intValue() + " from " + list.getClass().getClass().getSimpleName());
                }
                MapExpandKt.putData(this.ownerConfig.getLocalTraversalMap$plugin_autoaccessibility_release(), this.localLayoutId, list.get(i).intValue(), new int[2]);
                Map<Integer, int[]> map = this.ownerConfig.getLocalTraversalMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.localLayoutId));
                C87412m.m108591d(map);
                Object obj = map.get(list.get(i));
                C87412m.m108591d(obj);
                ((int[]) obj)[0] = i2;
                Map<Integer, int[]> map2 = this.ownerConfig.getLocalTraversalMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.localLayoutId));
                C87412m.m108591d(map2);
                Object obj2 = map2.get(list.get(i));
                C87412m.m108591d(obj2);
                ((int[]) obj2)[1] = intValue;
                i++;
            }
        }

        public LocalFocusOrderHelper next(int i) {
            this.internalList.add(Integer.valueOf(i));
            return this;
        }
    }

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdType.values().length];
            iArr[IdType.Layout.ordinal()] = 1;
            iArr[IdType.Id.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    private final void bindConfigAsync() {
        C61926c.m72663H(ConstantsAccessibility.THREAD_TAG, false, new MMBaseAccessibilityConfig$bindConfigAsync$1(this), 0, 8, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void checkInit() {
        if (!this.hasInitAccConfig && AccUtil.INSTANCE.canPreDeal()) {
            long currentTimeMillis = System.currentTimeMillis();
            tryInitLayoutMethod();
            initConfig();
            confirmConfig();
            logConfig();
            checkNeedPreDeal();
            Log.m105924i(TAG, "class:" + getClass().getSimpleName() + " initConfig cost: " + (System.currentTimeMillis() - currentTimeMillis));
            this.hasInitAccConfig = true;
        }
    }

    private final void checkNeedPreDeal() {
        preDealAccessibility();
        AccUtil.INSTANCE.getListenersOwner().observe(getActivity(), new MMBaseAccessibilityConfig$checkNeedPreDeal$1(this));
    }

    private final void checkNeedPreDealOnResume() {
        if (AccUtil.INSTANCE.canPreDeal()) {
            preDealAccessibility();
        }
    }

    private final void confirmConfig() {
        for (Confirmable confirm$plugin_autoaccessibility_release : this.confirmableList) {
            confirm$plugin_autoaccessibility_release.confirm$plugin_autoaccessibility_release();
        }
    }

    private final void dealChildAdded() {
        ((C119157j) C119157j.f356862d).mo183875f(new MMBaseAccessibilityConfig$dealChildAdded$1(this));
    }

    private final void dealFirstFocus() {
        C13598b0 b0Var;
        int i;
        int i2;
        int i3;
        int i4;
        if (AccUtil.INSTANCE.isAccessibilityEnabled()) {
            View startView2 = getStartView();
            if (startView2 != null) {
                this.startView = startView2;
                StringBuilder sb = new StringBuilder();
                sb.append("onResume sendAccessibilityEvent,startViewId:");
                IdUtil idUtil = IdUtil.INSTANCE;
                Integer num = this.startViewId;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    List<Integer> list = this.globalOrderList;
                    i3 = (C64197v.m75536e(list) >= 0 ? list.get(0) : 0).intValue();
                }
                sb.append(idUtil.getName(i3));
                sb.append('@');
                Integer num2 = this.startViewId;
                if (num2 != null) {
                    i4 = num2.intValue();
                } else {
                    List<Integer> list2 = this.globalOrderList;
                    i4 = (C64197v.m75536e(list2) >= 0 ? list2.get(0) : 0).intValue();
                }
                sb.append(i4);
                Log.m105924i(TAG, sb.toString());
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onResume start error,view is null,startViewId:");
                IdUtil idUtil2 = IdUtil.INSTANCE;
                Integer num3 = this.startViewId;
                if (num3 != null) {
                    i = num3.intValue();
                } else {
                    List<Integer> list3 = this.globalOrderList;
                    i = (C64197v.m75536e(list3) >= 0 ? list3.get(0) : 0).intValue();
                }
                sb4.append(idUtil2.getName(i));
                sb4.append('@');
                Integer num4 = this.startViewId;
                if (num4 != null) {
                    i2 = num4.intValue();
                } else {
                    List<Integer> list4 = this.globalOrderList;
                    i2 = (C64197v.m75536e(list4) >= 0 ? list4.get(0) : 0).intValue();
                }
                sb4.append(i2);
                Log.m105920e(TAG, sb4.toString());
            }
            getRootView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* access modifiers changed from: private */
    public final Integer getLayoutId(View view) {
        Object tag = view != null ? view.getTag(C0966R.C0970id.kdq) : null;
        if (tag instanceof Integer) {
            return (Integer) tag;
        }
        return null;
    }

    private final View getRootViewWithLayoutId(View view, int i) {
        Integer layoutId = getLayoutId(view);
        if (layoutId == null || layoutId.intValue() != i) {
            return null;
        }
        if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return view;
        }
        ViewParent parent = view.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        Integer layoutId2 = getLayoutId((View) parent);
        if (layoutId2 == null || layoutId2.intValue() != i) {
            return view;
        }
        ViewParent parent2 = view.getParent();
        C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
        return getRootViewWithLayoutId((View) parent2, i);
    }

    private final View getRootViewWithViewId(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getId() == i) {
                return (View) parent;
            }
            parent = viewGroup.getParent();
        }
        return null;
    }

    private final View getStartView() {
        C8477a0 a0Var = new C8477a0();
        C8479f0 f0Var = new C8479f0();
        Integer num = this.startViewLayoutId;
        if (num == null || C87412m.m108589b(num, this.contentLayoutId)) {
            AppCompatActivity activity = getActivity();
            Integer num2 = this.startViewId;
            T findViewById = activity.findViewById(num2 != null ? num2.intValue() : 0);
            f0Var.f27484d = findViewById;
            if (findViewById != null) {
                View view = (View) findViewById;
                return findViewById;
            }
        }
        MapExpandKt.visitChild(getRootView(), new MMBaseAccessibilityConfig$getStartView$1(a0Var, this, f0Var));
        return (View) f0Var.f27484d;
    }

    private final void initCore() {
        checkInit();
        AccUtil.INSTANCE.getListenersOwner().observe(getActivity(), new MMBaseAccessibilityConfig$initCore$1(this));
    }

    private final void logConfig() {
        Log.m105924i(TAG, getClass().getName() + " confirm config:");
        logViewRootMap("ContentDescMap", this.viewRootDescMap);
        logViewRootMap("ClickAsMap", this.clickViewRootTargetMap);
        logViewRootList("disFocusViewList", this.disFocusViewRootMap);
        logViewRootList("disFocusChildrenList", this.disableChildViewRootMap);
        logViewRootMap("typeMap", this.typeMap);
        logViewRootMap("talkMap", this.talkMap);
        logViewRootMap("talkStringMap", this.talkStringMap);
    }

    private final void logViewRootList(String str, Map<Integer, List<Integer>> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append(str);
            sb.append("=view:");
            sb.append(IdUtil.INSTANCE.getName(((Number) entry.getKey()).intValue()));
            sb.append("in root{");
            for (Number intValue : (Iterable) entry.getValue()) {
                sb.append(IdUtil.INSTANCE.getName(intValue.intValue()));
                sb.append(",");
            }
            sb.append("}");
        }
        Log.m105924i(TAG, sb.toString());
    }

    private final <T> void logViewRootMap(String str, Map<Integer, Map<Integer, T>> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append(str);
            sb.append("=view:");
            sb.append(IdUtil.INSTANCE.getName(((Number) entry.getKey()).intValue()));
            sb.append("in root{");
            for (Number intValue : ((Map) entry.getValue()).keySet()) {
                sb.append(IdUtil.INSTANCE.getName(intValue.intValue()));
                sb.append(",");
            }
            sb.append("}");
        }
        Log.m105924i(TAG, sb.toString());
    }

    private final void mockInflateAsync(View view) {
        ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
        if (!(tagData != null ? C87412m.m108589b(tagData.getHavenInflate(), Boolean.TRUE) : false)) {
            MapExpandKt.postIfNeed(view, new MMBaseAccessibilityConfig$mockInflateAsync$1(this, view));
        }
    }

    /* access modifiers changed from: private */
    public final void mockInflateCore(View view) {
        if (view != null) {
            AccProviderFactory.INSTANCE.onMockInflate(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mockInflateCore(viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void preDealAccessibility() {
        bindConfigAsync();
        mockInflateAsync(getRootView());
        dealChildAdded();
    }

    /* access modifiers changed from: private */
    public final void setOnHierarchyChangeListener(ViewGroup viewGroup, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        C13598b0 b0Var;
        String str = null;
        try {
            tryInitHierarchyListener();
            Field field = this.mOnHierarchyListenerFiled;
            if (field == null || viewGroup == null) {
                b0Var = null;
            } else {
                Object obj = field.get(viewGroup);
                if (!(obj instanceof AccOnHierarchyChangeListenerMerger)) {
                    field.set(viewGroup, new AccOnHierarchyChangeListenerMerger(obj instanceof ViewGroup.OnHierarchyChangeListener ? (ViewGroup.OnHierarchyChangeListener) obj : null, onHierarchyChangeListener));
                } else {
                    ViewGroup.OnHierarchyChangeListener l1 = ((AccOnHierarchyChangeListenerMerger) obj).getL1();
                    if (!(l1 instanceof ViewGroup.OnHierarchyChangeListener)) {
                        l1 = null;
                    }
                    field.set(viewGroup, new AccOnHierarchyChangeListenerMerger(l1, onHierarchyChangeListener));
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null && viewGroup != null) {
                viewGroup.setOnHierarchyChangeListener(onHierarchyChangeListener);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            if (viewGroup != null) {
                str = viewGroup.getClass().getSimpleName();
            }
            sb.append(str);
            sb.append(" setOnHierarchyChangeListener Crash");
            Log.m105920e(TAG, sb.toString());
            C117407d.INSTANCE.idkeyStat(AccConstants.ReportKey.f8994ID, 2, 1, false);
        }
    }

    private final void tryInitHierarchyListener() {
        if (!this.hasTryReflectHierarchy) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mOnHierarchyChangeListener");
                this.mOnHierarchyListenerFiled = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Throwable th) {
                this.hasTryReflectHierarchy = true;
                throw th;
            }
            this.hasTryReflectHierarchy = true;
        }
    }

    private final void tryInitLayoutMethod() {
        Class<MMActivity> cls = MMActivity.class;
        try {
            int i = MMActivity.DEFAULT_TOAST_TIME;
            Method declaredMethod = cls.getDeclaredMethod("getLayoutId", new Class[0]);
            this.getLayoutMethod = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Method method = this.getLayoutMethod;
            Integer num = null;
            Object invoke = method != null ? method.invoke(getActivity(), new Object[0]) : null;
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
            this.contentLayoutId = num;
        } catch (Throwable th) {
            Log.m105920e(TAG, "config onCreate getLayoutId wrong :" + th.getMessage() + " activity: " + getActivity().getClass().getName());
        }
    }

    private final void unbindConfigAsync() {
        C61926c.m72663H(ConstantsAccessibility.THREAD_TAG, false, new MMBaseAccessibilityConfig$unbindConfigAsync$1(this), 0, 8, (Object) null);
    }

    public final void addCallback$plugin_autoaccessibility_release(int i, int i2, C32226l<? super View, String> lVar) {
        C87412m.m108594g(lVar, "callback");
        MapExpandKt.putData(this.viewRootCallbackMap, i2, i, lVar);
    }

    public final ViewSetter addComplexContentDesc$plugin_autoaccessibility_release(int i, int i2) {
        return new ViewSetter(this, i, i2);
    }

    public final ViewSetter addSimpleContentDesc$plugin_autoaccessibility_release(int i, int i2) {
        return new ViewSetter(this, i, i2);
    }

    public final void disable(int i, int i2) {
        List list = this.disFocusViewRootMap.get(Integer.valueOf(i2));
        if (list != null) {
            list.add(Integer.valueOf(i));
            return;
        }
        Map<Integer, List<Integer>> map = this.disFocusViewRootMap;
        Integer valueOf = Integer.valueOf(i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        map.put(valueOf, arrayList);
    }

    public final void disableWholeExpand() {
        this.isDisableExpandWhole = true;
    }

    public final View findRoot$plugin_autoaccessibility_release(View view, List<Integer> list) {
        View view2;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(list, "rootIds");
        Map map = this.viewRootCache.get(Integer.valueOf(view.hashCode()));
        if (map != null) {
            for (Number intValue : list) {
                int intValue2 = intValue.intValue();
                WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(intValue2));
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                    continue;
                } else {
                    view2 = null;
                    continue;
                }
                if (view2 != null) {
                    StringBuilder sb = new StringBuilder();
                    IdUtil idUtil = IdUtil.INSTANCE;
                    sb.append(idUtil.getName(view.getId()));
                    sb.append('@');
                    sb.append(view.hashCode());
                    sb.append(", rootId:");
                    sb.append(idUtil.getName(intValue2));
                    sb.append(" cache hit ");
                    Log.m105918d("findRoot", sb.toString());
                    return view2;
                }
            }
        }
        View view3 = null;
        for (Number intValue3 : list) {
            int intValue4 = intValue3.intValue();
            IdUtil idUtil2 = IdUtil.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$0[idUtil2.getType(intValue4).ordinal()];
            View rootViewWithViewId = i != 1 ? i != 2 ? null : getRootViewWithViewId(view, intValue4) : getRootViewWithLayoutId(view, intValue4);
            if (rootViewWithViewId != null) {
                Map<Integer, Map<Integer, WeakReference<View>>> map2 = this.viewRootCache;
                Integer valueOf = Integer.valueOf(view.hashCode());
                Map<Integer, WeakReference<View>> map3 = map2.get(valueOf);
                if (map3 == null) {
                    map3 = new LinkedHashMap<>();
                    map2.put(valueOf, map3);
                }
                map3.put(Integer.valueOf(intValue4), new WeakReference(rootViewWithViewId));
                Log.m105918d(TAG, "view(" + idUtil2.getName(view.getId()) + ") findRoot(" + idUtil2.getName(rootViewWithViewId.getId()) + ") without Cache, curThread:" + Thread.currentThread().getName());
                return rootViewWithViewId;
            }
            view3 = rootViewWithViewId;
        }
        return view3;
    }

    public final void focusFirst(int i) {
        this.startViewId = Integer.valueOf(i);
        this.startViewLayoutId = null;
        Integer num = this.contentLayoutId;
        if (num != null) {
            int intValue = num.intValue();
            Map<Integer, List<Integer>> map = this.startViewRootMap;
            Integer valueOf = Integer.valueOf(i);
            List<Integer> list = map.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                map.put(valueOf, list);
            }
            list.add(Integer.valueOf(intValue));
        }
    }

    public final GlobalFocusOrderHelper focusOrder() {
        return new GlobalFocusOrderHelper(this, C64186f0.f181907d);
    }

    public final Map<Integer, Map<Integer, C13604l<Integer, C32226l<View, Boolean>>>> getClickViewRootTargetMap$plugin_autoaccessibility_release() {
        return this.clickViewRootTargetMap;
    }

    public final List<Confirmable> getConfirmableList$plugin_autoaccessibility_release() {
        return this.confirmableList;
    }

    public final Map<Integer, Map<Integer, C32226l<View, Boolean>>> getDisFocusConditionViewRootMap$plugin_autoaccessibility_release() {
        return this.disFocusConditionViewRootMap;
    }

    public final Map<Integer, List<Integer>> getDisFocusViewRootMap$plugin_autoaccessibility_release() {
        return this.disFocusViewRootMap;
    }

    public final Map<Integer, List<Integer>> getDisableChildViewRootMap$plugin_autoaccessibility_release() {
        return this.disableChildViewRootMap;
    }

    public final List<Integer> getGlobalOrderList$plugin_autoaccessibility_release() {
        return this.globalOrderList;
    }

    public final Map<Integer, int[]> getGlobalTraversalMap$plugin_autoaccessibility_release() {
        return this.globalTraversalMap;
    }

    public final boolean getHasFocusStartView$plugin_autoaccessibility_release() {
        return this.hasFocusStartView;
    }

    public final Map<Integer, List<Integer>> getLocalOrderList$plugin_autoaccessibility_release() {
        return this.localOrderList;
    }

    public final Map<Integer, Map<Integer, int[]>> getLocalTraversalMap$plugin_autoaccessibility_release() {
        return this.localTraversalMap;
    }

    public final Map<String, String> getParamMap$plugin_autoaccessibility_release() {
        return this.paramMap;
    }

    public final View getStartView$plugin_autoaccessibility_release() {
        return this.startView;
    }

    public final Integer getStartViewId$plugin_autoaccessibility_release() {
        return this.startViewId;
    }

    public final Integer getStartViewLayoutId$plugin_autoaccessibility_release() {
        return this.startViewLayoutId;
    }

    public final Map<Integer, List<Integer>> getStartViewRootMap$plugin_autoaccessibility_release() {
        return this.startViewRootMap;
    }

    public final Map<Integer, Map<Integer, C32226l<View, Boolean>>> getTalkMap$plugin_autoaccessibility_release() {
        return this.talkMap;
    }

    public final Map<Integer, Map<Integer, Integer>> getTalkStringMap$plugin_autoaccessibility_release() {
        return this.talkStringMap;
    }

    public final Map<Integer, Map<Integer, ViewType>> getTypeMap$plugin_autoaccessibility_release() {
        return this.typeMap;
    }

    public final Map<Integer, Map<Integer, int[]>> getViewRootAreaMap$plugin_autoaccessibility_release() {
        return this.viewRootAreaMap;
    }

    public final Map<Integer, Map<Integer, C32226l<View, String>>> getViewRootCallbackMap$plugin_autoaccessibility_release() {
        return this.viewRootCallbackMap;
    }

    public final Map<Integer, Map<Integer, C13604l<C32226l<View, Boolean>, C32226l<View, Boolean>>>> getViewRootCheckedMap$plugin_autoaccessibility_release() {
        return this.viewRootCheckedMap;
    }

    public final Map<Integer, Map<Integer, Object>> getViewRootDescMap$plugin_autoaccessibility_release() {
        return this.viewRootDescMap;
    }

    public final Map<Integer, List<Integer>> getViewRootDisableExpandList$plugin_autoaccessibility_release() {
        return this.viewRootDisableExpandList;
    }

    public final Map<Integer, Map<Integer, C13604l<C32226l<View, C13598b0>, C32226l<View, C13598b0>>>> getViewRootSeekCallback$plugin_autoaccessibility_release() {
        return this.viewRootSeekCallback;
    }

    public abstract void initConfig();

    public final boolean isDisableExpandWhole() {
        return this.isDisableExpandWhole;
    }

    public void onChildViewAdded(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/accessibility/base/MMBaseAccessibilityConfig", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (view == null || view2 == null) {
            C117292a.m165361g(this, "com/tencent/mm/accessibility/base/MMBaseAccessibilityConfig", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
            return;
        }
        mockInflateAsync(view2);
        MapExpandKt.visitChild(view2, new MMBaseAccessibilityConfig$onChildViewAdded$1(this));
        C117292a.m165361g(this, "com/tencent/mm/accessibility/base/MMBaseAccessibilityConfig", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    public void onChildViewRemoved(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/accessibility/base/MMBaseAccessibilityConfig", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (view == null || view2 == null) {
            C117292a.m165361g(this, "com/tencent/mm/accessibility/base/MMBaseAccessibilityConfig", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
            return;
        }
        MapExpandKt.visitChild(view2, new MMBaseAccessibilityConfig$onChildViewRemoved$1(this));
        C117292a.m165361g(this, "com/tencent/mm/accessibility/base/MMBaseAccessibilityConfig", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initCore();
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        Log.m105924i(TAG, "activity:" + getActivity().getClass().getSimpleName() + " onCreate total:" + (System.currentTimeMillis() - this.beforeCreateTime));
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        this.beforeCreateTime = System.currentTimeMillis();
    }

    public void onDestroy() {
        super.onDestroy();
        unbindConfigAsync();
        getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        MapExpandKt.visitChild(getRootView(), new MMBaseAccessibilityConfig$onDestroy$1(this));
    }

    public void onGlobalLayout() {
        if (TimeBlocker.INSTANCE.isSinceLastTrue(C0966R.C0970id.f5240l, 1000)) {
            if (this.startView == null) {
                this.startView = getStartView();
            }
            View view = this.startView;
            if (view != null) {
                MapExpandKt.postIfNeed(view, new MMBaseAccessibilityConfig$onGlobalLayout$1(this));
            }
        }
    }

    public void onResume() {
        if (this.firstResume) {
            dealFirstFocus();
        }
        checkNeedPreDealOnResume();
        this.firstResume = false;
    }

    public final ConfigHelper root(int i) {
        return new ConfigHelper(i, this);
    }

    public final void setDisableExpandWhole(boolean z) {
        this.isDisableExpandWhole = z;
    }

    public final void setHasFocusStartView$plugin_autoaccessibility_release(boolean z) {
        this.hasFocusStartView = z;
    }

    public final void setStartView$plugin_autoaccessibility_release(View view) {
        this.startView = view;
    }

    public final void setStartViewId$plugin_autoaccessibility_release(Integer num) {
        this.startViewId = num;
    }

    public final void setStartViewLayoutId$plugin_autoaccessibility_release(Integer num) {
        this.startViewLayoutId = num;
    }

    public final void setStartViewRootMap$plugin_autoaccessibility_release(Map<Integer, List<Integer>> map) {
        C87412m.m108594g(map, "<set-?>");
        this.startViewRootMap = map;
    }

    public final void setValue(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        this.paramMap.put(str, str2);
    }

    public final void talk(View view, String str) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(str, "s");
        view.announceForAccessibility(str);
    }

    public final ViewSetter view(int i, int i2) {
        return new ViewSetter(this, i, i2);
    }

    public final void focusFirst(int i, int i2) {
        this.startViewId = Integer.valueOf(i);
        this.startViewLayoutId = Integer.valueOf(i2);
        Map<Integer, List<Integer>> map = this.startViewRootMap;
        Integer valueOf = Integer.valueOf(i);
        List<Integer> list = map.get(valueOf);
        if (list == null) {
            list = new ArrayList<>();
            map.put(valueOf, list);
        }
        list.add(Integer.valueOf(i2));
    }
}
