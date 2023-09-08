package com.tencent.p014mm.p136ui.recyclerview;

import a14.C0000n0;
import a14.C53895h;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/ui/recyclerview/SynchronizedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$z;", "T", "Landroidx/recyclerview/widget/RecyclerView$e;", "Landroid/view/View;", "itemView", "", "isAsyncView", "holder", "", "position", "", "", "payloads", "Lrx3/b0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$z;ILjava/util/List;)V", "onCoroutineBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$z;ILjava/util/List;Lwx3/d;)Ljava/lang/Object;", "(Landroidx/recyclerview/widget/RecyclerView$z;ILwx3/d;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "isEnableSynchronized", "Z", "()Z", "setEnableSynchronized", "(Z)V", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.recyclerview.SynchronizedAdapter */
public abstract class SynchronizedAdapter<T extends RecyclerView.C16631z> extends RecyclerView.C16613e<T> {
    private boolean isEnableSynchronized;
    private final ReentrantLock lock = new ReentrantLock();

    @C91590f(mo125468c = "com.tencent.mm.ui.recyclerview.SynchronizedAdapter$onBindViewHolder$1", mo125469f = "DynamicViewCacheExtension.kt", mo125470l = {529}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.ui.recyclerview.SynchronizedAdapter$a */
    public static final class C57848a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f165477d;

        /* renamed from: e */
        public final /* synthetic */ SynchronizedAdapter<T> f165478e;

        /* renamed from: f */
        public final /* synthetic */ T f165479f;

        /* renamed from: g */
        public final /* synthetic */ int f165480g;

        /* renamed from: h */
        public final /* synthetic */ List<Object> f165481h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57848a(SynchronizedAdapter<T> synchronizedAdapter, T t, int i, List<Object> list, C15601d<? super C57848a> dVar) {
            super(2, dVar);
            this.f165478e = synchronizedAdapter;
            this.f165479f = t;
            this.f165480g = i;
            this.f165481h = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57848a(this.f165478e, this.f165479f, this.f165480g, this.f165481h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57848a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f165477d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SynchronizedAdapter<T> synchronizedAdapter = this.f165478e;
                T t = this.f165479f;
                int i2 = this.f165480g;
                List<Object> list = this.f165481h;
                this.f165477d = 1;
                if (synchronizedAdapter.onCoroutineBindViewHolder(t, i2, list, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    private final boolean isAsyncView(View view) {
        return C87412m.m108589b(view.getTag(C0966R.C0970id.f5311bn), 1);
    }

    public static /* synthetic */ Object onCoroutineBindViewHolder$suspendImpl(SynchronizedAdapter synchronizedAdapter, RecyclerView.C16631z zVar, int i, List list, C15601d dVar) {
        Object onCoroutineBindViewHolder = synchronizedAdapter.onCoroutineBindViewHolder(zVar, i, dVar);
        return onCoroutineBindViewHolder == C15911a.COROUTINE_SUSPENDED ? onCoroutineBindViewHolder : C13598b0.f38549a;
    }

    public final boolean isEnableSynchronized() {
        return this.isEnableSynchronized;
    }

    public void onBindViewHolder(T t, int i, List<Object> list) {
        Object obj;
        C87412m.m108594g(t, "holder");
        C87412m.m108594g(list, "payloads");
        String str = null;
        if (!this.isEnableSynchronized) {
            super.onBindViewHolder(t, i, list);
            C53895h.m60468f((C66212f) null, new C57848a(this, t, i, list, (C15601d<? super C57848a>) null), 1, (Object) null);
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            this.lock.lock();
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                Result.Companion companion = Result.Companion;
                super.onBindViewHolder(t, i, list);
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
                Throwable r112 = Result.m168117exceptionOrNullimpl(obj);
                HashMap<Integer, String> hashMap = DynamicViewCacheExtension.f56355h;
                String str2 = DynamicViewCacheExtension.f56355h.get(Integer.valueOf(hashCode()));
                StringBuilder sb = new StringBuilder();
                sb.append("[onBindViewHolder] waitLock=");
                sb.append(nanoTime2);
                sb.append("ns position=");
                sb.append(i);
                sb.append(" isAsyncView=");
                View view = t.f44854d;
                C87412m.m108593f(view, "holder.itemView");
                sb.append(isAsyncView(view));
                sb.append(" throwable=");
                if (r112 != null) {
                    str = r112.getMessage();
                }
                sb.append(str);
                Log.m105924i(str2, sb.toString());
                if (r112 != null) {
                    throw r112;
                }
            } else {
                super.onBindViewHolder(t, i, list);
            }
        } catch (Throwable th) {
            if (this.lock.isHeldByCurrentThread()) {
                this.lock.unlock();
            }
            throw th;
        }
        if (this.lock.isHeldByCurrentThread()) {
            this.lock.unlock();
        }
    }

    public Object onCoroutineBindViewHolder(T t, int i, List<Object> list, C15601d<? super C13598b0> dVar) {
        return onCoroutineBindViewHolder$suspendImpl(this, t, i, list, dVar);
    }

    public Object onCoroutineBindViewHolder(T t, int i, C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    public final void setEnableSynchronized(boolean z) {
        this.isEnableSynchronized = z;
    }
}
