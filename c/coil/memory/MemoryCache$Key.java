package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import coil.size.Size;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo182094d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "<init>", "()V", "Complex", "Simple", "Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key$Complex;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public abstract class MemoryCache$Key implements Parcelable {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcoil/memory/MemoryCache$Key$Complex;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class Complex extends MemoryCache$Key {
        public static final Parcelable.Creator<Complex> CREATOR = new C80131a();

        /* renamed from: d */
        public final String f234633d;

        /* renamed from: e */
        public final List<String> f234634e;

        /* renamed from: f */
        public final Size f234635f;

        /* renamed from: g */
        public final Map<String, String> f234636g;

        /* renamed from: coil.memory.MemoryCache$Key$Complex$a */
        public static final class C80131a implements Parcelable.Creator<Complex> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                Size size = (Size) parcel.readParcelable(Complex.class.getClassLoader());
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new Complex(readString, createStringArrayList, size, linkedHashMap);
            }

            public Object[] newArray(int i) {
                return new Complex[i];
            }
        }

        public Complex(String str, List<String> list, Size size, Map<String, String> map) {
            C87412m.m108594g(str, LiteAppCenter.FRAMEWORK_TYPE_BASE);
            C87412m.m108594g(list, "transformations");
            C87412m.m108594g(map, "parameters");
            this.f234633d = str;
            this.f234634e = list;
            this.f234635f = size;
            this.f234636g = map;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Complex)) {
                return false;
            }
            Complex complex = (Complex) obj;
            return C87412m.m108589b(this.f234633d, complex.f234633d) && C87412m.m108589b(this.f234634e, complex.f234634e) && C87412m.m108589b(this.f234635f, complex.f234635f) && C87412m.m108589b(this.f234636g, complex.f234636g);
        }

        public int hashCode() {
            int hashCode = ((this.f234633d.hashCode() * 31) + this.f234634e.hashCode()) * 31;
            Size size = this.f234635f;
            return ((hashCode + (size == null ? 0 : size.hashCode())) * 31) + this.f234636g.hashCode();
        }

        public String toString() {
            return "Complex(base=" + this.f234633d + ", transformations=" + this.f234634e + ", size=" + this.f234635f + ", parameters=" + this.f234636g + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f234633d);
            parcel.writeStringList(this.f234634e);
            parcel.writeParcelable(this.f234635f, i);
            Map<String, String> map = this.f234636g;
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class Simple extends MemoryCache$Key {
        public static final Parcelable.Creator<Simple> CREATOR = new C80132a();

        /* renamed from: d */
        public final String f234637d;

        /* renamed from: coil.memory.MemoryCache$Key$Simple$a */
        public static final class C80132a implements Parcelable.Creator<Simple> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new Simple(parcel.readString());
            }

            public Object[] newArray(int i) {
                return new Simple[i];
            }
        }

        public Simple(String str) {
            C87412m.m108594g(str, "value");
            this.f234637d = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Simple) && C87412m.m108589b(this.f234637d, ((Simple) obj).f234637d);
        }

        public int hashCode() {
            return this.f234637d.hashCode();
        }

        public String toString() {
            return "Simple(value=" + this.f234637d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f234637d);
        }
    }
}
