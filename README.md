# SpringBeanLifeCycle
spring Lifecycle:
-----------------------
1. Definition of the Bean: Defining the bean in spring environment
2. Instantiate Bean: Creating bean or instantiation process
3. Populate the Properties: Adds/assign values, ids etc
4. Post Initializeation: Aware interfaces will be executed, custom code is executed
5. Bean is Ready to Serve: All the dependecies are injected and Bean is ready to serve
6. Pre Destroy of the Bean: execution required to perform while cleanup belongs to this phase
7. Bean Destroy: Bean will be destroyed from JVM.
