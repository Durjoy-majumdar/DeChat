package com.tencent.maas.profiling;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23817d;
import com.google.protobuf.C23821e2;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23872m0;
import com.google.protobuf.C23896m1;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23901n0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.google.protobuf.C24071y;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PFS12 {
    private static C24025t.C24038h descriptor = C24025t.C24038h.m29872i(new String[]{"\n\u000bPFS12.proto\u0012\u0005PFS12\"\u0001\n\rTaskTimeTrace\u0012\u000f\n\u0007task_id\u0018\u0001 \u0001(\r\u0012\u0011\n\ttask_name\u0018\u0002 \u0001(\t\u0012\u0010\n\btask_tag\u0018\u0003 \u0001(\t\u0012\u0012\n\nstart_time\u0018\u0004 \u0001(\u0001\u0012\u0010\n\bduration\u0018\u0005 \u0001(\u0001\u0012\u0013\n\u000btask_traits\u0018\u0006 \u0001(\u0004\u0012\u0013\n\u000bsub_task_id\u0018\n \u0003(\r\"v\n\tTimeTrace\u0012\u0010\n\btrace_id\u0018\u0001 \u0001(\t\u0012\u0012\n\ntrace_name\u0018\u0002 \u0001(\t\u0012\u0014\n\froot_task_id\u0018\u0003 \u0001(\r\u0012-\n\u000ftask_time_trace\u0018\u0004 \u0003(\u000b2\u0014.PFS12.TaskTimeTraceB#\n\u001acom.tencent.maas.profilingB\u0005PFS12b\u0006proto3"}, new C24025t.C24038h[0]);
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_PFS12_TaskTimeTrace_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_PFS12_TaskTimeTrace_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_PFS12_TimeTrace_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_PFS12_TimeTrace_fieldAccessorTable;

    public static final class TaskTimeTrace extends C23872m0 implements TaskTimeTraceOrBuilder {
        private static final TaskTimeTrace DEFAULT_INSTANCE = new TaskTimeTrace();
        public static final int DURATION_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final C24062w1<TaskTimeTrace> PARSER = new C23813c<TaskTimeTrace>() {
            public TaskTimeTrace parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new TaskTimeTrace(lVar, a0Var);
            }
        };
        public static final int START_TIME_FIELD_NUMBER = 4;
        public static final int SUB_TASK_ID_FIELD_NUMBER = 10;
        public static final int TASK_ID_FIELD_NUMBER = 1;
        public static final int TASK_NAME_FIELD_NUMBER = 2;
        public static final int TASK_TAG_FIELD_NUMBER = 3;
        public static final int TASK_TRAITS_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public double duration_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public double startTime_;
        private int subTaskIdMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public C23908o0.C23915g subTaskId_;
        /* access modifiers changed from: private */
        public int taskId_;
        /* access modifiers changed from: private */
        public volatile Object taskName_;
        /* access modifiers changed from: private */
        public volatile Object taskTag_;
        /* access modifiers changed from: private */
        public long taskTraits_;

        public static TaskTimeTrace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return PFS12.internal_static_PFS12_TaskTimeTrace_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TaskTimeTrace parseDelimitedFrom(InputStream inputStream) {
            return (TaskTimeTrace) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TaskTimeTrace parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<TaskTimeTrace> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TaskTimeTrace)) {
                return super.equals(obj);
            }
            TaskTimeTrace taskTimeTrace = (TaskTimeTrace) obj;
            return getTaskId() == taskTimeTrace.getTaskId() && getTaskName().equals(taskTimeTrace.getTaskName()) && getTaskTag().equals(taskTimeTrace.getTaskTag()) && Double.doubleToLongBits(getStartTime()) == Double.doubleToLongBits(taskTimeTrace.getStartTime()) && Double.doubleToLongBits(getDuration()) == Double.doubleToLongBits(taskTimeTrace.getDuration()) && getTaskTraits() == taskTimeTrace.getTaskTraits() && getSubTaskIdList().equals(taskTimeTrace.getSubTaskIdList()) && this.unknownFields.equals(taskTimeTrace.unknownFields);
        }

        public double getDuration() {
            return this.duration_;
        }

        public C24062w1<TaskTimeTrace> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.taskId_;
            int i3 = 0;
            int w = i2 != 0 ? C23897n.m29278w(1, i2) + 0 : 0;
            if (!getTaskNameBytes().isEmpty()) {
                w += C23872m0.computeStringSize(2, this.taskName_);
            }
            if (!getTaskTagBytes().isEmpty()) {
                w += C23872m0.computeStringSize(3, this.taskTag_);
            }
            double d = this.startTime_;
            if (d != 0.0d) {
                w += C23897n.m29260e(4, d);
            }
            double d2 = this.duration_;
            if (d2 != 0.0d) {
                w += C23897n.m29260e(5, d2);
            }
            long j = this.taskTraits_;
            if (j != 0) {
                w += C23897n.m29280y(6, j);
            }
            int i4 = 0;
            while (true) {
                C23908o0.C23915g gVar = this.subTaskId_;
                if (i3 >= ((C23901n0) gVar).f68498f) {
                    break;
                }
                i4 += C23897n.m29279x(((C23901n0) gVar).mo37936k(i3));
                i3++;
            }
            int i5 = w + i4;
            if (!getSubTaskIdList().isEmpty()) {
                i5 = i5 + 1 + C23897n.m29267l(i4);
            }
            this.subTaskIdMemoizedSerializedSize = i4;
            int serializedSize = i5 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public double getStartTime() {
            return this.startTime_;
        }

        public int getSubTaskId(int i) {
            return ((C23901n0) this.subTaskId_).mo37936k(i);
        }

        public int getSubTaskIdCount() {
            return ((C23901n0) this.subTaskId_).f68498f;
        }

        public List<Integer> getSubTaskIdList() {
            return this.subTaskId_;
        }

        public int getTaskId() {
            return this.taskId_;
        }

        public String getTaskName() {
            Object obj = this.taskName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.taskName_ = u;
            return u;
        }

        public C16994k getTaskNameBytes() {
            Object obj = this.taskName_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.taskName_ = k;
            return k;
        }

        public String getTaskTag() {
            Object obj = this.taskTag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.taskTag_ = u;
            return u;
        }

        public C16994k getTaskTagBytes() {
            Object obj = this.taskTag_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.taskTag_ = k;
            return k;
        }

        public long getTaskTraits() {
            return this.taskTraits_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + getTaskId()) * 37) + 2) * 53) + getTaskName().hashCode()) * 37) + 3) * 53) + getTaskTag().hashCode()) * 37) + 4) * 53) + C23908o0.m29424b(Double.doubleToLongBits(getStartTime()))) * 37) + 5) * 53) + C23908o0.m29424b(Double.doubleToLongBits(getDuration()))) * 37) + 6) * 53) + C23908o0.m29424b(getTaskTraits());
            if (getSubTaskIdCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getSubTaskIdList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$100 = PFS12.internal_static_PFS12_TaskTimeTrace_fieldAccessorTable;
            access$100.mo37875c(TaskTimeTrace.class, Builder.class);
            return access$100;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new TaskTimeTrace();
        }

        public void writeTo(C23897n nVar) {
            getSerializedSize();
            int i = this.taskId_;
            if (i != 0) {
                nVar.mo37917X(1, i);
            }
            if (!getTaskNameBytes().isEmpty()) {
                C23872m0.writeString(nVar, 2, this.taskName_);
            }
            if (!getTaskTagBytes().isEmpty()) {
                C23872m0.writeString(nVar, 3, this.taskTag_);
            }
            double d = this.startTime_;
            if (d != 0.0d) {
                nVar.mo37901H(4, d);
            }
            double d2 = this.duration_;
            if (d2 != 0.0d) {
                nVar.mo37901H(5, d2);
            }
            long j = this.taskTraits_;
            if (j != 0) {
                nVar.mo37919Z(6, j);
            }
            if (getSubTaskIdList().size() > 0) {
                nVar.mo37918Y(82);
                nVar.mo37918Y(this.subTaskIdMemoizedSerializedSize);
            }
            int i2 = 0;
            while (true) {
                C23908o0.C23915g gVar = this.subTaskId_;
                if (i2 < ((C23901n0) gVar).f68498f) {
                    nVar.mo37918Y(((C23901n0) gVar).mo37936k(i2));
                    i2++;
                } else {
                    this.unknownFields.writeTo(nVar);
                    return;
                }
            }
        }

        public static final class Builder extends C23872m0.C23874b<Builder> implements TaskTimeTraceOrBuilder {
            private int bitField0_;
            private double duration_;
            private double startTime_;
            private C23908o0.C23915g subTaskId_;
            private int taskId_;
            private Object taskName_;
            private Object taskTag_;
            private long taskTraits_;

            private void ensureSubTaskIdIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.subTaskId_ = C23872m0.mutableCopy(this.subTaskId_);
                    this.bitField0_ |= 1;
                }
            }

            public static final C24025t.C24027b getDescriptor() {
                return PFS12.internal_static_PFS12_TaskTimeTrace_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder addAllSubTaskId(Iterable<? extends Integer> iterable) {
                ensureSubTaskIdIsMutable();
                C23810b.C23811a.addAll(iterable, this.subTaskId_);
                onChanged();
                return this;
            }

            public Builder addSubTaskId(int i) {
                ensureSubTaskIdIsMutable();
                ((C23901n0) this.subTaskId_).mo37933h(i);
                onChanged();
                return this;
            }

            public Builder clearDuration() {
                this.duration_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.startTime_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearSubTaskId() {
                this.subTaskId_ = C23872m0.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTaskId() {
                this.taskId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTaskName() {
                this.taskName_ = TaskTimeTrace.getDefaultInstance().getTaskName();
                onChanged();
                return this;
            }

            public Builder clearTaskTag() {
                this.taskTag_ = TaskTimeTrace.getDefaultInstance().getTaskTag();
                onChanged();
                return this;
            }

            public Builder clearTaskTraits() {
                this.taskTraits_ = 0;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return PFS12.internal_static_PFS12_TaskTimeTrace_descriptor;
            }

            public double getDuration() {
                return this.duration_;
            }

            public double getStartTime() {
                return this.startTime_;
            }

            public int getSubTaskId(int i) {
                return ((C23901n0) this.subTaskId_).mo37936k(i);
            }

            public int getSubTaskIdCount() {
                return ((C23901n0) this.subTaskId_).f68498f;
            }

            public List<Integer> getSubTaskIdList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.subTaskId_) : this.subTaskId_;
            }

            public int getTaskId() {
                return this.taskId_;
            }

            public String getTaskName() {
                Object obj = this.taskName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.taskName_ = u;
                return u;
            }

            public C16994k getTaskNameBytes() {
                Object obj = this.taskName_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.taskName_ = k;
                return k;
            }

            public String getTaskTag() {
                Object obj = this.taskTag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.taskTag_ = u;
                return u;
            }

            public C16994k getTaskTagBytes() {
                Object obj = this.taskTag_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.taskTag_ = k;
                return k;
            }

            public long getTaskTraits() {
                return this.taskTraits_;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$100 = PFS12.internal_static_PFS12_TaskTimeTrace_fieldAccessorTable;
                access$100.mo37875c(TaskTimeTrace.class, Builder.class);
                return access$100;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setDuration(double d) {
                this.duration_ = d;
                onChanged();
                return this;
            }

            public Builder setStartTime(double d) {
                this.startTime_ = d;
                onChanged();
                return this;
            }

            public Builder setSubTaskId(int i, int i2) {
                ensureSubTaskIdIsMutable();
                ((C23901n0) this.subTaskId_).mo37939n(i, i2);
                onChanged();
                return this;
            }

            public Builder setTaskId(int i) {
                this.taskId_ = i;
                onChanged();
                return this;
            }

            public Builder setTaskName(String str) {
                str.getClass();
                this.taskName_ = str;
                onChanged();
                return this;
            }

            public Builder setTaskNameBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.taskName_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTaskTag(String str) {
                str.getClass();
                this.taskTag_ = str;
                onChanged();
                return this;
            }

            public Builder setTaskTagBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.taskTag_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTaskTraits(long j) {
                this.taskTraits_ = j;
                onChanged();
                return this;
            }

            private Builder() {
                this.taskName_ = "";
                this.taskTag_ = "";
                this.subTaskId_ = C23872m0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public TaskTimeTrace build() {
                TaskTimeTrace buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public TaskTimeTrace buildPartial() {
                TaskTimeTrace taskTimeTrace = new TaskTimeTrace((C23872m0.C23874b) this);
                int unused = taskTimeTrace.taskId_ = this.taskId_;
                Object unused2 = taskTimeTrace.taskName_ = this.taskName_;
                Object unused3 = taskTimeTrace.taskTag_ = this.taskTag_;
                double unused4 = taskTimeTrace.startTime_ = this.startTime_;
                double unused5 = taskTimeTrace.duration_ = this.duration_;
                long unused6 = taskTimeTrace.taskTraits_ = this.taskTraits_;
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    ((C23817d) this.subTaskId_).f68221d = false;
                    this.bitField0_ = i & -2;
                }
                C23908o0.C23915g unused7 = taskTimeTrace.subTaskId_ = this.subTaskId_;
                onBuilt();
                return taskTimeTrace;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public TaskTimeTrace getDefaultInstanceForType() {
                return TaskTimeTrace.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.taskId_ = 0;
                this.taskName_ = "";
                this.taskTag_ = "";
                this.startTime_ = 0.0d;
                this.duration_ = 0.0d;
                this.taskTraits_ = 0;
                this.subTaskId_ = C23872m0.emptyIntList();
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof TaskTimeTrace) {
                    return mergeFrom((TaskTimeTrace) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.taskName_ = "";
                this.taskTag_ = "";
                this.subTaskId_ = C23872m0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(TaskTimeTrace taskTimeTrace) {
                if (taskTimeTrace == TaskTimeTrace.getDefaultInstance()) {
                    return this;
                }
                if (taskTimeTrace.getTaskId() != 0) {
                    setTaskId(taskTimeTrace.getTaskId());
                }
                if (!taskTimeTrace.getTaskName().isEmpty()) {
                    this.taskName_ = taskTimeTrace.taskName_;
                    onChanged();
                }
                if (!taskTimeTrace.getTaskTag().isEmpty()) {
                    this.taskTag_ = taskTimeTrace.taskTag_;
                    onChanged();
                }
                if (taskTimeTrace.getStartTime() != 0.0d) {
                    setStartTime(taskTimeTrace.getStartTime());
                }
                if (taskTimeTrace.getDuration() != 0.0d) {
                    setDuration(taskTimeTrace.getDuration());
                }
                if (taskTimeTrace.getTaskTraits() != 0) {
                    setTaskTraits(taskTimeTrace.getTaskTraits());
                }
                if (!taskTimeTrace.subTaskId_.isEmpty()) {
                    if (this.subTaskId_.isEmpty()) {
                        this.subTaskId_ = taskTimeTrace.subTaskId_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSubTaskIdIsMutable();
                        ((C23901n0) this.subTaskId_).addAll(taskTimeTrace.subTaskId_);
                    }
                    onChanged();
                }
                mergeUnknownFields(taskTimeTrace.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.profiling.PFS12.TaskTimeTrace.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.profiling.PFS12.TaskTimeTrace.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.profiling.PFS12$TaskTimeTrace r3 = (com.tencent.maas.profiling.PFS12.TaskTimeTrace) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.profiling.PFS12.TaskTimeTrace) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.profiling.PFS12$TaskTimeTrace r4 = (com.tencent.maas.profiling.PFS12.TaskTimeTrace) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.profiling.PFS12.TaskTimeTrace) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.profiling.PFS12.TaskTimeTrace.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.profiling.PFS12$TaskTimeTrace$Builder");
            }
        }

        public static Builder newBuilder(TaskTimeTrace taskTimeTrace) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(taskTimeTrace);
        }

        public static TaskTimeTrace parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private TaskTimeTrace(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.subTaskIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }

        public static TaskTimeTrace parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TaskTimeTrace) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static TaskTimeTrace parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public TaskTimeTrace getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static TaskTimeTrace parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TaskTimeTrace parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        private TaskTimeTrace() {
            this.subTaskIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.taskName_ = "";
            this.taskTag_ = "";
            this.subTaskId_ = C23872m0.emptyIntList();
        }

        public static TaskTimeTrace parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static TaskTimeTrace parseFrom(InputStream inputStream) {
            return (TaskTimeTrace) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static TaskTimeTrace parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TaskTimeTrace) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static TaskTimeTrace parseFrom(C23856l lVar) {
            return (TaskTimeTrace) C23872m0.parseWithIOException(PARSER, lVar);
        }

        private TaskTimeTrace(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            this.taskId_ = lVar.mo37758G();
                        } else if (F == 18) {
                            this.taskName_ = lVar.mo37756E();
                        } else if (F == 26) {
                            this.taskTag_ = lVar.mo37756E();
                        } else if (F == 33) {
                            this.startTime_ = lVar.mo37769n();
                        } else if (F == 41) {
                            this.duration_ = lVar.mo37769n();
                        } else if (F == 48) {
                            this.taskTraits_ = lVar.mo37759H();
                        } else if (F == 80) {
                            if (!z2 || !true) {
                                this.subTaskId_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            ((C23901n0) this.subTaskId_).mo37933h(lVar.mo37758G());
                        } else if (F == 82) {
                            int k = lVar.mo37766k(lVar.mo37779x());
                            if ((!z2 || !true) && lVar.mo37762d() > 0) {
                                this.subTaskId_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            while (lVar.mo37762d() > 0) {
                                ((C23901n0) this.subTaskId_).mo37933h(lVar.mo37758G());
                            }
                            lVar.mo37765j(k);
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    if (z2 && true) {
                        ((C23817d) this.subTaskId_).f68221d = false;
                    }
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                ((C23817d) this.subTaskId_).f68221d = false;
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static TaskTimeTrace parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TaskTimeTrace) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface TaskTimeTraceOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        double getDuration();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        double getStartTime();

        int getSubTaskId(int i);

        int getSubTaskIdCount();

        List<Integer> getSubTaskIdList();

        int getTaskId();

        String getTaskName();

        C16994k getTaskNameBytes();

        String getTaskTag();

        C16994k getTaskTagBytes();

        long getTaskTraits();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class TimeTrace extends C23872m0 implements TimeTraceOrBuilder {
        private static final TimeTrace DEFAULT_INSTANCE = new TimeTrace();
        /* access modifiers changed from: private */
        public static final C24062w1<TimeTrace> PARSER = new C23813c<TimeTrace>() {
            public TimeTrace parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new TimeTrace(lVar, a0Var);
            }
        };
        public static final int ROOT_TASK_ID_FIELD_NUMBER = 3;
        public static final int TASK_TIME_TRACE_FIELD_NUMBER = 4;
        public static final int TRACE_ID_FIELD_NUMBER = 1;
        public static final int TRACE_NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int rootTaskId_;
        /* access modifiers changed from: private */
        public List<TaskTimeTrace> taskTimeTrace_;
        /* access modifiers changed from: private */
        public volatile Object traceId_;
        /* access modifiers changed from: private */
        public volatile Object traceName_;

        public static TimeTrace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return PFS12.internal_static_PFS12_TimeTrace_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TimeTrace parseDelimitedFrom(InputStream inputStream) {
            return (TimeTrace) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TimeTrace parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<TimeTrace> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimeTrace)) {
                return super.equals(obj);
            }
            TimeTrace timeTrace = (TimeTrace) obj;
            return getTraceId().equals(timeTrace.getTraceId()) && getTraceName().equals(timeTrace.getTraceName()) && getRootTaskId() == timeTrace.getRootTaskId() && getTaskTimeTraceList().equals(timeTrace.getTaskTimeTraceList()) && this.unknownFields.equals(timeTrace.unknownFields);
        }

        public C24062w1<TimeTrace> getParserForType() {
            return PARSER;
        }

        public int getRootTaskId() {
            return this.rootTaskId_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getTraceIdBytes().isEmpty() ? C23872m0.computeStringSize(1, this.traceId_) + 0 : 0;
            if (!getTraceNameBytes().isEmpty()) {
                computeStringSize += C23872m0.computeStringSize(2, this.traceName_);
            }
            int i2 = this.rootTaskId_;
            if (i2 != 0) {
                computeStringSize += C23897n.m29278w(3, i2);
            }
            for (int i3 = 0; i3 < this.taskTimeTrace_.size(); i3++) {
                computeStringSize += C23897n.m29270o(4, this.taskTimeTrace_.get(i3));
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TaskTimeTrace getTaskTimeTrace(int i) {
            return this.taskTimeTrace_.get(i);
        }

        public int getTaskTimeTraceCount() {
            return this.taskTimeTrace_.size();
        }

        public List<TaskTimeTrace> getTaskTimeTraceList() {
            return this.taskTimeTrace_;
        }

        public TaskTimeTraceOrBuilder getTaskTimeTraceOrBuilder(int i) {
            return this.taskTimeTrace_.get(i);
        }

        public List<? extends TaskTimeTraceOrBuilder> getTaskTimeTraceOrBuilderList() {
            return this.taskTimeTrace_;
        }

        public String getTraceId() {
            Object obj = this.traceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.traceId_ = u;
            return u;
        }

        public C16994k getTraceIdBytes() {
            Object obj = this.traceId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.traceId_ = k;
            return k;
        }

        public String getTraceName() {
            Object obj = this.traceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.traceName_ = u;
            return u;
        }

        public C16994k getTraceNameBytes() {
            Object obj = this.traceName_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.traceName_ = k;
            return k;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + getTraceId().hashCode()) * 37) + 2) * 53) + getTraceName().hashCode()) * 37) + 3) * 53) + getRootTaskId();
            if (getTaskTimeTraceCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getTaskTimeTraceList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$2300 = PFS12.internal_static_PFS12_TimeTrace_fieldAccessorTable;
            access$2300.mo37875c(TimeTrace.class, Builder.class);
            return access$2300;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new TimeTrace();
        }

        public void writeTo(C23897n nVar) {
            if (!getTraceIdBytes().isEmpty()) {
                C23872m0.writeString(nVar, 1, this.traceId_);
            }
            if (!getTraceNameBytes().isEmpty()) {
                C23872m0.writeString(nVar, 2, this.traceName_);
            }
            int i = this.rootTaskId_;
            if (i != 0) {
                nVar.mo37917X(3, i);
            }
            for (int i2 = 0; i2 < this.taskTimeTrace_.size(); i2++) {
                nVar.mo37909P(4, this.taskTimeTrace_.get(i2));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends C23872m0.C23874b<Builder> implements TimeTraceOrBuilder {
            private int bitField0_;
            private int rootTaskId_;
            private C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> taskTimeTraceBuilder_;
            private List<TaskTimeTrace> taskTimeTrace_;
            private Object traceId_;
            private Object traceName_;

            private void ensureTaskTimeTraceIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.taskTimeTrace_ = new ArrayList(this.taskTimeTrace_);
                    this.bitField0_ |= 1;
                }
            }

            public static final C24025t.C24027b getDescriptor() {
                return PFS12.internal_static_PFS12_TimeTrace_descriptor;
            }

            private C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> getTaskTimeTraceFieldBuilder() {
                if (this.taskTimeTraceBuilder_ == null) {
                    List<TaskTimeTrace> list = this.taskTimeTrace_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.taskTimeTraceBuilder_ = new C23821e2<>(list, z, getParentForChildren(), isClean());
                    this.taskTimeTrace_ = null;
                }
                return this.taskTimeTraceBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (C23872m0.alwaysUseFieldBuilders) {
                    getTaskTimeTraceFieldBuilder();
                }
            }

            public Builder addAllTaskTimeTrace(Iterable<? extends TaskTimeTrace> iterable) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    ensureTaskTimeTraceIsMutable();
                    C23810b.C23811a.addAll(iterable, this.taskTimeTrace_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addTaskTimeTrace(TaskTimeTrace taskTimeTrace) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    taskTimeTrace.getClass();
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.add(taskTimeTrace);
                    onChanged();
                } else {
                    e2Var.mo37582f(taskTimeTrace);
                }
                return this;
            }

            public TaskTimeTrace.Builder addTaskTimeTraceBuilder() {
                return getTaskTimeTraceFieldBuilder().mo37580d(TaskTimeTrace.getDefaultInstance());
            }

            public Builder clearRootTaskId() {
                this.rootTaskId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTaskTimeTrace() {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    this.taskTimeTrace_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearTraceId() {
                this.traceId_ = TimeTrace.getDefaultInstance().getTraceId();
                onChanged();
                return this;
            }

            public Builder clearTraceName() {
                this.traceName_ = TimeTrace.getDefaultInstance().getTraceName();
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return PFS12.internal_static_PFS12_TimeTrace_descriptor;
            }

            public int getRootTaskId() {
                return this.rootTaskId_;
            }

            public TaskTimeTrace getTaskTimeTrace(int i) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                return e2Var == null ? this.taskTimeTrace_.get(i) : e2Var.mo37590n(i, false);
            }

            public TaskTimeTrace.Builder getTaskTimeTraceBuilder(int i) {
                return getTaskTimeTraceFieldBuilder().mo37587k(i);
            }

            public List<TaskTimeTrace.Builder> getTaskTimeTraceBuilderList() {
                return getTaskTimeTraceFieldBuilder().mo37588l();
            }

            public int getTaskTimeTraceCount() {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                return e2Var == null ? this.taskTimeTrace_.size() : e2Var.mo37589m();
            }

            public List<TaskTimeTrace> getTaskTimeTraceList() {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.taskTimeTrace_) : e2Var.mo37591o();
            }

            public TaskTimeTraceOrBuilder getTaskTimeTraceOrBuilder(int i) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                return e2Var == null ? this.taskTimeTrace_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends TaskTimeTraceOrBuilder> getTaskTimeTraceOrBuilderList() {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.taskTimeTrace_);
            }

            public String getTraceId() {
                Object obj = this.traceId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.traceId_ = u;
                return u;
            }

            public C16994k getTraceIdBytes() {
                Object obj = this.traceId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.traceId_ = k;
                return k;
            }

            public String getTraceName() {
                Object obj = this.traceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.traceName_ = u;
                return u;
            }

            public C16994k getTraceNameBytes() {
                Object obj = this.traceName_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.traceName_ = k;
                return k;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$2300 = PFS12.internal_static_PFS12_TimeTrace_fieldAccessorTable;
                access$2300.mo37875c(TimeTrace.class, Builder.class);
                return access$2300;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder removeTaskTimeTrace(int i) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder setRootTaskId(int i) {
                this.rootTaskId_ = i;
                onChanged();
                return this;
            }

            public Builder setTaskTimeTrace(int i, TaskTimeTrace taskTimeTrace) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    taskTimeTrace.getClass();
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.set(i, taskTimeTrace);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, taskTimeTrace);
                }
                return this;
            }

            public Builder setTraceId(String str) {
                str.getClass();
                this.traceId_ = str;
                onChanged();
                return this;
            }

            public Builder setTraceIdBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.traceId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTraceName(String str) {
                str.getClass();
                this.traceName_ = str;
                onChanged();
                return this;
            }

            public Builder setTraceNameBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.traceName_ = kVar;
                onChanged();
                return this;
            }

            private Builder() {
                this.traceId_ = "";
                this.traceName_ = "";
                this.taskTimeTrace_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public TimeTrace build() {
                TimeTrace buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public TimeTrace buildPartial() {
                TimeTrace timeTrace = new TimeTrace((C23872m0.C23874b) this);
                Object unused = timeTrace.traceId_ = this.traceId_;
                Object unused2 = timeTrace.traceName_ = this.traceName_;
                int unused3 = timeTrace.rootTaskId_ = this.rootTaskId_;
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.taskTimeTrace_ = Collections.unmodifiableList(this.taskTimeTrace_);
                        this.bitField0_ &= -2;
                    }
                    List unused4 = timeTrace.taskTimeTrace_ = this.taskTimeTrace_;
                } else {
                    List unused5 = timeTrace.taskTimeTrace_ = e2Var.mo37583g();
                }
                onBuilt();
                return timeTrace;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public TimeTrace getDefaultInstanceForType() {
                return TimeTrace.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public TaskTimeTrace.Builder addTaskTimeTraceBuilder(int i) {
                return getTaskTimeTraceFieldBuilder().mo37579c(i, TaskTimeTrace.getDefaultInstance());
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.traceId_ = "";
                this.traceName_ = "";
                this.rootTaskId_ = 0;
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    this.taskTimeTrace_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder addTaskTimeTrace(int i, TaskTimeTrace taskTimeTrace) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    taskTimeTrace.getClass();
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.add(i, taskTimeTrace);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, taskTimeTrace);
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof TimeTrace) {
                    return mergeFrom((TimeTrace) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder setTaskTimeTrace(int i, TaskTimeTrace.Builder builder) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.traceId_ = "";
                this.traceName_ = "";
                this.taskTimeTrace_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(TimeTrace timeTrace) {
                if (timeTrace == TimeTrace.getDefaultInstance()) {
                    return this;
                }
                if (!timeTrace.getTraceId().isEmpty()) {
                    this.traceId_ = timeTrace.traceId_;
                    onChanged();
                }
                if (!timeTrace.getTraceName().isEmpty()) {
                    this.traceName_ = timeTrace.traceName_;
                    onChanged();
                }
                if (timeTrace.getRootTaskId() != 0) {
                    setRootTaskId(timeTrace.getRootTaskId());
                }
                if (this.taskTimeTraceBuilder_ == null) {
                    if (!timeTrace.taskTimeTrace_.isEmpty()) {
                        if (this.taskTimeTrace_.isEmpty()) {
                            this.taskTimeTrace_ = timeTrace.taskTimeTrace_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureTaskTimeTraceIsMutable();
                            this.taskTimeTrace_.addAll(timeTrace.taskTimeTrace_);
                        }
                        onChanged();
                    }
                } else if (!timeTrace.taskTimeTrace_.isEmpty()) {
                    if (this.taskTimeTraceBuilder_.mo37595s()) {
                        C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = null;
                        this.taskTimeTraceBuilder_.f68224a = null;
                        this.taskTimeTraceBuilder_ = null;
                        this.taskTimeTrace_ = timeTrace.taskTimeTrace_;
                        this.bitField0_ &= -2;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = getTaskTimeTraceFieldBuilder();
                        }
                        this.taskTimeTraceBuilder_ = e2Var;
                    } else {
                        this.taskTimeTraceBuilder_.mo37578b(timeTrace.taskTimeTrace_);
                    }
                }
                mergeUnknownFields(timeTrace.unknownFields);
                onChanged();
                return this;
            }

            public Builder addTaskTimeTrace(TaskTimeTrace.Builder builder) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addTaskTimeTrace(int i, TaskTimeTrace.Builder builder) {
                C23821e2<TaskTimeTrace, TaskTimeTrace.Builder, TaskTimeTraceOrBuilder> e2Var = this.taskTimeTraceBuilder_;
                if (e2Var == null) {
                    ensureTaskTimeTraceIsMutable();
                    this.taskTimeTrace_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.profiling.PFS12.TimeTrace.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.profiling.PFS12.TimeTrace.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.profiling.PFS12$TimeTrace r3 = (com.tencent.maas.profiling.PFS12.TimeTrace) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.profiling.PFS12.TimeTrace) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.profiling.PFS12$TimeTrace r4 = (com.tencent.maas.profiling.PFS12.TimeTrace) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.profiling.PFS12.TimeTrace) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.profiling.PFS12.TimeTrace.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.profiling.PFS12$TimeTrace$Builder");
            }
        }

        public static Builder newBuilder(TimeTrace timeTrace) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timeTrace);
        }

        public static TimeTrace parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private TimeTrace(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static TimeTrace parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TimeTrace) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static TimeTrace parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public TimeTrace getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static TimeTrace parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TimeTrace() {
            this.memoizedIsInitialized = -1;
            this.traceId_ = "";
            this.traceName_ = "";
            this.taskTimeTrace_ = Collections.emptyList();
        }

        public static TimeTrace parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static TimeTrace parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static TimeTrace parseFrom(InputStream inputStream) {
            return (TimeTrace) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static TimeTrace parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TimeTrace) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        private TimeTrace(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            this.traceId_ = lVar.mo37756E();
                        } else if (F == 18) {
                            this.traceName_ = lVar.mo37756E();
                        } else if (F == 24) {
                            this.rootTaskId_ = lVar.mo37758G();
                        } else if (F == 34) {
                            if (!z2 || !true) {
                                this.taskTimeTrace_ = new ArrayList();
                                z2 |= true;
                            }
                            this.taskTimeTrace_.add((TaskTimeTrace) lVar.mo37777v(TaskTimeTrace.parser(), a0Var));
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.taskTimeTrace_ = Collections.unmodifiableList(this.taskTimeTrace_);
                    }
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.taskTimeTrace_ = Collections.unmodifiableList(this.taskTimeTrace_);
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static TimeTrace parseFrom(C23856l lVar) {
            return (TimeTrace) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static TimeTrace parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TimeTrace) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface TimeTraceOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        int getRootTaskId();

        TaskTimeTrace getTaskTimeTrace(int i);

        int getTaskTimeTraceCount();

        List<TaskTimeTrace> getTaskTimeTraceList();

        TaskTimeTraceOrBuilder getTaskTimeTraceOrBuilder(int i);

        List<? extends TaskTimeTraceOrBuilder> getTaskTimeTraceOrBuilderList();

        String getTraceId();

        C16994k getTraceIdBytes();

        String getTraceName();

        C16994k getTraceNameBytes();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    static {
        C24025t.C24027b bVar = getDescriptor().mo38347g().get(0);
        internal_static_PFS12_TaskTimeTrace_descriptor = bVar;
        internal_static_PFS12_TaskTimeTrace_fieldAccessorTable = new C23872m0.C23880f(bVar, new String[]{"TaskId", "TaskName", "TaskTag", "StartTime", "Duration", "TaskTraits", "SubTaskId"});
        C24025t.C24027b bVar2 = getDescriptor().mo38347g().get(1);
        internal_static_PFS12_TimeTrace_descriptor = bVar2;
        internal_static_PFS12_TimeTrace_fieldAccessorTable = new C23872m0.C23880f(bVar2, new String[]{"TraceId", "TraceName", "RootTaskId", "TaskTimeTrace"});
    }

    private PFS12() {
    }

    public static C24025t.C24038h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }

    public static void registerAllExtensions(C24071y yVar) {
        registerAllExtensions((C23806a0) yVar);
    }
}
