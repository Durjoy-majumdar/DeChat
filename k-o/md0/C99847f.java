package md0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import te3.C51163rv3;

/* renamed from: md0.f */
public class C99847f {

    /* renamed from: a */
    public String f292572a;

    /* renamed from: b */
    public LinkedHashMap<String, C99848a> f292573b = new LinkedHashMap<>();

    /* renamed from: c */
    public final ReadWriteLock f292574c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public StringBuilder f292575d = new StringBuilder();

    public C99847f(String str) {
        this.f292572a = str;
    }

    /* renamed from: a */
    public boolean mo139201a(C99847f fVar) {
        if (fVar == null) {
            return false;
        }
        ((ReentrantReadWriteLock) this.f292574c).readLock().lock();
        for (C99848a aVar : this.f292573b.values()) {
            C99848a aVar2 = new C99848a(this, fVar.f292572a);
            aVar2.f292579d = aVar.f292579d;
            fVar.f292573b.put(aVar2.f292576a, aVar2);
        }
        ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
        return true;
    }

    /* renamed from: b */
    public void mo139202b() {
        Log.m105924i("MicroMsg.ShortSentenceContainer", "createNewShortSentence");
        ((ReentrantReadWriteLock) this.f292574c).writeLock().lock();
        C99848a aVar = new C99848a(this);
        this.f292573b.put(aVar.f292576a, aVar);
        ((ReentrantReadWriteLock) this.f292574c).writeLock().unlock();
    }

    /* renamed from: c */
    public void mo139203c(int i) {
        Log.m105925i("MicroMsg.ShortSentenceContainer", "cutShortSentence markEnd:%s", Integer.valueOf(i));
        if (i >= 0) {
            ((ReentrantReadWriteLock) this.f292574c).readLock().lock();
            if (this.f292573b.size() == 0) {
                Log.m105920e("MicroMsg.ShortSentenceContainer", "splitShortSentence there is no last one");
                ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
                return;
            }
            Iterator<C99848a> it = this.f292573b.values().iterator();
            C99848a aVar = null;
            while (it.hasNext()) {
                aVar = it.next();
            }
            if (aVar != null) {
                Log.m105919d("MicroMsg.ShortSentenceContainer", "cutShortSentence voiceFileMarkEnd:%s voiceId:%s markEnd:%s", Integer.valueOf(aVar.f292579d), aVar.f292576a, Integer.valueOf(i));
                aVar.f292579d = i;
                ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
                return;
            }
            throw new IllegalStateException("splitShortSentence last info is null");
        }
        throw new IllegalStateException("splitShortSentence file mark less than zero. mark: " + i);
    }

    /* renamed from: d */
    public LinkedList<C51163rv3> mo139204d() {
        LinkedList<C51163rv3> linkedList = new LinkedList<>();
        ((ReentrantReadWriteLock) this.f292574c).readLock().lock();
        for (C99848a next : this.f292573b.values()) {
            if (next.f292577b) {
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = next.f292576a;
                rv32.f141176e = true;
                linkedList.add(rv32);
            }
        }
        ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
        return linkedList;
    }

    /* renamed from: e */
    public boolean mo139205e() {
        ((ReentrantReadWriteLock) this.f292574c).readLock().lock();
        boolean z = true;
        if (this.f292573b.size() == 0) {
            Log.m105924i("MicroMsg.ShortSentenceContainer", "isAllRespEnd innerContainer.size() == 0");
            ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
            return true;
        }
        Iterator<C99848a> it = this.f292573b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C99848a next = it.next();
            Log.m105919d("MicroMsg.ShortSentenceContainer", "isAllRespEnd voiceId:%s isRequestEnd:%s isResponseEnd:%s", next.f292576a, Boolean.valueOf(next.f292578c), Boolean.valueOf(next.f292583h));
            if (!next.f292583h) {
                z = false;
                break;
            }
        }
        ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
        return z;
    }

    /* renamed from: f */
    public C99848a mo139206f(int i) {
        ((ReentrantReadWriteLock) this.f292574c).readLock().lock();
        C99848a aVar = null;
        if (this.f292573b.size() == 0) {
            ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
            return null;
        }
        Iterator<C99848a> it = this.f292573b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C99848a next = it.next();
            Log.m105919d("MicroMsg.ShortSentenceContainer", "locateCurrentShortSentence oldOffset = %s voiceFileMarkEnd = %s info.isRequestEnd = %s", Integer.valueOf(i), Integer.valueOf(next.f292579d), Boolean.valueOf(next.f292578c));
            if (!next.f292578c && i <= next.f292579d) {
                aVar = next;
                break;
            }
        }
        ((ReentrantReadWriteLock) this.f292574c).readLock().unlock();
        return aVar;
    }

    /* renamed from: md0.f$a */
    public class C99848a {

        /* renamed from: a */
        public String f292576a;

        /* renamed from: b */
        public boolean f292577b = false;

        /* renamed from: c */
        public boolean f292578c = false;

        /* renamed from: d */
        public int f292579d = Integer.MAX_VALUE;

        /* renamed from: e */
        public int f292580e = 0;

        /* renamed from: f */
        public int f292581f = -1;

        /* renamed from: g */
        public String f292582g = null;

        /* renamed from: h */
        public boolean f292583h = false;

        public C99848a(C99847f fVar) {
            this.f292576a = mo139207a(fVar.f292572a);
        }

        /* renamed from: a */
        public final String mo139207a(String str) {
            long currentTimeMillis = System.currentTimeMillis() & Util.MAX_32BIT_VALUE;
            long nextInt = Util.MAX_32BIT_VALUE & ((long) new Random(System.currentTimeMillis()).nextInt());
            long j = (currentTimeMillis << 32) | nextInt;
            if (j < 0) {
                j = Math.abs(j);
            }
            String str2 = str + j;
            Log.m105925i("MicroMsg.ShortSentenceContainer", "finally random = %s(%s) time = %s(%s) id = %s(%s) session = %s strId = %s", Long.valueOf(nextInt), Long.toBinaryString(nextInt), Long.valueOf(currentTimeMillis), Long.toBinaryString(currentTimeMillis), Long.valueOf(j), Long.toBinaryString(j), str, str2);
            return str2;
        }

        public C99848a(C99847f fVar, String str) {
            this.f292576a = mo139207a(str);
        }
    }
}
