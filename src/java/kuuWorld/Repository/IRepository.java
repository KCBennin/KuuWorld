
package java.kuuWorld.Repository;

public interface IRepository<T> extends IReadOnlyRepository<T> {

    public void AddResource(T Entity);

    public void AddResourceRange(List<T> EntityRange);

    public void RemoveResource(T Entity);

    public void RemoveResourceRange(List<T> EntityRange);
}
