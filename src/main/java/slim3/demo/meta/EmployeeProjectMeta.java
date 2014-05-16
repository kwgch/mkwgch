package slim3.demo.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-07-16 10:53:31")
/** */
public final class EmployeeProjectMeta extends org.slim3.datastore.ModelMeta<slim3.demo.model.EmployeeProject> {

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<slim3.demo.model.EmployeeProject, org.slim3.datastore.ModelRef<slim3.demo.model.Employee>, slim3.demo.model.Employee> employeeRef = new org.slim3.datastore.ModelRefAttributeMeta<slim3.demo.model.EmployeeProject, org.slim3.datastore.ModelRef<slim3.demo.model.Employee>, slim3.demo.model.Employee>(this, "employeeRef", "employeeRef", org.slim3.datastore.ModelRef.class, slim3.demo.model.Employee.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.EmployeeProject, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.EmployeeProject, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<slim3.demo.model.EmployeeProject, org.slim3.datastore.ModelRef<slim3.demo.model.Project>, slim3.demo.model.Project> projectRef = new org.slim3.datastore.ModelRefAttributeMeta<slim3.demo.model.EmployeeProject, org.slim3.datastore.ModelRef<slim3.demo.model.Project>, slim3.demo.model.Project>(this, "projectRef", "projectRef", org.slim3.datastore.ModelRef.class, slim3.demo.model.Project.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.EmployeeProject, java.lang.Integer> schemaVersion = new org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.EmployeeProject, java.lang.Integer>(this, "schemaVersion", "schemaVersion", java.lang.Integer.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.EmployeeProject, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<slim3.demo.model.EmployeeProject, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final EmployeeProjectMeta slim3_singleton = new EmployeeProjectMeta();

    /**
     * @return the singleton
     */
    public static EmployeeProjectMeta get() {
       return slim3_singleton;
    }

    /** */
    public EmployeeProjectMeta() {
        super("EmployeeProject", slim3.demo.model.EmployeeProject.class);
    }

    @Override
    public slim3.demo.model.EmployeeProject entityToModel(com.google.appengine.api.datastore.Entity entity) {
        slim3.demo.model.EmployeeProject model = new slim3.demo.model.EmployeeProject();
        if (model.getEmployeeRef() == null) {
            throw new NullPointerException("The property(employeeRef) is null.");
        }
        model.getEmployeeRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("employeeRef"));
        model.setKey(entity.getKey());
        if (model.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) is null.");
        }
        model.getProjectRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("projectRef"));
        model.setSchemaVersion(longToInteger((java.lang.Long) entity.getProperty("schemaVersion")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        if (m.getEmployeeRef() == null) {
            throw new NullPointerException("The property(employeeRef) must not be null.");
        }
        entity.setProperty("employeeRef", m.getEmployeeRef().getKey());
        if (m.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) must not be null.");
        }
        entity.setProperty("projectRef", m.getProjectRef().getKey());
        entity.setProperty("schemaVersion", m.getSchemaVersion());
        entity.setProperty("version", m.getVersion());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        if (m.getEmployeeRef() == null) {
            throw new NullPointerException("The property(employeeRef) must not be null.");
        }
        m.getEmployeeRef().assignKeyIfNecessary(ds);
        if (m.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) must not be null.");
        }
        m.getProjectRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        slim3.demo.model.EmployeeProject m = (slim3.demo.model.EmployeeProject) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getEmployeeRef() != null && m.getEmployeeRef().getKey() != null){
            writer.setNextPropertyName("employeeRef");
            encoder0.encode(writer, m.getEmployeeRef(), maxDepth, currentDepth);
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getProjectRef() != null && m.getProjectRef().getKey() != null){
            writer.setNextPropertyName("projectRef");
            encoder0.encode(writer, m.getProjectRef(), maxDepth, currentDepth);
        }
        if(m.getSchemaVersion() != null){
            writer.setNextPropertyName("schemaVersion");
            encoder0.encode(writer, m.getSchemaVersion());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected slim3.demo.model.EmployeeProject jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        slim3.demo.model.EmployeeProject m = new slim3.demo.model.EmployeeProject();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("employeeRef");
        decoder0.decode(reader, m.getEmployeeRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("projectRef");
        decoder0.decode(reader, m.getProjectRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("schemaVersion");
        m.setSchemaVersion(decoder0.decode(reader, m.getSchemaVersion()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}